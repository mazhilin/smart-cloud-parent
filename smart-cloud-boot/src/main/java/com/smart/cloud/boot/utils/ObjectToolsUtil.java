package com.smart.cloud.boot.utils;

import lombok.experimental.UtilityClass;

/**
 * @className: com.smart.cloud.boot.utils.ObjectToolsUtil
 * @title: 封装Smart项目-ObjectToolsUtil类
 * @description: <p>
 *         SmartCloud项目-ObjectToolsUtil
 *         </p>
 * @content: ObjectToolsUtil
 * @author: Powered by marklin
 * @datetime: 2023-06-02 02:18
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@UtilityClass
public  class ObjectToolsUtil {
    public static boolean hasLength(CharSequence str) {
        return (str != null && str.length() > 0);
    }

    public static boolean hasLength(String str) {
        return hasLength((CharSequence) str);
    }

    public static boolean hasText(CharSequence str) {
        if (!hasLength(str)) {
            return false;
        }

        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
