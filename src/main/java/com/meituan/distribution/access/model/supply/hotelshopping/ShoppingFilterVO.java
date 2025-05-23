package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class ShoppingFilterVO {
    /**
     * 产品类型：1 全日房 2 钟点房 3 全日房和钟点房
     */
    private Integer productType;
    /**
     * 价格筛选区间下界(>=minimumPrice)
     */
    private Integer minimumPrice;
    /**
     * 价格筛选区间上界(<=maximumPrice)
     */
    private Integer maximumPrice;

}
