package com.meituan.distribution.access.model.supply.hotelcontent;


import lombok.Data;

import java.util.List;


@Data
public class HotelContentRespBody {
    private List<HotelContentVO> hotelContents;
}
