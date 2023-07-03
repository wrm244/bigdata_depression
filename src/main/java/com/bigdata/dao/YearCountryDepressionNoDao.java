package com.bigdata.dao;

import com.bigdata.domain.YearCountryDepressionNo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface YearCountryDepressionNoDao {
    @Select(" SELECT year, country, depressed_count as totalDepressedNo FROM year_country_depression_no ORDER BY year ASC")
    List<Map<String, YearCountryDepressionNo>> selectAll();
}
