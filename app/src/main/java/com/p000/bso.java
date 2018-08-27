package com.p000;

import java.util.concurrent.Executor;

/* renamed from: bso */
final class bso<TResult> extends bsj<TResult> {
    /* renamed from: a */
    private final Object f7534a = new Object();
    /* renamed from: b */
    private final bsn<TResult> f7535b = new bsn();
    /* renamed from: c */
    private boolean f7536c;
    /* renamed from: d */
    private TResult f7537d;
    /* renamed from: e */
    private Exception f7538e;

    bso() {
    }

    /* renamed from: c */
    private void m10657c() {
        aoi.m4685a(!this.f7536c, (Object) "Task is already complete");
    }

    /* renamed from: d */
    private void m10658d() {
        synchronized (this.f7534a) {
            if (this.f7536c) {
                this.f7535b.m10655a((bsj) this);
                return;
            }
        }
    }

    /* renamed from: a */
    public bsj<TResult> mo1431a(Executor executor, bsi<TResult> bsi) {
        this.f7535b.m10656a(new bsl(executor, bsi));
        m10658d();
        return this;
    }

    /* renamed from: a */
    public void m10660a(Exception exception) {
        aoi.m4680a((Object) exception, (Object) "Exception must not be null");
        synchronized (this.f7534a) {
            m10657c();
            this.f7536c = true;
            this.f7538e = exception;
        }
        this.f7535b.m10655a((bsj) this);
    }

    /* renamed from: a */
    public void m10661a(TResult tResult) {
        synchronized (this.f7534a) {
            m10657c();
            this.f7536c = true;
            this.f7537d = tResult;
        }
        this.f7535b.m10655a((bsj) this);
    }

    /* renamed from: a */
    public boolean mo1432a() {
        boolean z;
        synchronized (this.f7534a) {
            z = this.f7536c && this.f7538e == null;
        }
        return z;
    }

    /* renamed from: b */
    public Exception mo1433b() {
        Exception exception;
        synchronized (this.f7534a) {
            exception = this.f7538e;
        }
        return exception;
    }

    /* renamed from: b */
    public boolean m10664b(Exception exception) {
        boolean z = true;
        aoi.m4680a((Object) exception, (Object) "Exception must not be null");
        synchronized (this.f7534a) {
            if (this.f7536c) {
                z = false;
            } else {
                this.f7536c = true;
                this.f7538e = exception;
                this.f7535b.m10655a((bsj) this);
            }
        }
        return z;
    }
}
