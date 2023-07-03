package com.bigdata.dao;

import com.bigdata.domain.CountryPerDepressed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


/**
 * 不同国家的抑郁症患者比例关系数据持久类
 *
 * @author chenshuang
 * @date 2023/07/03 14:23
 */
@Mapper
public interface CountryPerDepressedDao {
    /**
     * 选择所有
     *
     * @return {@code List<Map<String,CountryPerDepressed>>}
     */
    @Select("select country,(average_depression_ratio/10) as average_depression_ratio from countries_per_depression order by average_depression_ratio desc")
    List<Map<String, CountryPerDepressed>> selectAll();
}
