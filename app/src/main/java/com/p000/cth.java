package com.p000;

import android.content.Intent;

/* compiled from: PendingRunnable */
/* renamed from: cth */
public abstract class cth implements Runnable {
    /* renamed from: a */
    private long f18365a;
    /* renamed from: b */
    private boolean f18366b;
    /* renamed from: c */
    private Intent f18367c;

    public cth() {
        this(cti.m24874a());
    }

    public cth(long j) {
        this.f18365a = j;
        this.f18366b = false;
    }

    /* renamed from: a */
    public void m22514a(Intent intent) {
        this.f18367c = intent;
    }

    /* renamed from: a */
    public Intent m22513a() {
        return this.f18367c;
    }

    /* renamed from: b */
    public boolean m22516b() {
        return this.f18366b;
    }

    /* renamed from: a */
    public void m22515a(boolean z) {
        this.f18366b = z;
    }

    /* renamed from: c */
    public long m22517c() {
        return this.f18365a;
    }
}
