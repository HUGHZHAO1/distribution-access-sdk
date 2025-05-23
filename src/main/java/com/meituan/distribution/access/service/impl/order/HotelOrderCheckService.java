package com.meituan.distribution.access.service.impl.order;

import com.meituan.distribution.access.constants.DistributionPlatformConstants;
import com.meituan.distribution.access.model.order.check.OrderCheckRequest;
import com.meituan.distribution.access.model.order.check.OrderCheckRespBody;
import com.meituan.distribution.access.service.DistributionPlatformApiAbstractService;


public class HotelOrderCheckService extends DistributionPlatformApiAbstractService<OrderCheckRequest, OrderCheckRespBody> {

    private static final String VERSION = "1.0";

    @Override
    protected String getApiVersion() {
        return VERSION;
    }

    @Override
    protected String getMethodName() {
        return DistributionPlatformConstants.HOTEL_ORDER_CHECK;
    }

    @Override
    protected boolean needLog() {
        return true;
    }
}
