package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;

import java.util.List;


@Data
public class BreakfastPolicyVO {
    /**
     * 是否提供早餐, 0:不提供;1:提供
     */
    private Integer hasBreakfast;
    /**
     * 早餐类型, 0:西式;1:中式;2:日式;3:美式;4:亚洲风味;5:欧陆式;6:全套英式/爱尔兰式;7:无麸质;8:清真;9:意式;10:犹太洁食;11:全素食;12:素食
     */
    private List<NameElementVO> types;
    /**
     * 早餐形式, 0:单点;1:自助餐 2：固定套餐
     */
    private List<NameElementVO> styles;
    /**
     * 早餐种类, 1.面包；2.点心；3.薄煎饼；4.果酱；5.黄油；6.奶酪；7.谷物；8.冷盘肉；9.鸡蛋；10.酸奶；11.水果；12.咖啡；13.茶；14.热巧克力；15.果汁；16.香槟；17.单点菜单；18.当地特色；19.熟菜/热菜
     */
    private List<NameElementVO> categories;
    /**
     * 早餐金额
     */
    private BreakfastAmount amount;
    /**
     * 早餐营业时间
     */
    private List<BreakfastBusinessHourVO> businessHours;
}
