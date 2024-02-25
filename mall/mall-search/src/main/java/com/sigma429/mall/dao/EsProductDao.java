package com.sigma429.mall.dao;

import com.sigma429.mall.domain.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 搜索商品管理自定义Dao
 */
public interface EsProductDao {
    /**
     * 获取指定ID的搜索商品
     */
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
