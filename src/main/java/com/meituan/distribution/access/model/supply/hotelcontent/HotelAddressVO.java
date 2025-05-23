package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;

import java.util.List;


@Data
public class HotelAddressVO {
    /**
     * 国家信息
     */
    private NameEnElementVO country;
    /**
     * 省份信息
     */
    private NameEnElementVO province;
    /**
     * 城市信息
     */
    private NameEnElementVO city;
    /**
     * 行政区
     */
    private NameEnElementVO area;
    /**
     * 商业区
     */
    private List<NameElementVO> businessDistricts;
    /**
     * 酒店详细地址
     */
    private AddressLineVO addressLine;
    /**
     * 经纬度
     */
    private List<CoordinateVO> coordinates;
}
