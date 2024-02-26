package com.sigma429.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.sigma429.mall.dto.PmsBrandDTO;
import com.sigma429.mall.mapper.PmsBrandMapper;
import com.sigma429.mall.model.PmsBrand;
import com.sigma429.mall.model.PmsBrandExample;
import com.sigma429.mall.service.DemoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DemoService实现类
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private PmsBrandMapper brandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrandDTO pmsBrandDTO) {
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtils.copyProperties(pmsBrandDTO, pmsBrand);
        return brandMapper.insertSelective(pmsBrand);
    }

    @Override
    public int updateBrand(Long id, PmsBrandDTO pmsBrandDTO) {
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtils.copyProperties(pmsBrandDTO, pmsBrand);
        pmsBrand.setId(id);
        return brandMapper.updateByPrimaryKeySelective(pmsBrand);
    }

    @Override
    public int deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}
