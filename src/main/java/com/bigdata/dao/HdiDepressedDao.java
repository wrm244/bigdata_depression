package com.bigdata.dao;


import com.bigdata.domain.HdiDepressed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 人类发展指数与抑郁症人数数据持久层
 *
 * @author 吴河山
 * @date 2023/07/03 10:11
 */
@Mapper
public interface HdiDepressedDao {
    @Select("select HDI as hdiForYear,total_depressed as depressedNo from hdi_depressed")
    List<Map<String, HdiDepressed>> selectAll();
}
