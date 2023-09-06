package com.smart.cloud.captcha.domain;

/**
 * @className: com.smart.cloud.common.captcha.Captchas
 * @projectName: 封装SmartCloud项目-Captchas类
 * @module: SmartCloud项目-Captchas类，主要位于Captchas模块的业务场景
 * @content: Captchas类，主要用于完成Captchas的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-07 01:10
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public interface Captchas {

    String CAPTCHA = "captcha";

    String CAPTCHA_INTERVAL = "interval";

    String CAPTCHA_KEY = "captchaKey";

    String LAST_CHECK_KEY = "lastCheckKey";

    String BUSINESS_SCOPE = "businessScope";
}
