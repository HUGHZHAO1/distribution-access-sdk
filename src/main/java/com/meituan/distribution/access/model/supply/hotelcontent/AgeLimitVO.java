package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;


@Data
public class AgeLimitVO {
    /**
     * 入住年龄限制，0.不限制 1.限制
     */
    private Integer isLimited;
    /**
     * 入住最大年龄
     * <p>
     * 数字18~99，另增加枚举0，0表示“不限”
     */
    private Integer maxAge;
    /**
     * 入住最小年龄
     * <p>
     * 数字18~99，另增加枚举0，0表示“不限”
     */
    private Integer minAge;
}
