package com.diaock.system.dao;

import com.diaock.mybatis.dao.BaseDao;
import com.diaock.system.entity.SysLogLoginEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 登录日志 DAO
 * @author chengKun
 */
@Mapper
public interface SysLogLoginDao extends BaseDao<SysLogLoginEntity> {

}