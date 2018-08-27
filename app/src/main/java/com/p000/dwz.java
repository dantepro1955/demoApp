package com.p000;

import java.util.concurrent.atomic.AtomicBoolean;
import p000.dtp.C5092a;

/* compiled from: ScalarSynchronousObservable */
/* renamed from: dwz */
public final class dwz<T> extends dtp<T> {
    /* renamed from: c */
    static final boolean f23387c = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();
    /* renamed from: b */
    final T f23388b;

    /* compiled from: ScalarSynchronousObservable */
    /* renamed from: dwz$a */
    static final class C5221a<T> implements C5092a<T> {
        /* renamed from: a */
        final T f23378a;

        public /* synthetic */ void call(Object obj) {
            m29695a((dtv) obj);
        }

        C5221a(T t) {
            this.f23378a = t;
        }

        /* renamed from: a */
        public void m29695a(dtv<? super T> dtv) {
            dtv.setProducer(dwz.m29698a(dtv, this.f23378a));
        }
    }

    /* compiled from: ScalarSynchronousObservable */
    /* renamed from: dwz$b */
    static final class C5222b<T> implements C5092a<T> {
        /* renamed from: a */
        final T f23379a;
        /* renamed from: b */
        final duo<duk, dtw> f23380b;

        public /* synthetic */ void call(Object obj) {
            m29696a((dtv) obj);
        }

        C5222b(T t, duo<duk, dtw> duo) {
            this.f23379a = t;
            this.f23380b = duo;
        }

        /* renamed from: a */
        public void m29696a(dtv<? super T> dtv) {
            dtv.setProducer(new C5223c(dtv, this.f23379a, this.f23380b));
        }
    }

    /* compiled from: ScalarSynchronousObservable */
    /* renamed from: dwz$c */
    static final class C5223c<T> extends AtomicBoolean implements dtr, duk {
        private static final long serialVersionUID = -2466317989629281651L;
        /* renamed from: a */
        final dtv<? super T> f23381a;
        /* renamed from: b */
        final T f23382b;
        /* renamed from: c */
        final duo<duk, dtw> f23383c;

        public C5223c(dtv<? super T> dtv, T t, duo<duk, dtw> duo) {
            this.f23381a = dtv;
            this.f23382b = t;
            this.f23383c = duo;
        }

        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            } else if (j != 0 && compareAndSet(false, true)) {
                this.f23381a.add((dtw) this.f23383c.mo4103a(this));
            }
        }

        /* renamed from: a */
        public void mo4643a() {
            dtq dtq = this.f23381a;
            if (!dtq.isUnsubscribed()) {
                Object obj = this.f23382b;
                try {
                    dtq.onNext(obj);
                    if (!dtq.isUnsubscribed()) {
                        dtq.onCompleted();
                    }
                } catch (Throwable th) {
                    dud.m29405a(th, dtq, obj);
                }
            }
        }

        public String toString() {
            return "ScalarAsyncProducer[" + this.f23382b + ", " + get() + "]";
        }
    }

    /* compiled from: ScalarSynchronousObservable */
    /* renamed from: dwz$d */
    static final class C5224d<T> implements dtr {
        /* renamed from: a */
        final dtv<? super T> f23384a;
        /* renamed from: b */
        final T f23385b;
        /* renamed from: c */
        boolean f23386c;

        public C5224d(dtv<? super T> dtv, T t) {
            this.f23384a = dtv;
            this.f23385b = t;
        }

        public void request(long j) {
            if (!this.f23386c) {
                if (j < 0) {
                    throw new IllegalStateException("n >= required but it was " + j);
                } else if (j != 0) {
                    this.f23386c = true;
                    dtq dtq = this.f23384a;
                    if (!dtq.isUnsubscribed()) {
                        Object obj = this.f23385b;
                        try {
                            dtq.onNext(obj);
                            if (!dtq.isUnsubscribed()) {
                                dtq.onCompleted();
                            }
                        } catch (Throwable th) {
                            dud.m29405a(th, dtq, obj);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static <T> dtr m29698a(dtv<? super T> dtv, T t) {
        if (f23387c) {
            return new dwb(dtv, t);
        }
        return new C5224d(dtv, t);
    }

    /* renamed from: b */
    public static <T> dwz<T> m29699b(T t) {
        return new dwz(t);
    }

    protected dwz(T t) {
        super(dyg.m29842a(new C5221a(t)));
        this.f23388b = t;
    }

    /* renamed from: a */
    public T m29700a() {
        return this.f23388b;
    }

    /* renamed from: c */
    public dtp<T> m29701c(final dts dts) {
        duo c52171;
        if (dts instanceof dwd) {
            final dwd dwd = (dwd) dts;
            c52171 = new duo<duk, dtw>(this) {
                /* renamed from: b */
                final /* synthetic */ dwz f23370b;

                /* renamed from: a */
                public dtw m29689a(duk duk) {
                    return dwd.m29613a(duk);
                }
            };
        } else {
            c52171 = new duo<duk, dtw>(this) {
                /* renamed from: b */
                final /* synthetic */ dwz f23375b;

                /* renamed from: a */
                public dtw m29692a(final duk duk) {
                    final dtw createWorker = dts.createWorker();
                    createWorker.mo4644a(new duk(this) {
                        /* renamed from: c */
                        final /* synthetic */ C52192 f23373c;

                        /* renamed from: a */
                        public void mo4643a() {
                            try {
                                duk.mo4643a();
                            } finally {
                                createWorker.unsubscribe();
                            }
                        }
                    });
                    return createWorker;
                }
            };
        }
        return dtp.m29310a(new C5222b(this.f23388b, c52171));
    }

    /* renamed from: g */
    public <R> dtp<R> m29702g(final duo<? super T, ? extends dtp<? extends R>> duo) {
        return dtp.m29310a(new C5092a<R>(this) {
            /* renamed from: b */
            final /* synthetic */ dwz f23377b;

            public /* synthetic */ void call(Object obj) {
                m29694a((dtv) obj);
            }

            /* renamed from: a */
            public void m29694a(dtv<? super R> dtv) {
                dtp dtp = (dtp) duo.mo4103a(this.f23377b.f23388b);
                if (dtp instanceof dwz) {
                    dtv.setProducer(dwz.m29698a(dtv, ((dwz) dtp).f23388b));
                } else {
                    dtp.m29331a(dyd.m29808a((dtv) dtv));
                }
            }
        });
    }
}
