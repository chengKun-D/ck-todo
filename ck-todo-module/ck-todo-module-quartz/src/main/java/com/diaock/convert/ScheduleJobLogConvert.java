package com.diaock.convert;

import com.diaock.entity.ScheduleJobLogEntity;
import com.diaock.vo.ScheduleJobLogVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author chengKun
 */
@Mapper
public interface ScheduleJobLogConvert {
    ScheduleJobLogConvert INSTANCE = Mappers.getMapper(ScheduleJobLogConvert.class);

    ScheduleJobLogEntity convert(ScheduleJobLogVO vo);

    ScheduleJobLogVO convert(ScheduleJobLogEntity entity);

    List<ScheduleJobLogVO> convertList(List<ScheduleJobLogEntity> list);

}