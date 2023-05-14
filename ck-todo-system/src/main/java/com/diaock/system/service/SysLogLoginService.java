package com.diaock.system.service;

import com.diaock.common.utils.PageResult;
import com.diaock.mybatis.service.BaseService;
import com.diaock.system.entity.SysLogLoginEntity;
import com.diaock.system.query.SysLogLoginQuery;
import com.diaock.system.vo.SysLogLoginVO;

/**
 * 登录日志
 * @author chengKun
 */
public interface SysLogLoginService extends BaseService<SysLogLoginEntity> {

    /**
     * Page result.
     *
     * @param query the query
     * @return the page result
     */
    PageResult<SysLogLoginVO> page(SysLogLoginQuery query);

    /**
     * 保存登录日志
     *
     * @param username  用户名
     * @param status    登录状态
     * @param operation 操作信息
     */
    void save(String username, Integer status, Integer operation);

    /**
     * 导出登录日志
     */
    void export();
}