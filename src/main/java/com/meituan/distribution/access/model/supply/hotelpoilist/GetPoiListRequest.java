package com.meituan.distribution.access.model.supply.hotelpoilist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetPoiListRequest {
    private Long maxId;
    private Integer pageSize;
}
