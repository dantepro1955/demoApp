package com.p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: xm */
class xm implements ThreadFactory {
    /* renamed from: a */
    final /* synthetic */ xk f25982a;
    /* renamed from: b */
    private final String f25983b;

    public xm(xk xkVar, String str) {
        this.f25982a = xkVar;
        this.f25983b = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f25983b + ":" + xy.m34847a(this.f25982a.f25973a.mo5557a()));
        thread.setDaemon(true);
        thread.setPriority(10);
        thread.setUncaughtExceptionHandler(new xn(this));
        return thread;
    }
}
