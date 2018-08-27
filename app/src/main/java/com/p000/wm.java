package com.p000;

import java.util.LinkedList;
import java.util.Queue;

/* renamed from: wm */
class wm {
    /* renamed from: a */
    private final int f25860a;
    /* renamed from: b */
    private final Queue f25861b;
    /* renamed from: c */
    private final Object f25862c;

    wm(int i) {
        if (i > 10) {
            i = 10;
        }
        this.f25860a = i;
        this.f25861b = new LinkedList();
        this.f25862c = new Object();
    }

    /* renamed from: a */
    int m34633a() {
        int size;
        synchronized (this.f25862c) {
            size = this.f25861b.size();
        }
        return size;
    }

    /* renamed from: a */
    void m34634a(vt vtVar) {
        synchronized (this.f25862c) {
            if (!m34636c()) {
                this.f25861b.offer(vtVar);
            }
        }
    }

    /* renamed from: b */
    int m34635b() {
        return this.f25860a;
    }

    /* renamed from: c */
    boolean m34636c() {
        boolean z;
        synchronized (this.f25862c) {
            z = m34633a() >= this.f25860a;
        }
        return z;
    }

    /* renamed from: d */
    boolean m34637d() {
        boolean z;
        synchronized (this.f25862c) {
            z = m34633a() == 0;
        }
        return z;
    }

    /* renamed from: e */
    vt m34638e() {
        try {
            vt vtVar;
            synchronized (this.f25862c) {
                vtVar = !m34637d() ? (vt) this.f25861b.poll() : null;
            }
            return vtVar;
        } catch (Exception e) {
            return null;
        }
    }
}
