package com.diaock.utils;

import org.quartz.DisallowConcurrentExecution;

/**
 * 禁止并发
 * @author chengKun
 */
@DisallowConcurrentExecution
public class ScheduleDisallowConcurrentExecution extends AbstractScheduleJob {

}
