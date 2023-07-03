package com.bigdata.domain;

import lombok.Data;

/***
 * 性别与抑郁的关系封装属性，继承AllHeaders
 *
 *
 */

@Data
public class CountryDepressed extends AllHeaders {
    private String country;
    private Integer depressedCountry;

    @Override
    public String toString() {
        return "CountryDepressed{" +
                "country='" + country + '\'' +
                ", depressedCountry=" + depressedCountry +
                '}';
    }
}