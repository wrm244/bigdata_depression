package com.bigdata.service.impl;

import com.bigdata.controller.Code;
import com.bigdata.controller.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/YearCountryDepressionNo")
public class YearCountryDepressionNo {
    @Autowired
    private YearCountryDepressionNoServiceImpl yearCountryDepressionNoService;

    @GetMapping
    Result yearCountryDepressedPerSelectAll() {
        List<Map<String, com.bigdata.domain.YearCountryDepressionNo>> yearCountryDepressionNoList = yearCountryDepressionNoService.selectAll();
        Integer code = yearCountryDepressionNoList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = yearCountryDepressionNoList != null ? "" : "yearCountryDepressedPer数据查询失败，请重试！";
        return new Result(code,yearCountryDepressionNoList,msg);
    }
}
