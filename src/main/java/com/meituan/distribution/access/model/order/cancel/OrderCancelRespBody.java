package com.meituan.distribution.access.model.order.cancel;

import lombok.Data;

@Data
public class OrderCancelRespBody {
    // 美团订单id
    private Long mtOrderId;
    // 分销商订单id
    private String distributorOrderId;
    // 响应状态, 0表示取消成功
    private Integer code;
    // 文案描述
    private String desc;
}
