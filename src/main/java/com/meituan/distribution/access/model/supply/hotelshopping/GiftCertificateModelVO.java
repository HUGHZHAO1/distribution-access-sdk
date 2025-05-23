package com.meituan.distribution.access.model.supply.hotelshopping;

import lombok.Data;

@Data
public class GiftCertificateModelVO {

    /**
     * 凭证类型
     */
    private Integer type;
    /**
     * 查验证件地点
     */
    private Integer verificationPlace;
    /**
     * 凭证说明
     */
    private String certificateDesc;
}