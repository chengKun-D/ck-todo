package com.diaock.system.convert;

import com.diaock.system.entity.SysDictTypeEntity;
import com.diaock.system.vo.SysDictTypeVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 字典类型转换
 * @author chengKun
 */
@Mapper
public interface SysDictTypeConvert {
    SysDictTypeConvert INSTANCE = Mappers.getMapper(SysDictTypeConvert.class);

    SysDictTypeVO convert(SysDictTypeEntity entity);

    SysDictTypeEntity convert(SysDictTypeVO vo);

    List<SysDictTypeVO> convertList(List<SysDictTypeEntity> list);

}