package com.bigdata.dao;

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
    @Select("SELECT year,sum(total_depressed) as depressed_no FROM year_per_male_depressed  GROUP BY year order by year asc")
    List<Map<String, YearPerSexDepressed>> selectMaleData();
    @Select("SELECT year,sum(total_depressed) as depressed_no FROM year_per_female_depressed  GROUP BY year order by year asc")
    List<Map<String, YearPerSexDepressed>> selectFemaleData();

}