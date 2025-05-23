package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;

@Data
public class BreakfastFeesVO {
    /**
     * 收费标准
     * 1：按年龄
     * 2：按身高
     */
    private String type;
    /**
     * 年龄范围
     * M∈[0,17]；
     * N∈[0,17]或N=18，N=18时对应枚举含义“以上”
     */
    private String ageRange;
    /**
     * 身高范围
     * 取值范围[0,181]：
     * [0,180]：以10为最小颗粒度进行取值
     */
    private String HeightRange;
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
}
