package com.meituan.distribution.access.model.supply.listsearch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetHotelPoiListSearchRequest {
    /**
     * 分销商业务类型
     */
    private Integer bizType;
    /**
     * 入店日期
     */
    private String checkin;
    /**
     * 离店日期
     */
    private String checkout;
    /**
     * 城市code, 参照城市国家列表字典。
     */
    private Long cityCode;
    /**
     * 位置范围
     */
    private Coordinate coordinate;
    /**
     * 偏移量
     */
    private String nextId;
    /**
     * pageSize
     */
    private Integer pageSize;
    /**
     * 排序方式 1:默认排序 2:按照距离排序 3:按照评分排序
     */
    private Integer sortType;
    /**
     * 关键词
     */
    private String queryText;
    /**
     * 酒店星级列表
     */
    private Set<Integer> star;
}
