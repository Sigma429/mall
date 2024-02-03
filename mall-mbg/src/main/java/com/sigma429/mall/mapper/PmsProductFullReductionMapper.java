package com.sigma429.mall.mapper;

import com.sigma429.mall.model.PmsProductFullReduction;
import com.sigma429.mall.model.PmsProductFullReductionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductFullReductionMapper {
    long countByExample(PmsProductFullReductionExample example);

    int deleteByExample(PmsProductFullReductionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductFullReduction row);

    int insertSelective(PmsProductFullReduction row);

    List<PmsProductFullReduction> selectByExample(PmsProductFullReductionExample example);

    PmsProductFullReduction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") PmsProductFullReduction row, @Param("example") PmsProductFullReductionExample example);

    int updateByExample(@Param("row") PmsProductFullReduction row, @Param("example") PmsProductFullReductionExample example);

    int updateByPrimaryKeySelective(PmsProductFullReduction row);

    int updateByPrimaryKey(PmsProductFullReduction row);
}