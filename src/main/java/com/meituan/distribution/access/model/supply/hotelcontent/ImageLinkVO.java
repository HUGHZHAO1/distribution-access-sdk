package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;


@Data
public class ImageLinkVO {
    /**
     * 图片大小，300*400
     */
    private String size;
    /**
     * 图片url
     */
    private String url;
    /**
     * 图片描述信息
     */
    private String description;
}
