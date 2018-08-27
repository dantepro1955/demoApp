package com.p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: atk */
public class atk implements ThreadFactory {
    /* renamed from: a */
    private final String f4329a;
    /* renamed from: b */
    private final int f4330b;
    /* renamed from: c */
    private final AtomicInteger f4331c;
    /* renamed from: d */
    private final ThreadFactory f4332d;

    public atk(String str) {
        this(str, 0);
    }

    public atk(String str, int i) {
        this.f4331c = new AtomicInteger();
        this.f4332d = Executors.defaultThreadFactory();
        this.f4329a = (String) aoi.m4680a((Object) str, (Object) "Name must not be null");
        this.f4330b = i;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f4332d.newThread(new atl(runnable, this.f4330b));
        String str = this.f4329a;
        newThread.setName(new StringBuilder(String.valueOf(str).length() + 13).append(str).append("[").append(this.f4331c.getAndIncrement()).append("]").toString());
        return newThread;
    }
}
