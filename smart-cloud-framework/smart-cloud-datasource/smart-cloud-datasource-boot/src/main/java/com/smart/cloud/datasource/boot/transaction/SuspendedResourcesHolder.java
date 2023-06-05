package com.smart.cloud.datasource.boot.transaction;

import javax.annotation.Nonnull;

/**
 * @className: com.smart.cloud.datasource.boot.transaction.SuspendedResourcesHolder
 * @title: 封装SmartCloud项目-SuspendedResourcesHolder类
 * @description: <p>
 *         SmartCloud项目-SuspendedResourcesHolder
 *         </p>
 * @content: SuspendedResourcesHolder
 * @author: Powered by marklin
 * @datetime: 2023-06-06 00:50
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public class SuspendedResourcesHolder {
    /**
     * The xid
     */
    private String xid;

    public SuspendedResourcesHolder(String xid) {
        if (xid == null) {
            throw new IllegalArgumentException("xid must be not null");
        }
        this.xid = xid;
    }

    @Nonnull
    public String getXid() {
        return xid;
    }
}
