package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Data;


@Data
public class TotalPriceVO {

    /**
     * 总卖价
     */
    private Integer totalSalePrice;

    /**
     * 总佣金
     */
    private Integer totalSubPrice;
}
