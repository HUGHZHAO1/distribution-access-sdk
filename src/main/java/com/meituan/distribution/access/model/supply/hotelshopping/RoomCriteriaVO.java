package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RoomCriteriaVO {
    /**
     * 每个请求的房间总数，返回库存符合预期的产品
     */
    private Integer roomCount;
    /**
     * 每个房间的成人人数
     */
    private Integer adultCount;
    /**
     * 每个房间的儿童人数
     */
    private Integer childCount;
    /**
     * 每个孩子的年龄数组大小必须与孩子数量相同
     */
    private List<Integer> childAges;

}
