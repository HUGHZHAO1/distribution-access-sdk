package com.meituan.distribution.access.model.order.check;

import com.meituan.distribution.access.model.order.booking.OccupancyInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderCheckRequest {
    // 美团酒店id
    private Long hotelId;
    // 美团产品id
    private Long goodsId;
    // 入住日期，格式：yyyy-MM-dd
    private String checkinDate;
    // 离店日期，格式：yyyy-MM-dd
    private String checkoutDate;
    // 预定间数
    private Integer roomNum;
    //订单总价
    private Integer totalPrice;
    // 入住人数信息，分销商有对接非落地产品时，必填
    private OccupancyInfo occupancyInfo;
}
