package com.diaock.mybatis.interceptor;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 数据范围
 * @author chengKun
 */
@Data
@AllArgsConstructor
public class DataScope {
    private String sqlFilter;

}