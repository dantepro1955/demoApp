package com.p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: asp */
public abstract class asp {
    /* renamed from: a */
    private static final ExecutorService f4261a = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new atk("GAC_Transform"));

    /* renamed from: a */
    public static ExecutorService m5494a() {
        return f4261a;
    }
}
