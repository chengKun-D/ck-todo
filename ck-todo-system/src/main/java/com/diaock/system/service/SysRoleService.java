package com.diaock.system.service;

import com.diaock.common.utils.PageResult;
import com.diaock.mybatis.service.BaseService;
import com.diaock.system.entity.SysRoleEntity;
import com.diaock.system.query.SysRoleQuery;
import com.diaock.system.vo.SysRoleDataScopeVO;
import com.diaock.system.vo.SysRoleVO;

import java.util.List;

/**
 * 角色
 * @author chengKun
 */
public interface SysRoleService extends BaseService<SysRoleEntity> {

    PageResult<SysRoleVO> page(SysRoleQuery query);

    List<SysRoleVO> getList(SysRoleQuery query);

    void save(SysRoleVO vo);

    void update(SysRoleVO vo);

    void dataScope(SysRoleDataScopeVO vo);

    void delete(List<Long> idList);
}