package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Data;

import java.util.List;


@Data
public class RpGuaranteeVO {
    /**
     * 担保类型：0-非担保，1-首晚担保，2-整单担保
     */
    public int guaranteeType;
    /**
     * 担保作用时间类型：0-全部日期，1-特殊日期
     */
    public int guaranteeTimeType;
    /**
     * 计到店时间，格式：HH:mm:ss
     */
    public String arrivalHour;
    /**
     * 特殊日期时间段列表
     */
    public List<DatePeriodVO> datePeriods;
}
