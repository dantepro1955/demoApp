package com.p000;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: BooleanSubscription */
/* renamed from: dys */
public final class dys implements dtw {
    /* renamed from: b */
    static final duk f23519b = new C52531();
    /* renamed from: a */
    final AtomicReference<duk> f23520a;

    /* compiled from: BooleanSubscription */
    /* renamed from: dys$1 */
    static class C52531 implements duk {
        C52531() {
        }

        /* renamed from: a */
        public void mo4643a() {
        }
    }

    public dys() {
        this.f23520a = new AtomicReference();
    }

    private dys(duk duk) {
        this.f23520a = new AtomicReference(duk);
    }

    /* renamed from: a */
    public static dys m29885a(duk duk) {
        return new dys(duk);
    }

    public boolean isUnsubscribed() {
        return this.f23520a.get() == f23519b;
    }

    public void unsubscribe() {
        if (((duk) this.f23520a.get()) != f23519b) {
            duk duk = (duk) this.f23520a.getAndSet(f23519b);
            if (duk != null && duk != f23519b) {
                duk.mo4643a();
            }
        }
    }
}
