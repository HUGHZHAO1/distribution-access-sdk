package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;


@Data
public class CheckOutPolicyVO {
    /**
     * 离店开始时间，若为0（不限），则表示不限制开始离店时间，即“次日离店截止时间之前”，其他值半小时为一个取值点
     */
    private String start;
    /**
     * 离店截止时间，若为0，表示固定小时制，即入住hours小时后离店，其他值半小时为一个取值点
     */
    private String end;
    /**
     * 固定小时后离店，可支持1位小数点
     */
    private Float hours;
}
