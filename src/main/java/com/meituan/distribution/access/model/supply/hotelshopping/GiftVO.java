package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Data;

import java.util.List;


@Data
public class GiftVO {
    private Integer giveType;
    private String giftName;
    private String giftDesc;
    private Integer giftPrice;
    private Integer availableDateType;
    private List<GiftDateVO> availableDate;
    /**
     * 景点名称
     */
    private String sPoiName;
    /**
     * 景点地址
     */
    private String sAddress;
    /**
     * 成人最大数
     */
    private String adultMax;
    /**
     * 成人最小数
     */
    private String adultMin;
    /**
     * 儿童数
     */
    private String child;
    /**
     * 入园方式/就餐方式
     */
    private String entryMode;
    /**
     * 礼包类型：21：景点  22：餐饮  23：玩乐
     */
    private int giftTemplate;
    /**
     * 适用于餐饮，结束时间
     */
    private String mealTimeEndTime;
    /**
     * 适用于餐饮，开始时间
     */
    private String mealTimeStartTime;

    /**
     * 其他说明
     */
    private String otherDescription;
    /**
     * 是否自助, 礼包类型为餐时使用。
     */
    private Boolean offerBuffet;
    /**
     * 产品图片
     */
    private List<GiftImageVO> images;
    /**
     * 营业时间
     */
    private List<GiftBusinessHourVO> businessHours;
    /**
     * 项目内容
     */
    private List<GiftItemInfoVO> itemContents;

    /**
     * 二级品类，可动态变化
     */
    private Long secType;

    /**
     * 实体凭证
     */
    private GiftCertificateModelVO giftCertificateModel;
    /**
     * 可用规则
     */
    private String availableRule;
}
