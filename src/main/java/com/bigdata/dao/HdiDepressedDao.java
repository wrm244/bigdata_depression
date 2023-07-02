package com.bigdata.dao;


import com.bigdata.domain.HdiDepressed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
@Mapper
public interface HdiDepressedDao {
    @Select("select HDI as hdiForYear,total_depressed as depressedNo from hdi_depressed")
    List<Map<String, HdiDepressed>> selectAll();
}
