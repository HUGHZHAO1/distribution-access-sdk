package com.meituan.distribution.access.example;

import com.meituan.distribution.access.config.ClientConfig;
import com.meituan.distribution.access.model.order.booking.OrderBookingRequest;
import com.meituan.distribution.access.model.order.booking.OrderBookingRespBody;
import com.meituan.distribution.access.model.order.cancel.OrderCancelRequest;
import com.meituan.distribution.access.model.order.cancel.OrderCancelRespBody;
import com.meituan.distribution.access.model.order.check.OrderCheckRequest;
import com.meituan.distribution.access.model.order.check.OrderCheckRespBody;
import com.meituan.distribution.access.model.order.query.OrderQueryParamItem;
import com.meituan.distribution.access.model.order.query.OrderQueryRequest;
import com.meituan.distribution.access.model.order.query.OrderQueryRespBody;
import com.meituan.distribution.access.model.supply.hotelcontent.HotelContentRequest;
import com.meituan.distribution.access.model.supply.hotelcontent.HotelContentRespBody;
import com.meituan.distribution.access.model.supply.hotelgoodsrp.GetGoodsRpRequest;
import com.meituan.distribution.access.model.supply.hotelgoodsrp.GetGoodsRpRespBody;
import com.meituan.distribution.access.model.supply.hotelpoilist.GetPoiListRequest;
import com.meituan.distribution.access.model.supply.hotelpoilist.GetPoiListRespBody;
import com.meituan.distribution.access.model.supply.hotelrealroom.RealRoomContentRequest;
import com.meituan.distribution.access.model.supply.hotelrealroom.RealRoomContentRespBody;
import com.meituan.distribution.access.model.supply.hotelshopping.GetShoppingHotelAvailRequest;
import com.meituan.distribution.access.model.supply.hotelshopping.GetShoppingHotelAvailRespBody;
import com.meituan.distribution.access.model.supply.hotelshopping.GetShoppingHotelMultiRequest;
import com.meituan.distribution.access.model.supply.hotelshopping.GetShoppingHotelMultiRespBody;
import com.meituan.distribution.access.model.supply.hotelshopping.InclusivePriceVO;
import com.meituan.distribution.access.model.supply.hotelshopping.RoomCriteriaVO;
import com.meituan.distribution.access.model.supply.hotelshopping.ShoppingFilterVO;
import com.meituan.distribution.access.model.supply.listsearch.GetHotelPoiListSearchRequest;
import com.meituan.distribution.access.model.supply.listsearch.GetHotelPoiListSearchRespBody;
import com.meituan.distribution.access.model.supply.suggest.GetHotelSuggestRequest;
import com.meituan.distribution.access.model.supply.suggest.GetHotelCitySuggestRespBody;
import com.meituan.distribution.access.model.supply.suggest.GetKeywordSuggestRespBody;
import com.meituan.distribution.access.service.impl.order.HotelOrderBookingService;
import com.meituan.distribution.access.service.impl.order.HotelOrderCancelService;
import com.meituan.distribution.access.service.impl.order.HotelOrderCheckService;
import com.meituan.distribution.access.service.impl.order.HotelOrderQueryService;
import com.meituan.distribution.access.service.impl.supply.HotelCitySuggestService;
import com.meituan.distribution.access.service.impl.supply.HotelContentService;
import com.meituan.distribution.access.service.impl.supply.HotelGoodsRpService;
import com.meituan.distribution.access.service.impl.supply.HotelKeywordSuggestService;
import com.meituan.distribution.access.service.impl.supply.HotelPoiListSearchService;
import com.meituan.distribution.access.service.impl.supply.HotelPoiListService;
import com.meituan.distribution.access.service.impl.supply.HotelRealRoomService;
import com.meituan.distribution.access.service.impl.supply.HotelShoppingAvailService;
import com.meituan.distribution.access.service.impl.supply.HotelShoppingMultiService;
import com.meituan.distribution.access.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;

/**
 * 配置使用示例
 * 展示如何使用配置系统和API调用
 */
@Slf4j
public class ConfigurationExample {

    public static void main(String[] args) {
        // 打印当前配置信息
        printCurrentConfig();
        
        // 使用API服务示例
        callApiExample();
    }
    
    private static void printCurrentConfig() {
        log.info("当前配置信息:");
        log.info("分销商业务ID: {}", ClientConfig.getPartnerBizId());
        log.info("访问密钥: {}", ClientConfig.getAccessKey());
        log.info("HTTP连接超时: {}ms", ClientConfig.getHttpConnectTimeout());
        log.info("HTTP读取超时: {}ms", ClientConfig.getHttpReadTimeout());
        log.info("HTTP写入超时: {}ms", ClientConfig.getHttpWriteTimeout());
    }
    
    private static void callApiExample() {
        log.info("查询酒店ID列表API服务示例开始");

        HotelPoiListService poiListService = new HotelPoiListService();

        GetPoiListRequest poiListRequest = GetPoiListRequest.builder()
                .maxId(0L)
                .pageSize(50)
                .build();

        GetPoiListRespBody poiListRespBody = poiListService.invokeApi(poiListRequest);

        log.info("查询酒店Id列表响应结果: {}", JsonUtil.object2Json(poiListRespBody));

    }
}