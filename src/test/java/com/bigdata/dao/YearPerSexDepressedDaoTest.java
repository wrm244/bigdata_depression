package com.bigdata.dao;

import com.bigdata.domain.YearPerSexDepressed;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class YearPerSexDepressedDaoTest {
    @Autowired
    private YearPerSexDepressedDao yearPerSexDepressedDao;

    @Test
    void ageDepressedSelectAll(){
        List<Map<String, YearPerSexDepressed>> yearPerSexDepressed = yearPerSexDepressedDao.selectFemaleData();
        System.out.println(yearPerSexDepressed);
    }
}
