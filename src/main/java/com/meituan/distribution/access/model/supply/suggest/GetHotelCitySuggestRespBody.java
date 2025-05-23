package com.meituan.distribution.access.model.supply.suggest;

import lombok.Data;

import java.util.List;


@Data
public class GetHotelCitySuggestRespBody {

    private List<HotelSuggestResultVO> hotelCitySuggest;

}
