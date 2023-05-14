package com.diaock.system.convert;

import com.diaock.system.entity.SysRoleEntity;
import com.diaock.system.vo.SysRoleVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 角色转换
 * @author chengKun
 */
@Mapper
public interface SysRoleConvert {
    SysRoleConvert INSTANCE = Mappers.getMapper(SysRoleConvert.class);

    SysRoleVO convert(SysRoleEntity entity);

    SysRoleEntity convert(SysRoleVO vo);

    List<SysRoleVO> convertList(List<SysRoleEntity> list);

}
