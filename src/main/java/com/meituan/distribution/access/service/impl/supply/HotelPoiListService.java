package com.meituan.distribution.access.service.impl.supply;

import com.meituan.distribution.access.constants.DistributionPlatformConstants;
import com.meituan.distribution.access.model.supply.hotelpoilist.GetPoiListRequest;
import com.meituan.distribution.access.model.supply.hotelpoilist.GetPoiListRespBody;
import com.meituan.distribution.access.service.DistributionPlatformApiAbstractService;


public class HotelPoiListService extends DistributionPlatformApiAbstractService<GetPoiListRequest, GetPoiListRespBody> {

    private static final String VERSION = "1.0";


    @Override
    protected String getApiVersion() {
        return VERSION;
    }

    @Override
    protected String getMethodName() {
        return DistributionPlatformConstants.HOTEL_POI_LIST;
    }

    @Override
    protected boolean needLog() {
        return false;
    }
}
