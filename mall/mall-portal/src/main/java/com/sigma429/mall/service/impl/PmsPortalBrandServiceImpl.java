package com.sigma429.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.sigma429.mall.api.CommonPage;
import com.sigma429.mall.dao.HomeDao;
import com.sigma429.mall.mapper.PmsBrandMapper;
import com.sigma429.mall.mapper.PmsProductMapper;
import com.sigma429.mall.model.PmsBrand;
import com.sigma429.mall.model.PmsProduct;
import com.sigma429.mall.model.PmsProductExample;
import com.sigma429.mall.service.PmsPortalBrandService;
import net.sf.jsqlparser.statement.select.Offset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:PmsPortalBrandServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:前台品牌管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/20 - 2:28
 * @Version:v1.0
 */
@Service
public class PmsPortalBrandServiceImpl implements PmsPortalBrandService {
    @Autowired
    private HomeDao homeDao;
    @Autowired
    private PmsBrandMapper brandMapper;
    @Autowired
    private PmsProductMapper productMapper;

    @Override
    public List<PmsBrand> recommendList(Integer pageNum, Integer pageSize) {
        int offset = (pageNum - 1) * pageSize;
        return homeDao.getRecommendBrandList(offset, pageSize);
    }

    @Override
    public PmsBrand detail(Long brandId) {
        return brandMapper.selectByPrimaryKey(brandId);
    }

    @Override
    public CommonPage<PmsProduct> productList(Long brandId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PmsProductExample example = new PmsProductExample();
        example.createCriteria().andDeleteStatusEqualTo(0).andBrandIdEqualTo(brandId);
        List<PmsProduct> productList = productMapper.selectByExample(example);
        return CommonPage.restPage(productList);
    }
}
