package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;


@Data
public class CheckInPolicyVO {
    /**
     * 开始入住时间，格式为HH:mm，取值范围为[06:00, 23:30]，半小时为一个取值点
     */
    private String start;
    /**
     * 截止入住时间, 若为0，则表示没有截止入住时间，其他取值半小时为一个取值点
     */
    private String end;
}
