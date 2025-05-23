package com.meituan.distribution.access.model.supply.hotelgoodsrp;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetGoodsRpRequest {

    private List<Long> hotelIds;

    private List<Long> goodsIds;

    private String checkinDate;

    private String checkoutDate;

    private Integer goodsType;

    private List<String> queryInfoDimensions;
}
