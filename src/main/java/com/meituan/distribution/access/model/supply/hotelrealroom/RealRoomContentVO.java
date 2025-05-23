package com.meituan.distribution.access.model.supply.hotelrealroom;

import lombok.Data;

import java.util.List;
import java.util.Map;


@Data
public class RealRoomContentVO {
    /**
     * 物理房型基本信息
     */
    private RealRoomBaseVO baseInfo;
    /**
     * 房型设施
     */
    private Map<Integer, FacilityItemVO> facilities;
    /**
     * 房型图片
     */
    private List<ImageVO> images;
    /**
     * 儿童及加床政策
     */
    private RealRoomChildPolicyVO childPolicy;
}
