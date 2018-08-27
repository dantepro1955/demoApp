package com.p000;

import android.os.Handler;
import android.os.Looper;

/* compiled from: ANRWatchDog */
/* renamed from: cri */
public class cri extends Thread {
    /* renamed from: a */
    private static final C3581a f16690a = new cri$1();
    /* renamed from: b */
    private static final cri$b f16691b = new cri$2();
    /* renamed from: c */
    private C3581a f16692c;
    /* renamed from: d */
    private cri$b f16693d;
    /* renamed from: e */
    private final Handler f16694e;
    /* renamed from: f */
    private final int f16695f;
    /* renamed from: g */
    private volatile int f16696g;
    /* renamed from: h */
    private final Runnable f16697h;

    /* compiled from: ANRWatchDog */
    /* renamed from: cri$a */
    public interface C3581a {
        /* renamed from: a */
        void mo3254a(crh crh);
    }

    public cri() {
        this(5000);
    }

    public cri(int i) {
        this.f16692c = f16690a;
        this.f16693d = f16691b;
        this.f16694e = new Handler(Looper.getMainLooper());
        this.f16696g = 0;
        this.f16697h = new cri$3(this);
        this.f16695f = i;
    }

    /* renamed from: a */
    public cri m20835a(C3581a c3581a) {
        if (c3581a == null) {
            this.f16692c = f16690a;
        } else {
            this.f16692c = c3581a;
        }
        return this;
    }

    public void run() {
        setName("AnrWatchDog");
        while (!isInterrupted()) {
            int i = this.f16696g;
            this.f16694e.post(this.f16697h);
            try {
                Thread.sleep((long) this.f16695f);
                if (this.f16696g == i) {
                    this.f16692c.mo3254a(new crh());
                    return;
                }
            } catch (InterruptedException e) {
                this.f16693d.a(e);
                return;
            }
        }
    }
}
