package com.meituan.distribution.access.model.order.query;

import lombok.Data;

@Data
public class HotelOrderAptInfoVO {
    private Long mtOrderId;
    private String checkInTime;
    private String checkOutTime;
    private String arriveTime;
    private String comment;
    private Integer roomCount;
    private String roomName;
    private Integer roomId;
    private Long hotelId;
    private String poiName;
    private String personNames;
    private String contactName;
    private String contactPhone;
}
