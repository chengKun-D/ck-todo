package com.diaock.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.diaock.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户角色管理
 * @author chengKun
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("sys_user_role")
public class SysUserRoleEntity extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    private Long roleId;
    /**
     * 用户ID
     */
    private Long userId;

}
