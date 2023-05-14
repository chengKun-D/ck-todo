package com.diaock.dao;

import com.diaock.entity.ScheduleJobLogEntity;
import com.diaock.mybatis.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 * @author chengKun
 */
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {

}