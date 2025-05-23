package com.meituan.distribution.access.service.impl.supply;

import com.meituan.distribution.access.constants.DistributionPlatformConstants;
import com.meituan.distribution.access.model.supply.listsearch.GetHotelPoiListSearchRequest;
import com.meituan.distribution.access.model.supply.listsearch.GetHotelPoiListSearchRespBody;
import com.meituan.distribution.access.service.DistributionPlatformApiAbstractService;


public class HotelPoiListSearchService extends DistributionPlatformApiAbstractService<GetHotelPoiListSearchRequest, GetHotelPoiListSearchRespBody> {

    private static final String VERSION = "2.0";

    @Override
    protected String getApiVersion() {
        return VERSION;
    }

    @Override
    protected String getMethodName() {
        return DistributionPlatformConstants.HOTEL_LIST_SEARCH;
    }

    @Override
    protected boolean needLog() {
        return false;
    }
}
