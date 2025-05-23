package com.meituan.distribution.access.model.order.check;

import lombok.Data;

import java.util.List;


@Data
public class OrderCheckRespBody {
    // 0 : 校验成功  1 : 校验失败
    private Integer code;
    private String desc;
    List<PriceModelVO> priceModels;
    private Integer remainRoomNum;
}
