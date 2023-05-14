package com.diaock.security.mobile;

/**
 * 手机短信登录，验证码效验
 * @author chengKun
 */
public interface MobileVerifyCodeService {

    boolean verifyCode(String mobile, String code);
}
