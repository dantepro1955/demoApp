package com.p000;

import java.util.concurrent.atomic.AtomicLong;
import p000.dtp.C5093b;

/* compiled from: OperatorZip */
/* renamed from: dvv */
public final class dvv<R> implements C5093b<R, dtp<?>[]> {
    /* renamed from: a */
    final duq<? extends R> f23208a;

    /* compiled from: OperatorZip */
    /* renamed from: dvv$a */
    static final class C5170a<R> extends AtomicLong {
        /* renamed from: b */
        static final int f23195b = ((int) (((double) dwx.f23363b) * 0.7d));
        private static final long serialVersionUID = 5995274816189928317L;
        /* renamed from: a */
        final dtq<? super R> f23196a;
        /* renamed from: c */
        int f23197c;
        /* renamed from: d */
        private final duq<? extends R> f23198d;
        /* renamed from: e */
        private final dyt f23199e = new dyt();
        /* renamed from: f */
        private volatile Object[] f23200f;
        /* renamed from: g */
        private AtomicLong f23201g;

        /* compiled from: OperatorZip */
        /* renamed from: dvv$a$a */
        final class C5169a extends dtv {
            /* renamed from: a */
            final dwx f23193a = dwx.m29680b();
            /* renamed from: b */
            final /* synthetic */ C5170a f23194b;

            C5169a(C5170a c5170a) {
                this.f23194b = c5170a;
            }

            public void onStart() {
                request((long) dwx.f23363b);
            }

            /* renamed from: a */
            public void m29560a(long j) {
                request(j);
            }

            public void onCompleted() {
                this.f23193a.m29685d();
                this.f23194b.m29561a();
            }

            public void onError(Throwable th) {
                this.f23194b.f23196a.onError(th);
            }

            public void onNext(Object obj) {
                try {
                    this.f23193a.m29681a(obj);
                } catch (Throwable e) {
                    onError(e);
                }
                this.f23194b.m29561a();
            }
        }

        public C5170a(dtv<? super R> dtv, duq<? extends R> duq) {
            this.f23196a = dtv;
            this.f23198d = duq;
            dtv.add(this.f23199e);
        }

        /* renamed from: a */
        public void m29562a(dtp[] dtpArr, AtomicLong atomicLong) {
            int i = 0;
            Object[] objArr = new Object[dtpArr.length];
            for (int i2 = 0; i2 < dtpArr.length; i2++) {
                dtw c5169a = new C5169a(this);
                objArr[i2] = c5169a;
                this.f23199e.m29887a(c5169a);
            }
            this.f23201g = atomicLong;
            this.f23200f = objArr;
            while (i < dtpArr.length) {
                dtpArr[i].m29331a((C5169a) objArr[i]);
                i++;
            }
        }

        /* renamed from: a */
        void m29561a() {
            Object[] objArr = this.f23200f;
            if (objArr != null && getAndIncrement() == 0) {
                int length = objArr.length;
                dtq dtq = this.f23196a;
                AtomicLong atomicLong = this.f23201g;
                while (true) {
                    dwx dwx;
                    Object obj = new Object[length];
                    int i = 1;
                    int i2 = 0;
                    while (i2 < length) {
                        int i3;
                        dwx = ((C5169a) objArr[i2]).f23193a;
                        Object g = dwx.m29688g();
                        if (g == null) {
                            i3 = 0;
                        } else if (dwx.m29682b(g)) {
                            dtq.onCompleted();
                            this.f23199e.unsubscribe();
                            return;
                        } else {
                            obj[i2] = dwx.m29683c(g);
                            i3 = i;
                        }
                        i2++;
                        i = i3;
                    }
                    if (i != 0 && atomicLong.get() > 0) {
                        try {
                            dtq.onNext(this.f23198d.mo4649a(obj));
                            atomicLong.decrementAndGet();
                            this.f23197c++;
                            for (Object obj2 : objArr) {
                                dwx = ((C5169a) obj2).f23193a;
                                dwx.m29687f();
                                if (dwx.m29682b(dwx.m29688g())) {
                                    dtq.onCompleted();
                                    this.f23199e.unsubscribe();
                                    return;
                                }
                            }
                            if (this.f23197c > f23195b) {
                                for (Object obj22 : objArr) {
                                    ((C5169a) obj22).m29560a((long) this.f23197c);
                                }
                                this.f23197c = 0;
                            }
                        } catch (Throwable th) {
                            dud.m29405a(th, dtq, obj);
                            return;
                        }
                    } else if (decrementAndGet() <= 0) {
                        return;
                    }
                }
            }
        }
    }

    /* compiled from: OperatorZip */
    /* renamed from: dvv$b */
    static final class C5171b<R> extends AtomicLong implements dtr {
        private static final long serialVersionUID = -1216676403723546796L;
        /* renamed from: a */
        final C5170a<R> f23202a;

        public C5171b(C5170a<R> c5170a) {
            this.f23202a = c5170a;
        }

        public void request(long j) {
            dus.m29421a((AtomicLong) this, j);
            this.f23202a.m29561a();
        }
    }

    /* compiled from: OperatorZip */
    /* renamed from: dvv$c */
    final class C5172c extends dtv<dtp[]> {
        /* renamed from: a */
        final dtv<? super R> f23203a;
        /* renamed from: b */
        final C5170a<R> f23204b;
        /* renamed from: c */
        final C5171b<R> f23205c;
        /* renamed from: d */
        boolean f23206d;
        /* renamed from: e */
        final /* synthetic */ dvv f23207e;

        public /* synthetic */ void onNext(Object obj) {
            m29563a((dtp[]) obj);
        }

        public C5172c(dvv dvv, dtv<? super R> dtv, C5170a<R> c5170a, C5171b<R> c5171b) {
            this.f23207e = dvv;
            this.f23203a = dtv;
            this.f23204b = c5170a;
            this.f23205c = c5171b;
        }

        public void onCompleted() {
            if (!this.f23206d) {
                this.f23203a.onCompleted();
            }
        }

        public void onError(Throwable th) {
            this.f23203a.onError(th);
        }

        /* renamed from: a */
        public void m29563a(dtp[] dtpArr) {
            if (dtpArr == null || dtpArr.length == 0) {
                this.f23203a.onCompleted();
                return;
            }
            this.f23206d = true;
            this.f23204b.m29562a(dtpArr, this.f23205c);
        }
    }

    public dvv(dup dup) {
        this.f23208a = dur.m29419a(dup);
    }

    /* renamed from: a */
    public dtv<? super dtp[]> m29564a(dtv<? super R> dtv) {
        C5170a c5170a = new C5170a(dtv, this.f23208a);
        dtr c5171b = new C5171b(c5170a);
        Object c5172c = new C5172c(this, dtv, c5170a, c5171b);
        dtv.add(c5172c);
        dtv.setProducer(c5171b);
        return c5172c;
    }
}
