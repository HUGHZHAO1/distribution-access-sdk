package com.meituan.distribution.access.model.order.query;

import lombok.Data;


@Data
public class HotelOrderRefundInfoVO {
    //订单中心新平台字段变长，后续废弃这个字段
    @Deprecated
    private Long refundId;
    private Integer refundPrice;
    private Integer refundSettlePrice;
    private String refundTime;
}
