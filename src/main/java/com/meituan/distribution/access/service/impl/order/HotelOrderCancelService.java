package com.meituan.distribution.access.service.impl.order;

import com.meituan.distribution.access.constants.DistributionPlatformConstants;
import com.meituan.distribution.access.model.order.cancel.OrderCancelRequest;
import com.meituan.distribution.access.model.order.cancel.OrderCancelRespBody;
import com.meituan.distribution.access.service.DistributionPlatformApiAbstractService;


public class HotelOrderCancelService extends DistributionPlatformApiAbstractService<OrderCancelRequest, OrderCancelRespBody> {

    private static final String VERSION = "1.0";

    @Override
    protected String getApiVersion() {
        return VERSION;
    }

    @Override
    protected String getMethodName() {
        return DistributionPlatformConstants.HOTEL_ORDER_CANCEL;
    }

    @Override
    protected boolean needLog() {
        return true;
    }
}
