package com.bigdata.controller;

import com.bigdata.domain.YearCountryDepressionNo;
import com.bigdata.service.impl.YearCountryDepressionNoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/year-country-depression-no")
public class YearCountryDepressionNoController {
    @Autowired
    private YearCountryDepressionNoServiceImpl yearCountryDepressionNoService;

    @GetMapping
    Result yearCountryDepressedPerSelectAll() {
        List<Map<String, YearCountryDepressionNo>> yearCountryDepressionNoList = yearCountryDepressionNoService.selectAll();
        Integer code = yearCountryDepressionNoList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = yearCountryDepressionNoList != null ? "" : "yearCountryDepressionNo数据查询失败，请重试！";
        return new Result(code,yearCountryDepressionNoList,msg);
    }
}
