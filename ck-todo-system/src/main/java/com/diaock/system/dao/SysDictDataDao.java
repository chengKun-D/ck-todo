package com.diaock.system.dao;

import com.diaock.mybatis.dao.BaseDao;
import com.diaock.system.entity.SysDictDataEntity;
import com.diaock.system.vo.SysDictVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 字典数据 DAO
 * @author chengKun
 */
@Mapper
public interface SysDictDataDao extends BaseDao<SysDictDataEntity> {

    @Select("${sql}")
    List<SysDictVO.DictData> getListForSql(@Param("sql") String sql);
}
