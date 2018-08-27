package com.p000;

/* compiled from: Completable */
/* renamed from: dtm */
public class dtm {
    /* renamed from: a */
    static final dtm f22914a = new dtm(new C50851(), false);
    /* renamed from: b */
    static final dtm f22915b = new dtm(new C50883(), false);
    /* renamed from: c */
    private final C5084a f22916c;

    /* compiled from: Completable */
    /* renamed from: dtm$a */
    public interface C5084a extends dul<dtn> {
    }

    /* compiled from: Completable */
    /* renamed from: dtm$1 */
    static class C50851 implements C5084a {
        C50851() {
        }

        public /* synthetic */ void call(Object obj) {
            m29280a((dtn) obj);
        }

        /* renamed from: a */
        public void m29280a(dtn dtn) {
            dtn.mo4641a(dyw.m29892a());
            dtn.mo4640a();
        }
    }

    /* compiled from: Completable */
    /* renamed from: dtm$3 */
    static class C50883 implements C5084a {
        C50883() {
        }

        public /* synthetic */ void call(Object obj) {
            m29282a((dtn) obj);
        }

        /* renamed from: a */
        public void m29282a(dtn dtn) {
            dtn.mo4641a(dyw.m29892a());
        }
    }

    /* compiled from: Completable */
    /* renamed from: dtm$b */
    public interface C5090b extends duo<dtn, dtn> {
    }

    /* renamed from: a */
    public static dtm m29289a(C5084a c5084a) {
        NullPointerException e;
        dtm.m29292a((Object) c5084a);
        try {
            return new dtm(c5084a);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            dyg.m29850a(th);
            e2 = dtm.m29291a(th);
        }
    }

    /* renamed from: a */
    public static dtm m29290a(final dtp<?> dtp) {
        dtm.m29292a((Object) dtp);
        return dtm.m29289a(new C5084a() {
            public /* synthetic */ void call(Object obj) {
                m29281a((dtn) obj);
            }

            /* renamed from: a */
            public void m29281a(final dtn dtn) {
                dtv c50861 = new dtv<Object>(this) {
                    /* renamed from: b */
                    final /* synthetic */ C50872 f22910b;

                    public void onCompleted() {
                        dtn.mo4640a();
                    }

                    public void onError(Throwable th) {
                        dtn.mo4642a(th);
                    }

                    public void onNext(Object obj) {
                    }
                };
                dtn.mo4641a((dtw) c50861);
                dtp.m29331a(c50861);
            }
        });
    }

    /* renamed from: a */
    static <T> T m29292a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static NullPointerException m29291a(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    protected dtm(C5084a c5084a) {
        this.f22916c = dyg.m29840a(c5084a);
    }

    protected dtm(C5084a c5084a, boolean z) {
        if (z) {
            c5084a = dyg.m29840a(c5084a);
        }
        this.f22916c = c5084a;
    }

    /* renamed from: a */
    public final dtw m29294a() {
        final dtw dyu = new dyu();
        m29295a(new dtn(this) {
            /* renamed from: b */
            final /* synthetic */ dtm f22913b;

            /* renamed from: a */
            public void mo4640a() {
                dyu.unsubscribe();
            }

            /* renamed from: a */
            public void mo4642a(Throwable th) {
                dyg.m29850a(th);
                dyu.unsubscribe();
                dtm.m29293b(th);
            }

            /* renamed from: a */
            public void mo4641a(dtw dtw) {
                dyu.m29890a(dtw);
            }
        });
        return dyu;
    }

    /* renamed from: b */
    static void m29293b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: a */
    public final void m29295a(dtn dtn) {
        NullPointerException e;
        dtm.m29292a((Object) dtn);
        try {
            dyg.m29841a(this, this.f22916c).call(dtn);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            dud.m29409b(th);
            Throwable th2 = dyg.m29858d(th2);
            dyg.m29850a(th2);
            e2 = dtm.m29291a(th2);
        }
    }
}
