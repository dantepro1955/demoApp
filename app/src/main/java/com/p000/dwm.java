package com.p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.dtm.C5084a;
import p000.dts.C5094a;

/* compiled from: SchedulerWhen */
/* renamed from: dwm */
public class dwm extends dts implements dtw {
    /* renamed from: b */
    static final dtw f23319b = new C51993();
    /* renamed from: c */
    static final dtw f23320c = dyw.m29892a();
    /* renamed from: d */
    private final dts f23321d;
    /* renamed from: e */
    private final dtq<dtp<dtm>> f23322e;
    /* renamed from: f */
    private final dtw f23323f;

    /* compiled from: SchedulerWhen */
    /* renamed from: dwm$3 */
    static class C51993 implements dtw {
        C51993() {
        }

        public void unsubscribe() {
        }

        public boolean isUnsubscribed() {
            return false;
        }
    }

    /* compiled from: SchedulerWhen */
    /* renamed from: dwm$d */
    static abstract class C5200d extends AtomicReference<dtw> implements dtw {
        /* renamed from: a */
        protected abstract dtw mo4664a(C5094a c5094a, dtn dtn);

        public C5200d() {
            super(dwm.f23319b);
        }

        /* renamed from: b */
        private void m29638b(C5094a c5094a, dtn dtn) {
            dtw dtw = (dtw) get();
            if (dtw != dwm.f23320c && dtw == dwm.f23319b) {
                dtw = mo4664a(c5094a, dtn);
                if (!compareAndSet(dwm.f23319b, dtw)) {
                    dtw.unsubscribe();
                }
            }
        }

        public boolean isUnsubscribed() {
            return ((dtw) get()).isUnsubscribed();
        }

        public void unsubscribe() {
            dtw dtw = dwm.f23320c;
            dtw dtw2;
            do {
                dtw2 = (dtw) get();
                if (dtw2 == dwm.f23320c) {
                    return;
                }
            } while (!compareAndSet(dtw2, dtw));
            if (dtw2 != dwm.f23319b) {
                dtw2.unsubscribe();
            }
        }
    }

    /* compiled from: SchedulerWhen */
    /* renamed from: dwm$a */
    static class C5201a extends C5200d {
        /* renamed from: a */
        private final duk f23313a;
        /* renamed from: b */
        private final long f23314b;
        /* renamed from: c */
        private final TimeUnit f23315c;

        public C5201a(duk duk, long j, TimeUnit timeUnit) {
            this.f23313a = duk;
            this.f23314b = j;
            this.f23315c = timeUnit;
        }

        /* renamed from: a */
        protected dtw mo4664a(C5094a c5094a, dtn dtn) {
            return c5094a.mo4645a(new C5203c(this.f23313a, dtn), this.f23314b, this.f23315c);
        }
    }

    /* compiled from: SchedulerWhen */
    /* renamed from: dwm$b */
    static class C5202b extends C5200d {
        /* renamed from: a */
        private final duk f23316a;

        public C5202b(duk duk) {
            this.f23316a = duk;
        }

        /* renamed from: a */
        protected dtw mo4664a(C5094a c5094a, dtn dtn) {
            return c5094a.mo4644a(new C5203c(this.f23316a, dtn));
        }
    }

    /* compiled from: SchedulerWhen */
    /* renamed from: dwm$c */
    static class C5203c implements duk {
        /* renamed from: a */
        private dtn f23317a;
        /* renamed from: b */
        private duk f23318b;

        public C5203c(duk duk, dtn dtn) {
            this.f23318b = duk;
            this.f23317a = dtn;
        }

        /* renamed from: a */
        public void mo4643a() {
            try {
                this.f23318b.mo4643a();
            } finally {
                this.f23317a.mo4640a();
            }
        }
    }

    public dwm(duo<dtp<dtp<dtm>>, dtm> duo, dts dts) {
        this.f23321d = dts;
        Object a = dyo.m29867a();
        this.f23322e = new dyb(a);
        this.f23323f = ((dtm) duo.mo4103a(a.m29347h())).m29294a();
    }

    public void unsubscribe() {
        this.f23323f.unsubscribe();
    }

    public boolean isUnsubscribed() {
        return this.f23323f.isUnsubscribed();
    }

    public C5094a createWorker() {
        final C5094a createWorker = this.f23321d.createWorker();
        Object a = dut.m29431a();
        final dtq dyb = new dyb(a);
        dtp d = a.m29341d(new duo<C5200d, dtm>(this) {
            /* renamed from: b */
            final /* synthetic */ dwm f23308b;

            /* renamed from: a */
            public dtm m29633a(final C5200d c5200d) {
                return dtm.m29289a(new C5084a(this) {
                    /* renamed from: b */
                    final /* synthetic */ C51971 f23306b;

                    public /* synthetic */ void call(Object obj) {
                        m29632a((dtn) obj);
                    }

                    /* renamed from: a */
                    public void m29632a(dtn dtn) {
                        dtn.mo4641a(c5200d);
                        c5200d.m29638b(createWorker, dtn);
                    }
                });
            }
        });
        C5094a c51982 = new C5094a(this) {
            /* renamed from: c */
            final /* synthetic */ dwm f23311c;
            /* renamed from: d */
            private final AtomicBoolean f23312d = new AtomicBoolean();

            public void unsubscribe() {
                if (this.f23312d.compareAndSet(false, true)) {
                    createWorker.unsubscribe();
                    dyb.onCompleted();
                }
            }

            public boolean isUnsubscribed() {
                return this.f23312d.get();
            }

            /* renamed from: a */
            public dtw mo4645a(duk duk, long j, TimeUnit timeUnit) {
                dtw c5201a = new C5201a(duk, j, timeUnit);
                dyb.onNext(c5201a);
                return c5201a;
            }

            /* renamed from: a */
            public dtw mo4644a(duk duk) {
                dtw c5202b = new C5202b(duk);
                dyb.onNext(c5202b);
                return c5202b;
            }
        };
        this.f23322e.onNext(d);
        return c51982;
    }
}
