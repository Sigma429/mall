package com.sigma429.mall.mapper;

import com.sigma429.mall.model.UmsMemberTask;
import com.sigma429.mall.model.UmsMemberTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberTaskMapper {
    long countByExample(UmsMemberTaskExample example);

    int deleteByExample(UmsMemberTaskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTask row);

    int insertSelective(UmsMemberTask row);

    List<UmsMemberTask> selectByExample(UmsMemberTaskExample example);

    UmsMemberTask selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsMemberTask row, @Param("example") UmsMemberTaskExample example);

    int updateByExample(@Param("row") UmsMemberTask row, @Param("example") UmsMemberTaskExample example);

    int updateByPrimaryKeySelective(UmsMemberTask row);

    int updateByPrimaryKey(UmsMemberTask row);
}