package com.bigdata.controller;

import com.bigdata.domain.CountryDepressed;
import com.bigdata.service.CountryDepressedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * 性别与抑郁关系控制器
 *
 * @author
 * @date 2023/07/02 23:34
 */
@RestController
@RequestMapping("/api/country-depressed")
@CrossOrigin(origins = {"*"})
public class CountryDepressedController {
    @Autowired
    private CountryDepressedService countryDepressedService;

    /**
     * 性别与抑郁api选择所有数据返回
     *
     * @return {@code Result}
     */
    @GetMapping
    public Result countryDepressedSelectAll() {
        List<Map<String, CountryDepressed>> countryDepressedList = countryDepressedService.selectAll();
        Integer code = countryDepressedList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = countryDepressedList != null ? "" : "countryDepressed数据查询失败，请重试！";
        return new Result(code,countryDepressedList,msg);
    }
}
