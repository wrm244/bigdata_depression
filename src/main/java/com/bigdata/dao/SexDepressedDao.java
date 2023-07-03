package com.bigdata.dao;

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
public interface SexDepressedDao {
    /**
     * 选择所有
     *
     * @return {@code List<Map<String,SexDepressed>>}
     */
    @Select("select sex,sex_depressed as depressedSex from sex_depressed")
    List<Map<String, SexDepressed>> selectAll();
}
