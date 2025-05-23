package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
public class ChildPolicyVO {
    /**
     * 是否允许儿童入住
     * 0 全部房型不允许
     * 1 全部房型允许
     * 2 部分房型允许
     */
    private String allowedChild;
    /**
     * 允许入住儿童最小年龄
     * 0 年龄不限
     * 1~17：分别代表1~17岁
     */
    private String minAge;
    /**
     * 最大可容纳儿童数量
     * 0 不支持
     * 1~6：分别代表1~6名
     */
    private String maxAmount;
    /**
     * 儿童使用现有床收费标准是否统一
     * 0 全部房型统一收费标准
     * 1 部分房型收费标准单独设置（通过房型静态信息获取）
     */
    private String ExistingBedFees;
    /**
     * 加床收费标准是否统一，包含普通床和婴儿床
     * 0 全部房型统一收费标准
     * 1 部分房型收费标准单独设置（通过房型静态信息获取
     */
    private String ExtraBedFees;
    /**
     * 收费标准
     * 类型有普通床或婴儿床时，为允许加普通床或婴儿床
     */
    private List<FeesVO> fees;
    /**
     * 早餐收费标准
     */
    private List<BreakfastFeesVO> breakfastFees;
    /**
     * 备注
     */
    private String remark;
    /**
     * 特别提示
     */
    private String specialTips;
}
