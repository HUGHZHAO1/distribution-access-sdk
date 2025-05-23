package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;

@Data
public class FeesVO {
    /**
     * 1：儿童使用现有床收费标准
     * 2：加普通床收费标准
     * 3：加婴儿床收费标准
     */
    private String type;
    /**
     * 年龄范围-ageRange
     * 格式：M-N或M；M、N均为整数；现有床、普通床取值范围为（0,17] ,婴儿床取值范围为[0,6]
     */
    private String ageRange;
    /**
     * 收费方式-feeType
     * 0免费
     * 1明确价格收费
     * 2占房费比收费
     */
    private String pattern;
    /**
     * 收费金额-feeAmount
     * 收费方式为明确价格收费，为具体金额；收费方式为占房费比收费，为房费百分比；
     * 数字格式；仅允许输入大于等于0的整数
     */
    private String amount;
    /**
     * 收费单位-feeUnit
     * 0每人每晚
     * 1每人每次入住
     */
    private String unit;
    /**
     * 是否提供早餐
     * 0：不提供儿童早餐
     * 1：提供儿童早餐
     */
    private String hasBreakfast;
    /**
     * 早餐类型
     * 0：儿童早餐不另外收费
     * 1：儿童早餐另外收费
     */
    private String breakfastPattern;
}
