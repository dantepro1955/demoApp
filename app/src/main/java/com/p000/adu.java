package com.p000;

import android.os.SystemClock;

/* compiled from: StandaloneMediaClock */
/* renamed from: adu */
final class adu implements adi {
    /* renamed from: a */
    private boolean f649a;
    /* renamed from: b */
    private long f650b;
    /* renamed from: c */
    private long f651c;

    adu() {
    }

    /* renamed from: b */
    public void m847b() {
        if (!this.f649a) {
            this.f649a = true;
            this.f651c = m844b(this.f650b);
        }
    }

    /* renamed from: c */
    public void m848c() {
        if (this.f649a) {
            this.f650b = m844b(this.f651c);
            this.f649a = false;
        }
    }

    /* renamed from: a */
    public void m846a(long j) {
        this.f650b = j;
        this.f651c = m844b(j);
    }

    /* renamed from: a */
    public long mo83a() {
        return this.f649a ? m844b(this.f651c) : this.f650b;
    }

    /* renamed from: b */
    private long m844b(long j) {
        return (SystemClock.elapsedRealtime() * 1000) - j;
    }
}
