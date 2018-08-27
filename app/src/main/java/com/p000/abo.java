package com.p000;

import io.fabric.sdk.android.Fabric;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsUncaughtExceptionHandler */
/* renamed from: abo */
class abo implements UncaughtExceptionHandler {
    /* renamed from: a */
    private final C0018a f273a;
    /* renamed from: b */
    private final UncaughtExceptionHandler f274b;
    /* renamed from: c */
    private final AtomicBoolean f275c = new AtomicBoolean(false);

    /* compiled from: CrashlyticsUncaughtExceptionHandler */
    /* renamed from: abo$a */
    interface C0018a {
        /* renamed from: a */
        void mo8a(Thread thread, Throwable th);
    }

    public abo(C0018a c0018a, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f273a = c0018a;
        this.f274b = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f275c.set(true);
        try {
            this.f273a.mo8a(thread, th);
        } catch (Throwable e) {
            Fabric.h().e("CrashlyticsCore", "An error occurred in the uncaught exception handler", e);
        } finally {
            Fabric.h().a("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
            this.f274b.uncaughtException(thread, th);
            this.f275c.set(false);
        }
    }

    /* renamed from: a */
    boolean m351a() {
        return this.f275c.get();
    }
}
