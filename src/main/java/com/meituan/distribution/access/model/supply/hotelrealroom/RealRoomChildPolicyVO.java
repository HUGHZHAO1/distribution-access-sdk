package com.meituan.distribution.access.model.supply.hotelrealroom;

import com.meituan.distribution.access.model.supply.hotelcontent.FeesVO;
import lombok.Data;

import java.util.List;

@Data
public class RealRoomChildPolicyVO {

    /**
     * 最大可容纳儿童数量
     * 0 不支持
     * 1~6：分别代表1~6名
     */
    private String maxAmount;
    /**
     * 收费标准
     * 类型有普通床或婴儿床时，为允许加普通床或婴儿床
     */
    private List<FeesVO> fees;
}
