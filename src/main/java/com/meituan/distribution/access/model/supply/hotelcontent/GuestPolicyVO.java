package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;

@Data
public class GuestPolicyVO {
    /**
     * 外宾政策
     */
    private NameElementVO guestType;
    /**
     * 儿童及加床
     */
    private String children;
    /**
     * 年龄限制
     */
    private AgeLimitVO ageLimit;
}
