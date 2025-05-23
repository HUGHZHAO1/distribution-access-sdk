package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;


@Data
public class RoomBedVO {
    /**
     * 床型类型
     */
    private String type;
    /**
     * 床型描述
     */
    private String description;
    /**
     * 床数
     */
    private Integer count;
}
