package com.meituan.distribution.access.model.order.query;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderQueryParamItem {
    // 美团订单id
    private Long mtOrderId;
    // 分销商订单id
    private String distributorOrderId;
}
