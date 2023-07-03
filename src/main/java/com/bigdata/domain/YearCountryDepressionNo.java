package com.bigdata.domain;

import lombok.Data;

/**
 * 每年每个国家的抑郁人数封装属性，继承AllHeaders
 *
 * @author zgs
 * @date 2023/07/03 12:34
 */
@Data
public class YearCountryDepressionNo extends AllHeaders {
    private Integer year;
    private String country;
    private Double totalDepressedNo;
}