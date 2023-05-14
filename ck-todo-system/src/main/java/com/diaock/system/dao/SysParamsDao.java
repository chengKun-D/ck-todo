package com.diaock.system.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.diaock.mybatis.dao.BaseDao;
import com.diaock.system.entity.SysParamsEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 参数管理 DAO
 * @author chengKun
 */
@Mapper
public interface SysParamsDao extends BaseDao<SysParamsEntity> {

    default boolean isExist(String paramKey) {
        return this.exists(new QueryWrapper<SysParamsEntity>().eq("param_key" , paramKey));
    }
}