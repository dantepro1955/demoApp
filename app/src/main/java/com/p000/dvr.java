package com.p000;

import p000.dtp.C5093b;

/* compiled from: OperatorOnErrorResumeNextViaFunction */
/* renamed from: dvr */
public final class dvr<T> implements C5093b<T, T> {
    /* renamed from: a */
    final duo<? super Throwable, ? extends dtp<? extends T>> f23165a;

    /* renamed from: a */
    public static <T> dvr<T> m29547a(final duo<? super Throwable, ? extends T> duo) {
        return new dvr(new duo<Throwable, dtp<? extends T>>() {
            /* renamed from: a */
            public dtp<? extends T> m29545a(Throwable th) {
                return dtp.m29315a(duo.mo4103a(th));
            }
        });
    }

    public dvr(duo<? super Throwable, ? extends dtp<? extends T>> duo) {
        this.f23165a = duo;
    }

    /* renamed from: a */
    public dtv<? super T> m29548a(final dtv<? super T> dtv) {
        final dtr dvz = new dvz();
        final dtw dyv = new dyv();
        Object c51602 = new dtv<T>(this) {
            /* renamed from: a */
            long f23159a;
            /* renamed from: e */
            final /* synthetic */ dvr f23163e;
            /* renamed from: f */
            private boolean f23164f;

            /* compiled from: OperatorOnErrorResumeNextViaFunction */
            /* renamed from: dvr$2$1 */
            class C51591 extends dtv<T> {
                /* renamed from: a */
                final /* synthetic */ C51602 f23158a;

                C51591(C51602 c51602) {
                    this.f23158a = c51602;
                }

                public void onNext(T t) {
                    dtv.onNext(t);
                }

                public void onError(Throwable th) {
                    dtv.onError(th);
                }

                public void onCompleted() {
                    dtv.onCompleted();
                }

                public void setProducer(dtr dtr) {
                    dvz.m29574a(dtr);
                }
            }

            public void onCompleted() {
                if (!this.f23164f) {
                    this.f23164f = true;
                    dtv.onCompleted();
                }
            }

            public void onError(Throwable th) {
                if (this.f23164f) {
                    dud.m29409b(th);
                    dyg.m29850a(th);
                    return;
                }
                this.f23164f = true;
                try {
                    unsubscribe();
                    dtv c51591 = new C51591(this);
                    dyv.m29891a(c51591);
                    long j = this.f23159a;
                    if (j != 0) {
                        dvz.m29573a(j);
                    }
                    ((dtp) this.f23163e.f23165a.mo4103a(th)).m29331a(c51591);
                } catch (Throwable th2) {
                    dud.m29404a(th2, dtv);
                }
            }

            public void onNext(T t) {
                if (!this.f23164f) {
                    this.f23159a++;
                    dtv.onNext(t);
                }
            }

            public void setProducer(dtr dtr) {
                dvz.m29574a(dtr);
            }
        };
        dyv.m29891a(c51602);
        dtv.add(dyv);
        dtv.setProducer(dvz);
        return c51602;
    }
}
