package com.bigdata.domain;

import lombok.Data;


/**
 * 时间与抑郁的关系封装属性，继承AllHeaders
 *
 * @author chenshuang
 * @date 2023/07/03 12:31
 */
@Data
public class YearDepressed extends AllHeaders {
    private Integer year;
    private Integer depressedNo;

    @Override
    public String toString() {
        return "AgeDepressed{" +
                "year='" + year + '\'' +
                ", depressedNo=" + depressedNo +
                '}';
    }
}
