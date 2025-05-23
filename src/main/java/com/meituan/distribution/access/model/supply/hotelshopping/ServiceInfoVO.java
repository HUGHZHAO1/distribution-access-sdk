package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Data;

import java.util.List;


@Data
public class ServiceInfoVO {
    /**
     * 钟点房信息
     */
    private RpUseInfoVO rpUseInfo;
    /**
     * 餐食信息
     */
    private List<MealTypeVO> mealType;
    /**
     * 礼包信息
     */
    private List<GiftVO> gifts;
}
