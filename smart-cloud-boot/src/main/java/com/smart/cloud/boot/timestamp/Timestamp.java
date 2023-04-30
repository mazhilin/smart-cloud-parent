package com.smart.cloud.boot.timestamp;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @className: com.smart.cloud.boot.timestamp.Timestamp
 * @title: 封装SmartCloud项目-Timestamp类
 * @description: <p>
 *         SmartCloud项目-Timestamp
 *         </p>
 * @content: Timestamp
 * @author: Powered by marklin
 * @datetime: 2023-04-30 19:25
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public final class Timestamp {
    private final int period;

    private final AtomicLong now;

    private Timestamp(int period) {
        this.period = period;
        this.now = new AtomicLong(System.currentTimeMillis());
        scheduleClockUpdating();
    }

    private static Timestamp instance() {
        return InstanceHolder.INSTANCE;
    }

    /**
     * 用来替换原来的System.currentTimeMillis()
     */
    public static long currentTime() {
        return instance().currentTimeMillis();
    }

    private void scheduleClockUpdating() {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor(runnable -> {
            Thread thread = new Thread(runnable, "smart-cloud-timestamp");
            thread.setDaemon(true);
            return thread;
        });
        scheduler.scheduleAtFixedRate(() -> now.set(System.currentTimeMillis()), period, period, TimeUnit.MILLISECONDS);
    }

    private long currentTimeMillis() {
        return now.get();
    }

    private static class InstanceHolder {
        private static final Timestamp INSTANCE = new Timestamp(1);
    }
}
