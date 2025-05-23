package com.meituan.distribution.access.service.impl.supply;

import com.meituan.distribution.access.constants.DistributionPlatformConstants;
import com.meituan.distribution.access.model.supply.suggest.GetHotelSuggestRequest;
import com.meituan.distribution.access.model.supply.suggest.GetKeywordSuggestRespBody;
import com.meituan.distribution.access.service.DistributionPlatformApiAbstractService;


public class HotelKeywordSuggestService extends DistributionPlatformApiAbstractService<GetHotelSuggestRequest, GetKeywordSuggestRespBody> {

    private static final String VERSION = "2.0";

    @Override
    protected String getApiVersion() {
        return VERSION;
    }

    @Override
    protected String getMethodName() {
        return DistributionPlatformConstants.HOTEL_KEYWORD_SUGGEST;
    }

    @Override
    protected boolean needLog() {
        return false;
    }
}
