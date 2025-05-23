package com.meituan.distribution.access.model.order.query;

import lombok.Data;

import java.util.List;

@Data
public class OrderQueryRespBody {

    private Integer code;
    private String desc;
    private List<HotelOrderInfoVO> orderInfos;

}
