package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Data;


@Data
public class BedVO {

    /**
     * 床型类型
     */
    private String bedType;
    /**
     * 床型描述
     */
    private String bedDesc;
    /**
     * 床数
     */
    private Integer bedCount;
}
