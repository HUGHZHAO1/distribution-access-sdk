package com.meituan.distribution.access.model.supply.hotelrealroom;

import lombok.Data;


@Data
public class FacilityItemVO {
    /**
     * 设施属性id
     */
    private Integer id;
    /**
     * 设施名称
     */
    private String name;
    /**
     * 设施属性值
     */
    private String value;
}
