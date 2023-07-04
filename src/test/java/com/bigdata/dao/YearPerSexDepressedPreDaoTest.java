package com.bigdata.dao;

import com.bigdata.domain.YearPerSexDepressed;
import com.bigdata.domain.YearPerSexDepressedPre;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class YearPerSexDepressedPreDaoTest {
    @Autowired
    private YearPerSexDepressedPreDao yearPerSexDepressedPreDao;

    @Test
    void ageDepressedSelectAll(){
        List<Map<String, YearPerSexDepressedPre>> yearPerSexDepressed = yearPerSexDepressedPreDao.selectFemaleData();
        System.out.println(yearPerSexDepressed);
    }
}
