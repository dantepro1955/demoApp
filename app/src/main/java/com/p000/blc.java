package com.p000;

import java.util.concurrent.TimeUnit;

@bhd
/* renamed from: blc */
public class blc<T> implements ble<T> {
    /* renamed from: a */
    private final T f6806a;
    /* renamed from: b */
    private final blf f6807b = new blf();

    public blc(T t) {
        this.f6806a = t;
        this.f6807b.m9325a();
    }

    /* renamed from: a */
    public void mo1017a(Runnable runnable) {
        this.f6807b.m9326a(runnable);
    }

    /* renamed from: b */
    public void mo1018b(Runnable runnable) {
        this.f6807b.m9327b(runnable);
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public T get() {
        return this.f6806a;
    }

    public T get(long j, TimeUnit timeUnit) {
        return this.f6806a;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
