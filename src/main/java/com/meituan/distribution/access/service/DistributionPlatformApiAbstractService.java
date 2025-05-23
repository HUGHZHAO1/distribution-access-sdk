package com.meituan.distribution.access.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import com.meituan.distribution.access.config.ClientConfig;
import com.meituan.distribution.access.constants.ApiRequestParamConstants;
import com.meituan.distribution.access.constants.DistributionPlatformConstants;
import com.meituan.distribution.access.enums.ApiResponseCodeEnum;
import com.meituan.distribution.access.utils.AuthUtil;
import com.meituan.distribution.access.utils.HttpUtil;
import com.meituan.distribution.access.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.ParameterizedType;
import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;


@Slf4j
public abstract class DistributionPlatformApiAbstractService<PARAM,RESPONSE> {

    private static final Map<String, String> URI_PATH_MAP;

    static {
        HashMap<String, String> map = Maps.newHashMap();
        map.put("1.0", DistributionPlatformConstants.URI_VERSION_1);
        map.put("2.0", DistributionPlatformConstants.URI_VERSION_2);
        URI_PATH_MAP = Collections.unmodifiableMap(map);
    }

    private String getUrl() {
        return DistributionPlatformConstants.DOMAIN_NAME.concat(URI_PATH_MAP.get(getApiVersion()));
    }

    protected abstract String getApiVersion();

    protected abstract String getMethodName();

    protected abstract boolean needLog();

    private void doLog(String httpRequestBody, String httpResponseBody) {
        if (needLog()) {
            log.info("Invoke distribution platform Api, ApiName: {}, RequestBody: {}, ResponseBody:{}", getMethodName(), httpRequestBody, httpResponseBody);
        }
    }

    private RESPONSE parseResponse(String responseBody) {
        try {
            ObjectMapper objectMapper = JsonUtil.getObjectMapper();
            JsonNode rootNode = objectMapper.readTree(responseBody);
            JsonNode codeNode = rootNode.path("code");
            if (Objects.isNull(codeNode) || !Objects.equals(ApiResponseCodeEnum.OK.getCode(), codeNode.asInt())) {
                log.warn("Distribution platform response code failed, response: {}", responseBody);
                return null;
            }
            // 通过反射获取运行时实现类的RESPONSE类型
            Class<?> responseClass = (Class<?>) ((ParameterizedType) getClass()
                    .getGenericSuperclass())
                    .getActualTypeArguments()[1];
            return (RESPONSE) objectMapper.treeToValue(rootNode.path("result"), responseClass);
        } catch (Exception e) {
            log.error("Parse response failed, response:{}", responseBody, e);
            return null;
        }
    }

    public RESPONSE invokeApi(PARAM param) {
        try {
            String requestBody = new RequestParamBuilder<PARAM>()
                    .method(getMethodName())
                    .version(getApiVersion())
                    .data(param)
                    .nonce()
                    .timestamp()
                    .signature()
                    .build();
            log.info("请求体：{}", requestBody);
            String responseBody = HttpUtil.post(getUrl(), requestBody);
            doLog(requestBody, responseBody);
            return parseResponse(responseBody);
        } catch (Exception e) {
            log.error("Invoke api method failed, methodName: {}, version: {}", getMethodName(), getApiVersion(), e);
            return null;
        }
    }




    private static class RequestParamBuilder<PARAM> {
        private final Map<String, Object> paramMap = Maps.newHashMap();

        public RequestParamBuilder() {
            paramMap.put(ApiRequestParamConstants.PARTNER_ID, ClientConfig.getPartnerBizId());
            paramMap.put(ApiRequestParamConstants.ACCESSKEY, ClientConfig.getAccessKey());
        }

        public RequestParamBuilder<PARAM> method(String methodName) {
            paramMap.put(ApiRequestParamConstants.METHOD, methodName);
            return this;
        }

        public RequestParamBuilder<PARAM> version(String methodVersion) {
            paramMap.put(ApiRequestParamConstants.VERSION, methodVersion);
            return this;
        }

        public RequestParamBuilder<PARAM> data(PARAM param) {
            paramMap.put(ApiRequestParamConstants.DATA, JsonUtil.object2Json(param, false));
            return this;
        }

        public RequestParamBuilder<PARAM> nonce() {
            paramMap.put(ApiRequestParamConstants.NONCE, Math.abs(new Random().nextInt()));
            return this;
        }

        public RequestParamBuilder<PARAM> timestamp() {
            paramMap.put(ApiRequestParamConstants.TIMESTAMP, Instant.now().getEpochSecond());
            return this;
        }

        public RequestParamBuilder<PARAM> signature() {
            paramMap.put(ApiRequestParamConstants.SIGNATURE, AuthUtil.calculateSignature(paramMap, ClientConfig.getSecretKey()));
            return this;
        }

        public String build() {
            return JsonUtil.object2Json(paramMap, false);
        }

    }


}
