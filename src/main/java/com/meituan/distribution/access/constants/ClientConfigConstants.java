package com.meituan.distribution.access.constants;

/**
 * 客户端配置常量类，定义配置文件中的键名
 */
public class ClientConfigConstants {
    // 配置文件路径
    public static final String CONFIG_FILE_PATH = "distribution-platform.properties";

    // 使用模式
    public static final String USE_MODE = "distribution.sdk.useMode";

    // 正式账号配置
    public static final String ACCESS_KEY = "distribution.platform.accessKey";
    public static final String SECRET_KEY = "distribution.platform.secretKey";
    public static final String PARTNER_BIZ_ID = "distribution.platform.partnerBizId";

    // 卖价模式联调配置
    public static final String TEST_ACCESS_KEY = "distribution.platform.test.accessKey";
    public static final String TEST_SECRET_KEY = "distribution.platform.test.secretKey";

    // 结算价模式联调配置
    public static final String TEST_SETTLE_ACCESS_KEY = "distribution.platform.test.settle.accessKey";
    public static final String TEST_SETTLE_SECRET_KEY = "distribution.platform.test.settle.secretKey";

    // HTTP配置项键名
    public static final String HTTP_CONNECT_TIMEOUT = "distribution.platform.http.connectTimeout";
    public static final String HTTP_READ_TIMEOUT = "distribution.platform.http.readTimeout";
    public static final String HTTP_WRITE_TIMEOUT = "distribution.platform.http.writeTimeout";

    // 默认值
    public static final int DEFAULT_CONNECT_TIMEOUT = 5000;
    public static final int DEFAULT_READ_TIMEOUT = 10000;
    public static final int DEFAULT_WRITE_TIMEOUT = 10000;

    // 使用模式常量
    public static final int USE_MODE_FORMAL = 1;           // 正式账号
    public static final int USE_MODE_TEST_PRICE = 2;       // 卖价模式联调
    public static final int USE_MODE_TEST_SETTLE_PRICE = 3; // 结算价模式联调
}
