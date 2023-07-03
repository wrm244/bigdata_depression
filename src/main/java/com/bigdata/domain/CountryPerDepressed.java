package com.bigdata.domain;

import lombok.Data;


/**
 * 不同国家的抑郁症患者比例的关系封装属性，继承AllHeaders
 *
 * @author chenshuang
 * @date 2023/07/03 12:31
 */
@Data
public class CountryPerDepressed extends AllHeaders {
    private String country;
    private Integer depressedNo;

    @Override
    public String toString() {
        return "CountryPerDepressed{" +
                "country='" + country + '\'' +
                ", depressedNo=" + depressedNo +
                '}';
    }
}
