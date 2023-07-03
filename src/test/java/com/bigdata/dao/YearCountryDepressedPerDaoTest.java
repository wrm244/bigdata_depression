package com.bigdata.dao;

import com.bigdata.domain.YearCountryDepressedPer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class YearCountryDepressedPerDaoTest {
    @Autowired
    private YearCountryDepressedPerDao yearCountryDepressedPerDao;
    @Test
    public void yearCountryDepressedPer(){
        List<Map<String, YearCountryDepressedPer>> yearCountryDepressedPerList = yearCountryDepressedPerDao.selectAll();
        System.out.println(yearCountryDepressedPerList);
    }
}
