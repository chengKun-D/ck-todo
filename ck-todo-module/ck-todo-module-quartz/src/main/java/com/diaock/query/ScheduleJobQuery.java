package com.diaock.query;

import com.diaock.common.query.Query;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 定时任务查询
 * @author chengKun
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "定时任务查询")
public class ScheduleJobQuery extends Query {
    @Schema(description = "任务名称")
    private String jobName;

    @Schema(description = "任务组名")
    private String jobGroup;

    @Schema(description = "状态")
    private Integer status;

}