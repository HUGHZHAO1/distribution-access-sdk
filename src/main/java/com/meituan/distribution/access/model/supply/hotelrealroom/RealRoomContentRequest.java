package com.meituan.distribution.access.model.supply.hotelrealroom;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RealRoomContentRequest {
    /**
     * 酒店id
     */
    private Long hotelId;
    /**
     * 物理房型id列表
     */
    private List<Integer> realRoomIds;
}
