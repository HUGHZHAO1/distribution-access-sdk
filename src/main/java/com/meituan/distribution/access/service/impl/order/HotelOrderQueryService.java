package com.meituan.distribution.access.service.impl.order;

import com.meituan.distribution.access.constants.DistributionPlatformConstants;
import com.meituan.distribution.access.model.order.query.OrderQueryRequest;
import com.meituan.distribution.access.model.order.query.OrderQueryRespBody;
import com.meituan.distribution.access.service.DistributionPlatformApiAbstractService;


public class HotelOrderQueryService extends DistributionPlatformApiAbstractService<OrderQueryRequest, OrderQueryRespBody> {

    private static final String VERSION = "1.0";

    @Override
    protected String getApiVersion() {
        return VERSION;
    }

    @Override
    protected String getMethodName() {
        return DistributionPlatformConstants.HOTEL_ORDER_QUERY;
    }

    @Override
    protected boolean needLog() {
        return false;
    }
}
