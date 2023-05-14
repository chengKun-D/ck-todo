package com.diaock.system.service;

import com.diaock.common.utils.PageResult;
import com.diaock.mybatis.service.BaseService;
import com.diaock.system.entity.SysDictTypeEntity;
import com.diaock.system.query.SysDictTypeQuery;
import com.diaock.system.vo.SysDictTypeVO;
import com.diaock.system.vo.SysDictVO;

import java.util.List;

/**
 * 数据字典类型
 * @author chengKun
 */
public interface SysDictTypeService extends BaseService<SysDictTypeEntity> {

    PageResult<SysDictTypeVO> page(SysDictTypeQuery query);

    void save(SysDictTypeVO vo);

    void update(SysDictTypeVO vo);

    void delete(List<Long> idList);

    /**
     * 获取动态SQL数据
     */
    List<SysDictVO.DictData> getDictSql(Long id);

    /**
     * 获取全部字典列表
     */
    List<SysDictVO> getDictList();

    /**
     * 刷新字典缓存
     */
    void refreshTransCache();

}