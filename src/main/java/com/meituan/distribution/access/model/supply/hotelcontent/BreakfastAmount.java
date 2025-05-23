package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;


@Data
public class BreakfastAmount {
    /**
     * 早餐金额，单位元
     */
    private String price;
    /**
     * 早餐币种，人民币RMB
     */
    private String currency;
}
