package com.bigdata.dao;

import com.bigdata.domain.YearCountryDepressedPer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
@Mapper
public interface YearCountryDepressedPerDao {
    @Select(" SELECT year,country,total_depression_rate as totalDepressedRate FROM year_country_depressed_per ")
    List<Map<String, YearCountryDepressedPer>> selectAll();
}
