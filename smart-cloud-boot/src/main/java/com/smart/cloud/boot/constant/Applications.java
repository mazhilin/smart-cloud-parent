package com.smart.cloud.boot.constant;

/**
 * @className: com.smart.cloud.boot.constant.Applications
 * @projectName: 封装SmartCloud项目-Applications类
 * @module: SmartCloud项目-Applications类，主要位于Applications模块的业务场景
 * @content: Applications类，主要用于完成Applications-应用常见常量的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-13 00:52
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public final class Applications {

    /**
     * 应用程序类型
     */
    interface Types {
        String WEB = "web";
        String APP = "app";
        String SMR = "smr";
    }

    /**
     * 应用操作系统
     */
    interface OS {
        String Microsoft = "windows";
        String Apple = "apple";
        String Linux = "linux";
        String Google = "android";
        String Unix = "unix";
    }

    /**
     * 应用操作系统
     */
    interface Browser {
        String Chrome = "Google Chrome";
        String Firefox = "Mozilla Firefox";
        String Edge = "Microsoft Edge";
        String Safari = "Apple Safari";
        String Opera = "Opera";
        String Uc = "UCWeb";
        String Chromium = "Google Chromium";
    }

}
