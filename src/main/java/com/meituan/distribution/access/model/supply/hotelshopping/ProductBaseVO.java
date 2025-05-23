package com.meituan.distribution.access.model.supply.hotelshopping;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;


@Data
public class ProductBaseVO {
    /**
     * 产品类型 1 全日房  2 钟点房
     */
    private Integer productType;
    /**
     * 是否立即确认 1 立即确认 0 非立即确认
     */
    private Integer confirmType;
    /**
     * 房态 0 满房  1 可预订
     */
    private Integer productStatus;
    /**
     * 产品支付方式  0 预付 1 担保 2 现付非担保
     * Example: 0
     */
    private Integer paymentType;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 库存
     * 当库存小于等于5时，返回具体库存数，其他默认返回999，库存等于0 也返回
     */
    private Integer inventory;
    /**
     * 产品限制规则
     */
    private String productLimitRule;
    /**
     * 产品是否需要身份证 true：需要 false：不需要
     */
    private Boolean needCertificate;
    /**
     * 是否需要英文姓名下单 0-否 1-是
     */
    private Integer needEngName;
}
