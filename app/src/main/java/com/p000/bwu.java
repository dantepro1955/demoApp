package com.p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p000.dtp.C5092a;

/* compiled from: RelaySubscriptionManager */
/* renamed from: bwu */
final class bwu<T> extends AtomicReference<C1569b<T>> implements C5092a<T> {
    /* renamed from: a */
    volatile Object f8035a;
    /* renamed from: b */
    boolean f8036b = true;
    /* renamed from: c */
    dul<C1568a<T>> f8037c = dum.a();
    /* renamed from: d */
    dul<C1568a<T>> f8038d = dum.a();

    /* compiled from: RelaySubscriptionManager */
    /* renamed from: bwu$a */
    static final class C1568a<T> implements dtq<T> {
        /* renamed from: a */
        final dtq<? super T> f8028a;
        /* renamed from: b */
        boolean f8029b = true;
        /* renamed from: c */
        boolean f8030c;
        /* renamed from: d */
        List<Object> f8031d;
        /* renamed from: e */
        boolean f8032e;

        C1568a(dtq<? super T> dtq) {
            this.f8028a = dtq;
        }

        public void onNext(T t) {
            this.f8028a.onNext(t);
        }

        public void onError(Throwable th) {
            throw new AssertionError();
        }

        public void onCompleted() {
            throw new AssertionError();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        void m11561a(Object r2) {
            /*
            r1 = this;
            r0 = r1.f8032e;
            if (r0 != 0) goto L_0x0022;
        L_0x0004:
            monitor-enter(r1);
            r0 = 0;
            r1.f8029b = r0;	 Catch:{ all -> 0x0028 }
            r0 = r1.f8030c;	 Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x001e;
        L_0x000c:
            r0 = r1.f8031d;	 Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0017;
        L_0x0010:
            r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0028 }
            r0.<init>();	 Catch:{ all -> 0x0028 }
            r1.f8031d = r0;	 Catch:{ all -> 0x0028 }
        L_0x0017:
            r0 = r1.f8031d;	 Catch:{ all -> 0x0028 }
            r0.add(r2);	 Catch:{ all -> 0x0028 }
            monitor-exit(r1);	 Catch:{ all -> 0x0028 }
        L_0x001d:
            return;
        L_0x001e:
            monitor-exit(r1);	 Catch:{ all -> 0x0028 }
            r0 = 1;
            r1.f8032e = r0;
        L_0x0022:
            r0 = r1.f8028a;
            p000.bws.m11557a(r0, r2);
            goto L_0x001d;
        L_0x0028:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0028 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: bwu.a.a(java.lang.Object):void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: b */
        void m11562b(Object r3) {
            /*
            r2 = this;
            r0 = 0;
            monitor-enter(r2);
            r1 = r2.f8029b;	 Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x000a;
        L_0x0006:
            r1 = r2.f8030c;	 Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x000c;
        L_0x000a:
            monitor-exit(r2);	 Catch:{ all -> 0x001c }
        L_0x000b:
            return;
        L_0x000c:
            r1 = 0;
            r2.f8029b = r1;	 Catch:{ all -> 0x001c }
            if (r3 == 0) goto L_0x0012;
        L_0x0011:
            r0 = 1;
        L_0x0012:
            r2.f8030c = r0;	 Catch:{ all -> 0x001c }
            monitor-exit(r2);	 Catch:{ all -> 0x001c }
            if (r3 == 0) goto L_0x000b;
        L_0x0017:
            r0 = 0;
            r2.m11559a(r0, r3);
            goto L_0x000b;
        L_0x001c:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x001c }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: bwu.a.b(java.lang.Object):void");
        }

        /* renamed from: a */
        private void m11559a(List<Object> list, Object obj) {
            Object obj2 = 1;
            Object obj3 = null;
            Object obj4 = 1;
            while (true) {
                if (list != null) {
                    for (Object c : list) {
                        m11560c(c);
                    }
                }
                if (obj4 != null) {
                    try {
                        m11560c(obj);
                        obj4 = null;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                    }
                }
                synchronized (this) {
                    list = this.f8031d;
                    this.f8031d = null;
                    if (list == null) {
                        this.f8030c = false;
                        try {
                            return;
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                throw th2;
                            } catch (Throwable th4) {
                                th2 = th4;
                                obj3 = obj2;
                            }
                        }
                    } else {
                        try {
                        } catch (Throwable th5) {
                            th2 = th5;
                            obj2 = null;
                        }
                    }
                }
            }
            if (obj3 == null) {
                synchronized (this) {
                    this.f8030c = false;
                }
            }
            throw th2;
        }

        /* renamed from: c */
        private void m11560c(Object obj) {
            if (obj != null) {
                bws.m11557a(this.f8028a, obj);
            }
        }
    }

    /* compiled from: RelaySubscriptionManager */
    /* renamed from: bwu$b */
    static final class C1569b<T> {
        /* renamed from: a */
        static final C1569b f8033a = new C1569b(new C1568a[0]);
        /* renamed from: b */
        final C1568a[] f8034b;

        C1569b(C1568a[] c1568aArr) {
            this.f8034b = c1568aArr;
        }

        /* renamed from: a */
        C1569b m11563a(C1568a c1568a) {
            int length = this.f8034b.length;
            Object obj = new C1568a[(length + 1)];
            System.arraycopy(this.f8034b, 0, obj, 0, length);
            obj[length] = c1568a;
            return new C1569b(obj);
        }

        /* renamed from: b */
        C1569b m11564b(C1568a c1568a) {
            C1568a[] c1568aArr = this.f8034b;
            int length = c1568aArr.length;
            if (length == 1 && c1568aArr[0] == c1568a) {
                return f8033a;
            }
            if (length == 0) {
                return this;
            }
            Object obj = new C1568a[(length - 1)];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3;
                C1568a c1568a2 = c1568aArr[i];
                if (c1568a2 == c1568a) {
                    i3 = i2;
                } else if (i2 == length - 1) {
                    return this;
                } else {
                    i3 = i2 + 1;
                    obj[i2] = c1568a2;
                }
                i++;
                i2 = i3;
            }
            if (i2 == 0) {
                return f8033a;
            }
            C1568a[] c1568aArr2;
            if (i2 < length - 1) {
                c1568aArr2 = new C1568a[i2];
                System.arraycopy(obj, 0, c1568aArr2, 0, i2);
            } else {
                Object obj2 = obj;
            }
            return new C1569b(c1568aArr2);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m11569a((dtv) obj);
    }

    bwu() {
        super(C1569b.f8033a);
    }

    /* renamed from: a */
    public void m11569a(dtv<? super T> dtv) {
        C1568a c1568a = new C1568a(dtv);
        m11565a(dtv, c1568a);
        this.f8037c.call(c1568a);
        if (!dtv.isUnsubscribed()) {
            m11566b(c1568a);
            if (dtv.isUnsubscribed()) {
                m11568a(c1568a);
            }
        }
    }

    /* renamed from: a */
    private void m11565a(dtv<? super T> dtv, final C1568a<T> c1568a) {
        dtv.add(dyw.a(new duk(this) {
            /* renamed from: b */
            final /* synthetic */ bwu f8027b;

            /* renamed from: a */
            public void m11558a() {
                this.f8027b.m11568a(c1568a);
            }
        }));
    }

    /* renamed from: a */
    void m11570a(Object obj) {
        this.f8035a = obj;
    }

    /* renamed from: a */
    Object m11567a() {
        return this.f8035a;
    }

    /* renamed from: b */
    private void m11566b(C1568a<T> c1568a) {
        C1569b c1569b;
        do {
            c1569b = (C1569b) get();
        } while (!compareAndSet(c1569b, c1569b.m11563a(c1568a)));
        this.f8038d.call(c1568a);
    }

    /* renamed from: a */
    void m11568a(C1568a<T> c1568a) {
        C1569b c1569b;
        C1569b b;
        do {
            c1569b = (C1569b) get();
            b = c1569b.m11564b(c1568a);
            if (b == c1569b) {
                return;
            }
        } while (!compareAndSet(c1569b, b));
    }

    /* renamed from: b */
    C1568a<T>[] m11571b(Object obj) {
        m11570a(obj);
        return ((C1569b) get()).f8034b;
    }
}
