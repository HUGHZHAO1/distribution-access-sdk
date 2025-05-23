package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetShoppingHotelMultiRequest {
    private List<Long> hotelIds;
    private List<Long> productIds;
    private String checkin;
    private String checkout;
    private RoomCriteriaVO roomCriteria;
    @Builder.Default
    private String currency = "CNY";
    private ShoppingFilterVO filter;
}
