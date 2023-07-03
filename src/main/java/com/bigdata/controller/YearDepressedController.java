package com.bigdata.controller;

import com.bigdata.domain.AgeDepressed;
import com.bigdata.domain.YearDepressed;
import com.bigdata.service.AgeDepressedService;
import com.bigdata.service.YearDepressedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * 时间与抑郁关系控制器
 *
 * @author chenshuang
 * @date 2023/07/03 12:30
 */

@RestController
@RequestMapping("/api/year-depressed")
public class YearDepressedController {
    @Autowired
    private YearDepressedService yearDepressedService;

    /**
     * 时间与抑郁api选择所有数据返回
     *
     * @return {@code Result}
     */
    @GetMapping
    Result ageDepressedSelectAll() {
        List<Map<String,YearDepressed>> yearDepressedList = yearDepressedService.selectAll();
        Integer code = yearDepressedList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = yearDepressedList != null ? "" : "yearDepressed数据查询失败，请重试！";
        return new Result(code,yearDepressedList,msg);
    }
}
