package com.p000;

import java.util.concurrent.Future;

@bhd
/* renamed from: bkb */
public abstract class bkb implements bki<Future> {
    /* renamed from: a */
    private final Runnable f1591a;
    /* renamed from: b */
    private volatile Thread f1592b;
    /* renamed from: c */
    private boolean f1593c;

    /* renamed from: bkb$1 */
    class C12631 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bkb f6654a;

        C12631(bkb bkb) {
            this.f6654a = bkb;
        }

        public final void run() {
            this.f6654a.f1592b = Thread.currentThread();
            this.f6654a.mo196a();
        }
    }

    public bkb() {
        this.f1591a = new C12631(this);
        this.f1593c = false;
    }

    public bkb(boolean z) {
        this.f1591a = new C12631(this);
        this.f1593c = z;
    }

    /* renamed from: a */
    public abstract void mo196a();

    /* renamed from: b */
    public abstract void mo197b();

    /* renamed from: c */
    public final void mo194c() {
        mo197b();
        if (this.f1592b != null) {
            this.f1592b.interrupt();
        }
    }

    /* renamed from: d */
    public /* synthetic */ Object mo195d() {
        return m1729h();
    }

    /* renamed from: h */
    public final Future m1729h() {
        return this.f1593c ? bkf.m9058a(1, this.f1591a) : bkf.m9059a(this.f1591a);
    }
}
