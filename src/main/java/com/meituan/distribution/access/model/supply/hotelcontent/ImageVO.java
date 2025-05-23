package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;

import java.util.List;


@Data
public class ImageVO {
    /**
     * 图片类型，0:首图，1:环境，9: 客房，19：公共设施，32：大厅，34：外观，40：客厅，外观，41：厨房，42：卫浴，49：餐饮，50：休闲娱乐
     */
    private Integer category;
    /**
     * 图片类型名称
     */
    private String title;
    /**
     * 图片链接信息
     */
    private List<ImageLinkVO> links;
}
