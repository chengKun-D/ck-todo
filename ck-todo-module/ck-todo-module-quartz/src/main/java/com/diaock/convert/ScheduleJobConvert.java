package com.diaock.convert;

import com.diaock.entity.ScheduleJobEntity;
import com.diaock.vo.ScheduleJobVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 定时任务
 * @author chengKun
 */
@Mapper
public interface ScheduleJobConvert {
    ScheduleJobConvert INSTANCE = Mappers.getMapper(ScheduleJobConvert.class);

    ScheduleJobEntity convert(ScheduleJobVO vo);

    ScheduleJobVO convert(ScheduleJobEntity entity);

    List<ScheduleJobVO> convertList(List<ScheduleJobEntity> list);

}