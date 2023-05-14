package com.diaock.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chengKun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cache {

    private String cacheKey;

    private Object cacheValue;
}
