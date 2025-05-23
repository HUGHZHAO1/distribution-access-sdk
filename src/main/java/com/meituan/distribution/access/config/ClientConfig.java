package com.meituan.distribution.access.config;

import com.meituan.distribution.access.constants.ClientConfigConstants;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 客户端配置管理类
 * 负责加载和管理配置信息
 */
@Slf4j
public class ClientConfig {
    private static final Properties properties = new Properties();
    private static boolean isInitialized = false;

    private static synchronized void init() {
        if (isInitialized) {
            return;
        }
        try (InputStream inputStream = ClientConfig.class.getClassLoader()
                .getResourceAsStream(ClientConfigConstants.CONFIG_FILE_PATH)) {
            if (inputStream != null) {
                properties.load(inputStream);
                log.info("成功加载配置文件: {}", ClientConfigConstants.CONFIG_FILE_PATH);
            } else {
                log.warn("未找到配置文件: {}，将使用默认配置", ClientConfigConstants.CONFIG_FILE_PATH);
            }
        } catch (IOException e) {
            log.error("加载配置文件失败", e);
        }
        isInitialized = true;
    }

    public static String getString(String key, String defaultValue) {
        if (!isInitialized) {
            init();
        }
        return properties.getProperty(key, defaultValue);
    }

    public static int getInt(String key, int defaultValue) {
        if (!isInitialized) {
            init();
        }
        String value = properties.getProperty(key);
        if (value == null) {
            return defaultValue;
        }
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            log.warn("配置项 {} 的值 {} 不是有效的整数，将使用默认值 {}", key, value, defaultValue);
            return defaultValue;
        }
    }


    public static String getAccessKey() {
        return getString(ClientConfigConstants.ACCESS_KEY, "accessKey");
    }

    public static String getSecretKey() {
        return getString(ClientConfigConstants.SECRET_KEY, "secretKey");
    }

    public static int getPartnerBizId() {
        return getInt(ClientConfigConstants.PARTNER_BIZ_ID, 0);
    }

    public static int getHttpConnectTimeout() {
        return getInt(ClientConfigConstants.HTTP_CONNECT_TIMEOUT, ClientConfigConstants.DEFAULT_CONNECT_TIMEOUT);
    }

    public static int getHttpReadTimeout() {
        return getInt(ClientConfigConstants.HTTP_READ_TIMEOUT, ClientConfigConstants.DEFAULT_READ_TIMEOUT);
    }

    public static int getHttpWriteTimeout() {
        return getInt(ClientConfigConstants.HTTP_WRITE_TIMEOUT, ClientConfigConstants.DEFAULT_WRITE_TIMEOUT);
    }
}