package com.bigdata.controller;

import com.bigdata.domain.AgeDepressed;
import com.bigdata.domain.SexDepressed;
import com.bigdata.service.SexDepressedService;
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
@RequestMapping("/api/sex-depressed")
@CrossOrigin(origins = {"*"})
public class SexDepressedController {
    @Autowired
    private SexDepressedService sexDepressedService;

    /**
     * 性别与抑郁api选择所有数据返回
     *
     * @return {@code Result}
     */
    @GetMapping
    public Result sexDepressedSelectAll() {
        List<Map<String, SexDepressed>> sexDepressedList = sexDepressedService.selectAll();
        Integer code = sexDepressedList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = sexDepressedList != null ? "" : "sexDepressed数据查询失败，请重试！";
        return new Result(code,sexDepressedList,msg);
    }
}
