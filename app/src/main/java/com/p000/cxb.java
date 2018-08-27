package com.p000;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultConfigurationFactory */
/* renamed from: cxb */
public class cxb {

    /* compiled from: DefaultConfigurationFactory */
    /* renamed from: cxb$a */
    static class C4644a implements ThreadFactory {
        /* renamed from: a */
        private static final AtomicInteger f20473a = new AtomicInteger(1);
        /* renamed from: b */
        private final ThreadGroup f20474b;
        /* renamed from: c */
        private final AtomicInteger f20475c = new AtomicInteger(1);
        /* renamed from: d */
        private final String f20476d;
        /* renamed from: e */
        private final int f20477e;

        C4644a(int i, String str) {
            this.f20477e = i;
            this.f20474b = Thread.currentThread().getThreadGroup();
            this.f20476d = str + f20473a.getAndIncrement() + "-thread-";
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f20474b, runnable, this.f20476d + this.f20475c.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            thread.setPriority(this.f20477e);
            return thread;
        }
    }

    /* renamed from: a */
    public static Executor m25413a(int i, int i2, cxo cxo) {
        return new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, (cxo == cxo.LIFO ? 1 : null) != null ? new cxs() : new LinkedBlockingQueue(), cxb.m25414a(i2, "uil-pool-"));
    }

    /* renamed from: a */
    public static cxw m25412a() {
        return new cxx();
    }

    /* renamed from: a */
    private static ThreadFactory m25414a(int i, String str) {
        return new C4644a(i, str);
    }
}
