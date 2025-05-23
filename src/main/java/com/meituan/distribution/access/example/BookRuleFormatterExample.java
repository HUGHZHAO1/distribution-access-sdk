package com.meituan.distribution.access.example;

import com.meituan.distribution.access.model.supply.hotelgoodsrp.BookRuleVO;
import com.meituan.distribution.access.utils.BookRuleFormatter;
import lombok.extern.slf4j.Slf4j;

/**
 * 预订规则格式化工具使用示例
 */
@Slf4j
public class BookRuleFormatterExample {

    public static void main(String[] args) {
        try {
            // 示例1: 连续入住限制
            BookRuleVO rule1 = new BookRuleVO();
            rule1.setSerialCheckinMin(2);
            rule1.setSerialCheckinMax(5);
            String result1 = BookRuleFormatter.format(rule1);
            log.info("示例1 - 连续入住限制: {}", result1);

            // 示例2: 预订间数限制
            BookRuleVO rule2 = new BookRuleVO();
            rule2.setRoomCountMin(1);
            rule2.setRoomCountMax(3);
            String result2 = BookRuleFormatter.format(rule2);
            log.info("示例2 - 预订间数限制: {}", result2);

            // 示例3: 预订时间限制
            BookRuleVO rule3 = new BookRuleVO();
            rule3.setEarliestBookingDays(7);
            rule3.setLatestBookingDays(1);
            rule3.setLatestBookingHours("18:00:00");
            String result3 = BookRuleFormatter.format(rule3);
            log.info("示例3 - 预订时间限制: {}", result3);

            // 示例4: 凌晨预订
            BookRuleVO rule4 = new BookRuleVO();
            rule4.setIsDaybreakBooking(1);
            String result4 = BookRuleFormatter.format(rule4);
            log.info("示例4 - 凌晨预订: {}", result4);

            // 示例5: 规则有效期
            BookRuleVO rule5 = new BookRuleVO();
            rule5.setInStartDate(20230601);
            rule5.setInEndDate(20231231);
            String result5 = BookRuleFormatter.format(rule5);
            log.info("示例5 - 规则有效期: {}", result5);

            // 示例6: 复合规则
            BookRuleVO rule6 = new BookRuleVO();
            rule6.setSerialCheckinMin(2);
            rule6.setRoomCountMax(2);
            rule6.setEarliestBookingDays(3);
            rule6.setLatestBookingDays(0);
            rule6.setLatestBookingHours("20:00:00");
            rule6.setIsDaybreakBooking(1);
            rule6.setInStartDate(20230101);
            rule6.setInEndDate(20231231);
            String result6 = BookRuleFormatter.format(rule6);
            log.info("示例6 - 复合规则: {}", result6);
        } catch (Exception e) {
            log.error("运行示例时发生错误: {}", e.getMessage(), e);
        }
    }
}