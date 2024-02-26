package com.sigma429.mall.service;


import com.sigma429.mall.dto.PmsBrandDTO;
import com.sigma429.mall.model.PmsBrand;

import java.util.List;

/**
 * DemoService接口
 */
public interface DemoService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrandDTO pmsBrandDTO);

    int updateBrand(Long id, PmsBrandDTO pmsBrandDTO);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
