package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;

@Data
public class PetPolicyVO {
    /**
     * 宠物政策
     * 0 禁止
     * 1 允许，不确认收费情况
     * 2 允许，收费
     * 3 允许，免费
     */
    private Integer allowed;
}
