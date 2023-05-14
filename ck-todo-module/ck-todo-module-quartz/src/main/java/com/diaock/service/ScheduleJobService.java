package com.diaock.service;

import com.diaock.common.utils.PageResult;
import com.diaock.entity.ScheduleJobEntity;
import com.diaock.mybatis.service.BaseService;
import com.diaock.query.ScheduleJobQuery;
import com.diaock.vo.ScheduleJobVO;

import java.util.List;

/**
 * 定时任务
 * @author chengKun
 */
public interface ScheduleJobService extends BaseService<ScheduleJobEntity> {

    PageResult<ScheduleJobVO> page(ScheduleJobQuery query);

    void save(ScheduleJobVO vo);

    void update(ScheduleJobVO vo);

    void delete(List<Long> idList);

    void run(ScheduleJobVO vo);

    void changeStatus(ScheduleJobVO vo);
}