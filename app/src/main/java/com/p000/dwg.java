package com.p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: GenericScheduledExecutorServiceFactory */
/* renamed from: dwg */
enum dwg {
    ;
    
    /* renamed from: a */
    static final dwy f23291a = null;

    static {
        f23291a = new dwy("RxScheduledExecutorPool-");
    }

    /* renamed from: a */
    static ThreadFactory m29623a() {
        return f23291a;
    }

    /* renamed from: b */
    public static ScheduledExecutorService m29624b() {
        dun c = dyg.m29856c();
        if (c == null) {
            return dwg.m29625c();
        }
        return (ScheduledExecutorService) c.call();
    }

    /* renamed from: c */
    static ScheduledExecutorService m29625c() {
        return Executors.newScheduledThreadPool(1, dwg.m29623a());
    }
}
