package com.bigdata.controller;

import com.bigdata.domain.YearPerSexDepressed;
import com.bigdata.exception.BusinessException;
import com.bigdata.service.impl.YearPerSexDepressedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/year-per-depressed")
public class YearPerSexDepressedController {

    @Autowired
    private YearPerSexDepressedServiceImpl yearPerSexDepressedService;

    @GetMapping
    public Result SelectAll(@RequestParam("sex") String sex) {
        if (sex.equals("male")) {
            List<Map<String, YearPerSexDepressed>> yearPerSexDepressedList = yearPerSexDepressedService.selectMale();
            Integer code = yearPerSexDepressedList != null ? Code.GET_OK : Code.GET_ERR;
            String msg = yearPerSexDepressedList != null ? "" : "yearPerSexDepressed-male数据查询失败，请重试！";
            return new Result(code, yearPerSexDepressedList, msg);
        } else if (sex.equals("female")) {
            List<Map<String, YearPerSexDepressed>> yearPerSexDepressedList = yearPerSexDepressedService.selectFemale();
            Integer code = yearPerSexDepressedList != null ? Code.GET_OK : Code.GET_ERR;
            String msg = yearPerSexDepressedList != null ? "" : "yearPerSexDepressed-female数据查询失败，请重试！";
            return new Result(code, yearPerSexDepressedList, msg);
        }
        else{
            throw new BusinessException(Code.BUSINESS_ERR,sex+" 参数传递错误！");
        }
    }
}
