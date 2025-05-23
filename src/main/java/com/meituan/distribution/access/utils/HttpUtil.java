package com.meituan.distribution.access.utils;

import com.meituan.distribution.access.config.ClientConfig;
import lombok.extern.slf4j.Slf4j;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


@Slf4j
public class HttpUtil {

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static OkHttpClient CLIENT;

    static {
        initHttpClient();
    }

    /**
     * 初始化HTTP客户端
     * 从配置中读取超时设置
     */
    private static synchronized void initHttpClient() {
        if (CLIENT == null) {
            CLIENT = new OkHttpClient.Builder()
                    .connectTimeout(ClientConfig.getHttpConnectTimeout(), TimeUnit.MILLISECONDS)
                    .readTimeout(ClientConfig.getHttpReadTimeout(), TimeUnit.MILLISECONDS)
                    .writeTimeout(ClientConfig.getHttpWriteTimeout(), TimeUnit.MILLISECONDS)
                    .build();
            log.info("Http client init success，connectTimeout: {}ms, readTimeout: {}ms, writeTimeout: {}ms",
                    ClientConfig.getHttpConnectTimeout(),
                    ClientConfig.getHttpReadTimeout(),
                    ClientConfig.getHttpWriteTimeout());
        }
    }

    private HttpUtil() {}

    /**
     * 发送POST请求
     *
     * @param url 请求URL
     * @param requestBody 请求体
     * @return 响应内容
     * @throws IOException 请求异常
     */
    public static String post(String url, String requestBody) throws IOException {
        RequestBody body = RequestBody.create(requestBody, JSON);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        try (Response response = CLIENT.newCall(request).execute()) {
            int statusCode = response.code();
            ResponseBody responseBody = response.body();
            String responseString = responseBody != null ? responseBody.string() : "";

            if (response.isSuccessful()) {
                return responseString;
            } else {
                log.error("Http request failed with status code: {}", statusCode);
                throw new IOException("Http request failed with status code: " + statusCode);
            }
        }
    }
}