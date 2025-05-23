package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;

import java.util.List;

@Data
public class RealRoomBaseVO {
    /**
     * 酒店id
     */
    private Long hotelId;
    /**
     * 物理房型id
     */
    private Integer realRoomId;
    /**
     * 房型名称
     */
    private String name;
    /**
     * 房型名称-英文
     */
    private String nameEn;
    /**
     * 可用面积
     */
    private String useAbleArea;
    /**
     * 楼层
     */
    private String floor;
    /**
     * 房型状态，0：无效，1：有效
     */
    private Integer status;
    /**
     * 加床情况， false 不可加床true 可以加床
     */
    private Boolean allowExtraBed;
    /**
     * 上网方式
     */
    private Integer internetAccess;
    /**
     * 房间描述信息
     */
    private RoomDescriptionVO descriptions;
    /**
     * 床型基本信息
     */
    private List<List<RoomBedVO>> bedGroups;
    /**
     * 容纳人数
     */
    private RoomOccupancyVO occupancy;

    /**
     * 窗户信息
     */
    private RoomWindowVO window;
}
