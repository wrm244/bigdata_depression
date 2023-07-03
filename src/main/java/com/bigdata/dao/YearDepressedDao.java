package com.bigdata.dao;

import com.bigdata.domain.YearDepressed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


/**
 * 时间与抑郁症人数数据持久类
 *
 * @author chenshuang
 * @date 2023/07/03 12:26
 */
@Mapper
public interface YearDepressedDao {
    /**
     * 选择所有
     *
     * @return {@code List<Map<String,AgeDepressed>>}
     */
    @Select("select year,total_depressed as depressedNo from global_year_depressed order by year asc")
    List<Map<String, YearDepressed>> selectAll();
}
