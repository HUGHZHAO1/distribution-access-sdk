package com.meituan.distribution.access.model.supply.hotelgoodsrp;


import lombok.Data;

import java.util.List;

@Data
public class BookingTimeRuleVO {

    private Integer inStartDate;

    private Integer inEndDate;

    private List<EnableBookingTimePeriodVO> enableBookingTimePeriods;

    private Integer limitType;

    private Integer validDateType;

    private Integer enableBookingType;
}
