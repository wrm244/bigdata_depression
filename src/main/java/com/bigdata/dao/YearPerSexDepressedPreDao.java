package com.bigdata.dao;

import com.bigdata.domain.YearPerSexDepressed;
import com.bigdata.domain.YearPerSexDepressedPre;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface YearPerSexDepressedPreDao {
    /**
     * 选择不同年份不同性别的抑郁症患者的人数，分别统计男性和女性的人数
     * @return {@code List<Map<String, YearPerSexDepressed>>}
     */
    @Select("SELECT year,sum(prediction) as depressed_no FROM year_per_male_depressed_predictions  GROUP BY year order by year asc")
    List<Map<String, YearPerSexDepressedPre>> selectMaleData();
    @Select("SELECT year,sum(prediction) as depressed_no FROM year_per_female_depressed_predictions  GROUP BY year order by year asc")
    List<Map<String, YearPerSexDepressedPre>> selectFemaleData();

}