package com.diaock.system.service;

import com.diaock.system.entity.SysUserEntity;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * UserDetailsService
 * @author chengKun
 */
public interface SysUserDetailsService {

    /**
     * 获取 UserDetails 对象
     */
    UserDetails getUserDetails(SysUserEntity userEntity);
}
