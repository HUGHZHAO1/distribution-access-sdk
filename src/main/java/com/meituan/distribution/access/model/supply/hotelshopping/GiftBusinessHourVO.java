package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Data;

import java.util.List;


@Data
public class GiftBusinessHourVO {

    private String startTime;

    private String endTime;

    private List<Integer> effectWeek;

    private String startDate;

    private String endDate;
}
