package com.meituan.distribution.access.model.supply.listsearch;

import lombok.Data;

import java.util.List;


@Data
public class HotelListSearchVO {
    private Long totalCount;
    private List<HotelListSearchInfoVO> hotelListSearchInfo;
    private String nextId;
}
