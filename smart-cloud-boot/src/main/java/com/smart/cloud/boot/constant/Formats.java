package com.smart.cloud.boot.constant;

/**
 * @className: com.smart.cloud.boot.constant.Formats
 * @title: 封装SmartCloud项目-Formats类
 * @description: <p>
 *         SmartCloud项目-Formats-格式化常量类
 *         </p>
 * @content: SmartCloud统一格式化常量类
 * @author: Powered by marklin
 * @datetime: 2023-04-30 13:47
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public final class Formats {
    /**
     * 年
     */
    public static final String YEAR = "yyyy";

    /**
     * 月
     */
    public static final String MONTH = "MM";

    /**
     * 日
     */
    public static final String DAY = "dd";

    /**
     * 时
     */
    public static final String HOUR = "HH";

    /**
     * 分
     */
    public static final String MINUTE = "mm";

    /**
     * 秒
     */
    public static final String SECOND = "ss";

    /**
     * 日期
     */
    public static final String DATE = YEAR + Constants.LINE + MONTH + Constants.LINE + DAY;
    /**
     * 时间
     */
    public static final String TIME = HOUR + Constants.COLON + MINUTE + Constants.COLON + SECOND;
    /**
     * 日期+时间
     */
    public static final String DATETIME = DATE + Constants.EMPTY + TIME;


    public static void main(String[] args) {
        System.out.println(Formats.DATE);
        System.out.println(Formats.TIME);
        System.out.println(Formats.DATETIME);
        System.out.println(Formats.DATETIME.length());
        System.out.println("yyyy-MM-dd HH:mm:ss".length());
    }
}
