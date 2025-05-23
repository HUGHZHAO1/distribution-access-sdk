package com.meituan.distribution.access.utils;

import com.meituan.distribution.access.model.supply.hotelgoodsrp.BookRuleVO;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 预订规则格式化工具
 * 将BookRuleVO中的参数转换为易读的文本描述
 */
public class BookRuleFormatter {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final DateTimeFormatter DISPLAY_DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

    private BookRuleFormatter() {}

    /**
     * 将BookRuleVO转换为易读的文本描述
     *
     * @param rule 预订规则对象
     * @return 文本描述
     */
    public static String format(BookRuleVO rule) {
        if (rule == null) {
            return "无预订规则";
        }
        StringBuilder description = new StringBuilder();
        // 添加入住天数限制
        appendStayLimits(description, rule);
        // 添加预订间数限制
        appendRoomCountLimits(description, rule);
        // 添加预订时间限制
        appendBookingTimeLimits(description, rule);
        // 添加规则有效期
        appendRuleValidityPeriod(description, rule);
        return description.toString();
    }

    /**
     * 添加入住天数限制描述
     */
    private static void appendStayLimits(StringBuilder description, BookRuleVO rule) {
        Integer minStay = rule.getSerialCheckinMin();
        Integer maxStay = rule.getSerialCheckinMax();

        if ((minStay != null && minStay > 0) || (maxStay != null && maxStay > 0)) {
            description.append("【入住限制】");

            if (minStay != null && minStay > 0 && maxStay != null && maxStay > 0) {
                if (minStay.equals(maxStay)) {
                    description.append("必须连续入住").append(minStay).append("晚");
                } else {
                    description.append("连续入住").append(minStay).append("至").append(maxStay).append("晚");
                }
            } else if (minStay != null && minStay > 0) {
                description.append("至少连续入住").append(minStay).append("晚");
            } else {
                description.append("最多连续入住").append(maxStay).append("晚");
            }
            description.append("。");
        }
    }

    /**
     * 添加预订间数限制描述
     */
    private static void appendRoomCountLimits(StringBuilder description, BookRuleVO rule) {
        Integer minRooms = rule.getRoomCountMin();
        Integer maxRooms = rule.getRoomCountMax();

        if ((minRooms != null && minRooms > 0) || (maxRooms != null && maxRooms > 0)) {
            description.append("【预订间数】");

            if (minRooms != null && minRooms > 0 && maxRooms != null && maxRooms > 0) {
                if (minRooms.equals(maxRooms)) {
                    description.append("必须预订").append(minRooms).append("间");
                } else {
                    description.append("可预订").append(minRooms).append("至").append(maxRooms).append("间");
                }
            } else if (minRooms != null && minRooms > 0) {
                description.append("至少预订").append(minRooms).append("间");
            } else {
                description.append("最多预订").append(maxRooms).append("间");
            }

            description.append("。");
        }
    }

    /**
     * 添加预订时间限制描述
     */
    private static void appendBookingTimeLimits(StringBuilder description, BookRuleVO rule) {
        Integer earliestDays = rule.getEarliestBookingDays();
        String earliestHours = rule.getEarliestBookingHours();
        Integer latestDays = rule.getLatestBookingDays();
        String latestHours = rule.getLatestBookingHours();
        Integer isDaybreakBooking = rule.getIsDaybreakBooking();

        if (hasBookingTimeRestrictions(earliestDays, earliestHours, latestDays, latestHours, isDaybreakBooking)) {
            description.append("【预订时间】");

            // 最早预订时间
            if (earliestDays != null && earliestDays > 0) {
                description.append("最早可提前").append(earliestDays).append("天");
                
                if (StringUtils.isNotBlank(earliestHours)) {
                    description.append(earliestHours);
                }
                
                description.append("预订");
            }

            // 如果同时有最早和最晚限制，添加分隔符
            if (earliestDays != null && earliestDays > 0 && 
                ((latestDays != null && latestDays >= -1) || StringUtils.isNotBlank(latestHours))) {
                description.append("，");
            }

            // 最晚预订时间
            if (latestDays != null) {
                if (latestDays == 0) {
                    description.append("最晚可当天");
                } else if (latestDays > 0) {
                    description.append("最晚需提前").append(latestDays).append("天");
                } else if (latestDays == -1) {
                    description.append("支持凌晨预订");
                }
                
                if (StringUtils.isNotBlank(latestHours) && latestDays >= 0) {
                    description.append(latestHours);
                }
                
                if (latestDays >= 0) {
                    description.append("预订");
                }
            } else if (StringUtils.isNotBlank(latestHours)) {
                description.append("最晚").append(latestHours).append("前预订");
            }

            // 凌晨预订
            if (isDaybreakBooking != null && isDaybreakBooking == 1 && 
                (latestDays == null || latestDays != -1)) {
                if (description.toString().endsWith("预订")) {
                    description.append("，");
                } else if (!description.toString().endsWith("【预订时间】")) {
                    description.append("，");
                }
                description.append("支持凌晨预订");
            }

            description.append("。");
        }
    }

    /**
     * 检查是否有预订时间限制
     */
    private static boolean hasBookingTimeRestrictions(
            Integer earliestDays, String earliestHours, 
            Integer latestDays, String latestHours, 
            Integer isDaybreakBooking) {
        
        return (earliestDays != null && earliestDays > 0) || 
               StringUtils.isNotBlank(earliestHours) || 
               (latestDays != null && latestDays >= -1) || 
               StringUtils.isNotBlank(latestHours) || 
               (isDaybreakBooking != null && isDaybreakBooking == 1);
    }

    /**
     * 添加规则有效期描述
     */
    private static void appendRuleValidityPeriod(StringBuilder description, BookRuleVO rule) {
        Integer startDate = rule.getInStartDate();
        Integer endDate = rule.getInEndDate();

        if ((startDate != null && startDate > 0) || (endDate != null && endDate > 0)) {
            description.append("【规则有效期】");

            if (startDate != null && startDate > 0 && endDate != null && endDate > 0) {
                description.append("从").append(formatDate(startDate))
                          .append("至").append(formatDate(endDate));
            } else if (startDate != null && startDate > 0) {
                description.append("从").append(formatDate(startDate)).append("开始生效");
            } else {
                description.append("截止至").append(formatDate(endDate));
            }

            description.append("。");
        }
    }

    /**
     * 格式化日期为易读格式
     */
    private static String formatDate(Integer dateInt) {
        if (dateInt == null || dateInt <= 0) {
            return "";
        }
        try {
            String dateStr = String.valueOf(dateInt);
            LocalDate date = LocalDate.parse(dateStr, DATE_FORMATTER);
            return date.format(DISPLAY_DATE_FORMATTER);
        } catch (Exception e) {
            return String.valueOf(dateInt);
        }
    }
}