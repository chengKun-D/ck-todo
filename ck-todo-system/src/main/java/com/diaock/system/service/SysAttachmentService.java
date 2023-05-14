package com.diaock.system.service;

import com.diaock.common.utils.PageResult;
import com.diaock.mybatis.service.BaseService;
import com.diaock.system.entity.SysAttachmentEntity;
import com.diaock.system.query.SysAttachmentQuery;
import com.diaock.system.vo.SysAttachmentVO;

import java.util.List;

/**
 * 附件管理
 * @author chengKun
 */
public interface SysAttachmentService extends BaseService<SysAttachmentEntity> {

    PageResult<SysAttachmentVO> page(SysAttachmentQuery query);

    void save(SysAttachmentVO vo);

    void update(SysAttachmentVO vo);

    void delete(List<Long> idList);
}