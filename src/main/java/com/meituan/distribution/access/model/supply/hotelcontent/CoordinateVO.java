package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;



@Data
public class CoordinateVO {
    /**
     * 经度=实际经度*10^6
     */
    private Long longitude;
    /**
     * 纬度=实际纬度*10^6
     */
    private Long latitude;
    /**
     * 坐标类型:
     * "GAODE" ：高德
     * "BAIDU"：百度
     * "MAPBAR"：图吧
     */
    private String provider;
}
