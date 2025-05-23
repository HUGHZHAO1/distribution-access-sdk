package com.meituan.distribution.access.model.supply.hotelpoilist;

import lombok.Data;

import java.util.List;


@Data
public class GetPoiListRespBody {
    private Long maxId;
    private List<Long> hotelIds;
}
