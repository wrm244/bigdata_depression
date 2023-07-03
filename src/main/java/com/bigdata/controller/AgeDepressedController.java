package com.bigdata.controller;

import com.bigdata.domain.AgeDepressed;
import com.bigdata.service.AgeDepressedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * 年龄与抑郁关系控制器
 *
 * @author 吴河山
 * @date 2023/07/02 23:34
 */
@RestController
@RequestMapping("/api/age-depressed")
public class AgeDepressedController {
    @Autowired
    private AgeDepressedService ageDepressedService;

    /**
     * 年龄与抑郁api选择所有数据返回
     *
     * @return {@code Result}
     */
    @GetMapping
    Result ageDepressedSelectAll() {
        List<Map<String,AgeDepressed>> ageDepressedList = ageDepressedService.selectAll();
        Integer code = ageDepressedList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = ageDepressedList != null ? "" : "ageDepressed数据查询失败，请重试！";
        return new Result(code,ageDepressedList,msg);
    }
}
