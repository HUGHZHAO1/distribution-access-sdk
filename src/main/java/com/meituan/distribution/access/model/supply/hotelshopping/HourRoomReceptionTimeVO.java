package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Data;


@Data
public class HourRoomReceptionTimeVO {
    private String startTime;
    private String endTime;
    private Integer inStartDate;
    private Integer inEndDate;
}
