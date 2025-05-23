package com.meituan.distribution.access.model.supply.suggest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetHotelSuggestRequest {

    private String queryText;

    private Long cityCode;

    private String checkin;

    private String checkout;
}
