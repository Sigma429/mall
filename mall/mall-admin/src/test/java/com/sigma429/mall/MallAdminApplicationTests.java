package com.sigma429.mall;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cn.hutool.json.JSONUtil;
import com.sigma429.mall.dao.PmsMemberPriceDao;
import com.sigma429.mall.dao.PmsProductDao;
import com.sigma429.mall.dto.PmsProductResult;
import com.sigma429.mall.mapper.UmsAdminMapper;
import com.sigma429.mall.model.PmsMemberPrice;
import com.sigma429.mall.model.UmsAdmin;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RestController
class MallAdminApplicationTests {
    @Autowired
    private PmsMemberPriceDao memberPriceDao;
    @Autowired
    private PmsProductDao productDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(MallAdminApplicationTests.class);

    @Test
    void contextLoads() {
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }


    @Test
    @Transactional
    @Rollback
    public void testInsertBatch() {
        List<PmsMemberPrice> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            PmsMemberPrice memberPrice = new PmsMemberPrice();
            memberPrice.setProductId(1L);
            memberPrice.setMemberLevelId((long) (i + 1));
            memberPrice.setMemberPrice(new BigDecimal("22"));
            list.add(memberPrice);
        }
        int count = memberPriceDao.insertList(list);
        assertEquals(5, count);
    }

    @Test
    public void testGetProductUpdateInfo() {
        PmsProductResult productResult = productDao.getUpdateInfo(7L);
        String json = JSONUtil.parse(productResult).toString();
        LOGGER.info(json);
    }
}
