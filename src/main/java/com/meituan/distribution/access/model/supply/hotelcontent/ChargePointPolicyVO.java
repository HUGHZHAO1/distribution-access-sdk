package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;

import java.util.List;



@Data
public class ChargePointPolicyVO {

    private List<HotelPolicyItemVO> policyItems;
}
