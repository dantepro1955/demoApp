package com.p000;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: RxAndroidPlugins */
/* renamed from: dty */
public final class dty {
    /* renamed from: a */
    private static final dty f22931a = new dty();
    /* renamed from: b */
    private final AtomicReference<dtz> f22932b = new AtomicReference();

    /* renamed from: a */
    public static dty m29360a() {
        return f22931a;
    }

    dty() {
    }

    /* renamed from: b */
    public dtz m29361b() {
        if (this.f22932b.get() == null) {
            this.f22932b.compareAndSet(null, dtz.m29362a());
        }
        return (dtz) this.f22932b.get();
    }
}
