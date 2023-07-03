package com.bigdata.dao;

import com.bigdata.domain.CountryDepressed;
import com.bigdata.domain.SexDepressed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 *性别与抑郁关系数据持久类
 *
 * @author 郭新蕾
 *
 */
@Mapper
public interface CountryDepressedDao {
    /**
     * 选择所有
     *
     * @return {@code List<Map<String,CountryDepressed>>}
     */
    @Select("select country,total_depressed_country as depressedCountry from total_depressed_country")
    List<Map<String, CountryDepressed>> selectAll();
}
