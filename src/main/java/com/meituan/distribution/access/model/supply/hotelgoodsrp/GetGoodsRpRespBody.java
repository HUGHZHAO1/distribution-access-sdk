package com.meituan.distribution.access.model.supply.hotelgoodsrp;

import lombok.Data;

import java.util.List;


@Data
public class GetGoodsRpRespBody {

    private List<HotelGoodsVO> hotelGoods;

}

