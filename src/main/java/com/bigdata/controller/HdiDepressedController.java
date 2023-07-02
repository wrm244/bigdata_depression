package com.bigdata.controller;

import com.bigdata.domain.HdiDepressed;
import com.bigdata.service.impl.HdiDepressedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/hdiDepressed")
public class HdiDepressedController {
    @Autowired
    private HdiDepressedServiceImpl hdiDepressedService;

    @GetMapping
    Result hdiDepressedSelectAll() {
        List<Map<String, HdiDepressed>>  hdiDepressedList = hdiDepressedService.selectAll();
        Integer code = hdiDepressedList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = hdiDepressedList != null ? "" : "hdiDepressed数据查询失败，请重试！";
        return new Result(code,hdiDepressedList,msg);
    }

}
