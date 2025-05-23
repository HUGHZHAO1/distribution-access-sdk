package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Data;


@Data
public class InclusivePriceVO {
    /**
     * 日期,格式为yyyy-MM-dd
     */
    private String date;
    /**
     * 售卖价格,单位为分
     */
    private Integer salePrice;
    /**
     * 给分销商的佣金,单位为分
     */
    private Integer subPrice;
}
