package com.meituan.distribution.access.model.supply.hotelgoodsrp;

import lombok.Data;

@Data
public class CancelRuleVO {
    /**
     * 取消规则：
     * 0 不可取消
     * 1 可以取消
     */
    private Integer cancelType;
    /**
     * 提前取消天数，aheadCancelDays=0表示可以入住当日取消
     */
    private Integer aheadCancelDays;
    /**
     * 提前取消时间类型：
     * 0 时间
     * 1 时间量
     */
    private Integer deductType;
    /**
     * 提前取消的时间值或时间量值
     * deductType=0 格式为"HH:mm:ss", 例如: deductType=0，aheadCancelDays=0，aheadCancelHours="18:00:00",表示入住日18:00前可以取消；
     * deductType=1 格式为"数字", 例如: deductType=1，aheadCancelDays=0，aheadCancelHours=4表示入住日20:00前可以取消（提前4小时即24 - 4 = 20:00点）。
     */
    private String aheadCancelHours;

}
