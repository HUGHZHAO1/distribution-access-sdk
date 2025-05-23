package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Data;

import java.util.List;


@Data
public class ProductRoomVO {
    /**
     * 房型id
     */
    private Long roomId;
    /**
     * 房型的名称
     */
    private String roomName;
    /**
     * 床型
     */
    private List<List<BedVO>> bedGroups;
    /**
     * 是否有窗 0 有窗 1 部分有窗 2 无窗
     */
    private Integer window;

    /**
     * 是否允许加床,0 不可 1 可以
     */
    private Integer extraBed;
}
