package com.bigdata.dao;

import com.bigdata.domain.GdpPerSection;
import com.bigdata.domain.YearPerSexDepressed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface GdpPerSectionDao {
    /**
     * 根据人均区间进行分组，计算相应区间的抑郁症人数数量
     * @return {@code List<Map<String, GdpPerSection>>}
     */
    @Select("select gdp_per_section as gdpPerCapita,number as depressedNo from gdp_per_section_depressed order by depressedNo asc")
    List<Map<String, GdpPerSection>> selectAll();
}
