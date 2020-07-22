package com.wusuiwei.gmall.pms;

import com.wusuiwei.gmall.pms.daos.PmsProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    PmsProductRepository pmsProductRepository;

    @Test
    void contextLoads() {
        System.out.println(pmsProductRepository.findAll());
    }

}
