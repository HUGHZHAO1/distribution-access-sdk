package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;


@Data
public class HotelBaseVO {
    /**
     * 酒店名称
     */
    private String name;
    /**
     * 酒店名称英文
     */
    private String nameEn;
    /**
     * 酒店电话
     */
    private String phone;
    /**
     * 酒店是否可订，true:可订，false:不可订
     */
    private boolean bookable;
    /**
     * 酒店位置信息，包括所在城市、省份、行政区、经纬度等。
     */
    private HotelAddressVO address;
}
