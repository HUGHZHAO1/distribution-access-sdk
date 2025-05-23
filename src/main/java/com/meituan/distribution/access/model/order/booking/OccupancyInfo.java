package com.meituan.distribution.access.model.order.booking;

import lombok.Data;

import java.util.List;

@Data
public class OccupancyInfo {
    /**
     * 入住成人数
     */
    private Integer adultCount;
    /**
     * 入住儿童数
     */
    private Integer childCount;
    /**
     * 入住儿童年龄
     */
    private List<Integer> childAges;
}
