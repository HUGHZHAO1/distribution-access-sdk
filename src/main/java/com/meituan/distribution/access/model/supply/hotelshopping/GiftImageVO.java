package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Data;


@Data
public class GiftImageVO {

    /**
     * 图片url
     */
    private String url;
    /**
     * 服务选项类型 3:只赠送一次 4:每天赠送一次
     */
    private Integer rank;

}