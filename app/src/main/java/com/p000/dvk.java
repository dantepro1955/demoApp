package com.p000;

import p000.dtp.C5093b;

/* compiled from: OperatorAny */
/* renamed from: dvk */
public final class dvk<T> implements C5093b<Boolean, T> {
    /* renamed from: a */
    final duo<? super T, Boolean> f23087a;
    /* renamed from: b */
    final boolean f23088b;

    public dvk(duo<? super T, Boolean> duo, boolean z) {
        this.f23087a = duo;
        this.f23088b = z;
    }

    /* renamed from: a */
    public dtv<? super T> m29490a(final dtv<? super Boolean> dtv) {
        final dtr dwa = new dwa(dtv);
        Object c51411 = new dtv<T>(this) {
            /* renamed from: a */
            boolean f23082a;
            /* renamed from: b */
            boolean f23083b;
            /* renamed from: e */
            final /* synthetic */ dvk f23086e;

            public void onNext(T t) {
                if (!this.f23083b) {
                    this.f23082a = true;
                    try {
                        if (((Boolean) this.f23086e.f23087a.mo4103a(t)).booleanValue()) {
                            this.f23083b = true;
                            dwa.m29581a(Boolean.valueOf(!this.f23086e.f23088b));
                            unsubscribe();
                        }
                    } catch (Throwable th) {
                        dud.m29405a(th, this, t);
                    }
                }
            }

            public void onError(Throwable th) {
                if (this.f23083b) {
                    dyg.m29850a(th);
                    return;
                }
                this.f23083b = true;
                dtv.onError(th);
            }

            public void onCompleted() {
                if (!this.f23083b) {
                    this.f23083b = true;
                    if (this.f23082a) {
                        dwa.m29581a(Boolean.valueOf(false));
                    } else {
                        dwa.m29581a(Boolean.valueOf(this.f23086e.f23088b));
                    }
                }
            }
        };
        dtv.add(c51411);
        dtv.setProducer(dwa);
        return c51411;
    }
}
