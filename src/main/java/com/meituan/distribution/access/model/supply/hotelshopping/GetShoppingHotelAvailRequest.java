package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetShoppingHotelAvailRequest {

    private Long hotelId;
    private Long productId;
    private String checkin;
    private String checkout;
    private RoomCriteriaVO roomCriteria;
    @Builder.Default
    private String currency = "CNY";
    private ShoppingFilterVO filter;
}
