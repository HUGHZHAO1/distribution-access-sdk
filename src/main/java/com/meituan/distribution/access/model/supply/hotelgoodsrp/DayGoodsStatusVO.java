package com.meituan.distribution.access.model.supply.hotelgoodsrp;

import lombok.Data;


@Data
public class DayGoodsStatusVO {
    /**
     * 日期 yyyy-MM-dd
     */
    private String date;
    /**
     * 房态
     */
    private Integer status;

}
