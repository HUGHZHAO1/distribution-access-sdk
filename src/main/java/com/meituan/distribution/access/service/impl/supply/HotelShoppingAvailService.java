package com.meituan.distribution.access.service.impl.supply;

import com.meituan.distribution.access.constants.DistributionPlatformConstants;
import com.meituan.distribution.access.model.supply.hotelshopping.GetShoppingHotelAvailRequest;
import com.meituan.distribution.access.model.supply.hotelshopping.GetShoppingHotelAvailRespBody;
import com.meituan.distribution.access.service.DistributionPlatformApiAbstractService;


public class HotelShoppingAvailService extends DistributionPlatformApiAbstractService<GetShoppingHotelAvailRequest, GetShoppingHotelAvailRespBody> {

    private static final String VERSION = "2.0";

    @Override
    protected String getApiVersion() {
        return VERSION;
    }

    @Override
    protected String getMethodName() {
        return DistributionPlatformConstants.HOTEL_SHOPPING_AVAIL;
    }

    @Override
    protected boolean needLog() {
        return false;
    }
}
