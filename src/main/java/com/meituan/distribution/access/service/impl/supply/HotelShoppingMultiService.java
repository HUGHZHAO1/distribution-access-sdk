package com.meituan.distribution.access.service.impl.supply;

import com.meituan.distribution.access.constants.DistributionPlatformConstants;
import com.meituan.distribution.access.model.supply.hotelshopping.GetShoppingHotelMultiRequest;
import com.meituan.distribution.access.model.supply.hotelshopping.GetShoppingHotelMultiRespBody;
import com.meituan.distribution.access.service.DistributionPlatformApiAbstractService;


public class HotelShoppingMultiService extends DistributionPlatformApiAbstractService<GetShoppingHotelMultiRequest, GetShoppingHotelMultiRespBody> {

    private static final String VERSION = "2.0";

    @Override
    protected String getApiVersion() {
        return VERSION;
    }

    @Override
    protected String getMethodName() {
        return DistributionPlatformConstants.HOTEL_SHOPPING_MULTI;
    }

    @Override
    protected boolean needLog() {
        return false;
    }
}
