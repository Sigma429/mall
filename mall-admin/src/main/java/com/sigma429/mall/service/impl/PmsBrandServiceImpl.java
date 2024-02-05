package com.sigma429.mall.service.impl;

import com.sigma429.mall.dto.PmsBrandParam;
import com.sigma429.mall.model.PmsBrand;
import com.sigma429.mall.service.PmsBrandService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:PmsBrandServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:商品品牌Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:42
 * @Version:v1.0
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    @Override
    public List<PmsBrand> listAllBrand() {
        return null;
    }

    @Override
    public int createBrand(PmsBrandParam pmsBrandParam) {
        return 0;
    }

    @Override
    public int updateBrand(Long id, PmsBrandParam pmsBrandParam) {
        return 0;
    }

    @Override
    public int deleteBrand(Long id) {
        return 0;
    }

    @Override
    public int deleteBrand(List<Long> ids) {
        return 0;
    }

    @Override
    public List<PmsBrand> listBrand(String keyword, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return null;
    }

    @Override
    public int updateShowStatus(List<Long> ids, Integer showStatus) {
        return 0;
    }

    @Override
    public int updateFactoryStatus(List<Long> ids, Integer factoryStatus) {
        return 0;
    }
}
