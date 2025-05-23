package com.meituan.distribution.access.model.supply.suggest;

import lombok.Data;

@Data
public class HotelSuggestResultVO {
    /**
     * 城市ID
     */
    private Long cityCode;
    /**
     * 目的地类型
     */
    private String type;
    /**
     * 地标名或酒店名或地区名
     */
    private String keyword;
    /**
     * 酒店ID
     */
    private Long hotelId;
    /**
     * 酒店地址
     */
    private String address;
    /**
     * 酒店最低价
     */
    private Integer lowestPrice;
}
