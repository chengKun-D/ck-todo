package com.diaock.storage.properties;

import lombok.Data;

/**
 * 腾讯云存储配置项
 * @author chengKun
 */
@Data
public class TencentStorageProperties {
    private String accessKey;
    private String secretKey;
    private String region;
    private String bucketName;
}
