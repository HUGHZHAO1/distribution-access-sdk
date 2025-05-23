package com.meituan.distribution.access.service.impl.supply;

import com.meituan.distribution.access.constants.DistributionPlatformConstants;
import com.meituan.distribution.access.model.supply.hotelcontent.HotelContentRequest;
import com.meituan.distribution.access.model.supply.hotelcontent.HotelContentRespBody;
import com.meituan.distribution.access.service.DistributionPlatformApiAbstractService;


public class HotelContentService extends DistributionPlatformApiAbstractService<HotelContentRequest, HotelContentRespBody> {

    private static final String VERSION = "2.0";

    @Override
    protected String getApiVersion() {
        return VERSION;
    }

    @Override
    protected String getMethodName() {
        return DistributionPlatformConstants.HOTEL_CONTENT;
    }

    @Override
    protected boolean needLog() {
        return false;
    }
}
