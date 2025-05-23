package com.meituan.distribution.access.model.order.query;

import lombok.Data;

@Data
public class HotelOrderBaseInfoVO {
    private Long mtOrderId;
    private Integer totalPrice;
    private Integer settlePrice;
    private String createTime;
    private Integer orderStatus;
    private Integer goodsType;
    private Long goodsId;
    private Boolean fixRoom;
    private String misc;
    private String confirmationNumber;
    private String cancellationNumber;
}
