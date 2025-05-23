package com.meituan.distribution.access.model.supply.hotelrealroom;

import lombok.Data;

import java.util.List;


@Data
public class RealRoomContentRespBody {
    /**
     * 物理房型信息列表
     */
    private List<RealRoomContentVO> roomContents;
}
