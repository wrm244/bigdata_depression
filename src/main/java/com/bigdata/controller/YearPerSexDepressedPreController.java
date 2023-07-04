package com.bigdata.controller;

import com.bigdata.domain.YearPerSexDepressed;
import com.bigdata.domain.YearPerSexDepressedPre;
import com.bigdata.exception.BusinessException;
import com.bigdata.service.impl.YearPerSexDepressedPreServiceImpl;
import com.bigdata.service.impl.YearPerSexDepressedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/year-per-depressed-pre")
@CrossOrigin(origins = {"*"})
public class YearPerSexDepressedPreController {

    @Autowired
    private YearPerSexDepressedPreServiceImpl yearPerSexDepressedPreService;

    @GetMapping
    public Result SelectAll(@RequestParam("sex") String sex) {
        if (sex.equals("male")) {
            List<Map<String, YearPerSexDepressedPre>> yearPerSexDepressedPreList = yearPerSexDepressedPreService.selectMale();
            Integer code = yearPerSexDepressedPreList != null ? Code.GET_OK : Code.GET_ERR;
            String msg = yearPerSexDepressedPreList != null ? "" : "yearPerSexDepressed-male数据查询失败，请重试！";
            return new Result(code, yearPerSexDepressedPreList, msg);
        } else if (sex.equals("female")) {
            List<Map<String, YearPerSexDepressedPre>> yearPerSexDepressedPreList = yearPerSexDepressedPreService.selectFemale();
            Integer code = yearPerSexDepressedPreList != null ? Code.GET_OK : Code.GET_ERR;
            String msg = yearPerSexDepressedPreList != null ? "" : "yearPerSexDepressed-female数据查询失败，请重试！";
            return new Result(code, yearPerSexDepressedPreList, msg);
        }
        else{
            throw new BusinessException(Code.BUSINESS_ERR,sex+" 参数传递错误！");
        }
    }
}
