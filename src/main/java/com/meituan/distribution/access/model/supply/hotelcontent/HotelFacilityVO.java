package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;

import java.util.List;


@Data
public class HotelFacilityVO {
    /**
     * 类型：酒店服务/酒店设施
     */
    private String category;
    /**
     * 设施服务项信息
     */
    private List<FacilityItemVO> facilityItems;
}
