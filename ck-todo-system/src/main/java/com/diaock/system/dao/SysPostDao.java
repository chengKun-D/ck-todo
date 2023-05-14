package com.diaock.system.dao;

import com.diaock.mybatis.dao.BaseDao;
import com.diaock.system.entity.SysPostEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 岗位管理 DAO
 * @author chengKun
 */
@Mapper
public interface SysPostDao extends BaseDao<SysPostEntity> {

}