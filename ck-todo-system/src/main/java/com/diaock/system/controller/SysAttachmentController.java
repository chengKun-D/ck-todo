package com.diaock.system.controller;

import com.diaock.common.utils.PageResult;
import com.diaock.common.utils.Result;
import com.diaock.system.query.SysAttachmentQuery;
import com.diaock.system.service.SysAttachmentService;
import com.diaock.system.vo.SysAttachmentVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 附件管理
 * @author chengKun
 */
@RestController
@RequestMapping("sys/attachment")
@Tag(name = "附件管理")
@AllArgsConstructor
public class SysAttachmentController {
    private final SysAttachmentService sysAttachmentService;

    @GetMapping("page")
    @Operation(summary = "分页")
    @PreAuthorize("hasAuthority('sys:attachment:page')")
    public Result<PageResult<SysAttachmentVO>> page(@ParameterObject @Valid SysAttachmentQuery query) {
        PageResult<SysAttachmentVO> page = sysAttachmentService.page(query);

        return Result.ok(page);
    }

    @PostMapping
    @Operation(summary = "保存")
    @PreAuthorize("hasAuthority('sys:attachment:save')")
    public Result<String> save(@RequestBody SysAttachmentVO vo) {
        sysAttachmentService.save(vo);

        return Result.ok();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    @PreAuthorize("hasAuthority('sys:attachment:delete')")
    public Result<String> delete(@RequestBody List<Long> idList) {
        sysAttachmentService.delete(idList);

        return Result.ok();
    }
}