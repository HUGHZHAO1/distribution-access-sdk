package com.meituan.distribution.access.model.supply.hotelgoodsrp;

import lombok.Data;

import java.util.List;


@Data
public class InvoiceInfoVO {
    private Integer invoiceMode;
    private Integer tmcInvoiceMode;
    private List<Integer> supportInvoiceTypeList;
}

