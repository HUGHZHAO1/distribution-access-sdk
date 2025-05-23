# 分销酒店平台接入SDK

这是美团分销酒店平台的接入SDK DEMO，旨在简化合作伙伴的接入流程。

SDK支持通过配置文件进行配置，无需修改代码即可适应不同的环境和需求。

## 使用方法

在项目的`resources`目录下修改`distribution-platform.properties`文件

##### 配置项说明

| 配置项 | 说明             | 默认值 |
| ----- |----------------| ----- |
| distribution.platform.accessKey | 访问密钥，由平台分配     | accessKey |
| distribution.platform.secretKey | 密钥，由平台分配       | secretKey |
| distribution.platform.partnerBizId | 分销商业务ID，由平台分配  | partnerBizId |
| distribution.platform.http.connectTimeout | HTTP连接超时时间（毫秒） | 5000 |
| distribution.platform.http.readTimeout | HTTP读取超时时间（毫秒） | 10000 |
| distribution.platform.http.writeTimeout | HTTP写入超时时间（毫秒） | 10000 |

## 使用示例
请参考`com.meituan.distribution.access.example.ConfigurationExample`类。


## 注意事项

1. 请妥善保管您的accessKey和secretKey，不要泄露给第三方
2. 在生产环境中，建议将配置文件放在安全的位置，并设置适当的访问权限
3. 如有任何问题，请联系美团分销平台技术支持