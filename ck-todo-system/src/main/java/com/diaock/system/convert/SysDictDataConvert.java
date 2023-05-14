package com.diaock.system.convert;

import com.diaock.system.entity.SysDictDataEntity;
import com.diaock.system.vo.SysDictDataVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 字典数据转换
 * @author chengKun
 */
@Mapper
public interface SysDictDataConvert {
    SysDictDataConvert INSTANCE = Mappers.getMapper(SysDictDataConvert.class);

    SysDictDataVO convert(SysDictDataEntity entity);

    SysDictDataEntity convert(SysDictDataVO vo);

    List<SysDictDataVO> convertList(List<SysDictDataEntity> list);

}