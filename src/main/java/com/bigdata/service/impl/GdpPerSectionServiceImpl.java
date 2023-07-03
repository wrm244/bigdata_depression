package com.bigdata.service.impl;

import com.bigdata.dao.GdpPerSectionDao;
import com.bigdata.domain.GdpPerSection;
import com.bigdata.service.GdpPerSectionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class GdpPerSectionServiceImpl implements GdpPerSectionService {
    @Autowired
    private GdpPerSectionDao gdpPerSectionDao;
    @Override
    public List<Map<String, GdpPerSection>> selectAll() {
        return gdpPerSectionDao.selectAll();
    }
}
