package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;

import java.util.List;


@Data
public class HotelContentVO {
    /**
     * 酒店id
     */
    private Long hotelId;
    /**
     * 酒店基本信息
     */
    private HotelBaseVO baseInfo;
    /**
     * 酒店详细信息
     */
    private HotelDetailVO detailInfo;
    /**
     * 酒店通知
     */
    private List<TypeElementVO> notices;
    /**
     * 服务设施信息
     */
    private List<HotelFacilityVO> facilities;
    /**
     * 酒店图片
     */
    private List<ImageVO> images;
    /**
     * 物理房型基本信息
     */
    private List<RealRoomBaseVO> roomBaseInfos;
    /**
     * 酒店政策
     */
    private HotelPolicyVO policy;
}
