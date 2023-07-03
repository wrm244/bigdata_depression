package com.bigdata.controller;

import com.bigdata.service.YearCountryDepressedPerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bigdata.domain.YearCountryDepressedPer;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/year-country-depressed-per")
public class YearCountryDepressedPerController {
    @Autowired
    private YearCountryDepressedPerService yearCountryDepressedPerService;

    @GetMapping
    Result yearCountryDepressedPerSelectAll() {
        List<Map<String, YearCountryDepressedPer>> yearCountryDepressedPerList = yearCountryDepressedPerService.selectAll();
        Integer code = yearCountryDepressedPerList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = yearCountryDepressedPerList != null ? "" : "yearCountryDepressedPer数据查询失败，请重试！";
        return new Result(code,yearCountryDepressedPerList,msg);
    }
}
