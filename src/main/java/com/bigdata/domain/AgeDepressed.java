package com.bigdata.domain;

import lombok.Data;
@Data
public class AgeDepressed extends AllHeaders{
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
