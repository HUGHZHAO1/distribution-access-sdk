package com.meituan.distribution.access.model.supply.hotelshopping;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;


@Data
public class PromotionVO {

    /**
     * 促销优惠类型
     */
    private String offerType;
    /**
     * 促销活动类型
     */
    private String activityType;
    /**
     * 日均折扣金额
     */
    private Integer avgDiscount;
    /**
     * 入离日期总计折扣金额
     */
    private Integer totalDiscount;
    /**
     * 入离日期整单总计折扣金额
     */
    private Integer orderTotalDiscount;
    /**
     * 折扣日历
     */
    private List<Integer> discountCalendar;
    /**
     * 促销优惠标签
     */
    private String tag;
}
