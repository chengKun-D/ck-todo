package com.diaock.service;

import com.diaock.common.utils.PageResult;
import com.diaock.entity.ScheduleJobLogEntity;
import com.diaock.mybatis.service.BaseService;
import com.diaock.query.ScheduleJobLogQuery;
import com.diaock.vo.ScheduleJobLogVO;

/**
 * 定时任务日志
 * @author chengKun
 */
public interface ScheduleJobLogService extends BaseService<ScheduleJobLogEntity> {

    PageResult<ScheduleJobLogVO> page(ScheduleJobLogQuery query);

}