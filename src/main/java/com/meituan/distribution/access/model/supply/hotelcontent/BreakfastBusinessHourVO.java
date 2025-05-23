package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;

import java.util.List;


@Data
public class BreakfastBusinessHourVO {
    /**
     * 早餐日期,
     * 0星期一
     * 1星期二
     * 2星期三
     * 3星期四
     * 4星期五
     * 5星期六
     * 6星期日
     */
    private Integer weekDay;
    /**
     * 早餐时间段, 存储格式：hh:mm-hh:mm；以00:00-23:59为最大长度。
     */
    private List<String> times;
}
