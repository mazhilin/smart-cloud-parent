package com.smart.cloud.boot.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * @className: com.smart.cloud.boot.utils.SpringToolsUtil
 * @title: 封装SmartCloud项目-SpringToolsUtil类
 * @description: <p>
 *         SmartCloud项目-SptingToolsUtil工具类
 *         </p>
 * @content: 通用工具类
 * @author: Powered by marklin
 * @datetime: 2023-04-26 04:04
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public class SpringToolsUtil {
    private static final String UNKNOWN_IP_KEY = "unknown";


    /**
     * 获取当前请求的IP地址
     * @param request 请求
     * @return 返回值
     */
    public String getIpAddress(HttpServletRequest request) {
        String ipAddress = request.getHeader("X-forwarded-for");
        if (ipAddress == null || ipAddress.length() == 0 || UNKNOWN_IP_KEY.equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("Proxy-Client-IP");
        }
        if (ipAddress == null || ipAddress.length() == 0 || UNKNOWN_IP_KEY.equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ipAddress == null || ipAddress.length() == 0 || UNKNOWN_IP_KEY.equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ipAddress == null || ipAddress.length() == 0 || UNKNOWN_IP_KEY.equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ipAddress == null || ipAddress.length() == 0 || UNKNOWN_IP_KEY.equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getRemoteAddr();
        }
        if ("0:0:0:0:0:0:0:1".equals(ipAddress)) {
            ipAddress = "127.0.0.1";
        }
        if (ipAddress != null) {
            ipAddress = ipAddress.split(",")[0];
        }

        return ipAddress;
    }
}
