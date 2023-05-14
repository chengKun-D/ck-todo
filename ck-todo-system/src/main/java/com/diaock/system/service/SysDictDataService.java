package com.diaock.system.service;

import com.diaock.common.utils.PageResult;
import com.diaock.mybatis.service.BaseService;
import com.diaock.system.entity.SysDictDataEntity;
import com.diaock.system.query.SysDictDataQuery;
import com.diaock.system.vo.SysDictDataVO;

import java.util.List;

/**
 * 数据字典
 * @author chengKun
 */
public interface SysDictDataService extends BaseService<SysDictDataEntity> {

    PageResult<SysDictDataVO> page(SysDictDataQuery query);

    void save(SysDictDataVO vo);

    void update(SysDictDataVO vo);

    void delete(List<Long> idList);

}