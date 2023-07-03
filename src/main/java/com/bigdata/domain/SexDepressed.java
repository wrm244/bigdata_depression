package com.bigdata.domain;

import lombok.Data;

/***
 * 性别与抑郁的关系封装属性，继承AllHeaders
 *
 *
 */

@Data
public class SexDepressed extends AllHeaders {
    private String sex;
    private Integer depressedSex;

    @Override
    public String toString() {
        return "SexDepressed{" +
                "sex='" + sex + '\'' +
                ", depressedSex=" + depressedSex +
                '}';
    }
}
