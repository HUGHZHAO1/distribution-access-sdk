package com.meituan.distribution.access.model.supply.hotelcontent;

import lombok.Data;


@Data
public class NameEnElementVO extends NameElementVO {
    private String nameEn;

    public NameEnElementVO() {
        super();
    }

    public NameEnElementVO(Integer code, String name, String nameEn) {
        super(code, name);
        this.nameEn = nameEn;
    }
}
