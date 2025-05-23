package com.meituan.distribution.access.model.order.query;

import lombok.Data;

import java.util.List;


@Data
public class HotelOrderInfoVO {
    private HotelOrderBaseInfoVO baseInfo;
    private HotelOrderAptInfoVO aptInfo;
    private List<HotelRoomNightInfoVO> roomNights;
    private List<HotelOrderRefundInfoVO> refundInfos;
}
