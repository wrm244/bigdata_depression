package com.bigdata.dao;

import com.bigdata.domain.AgeDepressed;
import com.bigdata.domain.YearDepressed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 年龄与抑郁关系数据持久类
 *
 * @author
 * @date 2023/07/02 23:40
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
