package com.diaock.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author chengKun
 */
@Getter
@AllArgsConstructor
public enum ScheduleStatusEnum {
    /**
     * 暂停
     */
    PAUSE(0),
    /**
     * 正常
     */
    NORMAL(1);

    private final int value;
}
