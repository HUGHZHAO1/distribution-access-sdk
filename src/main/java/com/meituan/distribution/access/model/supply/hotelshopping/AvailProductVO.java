package com.meituan.distribution.access.model.supply.hotelshopping;

import com.meituan.distribution.access.model.supply.hotelgoodsrp.BookRuleVO;
import com.meituan.distribution.access.model.supply.hotelgoodsrp.BookingTimeRuleVO;
import lombok.Data;

import java.util.List;


@Data
public class AvailProductVO {
    /**
     * 产品ID
     */
    private Long productId;
    /**
     * 产品基本信息
     */
    private ProductBaseVO productBase;
    /**
     * 产品房型信息
     */
    private ProductRoomVO room;
    /**
     * 发票
     */
    private InvoiceInfoVO invoice;
    /**
     * 预订规则
     */
    private List<BookRuleVO> bookingRule;
    /**
     * 服务
     */
    private ServiceInfoVO service;
    /**
     * 税后的每日价格，国内、境外酒店默认使用含税价
     */
    private List<InclusivePriceVO> inclusivePrice;
    /**
     * 产品优惠活动列表
     */
    private List<PromotionVO> promotion;
    /**
     * 担保规则信息
     */
    private List<RpGuaranteeVO> guarantee;
    /**
     * 取消政策。定义了当客人在特定提前时间范围内取消预订时将收取的罚款。 处罚与未出现或未出现前的时间范围有关。
     */
    private List<CancelPolicyVO> cancelPolicy;

    private TotalPriceVO orderTotalPriceVO;

    private List<BookingTimeRuleVO> bookingTimeRules;
}
