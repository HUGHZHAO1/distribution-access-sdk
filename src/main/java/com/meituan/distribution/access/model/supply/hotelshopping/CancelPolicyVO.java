package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Data;


@Data
public class CancelPolicyVO {
    /**
     * 取消规则：0 不可取消  1 可以取消
     * Example: 0
     */
    private Integer cancelType;
    /**
     * 提前取消天数 0表是当天
     */
    private Integer moveUpCancelDays;
    /**
     * 提前取消的时间值
     * <p>
     * 格式为"HH:mm:ss", 例如: deductType=0，aheadCancelDays=0，aheadCancelHours="18:00:00",表示入住日18:00前可以取消；
     */
    private String moveUpCancelHour;
    /**
     * 如果罚款是固定收费，则存在，例如 30表示收取30人民币 （境外可能需要根据汇率进行换算）
     * example: 30
     */
    private Integer amount;
    /**
     * 如果罚款是基于晚上的，比如预订3晚，则收取前2晚罚金
     * example: 2
     */
    private Integer nights;
    /**
     * 如果罚款是百分比，则存在，例如 10 表示收取整单的10%
     * example: 10
     */
    private Integer percent;
}
