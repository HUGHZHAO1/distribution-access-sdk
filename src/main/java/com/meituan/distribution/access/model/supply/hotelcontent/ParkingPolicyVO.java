package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;

import java.util.List;


@Data
public class ParkingPolicyVO {
    /**
     * 停车场政策项信息
     */
    private List<HotelPolicyItemVO> policyItems;
}
