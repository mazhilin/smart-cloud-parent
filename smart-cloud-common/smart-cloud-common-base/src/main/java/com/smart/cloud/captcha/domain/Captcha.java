package com.smart.cloud.captcha.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @className: com.smart.cloud.common.captcha.Captcha
 * @projectName: 封装SmartCloud项目-Captcha类
 * @module: SmartCloud项目-Captcha类，主要位于Captcha模块的业务场景
 * @content: Captcha类，主要用于完成Captcha的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-07 01:00
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Captcha implements Serializable {

    private static final long serialVersionUID = -6788829742680615921L;

    /**
     * 验证码
     */
    private String captcha;
    /**
     * 缓存KEY
     */
    private String captchaKey;
    /**
     * 前置验证KEY
     */
    private String lastCheckKey;
    /**
     * 消息
     */
    private String message;
    /**
     * 消息编码
     */
    private String code;
    /**
     * 是否成功
     */
    private boolean succeed;
    /**
     * 间隔时间(秒)
     */
    private long interval;
    /**
     * 错误次数
     */
    private int errorTimes;
    /**
     * 剩余次数
     */
    private int surplusTimes;
    /**
     * 消息参数
     */
    private Object[] messageParams;

    public Captcha(boolean succeed) {
        this.succeed = succeed;
    }

    /**
     * 清除验证码
     */
    public void clearCaptcha() {
        this.captcha = null;
    }
}
