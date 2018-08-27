package com.p000;

import io.fabric.sdk.android.Fabric;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: BackgroundManager */
/* renamed from: aac */
class aac {
    /* renamed from: a */
    final AtomicReference<ScheduledFuture<?>> f52a = new AtomicReference();
    /* renamed from: b */
    boolean f53b = true;
    /* renamed from: c */
    private final ScheduledExecutorService f54c;
    /* renamed from: d */
    private final List<C0002a> f55d = new ArrayList();
    /* renamed from: e */
    private volatile boolean f56e = true;

    /* compiled from: BackgroundManager */
    /* renamed from: aac$1 */
    class C00011 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ aac f51a;

        C00011(aac aac) {
            this.f51a = aac;
        }

        public void run() {
            this.f51a.f52a.set(null);
            this.f51a.m53c();
        }
    }

    /* compiled from: BackgroundManager */
    /* renamed from: aac$a */
    public interface C0002a {
        /* renamed from: a */
        void mo6a();
    }

    public aac(ScheduledExecutorService scheduledExecutorService) {
        this.f54c = scheduledExecutorService;
    }

    /* renamed from: a */
    public void m56a(boolean z) {
        this.f56e = z;
    }

    /* renamed from: c */
    private void m53c() {
        for (C0002a a : this.f55d) {
            a.mo6a();
        }
    }

    /* renamed from: a */
    public void m55a(C0002a c0002a) {
        this.f55d.add(c0002a);
    }

    /* renamed from: a */
    public void m54a() {
        this.f53b = false;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f52a.getAndSet(null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* renamed from: b */
    public void m57b() {
        if (this.f56e && !this.f53b) {
            this.f53b = true;
            try {
                this.f52a.compareAndSet(null, this.f54c.schedule(new C00011(this), 5000, TimeUnit.MILLISECONDS));
            } catch (Throwable e) {
                Fabric.h().a("Answers", "Failed to schedule background detector", e);
            }
        }
    }
}
