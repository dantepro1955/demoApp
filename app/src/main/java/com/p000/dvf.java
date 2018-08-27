package com.p000;

import com.facebook.common.time.Clock;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p000.dtp.C5092a;
import p000.dtp.C5093b;
import p000.dts.C5094a;
import rx.schedulers.Schedulers;

/* compiled from: OnSubscribeRedo */
/* renamed from: dvf */
public final class dvf<T> implements C5092a<T> {
    /* renamed from: d */
    static final duo<dtp<? extends dto<?>>, dtp<?>> f23062d = new C51301();
    /* renamed from: a */
    final dtp<T> f23063a;
    /* renamed from: b */
    final boolean f23064b;
    /* renamed from: c */
    final boolean f23065c;
    /* renamed from: e */
    private final duo<? super dtp<? extends dto<?>>, ? extends dtp<?>> f23066e;
    /* renamed from: f */
    private final dts f23067f;

    /* compiled from: OnSubscribeRedo */
    /* renamed from: dvf$1 */
    static class C51301 implements duo<dtp<? extends dto<?>>, dtp<?>> {

        /* compiled from: OnSubscribeRedo */
        /* renamed from: dvf$1$1 */
        class C51291 implements duo<dto<?>, dto<?>> {
            /* renamed from: a */
            final /* synthetic */ C51301 f23036a;

            C51291(C51301 c51301) {
                this.f23036a = c51301;
            }

            /* renamed from: a */
            public dto<?> m29472a(dto<?> dto) {
                return dto.m29297a(null);
            }
        }

        C51301() {
        }

        /* renamed from: a */
        public dtp<?> m29474a(dtp<? extends dto<?>> dtp) {
            return dtp.m29341d(new C51291(this));
        }
    }

    /* compiled from: OnSubscribeRedo */
    /* renamed from: dvf$3 */
    class C51343 implements C5093b<dto<?>, dto<?>> {
        /* renamed from: a */
        final /* synthetic */ dvf f23047a;

        C51343(dvf dvf) {
            this.f23047a = dvf;
        }

        /* renamed from: a */
        public dtv<? super dto<?>> m29479a(final dtv<? super dto<?>> dtv) {
            return new dtv<dto<?>>(this, dtv) {
                /* renamed from: b */
                final /* synthetic */ C51343 f23046b;

                public /* synthetic */ void onNext(Object obj) {
                    m29478a((dto) obj);
                }

                public void onCompleted() {
                    dtv.onCompleted();
                }

                public void onError(Throwable th) {
                    dtv.onError(th);
                }

                /* renamed from: a */
                public void m29478a(dto<?> dto) {
                    if (dto.m29305h() && this.f23046b.f23047a.f23064b) {
                        dtv.onCompleted();
                    } else if (dto.m29304g() && this.f23046b.f23047a.f23065c) {
                        dtv.onError(dto.m29299b());
                    } else {
                        dtv.onNext(dto);
                    }
                }

                public void setProducer(dtr dtr) {
                    dtr.request(Clock.MAX_TIME);
                }
            };
        }
    }

    public /* synthetic */ void call(Object obj) {
        m29483a((dtv) obj);
    }

    /* renamed from: a */
    public static <T> dtp<T> m29482a(dtp<T> dtp, duo<? super dtp<? extends dto<?>>, ? extends dtp<?>> duo) {
        return dtp.m29310a(new dvf(dtp, duo, true, false, Schedulers.trampoline()));
    }

    private dvf(dtp<T> dtp, duo<? super dtp<? extends dto<?>>, ? extends dtp<?>> duo, boolean z, boolean z2, dts dts) {
        this.f23063a = dtp;
        this.f23066e = duo;
        this.f23064b = z;
        this.f23065c = z2;
        this.f23067f = dts;
    }

    /* renamed from: a */
    public void m29483a(dtv<? super T> dtv) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        final AtomicLong atomicLong = new AtomicLong();
        final C5094a createWorker = this.f23067f.createWorker();
        dtv.add(createWorker);
        final Object dyv = new dyv();
        dtv.add(dyv);
        final dyq k = dyn.m29862a().m29430k();
        k.m29336b(dyd.m29806a());
        final dvz dvz = new dvz();
        final dtv<? super T> dtv2 = dtv;
        C51322 c51322 = new duk(this) {
            /* renamed from: f */
            final /* synthetic */ dvf f23044f;

            /* compiled from: OnSubscribeRedo */
            /* renamed from: dvf$2$1 */
            class C51311 extends dtv<T> {
                /* renamed from: a */
                boolean f23037a;
                /* renamed from: b */
                final /* synthetic */ C51322 f23038b;

                C51311(C51322 c51322) {
                    this.f23038b = c51322;
                }

                public void onCompleted() {
                    if (!this.f23037a) {
                        this.f23037a = true;
                        unsubscribe();
                        k.onNext(dto.m29296a());
                    }
                }

                public void onError(Throwable th) {
                    if (!this.f23037a) {
                        this.f23037a = true;
                        unsubscribe();
                        k.onNext(dto.m29298a(th));
                    }
                }

                public void onNext(T t) {
                    if (!this.f23037a) {
                        dtv2.onNext(t);
                        m29476a();
                        dvz.m29573a(1);
                    }
                }

                /* renamed from: a */
                private void m29476a() {
                    long j;
                    do {
                        j = atomicLong.get();
                        if (j == Clock.MAX_TIME) {
                            return;
                        }
                    } while (!atomicLong.compareAndSet(j, j - 1));
                }

                public void setProducer(dtr dtr) {
                    dvz.m29574a(dtr);
                }
            }

            /* renamed from: a */
            public void mo4643a() {
                if (!dtv2.isUnsubscribed()) {
                    dtv c51311 = new C51311(this);
                    dyv.m29891a(c51311);
                    this.f23044f.f23063a.m29331a(c51311);
                }
            }
        };
        final dtp dtp = (dtp) this.f23066e.mo4103a(k.m29323a(new C51343(this)));
        final dtv<? super T> dtv3 = dtv;
        final AtomicLong atomicLong2 = atomicLong;
        final C51322 c513222 = c51322;
        createWorker.mo4644a(new duk(this) {
            /* renamed from: g */
            final /* synthetic */ dvf f23055g;

            /* renamed from: a */
            public void mo4643a() {
                dtp.m29331a(new dtv<Object>(this, dtv3) {
                    /* renamed from: a */
                    final /* synthetic */ C51364 f23048a;

                    public void onCompleted() {
                        dtv3.onCompleted();
                    }

                    public void onError(Throwable th) {
                        dtv3.onError(th);
                    }

                    public void onNext(Object obj) {
                        if (!dtv3.isUnsubscribed()) {
                            if (atomicLong2.get() > 0) {
                                createWorker.mo4644a(c513222);
                            } else {
                                atomicBoolean.compareAndSet(false, true);
                            }
                        }
                    }

                    public void setProducer(dtr dtr) {
                        dtr.request(Clock.MAX_TIME);
                    }
                });
            }
        });
        final AtomicLong atomicLong3 = atomicLong;
        final dvz dvz2 = dvz;
        final AtomicBoolean atomicBoolean2 = atomicBoolean;
        c513222 = c51322;
        dtv.setProducer(new dtr(this) {
            /* renamed from: f */
            final /* synthetic */ dvf f23061f;

            public void request(long j) {
                if (j > 0) {
                    dus.m29421a(atomicLong3, j);
                    dvz2.request(j);
                    if (atomicBoolean2.compareAndSet(true, false)) {
                        createWorker.mo4644a(c513222);
                    }
                }
            }
        });
    }
}
