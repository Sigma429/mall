package com.sigma429.mall.mapper;

import com.sigma429.mall.model.UmsRoleMenuRelation;
import com.sigma429.mall.model.UmsRoleMenuRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsRoleMenuRelationMapper {
    long countByExample(UmsRoleMenuRelationExample example);

    int deleteByExample(UmsRoleMenuRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsRoleMenuRelation row);

    int insertSelective(UmsRoleMenuRelation row);

    List<UmsRoleMenuRelation> selectByExample(UmsRoleMenuRelationExample example);

    UmsRoleMenuRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsRoleMenuRelation row, @Param("example") UmsRoleMenuRelationExample example);

    int updateByExample(@Param("row") UmsRoleMenuRelation row, @Param("example") UmsRoleMenuRelationExample example);

    int updateByPrimaryKeySelective(UmsRoleMenuRelation row);

    int updateByPrimaryKey(UmsRoleMenuRelation row);
}