package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Data;


@Data
public class MealTypeVO {
    /**
     * 餐食对应的Code
     * code：
     * 无早Room Only                 RO
     * 早餐Bed and Breakfast         BB
     * 午餐Lunch only                LO
     * 晚餐Dinner Only               DO
     * 早午餐Breakfast and Lunch     BL
     * 早晚餐Breakfast and Dinner    BD
     * 午晚餐Lunch and Dinner        LD
     * 早午晚餐 All Inclusive        AI
     * 额外收费 ExtPay               EP (到店付)
     * Example: BB
     */
    private String code;
    /**
     * 餐食对应的描述
     * Example: Bed and Breakfast
     */
    private String desc;
    /**
     * 餐食数量，默认0，（如果是收费，数量与每间客房人数保持一致）
     * Example: 2
     */
    private Integer count;
    /**
     * 规则生效开始日期，0表示默认生效规则；如：20190209，表示该规则2019年2月9号开始生效
     * Example: 0
     */
    private Integer startDate;
    /**
     * 规则生效结束日期，0表示默认生效规则；如：20190210，表示该规则2019年2月10号结束
     * Example: 0
     */
    private Integer endDate;
}
