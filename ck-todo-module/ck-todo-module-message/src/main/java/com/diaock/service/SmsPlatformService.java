package com.diaock.service;

import com.diaock.common.utils.PageResult;
import com.diaock.entity.SmsPlatformEntity;
import com.diaock.mybatis.service.BaseService;
import com.diaock.query.SmsPlatformQuery;
import com.diaock.sms.config.SmsConfig;
import com.diaock.vo.SmsPlatformVO;

import java.util.List;

/**
 * 短信平台
 * @author chengKun
 */
public interface SmsPlatformService extends BaseService<SmsPlatformEntity> {

    PageResult<SmsPlatformVO> page(SmsPlatformQuery query);

    /**
     * 启用的短信平台列表
     */
    List<SmsConfig> listByEnable();

    void save(SmsPlatformVO vo);

    void update(SmsPlatformVO vo);

    void delete(List<Long> idList);

}