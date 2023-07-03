package com.bigdata.dao;

import com.bigdata.domain.HdiDepressed;
import com.bigdata.domain.YearPerSexDepressed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface YearPerSexDepressedDao {
    /**
     * 选择不同年份不同性别的抑郁症患者的人数，分别统计男性和女性的人数
     * @return {@code List<Map<String, YearPerSexDepressed>>}
     */
    @Select("SELECT year,sum(CAST(depressed_no AS DOUBLE)) FROM tbl_DepressionTemperatures WHERE sex='male' GROUP BY year order by year desc")
    List<Map<String, YearPerSexDepressed>> selectMaleData();
    @Select("SELECT year,sum(CAST(depressed_no AS DOUBLE)) FROM tbl_DepressionTemperatures WHERE sex='female' GROUP BY year order by year desc")
    List<Map<String, YearPerSexDepressed>> selectFemaleData();

}