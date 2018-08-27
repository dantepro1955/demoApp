package com.p000;

import java.util.ArrayList;
import java.util.List;

@bhd
/* renamed from: blf */
class blf {
    /* renamed from: a */
    private final Object f6815a = new Object();
    /* renamed from: b */
    private final List<Runnable> f6816b = new ArrayList();
    /* renamed from: c */
    private final List<Runnable> f6817c = new ArrayList();
    /* renamed from: d */
    private boolean f6818d = false;

    /* renamed from: c */
    private void m9323c(Runnable runnable) {
        bkf.m9059a(runnable);
    }

    /* renamed from: d */
    private void m9324d(Runnable runnable) {
        bkx.f6798a.post(runnable);
    }

    /* renamed from: a */
    public void m9325a() {
        synchronized (this.f6815a) {
            if (this.f6818d) {
                return;
            }
            for (Runnable c : this.f6816b) {
                m9323c(c);
            }
            for (Runnable c2 : this.f6817c) {
                m9324d(c2);
            }
            this.f6816b.clear();
            this.f6817c.clear();
            this.f6818d = true;
        }
    }

    /* renamed from: a */
    public void m9326a(Runnable runnable) {
        synchronized (this.f6815a) {
            if (this.f6818d) {
                m9323c(runnable);
            } else {
                this.f6816b.add(runnable);
            }
        }
    }

    /* renamed from: b */
    public void m9327b(Runnable runnable) {
        synchronized (this.f6815a) {
            if (this.f6818d) {
                m9324d(runnable);
            } else {
                this.f6817c.add(runnable);
            }
        }
    }
}
