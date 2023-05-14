package com.diaock.dao;

import com.diaock.entity.SmsLogEntity;
import com.diaock.mybatis.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 短信日志
 * @author chengKun
 */
@Mapper
public interface SmsLogDao extends BaseDao<SmsLogEntity> {

}