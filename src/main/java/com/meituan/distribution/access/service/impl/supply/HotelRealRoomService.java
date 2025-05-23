package com.meituan.distribution.access.service.impl.supply;

import com.meituan.distribution.access.constants.DistributionPlatformConstants;
import com.meituan.distribution.access.model.supply.hotelrealroom.RealRoomContentRequest;
import com.meituan.distribution.access.model.supply.hotelrealroom.RealRoomContentRespBody;
import com.meituan.distribution.access.service.DistributionPlatformApiAbstractService;


public class HotelRealRoomService extends DistributionPlatformApiAbstractService<RealRoomContentRequest, RealRoomContentRespBody> {

    private static final String VERSION = "2.0";

    @Override
    protected String getApiVersion() {
        return VERSION;
    }

    @Override
    protected String getMethodName() {
        return DistributionPlatformConstants.HOTEL_REALROOM_CONTENT;
    }

    @Override
    protected boolean needLog() {
        return false;
    }
}
