package com.diaock.dao;

import com.diaock.entity.ScheduleJobEntity;
import com.diaock.mybatis.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务
 * @author chengKun
 */
@Mapper
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {

}