package com.meituan.distribution.access.model.order.query;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderQueryRequest {
    private List<OrderQueryParamItem> queryParams;
}
