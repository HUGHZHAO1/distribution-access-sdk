package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;


@Data
public class HotelPolicyItemVO {
    /**
     * 政策类型
     */
    private String type;
    /**
     * 政策类型名称
     */
    private String name;
    /**
     * 政策值
     */
    private String value;
    /**
     * 政策描述信息
     */
    private String description;
}
