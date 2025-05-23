package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Data;

import java.util.List;


@Data
public class RpUseInfoVO {
    /**
     * 钟点房商家接待时段，空值表示全时段接待
     */
    private List<HourRoomReceptionTimeVO> hourRoomReceptionTime;
    /**
     * 钟点房时间粒度，单位为分钟
     */
    private Integer timeIntervalMin;
    /**
     * 钟点房时长限制，单位为小时
     */
    private Integer timeLimitMin;
}
