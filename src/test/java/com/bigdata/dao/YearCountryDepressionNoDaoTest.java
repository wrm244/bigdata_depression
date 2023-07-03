package com.bigdata.dao;

import com.bigdata.domain.YearCountryDepressionNo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class YearCountryDepressionNoDaoTest {
    @Autowired
    private YearCountryDepressionNoDao yearCountryDepressionNoDao;
    @Test
    public void yearCountryDepressedPer(){
        List<Map<String, YearCountryDepressionNo>> yearCountryDepressionNoDaoList = yearCountryDepressionNoDao.selectAll();
        System.out.println(yearCountryDepressionNoDaoList);
    }
}