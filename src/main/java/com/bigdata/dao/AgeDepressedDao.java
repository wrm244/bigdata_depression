package com.bigdata.dao;

import com.bigdata.domain.AgeDepressed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 年龄与抑郁关系数据持久类
 *
 * @author 吴河山
 * @date 2023/07/02 23:40
 */
@Mapper
public interface AgeDepressedDao {
    /**
     * 选择所有
     *
     * @return {@code List<Map<String,AgeDepressed>>}
     */
    @Select("select HDI,total_depressed as depressedNo from age_depressed")
    List<Map<String,AgeDepressed>> selectAll();
}
