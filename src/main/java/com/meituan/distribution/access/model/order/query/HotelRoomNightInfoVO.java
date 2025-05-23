package com.meituan.distribution.access.model.order.query;

import lombok.Data;


@Data
public class HotelRoomNightInfoVO {
    private String bizDate;
    private Integer appointmentStatus;
    private Integer payStatus;
    private Integer sellPrice;
    private Integer subPrice;
    private String mealsDate;
    private Integer breakfastType;
    private Integer breakfastNum;
}
