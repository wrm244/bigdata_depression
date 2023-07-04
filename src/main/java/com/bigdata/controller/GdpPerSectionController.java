package com.bigdata.controller;
import com.bigdata.dao.GdpPerSectionDao;
import com.bigdata.domain.GdpPerSection;
import com.bigdata.domain.HdiDepressed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/gdp-per-section")
@CrossOrigin(origins = {"*"})
public class GdpPerSectionController {
    @Autowired
    private GdpPerSectionDao gdpPerSectionDao;
    
    @GetMapping
    public Result selectAll(){
        List<Map<String, GdpPerSection>> gdpPerSectionList = gdpPerSectionDao.selectAll();
        Integer code = gdpPerSectionList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = gdpPerSectionList != null ? "" : "GdpPerSection数据查询失败，请重试！";
        return new Result(code,gdpPerSectionList,msg);
    }
}
