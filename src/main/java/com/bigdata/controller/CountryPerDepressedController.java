package com.bigdata.controller;

import com.bigdata.domain.CountryPerDepressed;
import com.bigdata.service.CountryPerDepressedSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * 不同国家的抑郁症患者比例关系控制器
 *
 * @author chenshuang
 * @date 2023/07/03 13:55
 */
@RestController
@RequestMapping("/api/country-depressed-per")
@CrossOrigin(origins = {"*"})
public class CountryPerDepressedController {
    @Autowired
    private CountryPerDepressedSerive countryPerDepressedSerive;

    /**
     * 不同国家的抑郁症患者api选择所有数据返回
     *
     * @return {@code Result}
     */
    @GetMapping
    Result ageDepressedSelectAll() {
        List<Map<String,CountryPerDepressed>> countryPerDepressedList = countryPerDepressedSerive.selectAll();
        Integer code = countryPerDepressedList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = countryPerDepressedList != null ? "" : "countryPerDepressed数据查询失败，请重试！";
        return new Result(code,countryPerDepressedList,msg);
    }
}
