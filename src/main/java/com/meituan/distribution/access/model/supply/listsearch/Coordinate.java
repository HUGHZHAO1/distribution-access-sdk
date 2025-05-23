package com.meituan.distribution.access.model.supply.listsearch;


import lombok.Data;

@Data
public class Coordinate {

    private Integer longitude;

    private Integer latitude;

    private Integer radius;

    private String provider;
}
