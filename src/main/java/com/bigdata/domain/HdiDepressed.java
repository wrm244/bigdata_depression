package com.bigdata.domain;

import lombok.Data;

/**
 * 人类发展指数与抑郁的关系封装属性，继承AllHeaders
 *
 * @author 吴河山
 * @date 2023/07/03 10:13
 */
@Data
public class HdiDepressed extends AllHeaders {
    private Double hdiForYear;
    private Integer depressedNo;
}
