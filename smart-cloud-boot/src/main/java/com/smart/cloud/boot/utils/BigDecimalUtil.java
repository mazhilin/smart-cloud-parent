package com.smart.cloud.boot.utils;

import lombok.experimental.UtilityClass;

import java.math.BigDecimal;

/**
 * @className: com.smart.cloud.boot.utils.BigDecimalUtil
 * @title: 封装SmartCloud项目-BigDecimalUtil类
 * @description: <p>
 *         SmartCloud项目-BigDecimalUtil
 *         </p>
 * @content: BigDecimalUtil
 * @author: Powered by marklin
 * @datetime: 2023-04-30 22:00
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@UtilityClass
public class BigDecimalUtil {
    /**
     * Add big decimal.
     *
     * @param v1
     *         the v 1
     * @param v2
     *         the v 2
     *
     * @return the big decimal
     */
    public static BigDecimal add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2);
    }

    /**
     * Sub big decimal.
     *
     * @param v1
     *         the v 1
     * @param v2
     *         the v 2
     *
     * @return the big decimal
     */
    public static BigDecimal sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2);
    }


    /**
     * Mul big decimal.
     *
     * @param v1
     *         the v 1
     * @param v2
     *         the v 2
     *
     * @return the big decimal
     */
    public static BigDecimal mul(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2);
    }

    /**
     * Div big decimal.
     *
     * @param v1
     *         the v 1
     * @param v2
     *         the v 2
     *
     * @return the big decimal
     */
    public static BigDecimal div(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP);
    }
}
