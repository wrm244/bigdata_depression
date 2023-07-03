package com.bigdata.domain;

import lombok.Data;

/**
 * 年龄段与抑郁的关系封装属性，继承AllHeaders
 *
 * @author 吴河山
 * @date 2023/07/03 10:12
 */
@Data
public class AgeDepressed extends AllHeaders {
    private String age;
    private Integer depressedNo;

    @Override
    public String toString() {
        return "AgeDepressed{" +
                "age='" + age + '\'' +
                ", depressedNo=" + depressedNo +
                '}';
    }
}
