package com.meituan.distribution.access.model.supply.listsearch;

import lombok.Data;


@Data
public class HotelListSearchInfoVO {
    /**
     * 酒店ID
     */
    private Long hotelId;
    /**
     * 酒店名称
     */
    private String name;
    /**
     * 酒店星级
     */
    private Integer star;
    /**
     * 酒店评分
     */
    private Integer rating;
    /**
     * 酒店经度
     */
    private Integer longitude;
    /**
     * 纬度
     */
    private Integer latitude;
    /**
     * 酒店品牌名称
     */
    private String brandName;
    /**
     * 酒店集团名称
     */
    private String groupName;
    /**
     * 酒店地址
     */
    private String address;
    /**
     * 酒店头图
     */
    private String frontImg;
    /**
     * 酒店最低价
     */
    private Integer lowestPrice;
}
