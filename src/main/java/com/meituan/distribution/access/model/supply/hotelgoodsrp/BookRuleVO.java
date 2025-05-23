package com.meituan.distribution.access.model.supply.hotelgoodsrp;

import lombok.Data;


@Data
public class BookRuleVO {
    /**
     * 连续入住最少天数，0表示不限制
     */
    private Integer serialCheckinMin;
    /**
     * 连续入住最多天数，0表示不限制
     */
    private Integer serialCheckinMax;
    /**
     * 最少预订间数，0表示不限制
     */
    private Integer roomCountMin;
    /**
     * 最多预订间数，0表示不限制
     */
    private Integer roomCountMax;
    /**
     * 最早预订天数，空值或0或-1表示不限制
     */
    private Integer earliestBookingDays;
    /**
     * 最早预订时间，格式为HH:mm:ss, 空值表示不限制
     */
    private String earliestBookingHours;
    /**
     * 最晚预订天数，可能取值-1,0,正数。其中0表示当天，1表示提前一天，-1表示支持凌晨预订
     */
    private Integer latestBookingDays;
    /**
     * 最晚预订时间，格式为HH:mm:ss, 空值表示不限制
     */
    private String latestBookingHours;
    /**
     * 是否支持凌晨预订
     * 1 支持，
     * 0 不支持
     */
    private Integer isDaybreakBooking;
    /**
     * 限时特惠规则生效开始日期，0表示默认生效规则；如：20320209，表示该规则2032年02月09号开始生效。
     */
    private Integer inStartDate;
    /**
     * 限时特惠规则生效结束日期，0表示默认生效规则；如：20210210，表示该规则2021年02月10号结束
     */
    private Integer inEndDate;
}
