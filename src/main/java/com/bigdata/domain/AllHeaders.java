package com.bigdata.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 所有表头参数
 * 需注意在数据持久层选择读取的时候需要对应属性
 *
 * @author 吴河山
 * @date 2023/07/02 23:43
 */
@Data  //set与get方法
@AllArgsConstructor //有参构造方法
@NoArgsConstructor //无参构造方法
public class AllHeaders {
   private String country;
   private Integer year;
   private String sex;
   private String age;
   private Integer depressedNo;
   private Integer population;
   private Double depressedPerHundredKPop;
   private String countryYear;
   private Double hdiForYear;
   private Long gdpForYear;
   private Integer gdpPerCapita;
   private  String generation;
}
