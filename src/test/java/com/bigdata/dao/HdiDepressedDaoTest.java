package com.bigdata.dao;

import com.bigdata.domain.HdiDepressed;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

/**
 * 人类发展指数与抑郁人数测试类
 *
 * @author 吴河山
 * @date 2023/07/03 10:15
 */
@SpringBootTest
public class HdiDepressedDaoTest {
    @Autowired
    private HdiDepressedDao hdiDepressedDao;

    @Test
    void ageDepressedSelectAll(){
        List<Map<String, HdiDepressed>> hdiDepressed = hdiDepressedDao.selectAll();
        System.out.println(hdiDepressed);
    }
}
