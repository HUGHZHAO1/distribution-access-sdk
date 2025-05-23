package com.meituan.distribution.access.service.impl.supply;

import com.meituan.distribution.access.constants.DistributionPlatformConstants;
import com.meituan.distribution.access.model.supply.hotelgoodsrp.GetGoodsRpRequest;
import com.meituan.distribution.access.model.supply.hotelgoodsrp.GetGoodsRpRespBody;
import com.meituan.distribution.access.service.DistributionPlatformApiAbstractService;


public class HotelGoodsRpService extends DistributionPlatformApiAbstractService<GetGoodsRpRequest, GetGoodsRpRespBody> {

    private static final String VERSION = "1.0";

    @Override
    protected String getApiVersion() {
        return VERSION;
    }

    @Override
    protected String getMethodName() {
        return DistributionPlatformConstants.HOTEL_GOODS_RP;
    }

    @Override
    protected boolean needLog() {
        return false;
    }
}
