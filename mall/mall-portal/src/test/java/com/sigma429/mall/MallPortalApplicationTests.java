package com.sigma429.mall;

import com.sigma429.mall.dao.PortalProductDao;
import com.sigma429.mall.domain.PromotionProduct;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MallPortalApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private PortalProductDao portalProductDao;
    @Test
    public void testGetPromotionProductList(){
        List<Long> ids = new ArrayList<>();
        ids.add(26L);
        ids.add(27L);
        ids.add(28L);
        ids.add(29L);
        List<PromotionProduct> promotionProductList = portalProductDao.getPromotionProductList(ids);
        assertEquals(4,promotionProductList.size());
    }
}
