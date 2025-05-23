package com.meituan.distribution.access.model.order.booking;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderBookingRequest {

    private Long hotelId;

    private Long goodsId;
    // 入住人姓名，以英文逗号分隔，如：姓名A,姓名B
    private String personNames;
    // 联系人姓名
    private String contactName;
    // 联系人电话
    private String contactPhone;
    // 预计最晚到店时间, 格式: yyyy-MM-dd HH:mm:ss
    private String arriveDate;
    // 入住日期，格式：yyyy-MM-dd
    private String checkinDate;
    // 离店日期，格式：yyyy-MM-dd
    private String checkoutDate;
    // 预定间数
    private Integer roomNum;
    // 总价，单位：分
    private Integer totalPrice;
    // 结算价, 单位: 分
    private Integer settlePrice;
    // 分销商订单id
    private String distributorOrderId;
    // 身份证号
    private String personIdentities;
    // 入住人数信息，分销商有对接非落地产品时，必填
    private OccupancyInfo occupancyInfo;
}
