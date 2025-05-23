package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;

import java.util.List;


@Data
public class HotelPolicyVO {
    /**
     * 入店政策
     */
    private CheckInPolicyVO checkinPolicy;
    /**
     * 离店政策
     */
    private CheckOutPolicyVO checkOutPolicy;
    /**
     * 住客政策
     */
    private GuestPolicyVO guestPolicy;
    /**
     * 早餐政策
     */
    private BreakfastPolicyVO breakfastPolicy;
    /**
     * 宠物政策
     */
    private PetPolicyVO petPolicy;
    /**
     * 停车场政策
     */
    private List<ParkingPolicyVO> parkingPolicies;
    /**
     * 充电车位政策
     */
    private List<ChargePointPolicyVO> chargePointPolicies;
    /**
     * 儿童及加床政策
     */
    private ChildPolicyVO childPolicy;
}
