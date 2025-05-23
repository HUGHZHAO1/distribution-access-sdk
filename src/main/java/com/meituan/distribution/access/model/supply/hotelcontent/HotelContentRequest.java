package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HotelContentRequest {
    /**
     * 酒店id列表
     */
    private List<Long> hotelIds;
    /**
     * 酒店内容包括信息
     */
    private List<String> include;
}
