package com.meituan.distribution.access.utils;

import com.meituan.distribution.access.constants.ApiRequestParamConstants;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

@Slf4j
public class AuthUtil {


    private AuthUtil() {}

    private static final String ALGORITHM = "HmacSHA1";

    public static String calculateSignature(Map<String, Object> param, String secretKey) {
        Map<String, Object> sortedParam = sortMapForSignature(param);
        String rawSignStr = getRawSignStr(sortedParam);
        byte[] sk = secretKey.getBytes(StandardCharsets.UTF_8);
        SecretKeySpec secretKeySpec = new SecretKeySpec(sk, ALGORITHM);
        Mac mac = createMac(secretKeySpec);
        return Base64.getEncoder().encodeToString(mac.doFinal(rawSignStr.getBytes(StandardCharsets.UTF_8)));
    }

    private static Map<String, Object> sortMapForSignature(Map<String, Object> oriMap) {
        if (oriMap == null || oriMap.isEmpty()) {
            return Collections.emptyMap();
        }
        oriMap.remove(ApiRequestParamConstants.SIGNATURE);
        Map<String, Object>  sortedMap = new TreeMap<>(Comparator.comparing(String::toLowerCase));
        sortedMap.putAll(oriMap);
        return sortedMap;
    }

    private static String getRawSignStr(Map<String, Object> sortedParam) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String paramKey : sortedParam.keySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("&");
            }
            String value = object2String(sortedParam.get(paramKey));
            if (StringUtils.isBlank(value)) {
                continue;
            }
            stringBuilder.append(paramKey).append("=").append(value);
        }
        return stringBuilder.toString();
    }

    private static Mac createMac(SecretKeySpec secretKey) {
        Mac mac;
        try {
            mac = Mac.getInstance(ALGORITHM);
            mac.init(secretKey);
        } catch (Exception e) {
            log.error("HmacSHA1 init failed", e);
            throw new IllegalArgumentException(e);
        }
        return mac;
    }

    private static String object2String(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        } else {
            return JsonUtil.object2Json(obj, true);
        }
    }

}
