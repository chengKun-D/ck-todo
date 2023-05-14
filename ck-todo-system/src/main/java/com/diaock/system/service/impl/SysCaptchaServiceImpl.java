package com.diaock.system.service.impl;

import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.StrUtil;
import com.diaock.common.cache.RedisCache;
import com.diaock.common.cache.RedisKeys;
import com.diaock.system.enums.SysParamsEnum;
import com.diaock.system.service.SysCaptchaService;
import com.diaock.system.service.SysParamsService;
import com.diaock.system.vo.SysCaptchaVO;
import com.wf.captcha.SpecCaptcha;
import com.wf.captcha.base.Captcha;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author chengKun
 */
@Service
@AllArgsConstructor
public class SysCaptchaServiceImpl implements SysCaptchaService {
    private final RedisCache redisCache;
    private final SysParamsService sysParamsService;

    @Override
    public SysCaptchaVO generate() {
        // 生成验证码key
        String key = UUID.randomUUID().toString();

        // 生成验证码
        SpecCaptcha captcha = new SpecCaptcha(150, 40);
        captcha.setLen(5);
        captcha.setCharType(Captcha.TYPE_DEFAULT);
        String image = captcha.toBase64();

        // 保存到缓存
        String redisKey = RedisKeys.getCaptchaKey(key);
        redisCache.set(redisKey, captcha.text(), 300);

        // 封装返回数据
        SysCaptchaVO captchaVO = new SysCaptchaVO();
        captchaVO.setKey(key);
        captchaVO.setImage(image);

        return captchaVO;
    }

    @Override
    public boolean validate(String key, String code) {
        // 如果关闭了验证码，则直接效验通过
        if (!isCaptchaEnabled()) {
            return true;
        }

        if (StrUtil.isBlank(key) || StrUtil.isBlank(code)) {
            return false;
        }

        // 获取验证码
        String captcha = getCache(key);

        // 效验成功
        return code.equalsIgnoreCase(captcha);
    }

    private String getCache(String key) {
        key = RedisKeys.getCaptchaKey(key);
        String captcha = (String) redisCache.get(key);
        // 删除验证码
        if (captcha != null) {
            redisCache.delete(key);
        }

        return captcha;
    }

    /**
     * 是否开启登录验证码
     *
     * @return true：开启  false：关闭
     */
    private boolean isCaptchaEnabled() {
        return sysParamsService.getBoolean(SysParamsEnum.LOGIN_CAPTCHA.name());
    }
}