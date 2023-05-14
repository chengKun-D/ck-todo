package com.diaock.service;

import com.diaock.common.utils.PageResult;
import com.diaock.entity.SmsLogEntity;
import com.diaock.mybatis.service.BaseService;
import com.diaock.query.SmsLogQuery;
import com.diaock.vo.SmsLogVO;

/**
 * 短信日志
 * @author chengKun
 */
public interface SmsLogService extends BaseService<SmsLogEntity> {

    PageResult<SmsLogVO> page(SmsLogQuery query);

}