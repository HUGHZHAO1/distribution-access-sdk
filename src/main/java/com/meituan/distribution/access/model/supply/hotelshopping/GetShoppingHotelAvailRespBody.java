package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Data;

import java.util.List;


@Data
public class GetShoppingHotelAvailRespBody {
    private List<AvailabilityVO> availability;
}
