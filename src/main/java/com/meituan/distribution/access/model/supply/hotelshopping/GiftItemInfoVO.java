package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Data;

import java.util.List;


@Data
public class GiftItemInfoVO {

    private String itemType;

    private List<GiftItemDetailVO> itemDetails;

    private GiftItemOfferRuleVO itemOfferRule;
}
