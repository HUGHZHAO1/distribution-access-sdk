package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;

import java.util.List;


@Data
public class HotelDetailVO {
    /**
     * 开业时间，格式为yyyy/MM或yyyy/MM/dd
     */
    private String openDate;
    /**
     * 装修时间，格式为yyyy/MM或yyyy/MM/dd
     */
    private String decorationDate;
    /**
     * 酒店填写的营业时间，无固定格式，可能是12小时制或24小时制。
     */
    private String openHours;
    /**
     * 描述信息
     */
    private String description;
    /**
     * 统计信息
     */
    private List<TypeElementVO> statics;
    /**
     * 酒店评分
     */
    private List<TypeElementVO> ratings;
    /**
     * 酒店主题
     */
    private List<NameElementVO> themes;
    /**
     * 酒店品牌
     */
    private NameElementVO brand;
    /**
     * 酒店集团
     */
    private NameElementVO group;
    /**
     * 酒店类型
     */
    private List<NameElementVO> types;
    /**
     * 酒店星级
     */
    private NameElementVO star;
    /**
     * 前台可用的支付方式
     */
    private List<NameElementVO> paymentMethod;
    /**
     * 酒店标签信息
     */
    private List<HotelTagVO> hotelTags;
}
