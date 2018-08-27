package com.p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: arz */
public abstract class arz {
    /* renamed from: a */
    private static final ExecutorService f4189a = Executors.newFixedThreadPool(2, new atk("GAC_Executor"));

    /* renamed from: a */
    public static ExecutorService m5379a() {
        return f4189a;
    }
}
