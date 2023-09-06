package com.smart.cloud.captcha.support;

import com.smart.cloud.boot.utils.RandomUtil;

import java.util.UUID;

/**
 * @className: com.smart.cloud.captcha.support.CaptchaGenerator
 * @projectName: 封装SmartCloud项目-CaptchaGenerator类
 * @module: SmartCloud项目-CaptchaGenerator类，主要位于CaptchaGenerator模块的业务场景
 * @content: CaptchaGenerator类，主要用于完成CaptchaGenerator的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-07 01:39
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public class CaptchaGenerator {
    private CaptchaGenerator() {}

    private static final char[] NUMBERS = new char[10];
    private static final char[] CHARS = new char[('9' - '0' + 1) + ('z' - 'a' + 1) + ('Z' - 'A' + 1)];

    static {
        int c = 0;
        for (int i = 0; i < 10; i++) {
            NUMBERS[i] = (char) (i + 48);
            CHARS[c++] = NUMBERS[i];
        }
        for (int i = 0, len = 'Z' - 'A' + 1; i < len; i++) {
            CHARS[c++] = (char) ('A' + i);
        }
        for (int i = 0, len = 'z' - 'a' + 1; i < len; i++) {
            CHARS[c++] = (char) ('a' + i);
        }
    }

    /**
     * @return 6位数字验证码
     */
    public static String generateNumberCaptcha() {
        return generateNumberCaptcha(6);
    }

    /**
     * @param count 位数
     * @return 指定位数的数字验证码
     */
    public static String generateNumberCaptcha(int count) {
        return RandomUtil.random(count, 0, NUMBERS.length - 1, false, true, NUMBERS);
    }

    /**
     * @param count 位数
     * @return 指定位数的数字验证码
     */
    public static String generateNumberCaptcha(int count, char[] source) {
        return RandomUtil.random(count, 0, source.length - 1, false, true, source);
    }

    /**
     * @param count 位数
     * @return 指定位数的字符验证码
     */
    public static String generateCharCaptcha(int count) {
        return RandomUtil.random(count, 0, CHARS.length - 1, true, true, CHARS);
    }

    /**
     * @return 验证码KEY
     */
    public static String generateCaptchaKey() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
