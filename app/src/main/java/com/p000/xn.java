package com.p000;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: xn */
class xn implements UncaughtExceptionHandler {
    /* renamed from: a */
    final /* synthetic */ xm f25984a;

    xn(xm xmVar) {
        this.f25984a = xmVar;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f25984a.f25982a.f25974b.mo5609b("TaskManager", "Caught unhandled exception", th);
    }
}
