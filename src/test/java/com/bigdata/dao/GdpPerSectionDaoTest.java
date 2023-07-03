package com.bigdata.dao;

import com.bigdata.domain.GdpPerSection;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class GdpPerSectionDaoTest {
    @Autowired
    private GdpPerSectionDao gdpPerSectionDao;
    @Test
    public void GdpPerSectionDaoSelectAll(){
        List<Map<String,GdpPerSection>> gdpPerSectionList = gdpPerSectionDao.selectAll();
        System.out.println(gdpPerSectionList);

    }
}
