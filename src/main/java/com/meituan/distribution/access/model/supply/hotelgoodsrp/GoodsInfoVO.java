package com.meituan.distribution.access.model.supply.hotelgoodsrp;


import com.meituan.distribution.access.model.supply.hotelshopping.GiftVO;
import com.meituan.distribution.access.model.supply.hotelshopping.HourRoomReceptionTimeVO;
import lombok.Data;

import java.util.List;
import java.util.Map;


@Data
public class GoodsInfoVO {

    private Long hotelId;

    private Long goodsId;

    private String goodsName;

    private Integer needRealTel;

    private Integer goodsType;

    private Integer confirmType;

    private Integer thirdParty;

    private List<BreakfastVO> breakfast;

    private List<GoodsRoomInfoVO> roomInfoList;

    private List<CancelRuleVO> cancelRules;

    private List<GiftVO> gifts;

    private List<BookRuleVO> bookRules;

    private InvoiceInfoVO invoiceInfo;

    private List<PriceModelVO> priceModels;

    private Map<String, Integer> goodsActivityMap;

    private List<DayGoodsStatusVO> goodsStatuses;

    private List<HourRoomReceptionTimeVO> hourRoomReceptionTimeVOList;

    private Integer timeIntervalMin;

    private Integer timeLimitMin;

    private String goodsLimitRule;

    private Integer paymentType;

    private List<RpGuaranteeVO> rpGuarantees;

    private Boolean needIdentityCard;

    private Integer needEngName;

    private List<BookingTimeRuleVO> bookingTimeRules;
}
