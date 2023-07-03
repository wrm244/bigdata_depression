package com.bigdata.domain;

import lombok.Data;
/**
 * 人类发展指数与抑郁的关系封装属性，继承AllHeaders
 *
 * @author 贾茂宁
 * @date 2023/07/03 13：01
 */
@Data
public class YearPerSexDepressed extends AllHeaders {
    private Integer year;
    private Integer depressedNo;
}
