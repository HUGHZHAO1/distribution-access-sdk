package com.meituan.distribution.access.service.impl.order;

import com.meituan.distribution.access.constants.DistributionPlatformConstants;
import com.meituan.distribution.access.model.order.booking.OrderBookingRequest;
import com.meituan.distribution.access.model.order.booking.OrderBookingRespBody;
import com.meituan.distribution.access.service.DistributionPlatformApiAbstractService;


public class HotelOrderBookingService extends DistributionPlatformApiAbstractService<OrderBookingRequest, OrderBookingRespBody> {

    private static final String VERSION = "1.0";

    @Override
    protected String getApiVersion() {
        return VERSION;
    }

    @Override
    protected String getMethodName() {
        return DistributionPlatformConstants.HOTEL_ORDER_BOOKING;
    }

    @Override
    protected boolean needLog() {
        return true;
    }
}
