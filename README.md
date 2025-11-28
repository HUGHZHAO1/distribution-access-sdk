# 分销酒店平台接入SDK

这是美团分销酒店平台的接入SDK DEMO，旨在简化合作伙伴的接入流程。

SDK支持通过配置文件进行配置，无需修改代码即可适应不同的环境和需求。

## 功能特性

- 支持正式账号模式
- 支持卖价模式联调
- 支持结算价模式联调
- 灵活的配置管理，通过配置文件即可切换不同模式

## 使用方法

在项目的`resources`目录下修改`distribution-platform.properties`文件

### 配置项说明

#### 基础配置

| 配置项 | 说明             | 可选值 | 默认值 |
| ----- |----------------| ----- | ----- |
| distribution.platform.useMode | 使用模式 | 1=正式账号<br>2=卖价模式联调<br>3=结算价模式联调 | 1 |
| distribution.platform.partnerBizId | 分销商业务ID，由平台分配  | - | 0 |

#### 正式账号配置

| 配置项 | 说明             | 默认值 |
| ----- |----------------| ----- |
| distribution.platform.accessKey | 正式账号访问密钥，由平台分配     | accessKey |
| distribution.platform.secretKey | 正式账号密钥，由平台分配       | secretKey |

#### 卖价模式联调配置

| 配置项 | 说明             | 默认值 |
| ----- |----------------| ----- |
| distribution.platform.test.accessKey | 卖价模式联调访问密钥，由平台分配     | testAccessKey |
| distribution.platform.test.secretKey | 卖价模式联调密钥，由平台分配       | testSecretKey |

#### 结算价模式联调配置

| 配置项 | 说明             | 默认值 |
| ----- |----------------| ----- |
| distribution.platform.test.settle.accessKey | 结算价模式联调访问密钥，由平台分配     | testSettleAccessKey |
| distribution.platform.test.settle.secretKey | 结算价模式联调密钥，由平台分配       | testSettleSecretKey |

#### HTTP客户端配置

| 配置项 | 说明             | 默认值 |
| ----- |----------------| ----- |
| distribution.platform.http.connectTimeout | HTTP连接超时时间（毫秒） | 5000 |
| distribution.platform.http.readTimeout | HTTP读取超时时间（毫秒） | 10000 |
| distribution.platform.http.writeTimeout | HTTP写入超时时间（毫秒） | 10000 |

## 使用示例

### 1. 正式账号模式

在 `distribution-platform.properties` 中配置：

```properties
# 使用正式账号
distribution.platform.useMode=1
distribution.platform.partnerBizId=YOUR_PARTNER_BIZ_ID
distribution.platform.accessKey=YOUR_ACCESS_KEY
distribution.platform.secretKey=YOUR_SECRET_KEY
```

此模式下，SDK 将使用正式账号的密钥进行签名，请求中不包含 test 标识。

> **注意**：正式账号的 accessKey 和 secretKey 需要向平台单独申请，每个合作伙伴的密钥都不相同。

### 2. 卖价模式联调

在 `distribution-platform.properties` 中配置：

```properties
# 使用卖价模式联调（只需修改 useMode 即可）
distribution.platform.useMode=2
distribution.platform.partnerBizId=YOUR_PARTNER_BIZ_ID
```

此模式下，SDK 将使用卖价模式联调的共密钥进行签名，请求中会自动添加 `"test": "test"` 标识。

> **重要提示**：卖价模式联调使用平台统一提供的共密钥，**已在配置文件中预设，无需修改**。只需将 `useMode` 改为 `2` 即可。

### 3. 结算价模式联调

在 `distribution-platform.properties` 中配置：

```properties
# 使用结算价模式联调（只需修改 useMode 即可）
distribution.platform.useMode=3
distribution.platform.partnerBizId=YOUR_PARTNER_BIZ_ID
```

此模式下，SDK 将使用结算价模式联调的共密钥进行签名，请求中会自动添加 `"test": "testSettlePrice"` 标识。

> **重要提示**：结算价模式联调使用平台统一提供的共密钥，**已在配置文件中预设，无需修改**。只需将 `useMode` 改为 `3` 即可。

### 代码示例

请参考 `com.meituan.distribution.access.example.ConfigurationExample` 类。

## 模式切换说明

SDK 会根据 `distribution.platform.useMode` 的配置自动：

1. **选择对应的密钥**：不同模式使用不同的 accessKey 和 secretKey
2. **添加 test 标识**：联调模式会在请求参数中自动添加对应的 test 标识
3. **计算签名**：使用对应模式的 secretKey 计算请求签名

### 快速切换模式

**联调阶段**（共密钥已预设）：
- 卖价模式联调：只需设置 `distribution.platform.useMode=2`
- 结算价模式联调：只需设置 `distribution.platform.useMode=3`
- **无需修改任何密钥配置**，SDK 会自动使用预设的共密钥

**正式上线**：
1. 向平台申请正式账号的 accessKey 和 secretKey
2. 在配置文件中填写正式账号的密钥
3. 设置 `distribution.platform.useMode=1`

> **核心要点**：联调阶段切换模式，**只需修改 `useMode` 参数**，无需修改任何代码或其他配置！

## 注意事项

1. 请妥善保管您的accessKey和secretKey，不要泄露给第三方
2. 在生产环境中，建议将配置文件放在安全的位置，并设置适当的访问权限
3. 如有任何问题，请联系美团分销平台技术支持