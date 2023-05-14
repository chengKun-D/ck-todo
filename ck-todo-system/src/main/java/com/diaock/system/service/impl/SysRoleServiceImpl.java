package com.diaock.system.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.diaock.common.utils.PageResult;
import com.diaock.mybatis.service.impl.BaseServiceImpl;
import com.diaock.system.convert.SysRoleConvert;
import com.diaock.system.dao.SysRoleDao;
import com.diaock.system.entity.SysRoleEntity;
import com.diaock.system.enums.DataScopeEnum;
import com.diaock.system.query.SysRoleQuery;
import com.diaock.system.service.SysRoleDataScopeService;
import com.diaock.system.service.SysRoleMenuService;
import com.diaock.system.service.SysRoleService;
import com.diaock.system.service.SysUserRoleService;
import com.diaock.system.vo.SysRoleDataScopeVO;
import com.diaock.system.vo.SysRoleVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
 * @author chengKun
 */
@Service
@AllArgsConstructor
public class SysRoleServiceImpl extends BaseServiceImpl<SysRoleDao, SysRoleEntity> implements SysRoleService {
    private final SysRoleMenuService sysRoleMenuService;
    private final SysRoleDataScopeService sysRoleDataScopeService;
    private final SysUserRoleService sysUserRoleService;

    @Override
    public PageResult<SysRoleVO> page(SysRoleQuery query) {
        IPage<SysRoleEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(SysRoleConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    @Override
    public List<SysRoleVO> getList(SysRoleQuery query) {
        List<SysRoleEntity> entityList = baseMapper.selectList(getWrapper(query));

        return SysRoleConvert.INSTANCE.convertList(entityList);
    }

    private Wrapper<SysRoleEntity> getWrapper(SysRoleQuery query){
        LambdaQueryWrapper<SysRoleEntity> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(StrUtil.isNotBlank(query.getName()), SysRoleEntity::getName, query.getName());

        // 数据权限
        dataScopeWrapper(wrapper);

        return wrapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(SysRoleVO vo) {
        SysRoleEntity entity = SysRoleConvert.INSTANCE.convert(vo);

        // 保存角色
        entity.setDataScope(DataScopeEnum.SELF.getValue());
        baseMapper.insert(entity);

        // 保存角色菜单关系
        sysRoleMenuService.saveOrUpdate(entity.getId(), vo.getMenuIdList());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(SysRoleVO vo) {
        SysRoleEntity entity = SysRoleConvert.INSTANCE.convert(vo);

        // 更新角色
        updateById(entity);

        // 更新角色菜单关系
        sysRoleMenuService.saveOrUpdate(entity.getId(), vo.getMenuIdList());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void dataScope(SysRoleDataScopeVO vo) {
        SysRoleEntity entity = getById(vo.getId());
        entity.setDataScope(vo.getDataScope());
        // 更新角色
        updateById(entity);

        // 更新角色数据权限关系
        if(vo.getDataScope().equals(DataScopeEnum.CUSTOM.getValue())){
            sysRoleDataScopeService.saveOrUpdate(entity.getId(), vo.getOrgIdList());
        }else {
            sysRoleDataScopeService.deleteByRoleIdList(Collections.singletonList(vo.getId()));
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> idList) {
        // 删除角色
        removeByIds(idList);

        // 删除用户角色关系
        sysUserRoleService.deleteByRoleIdList(idList);

        // 删除角色菜单关系
        sysRoleMenuService.deleteByRoleIdList(idList);

        // 删除角色数据权限关系
        sysRoleDataScopeService.deleteByRoleIdList(idList);
    }

}