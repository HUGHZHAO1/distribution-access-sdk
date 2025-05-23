package com.meituan.distribution.access.model.supply.hotelgoodsrp;

import lombok.Data;


@Data
public class PriceModelVO {
    /**
     * 日期 yyyy-MM-dd
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
    /**
     * 佣金比率,如4%佣金比率则该值为400
     */
    private Integer subRatio;
    /**
     * 价日类型, 0--平日  1--周末  2--特殊日
     */
    private Integer dayType;
}
