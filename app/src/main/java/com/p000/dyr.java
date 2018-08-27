package com.p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p000.dtp.C5092a;

/* compiled from: SubjectSubscriptionManager */
/* renamed from: dyr */
final class dyr<T> extends AtomicReference<C5251a<T>> implements C5092a<T> {
    private static final long serialVersionUID = 6035251036011671568L;
    /* renamed from: a */
    volatile Object f23514a;
    /* renamed from: b */
    boolean f23515b = true;
    /* renamed from: c */
    dul<C5252b<T>> f23516c = dum.m29416a();
    /* renamed from: d */
    dul<C5252b<T>> f23517d = dum.m29416a();
    /* renamed from: e */
    dul<C5252b<T>> f23518e = dum.m29416a();

    /* compiled from: SubjectSubscriptionManager */
    /* renamed from: dyr$a */
    public static final class C5251a<T> {
        /* renamed from: c */
        static final C5252b[] f23504c = new C5252b[0];
        /* renamed from: d */
        static final C5251a f23505d = new C5251a(true, f23504c);
        /* renamed from: e */
        static final C5251a f23506e = new C5251a(false, f23504c);
        /* renamed from: a */
        final boolean f23507a;
        /* renamed from: b */
        final C5252b[] f23508b;

        public C5251a(boolean z, C5252b[] c5252bArr) {
            this.f23507a = z;
            this.f23508b = c5252bArr;
        }

        /* renamed from: a */
        public C5251a m29870a(C5252b c5252b) {
            int length = this.f23508b.length;
            Object obj = new C5252b[(length + 1)];
            System.arraycopy(this.f23508b, 0, obj, 0, length);
            obj[length] = c5252b;
            return new C5251a(this.f23507a, obj);
        }

        /* renamed from: b */
        public C5251a m29871b(C5252b c5252b) {
            C5252b[] c5252bArr = this.f23508b;
            int length = c5252bArr.length;
            if (length == 1 && c5252bArr[0] == c5252b) {
                return f23506e;
            }
            if (length == 0) {
                return this;
            }
            Object obj = new C5252b[(length - 1)];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3;
                C5252b c5252b2 = c5252bArr[i];
                if (c5252b2 == c5252b) {
                    i3 = i2;
                } else if (i2 == length - 1) {
                    return this;
                } else {
                    i3 = i2 + 1;
                    obj[i2] = c5252b2;
                }
                i++;
                i2 = i3;
            }
            if (i2 == 0) {
                return f23506e;
            }
            C5252b[] c5252bArr2;
            if (i2 < length - 1) {
                c5252bArr2 = new C5252b[i2];
                System.arraycopy(obj, 0, c5252bArr2, 0, i2);
            } else {
                Object obj2 = obj;
            }
            return new C5251a(this.f23507a, c5252bArr2);
        }
    }

    /* compiled from: SubjectSubscriptionManager */
    /* renamed from: dyr$b */
    public static final class C5252b<T> implements dtq<T> {
        /* renamed from: a */
        final dtv<? super T> f23509a;
        /* renamed from: b */
        boolean f23510b = true;
        /* renamed from: c */
        boolean f23511c;
        /* renamed from: d */
        List<Object> f23512d;
        /* renamed from: e */
        boolean f23513e;

        public C5252b(dtv<? super T> dtv) {
            this.f23509a = dtv;
        }

        public void onNext(T t) {
            this.f23509a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f23509a.onError(th);
        }

        public void onCompleted() {
            this.f23509a.onCompleted();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        void m29872a(Object r2) {
            /*
            r1 = this;
            r0 = r1.f23513e;
            if (r0 != 0) goto L_0x0022;
        L_0x0004:
            monitor-enter(r1);
            r0 = 0;
            r1.f23510b = r0;	 Catch:{ all -> 0x0028 }
            r0 = r1.f23511c;	 Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x001e;
        L_0x000c:
            r0 = r1.f23512d;	 Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0017;
        L_0x0010:
            r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0028 }
            r0.<init>();	 Catch:{ all -> 0x0028 }
            r1.f23512d = r0;	 Catch:{ all -> 0x0028 }
        L_0x0017:
            r0 = r1.f23512d;	 Catch:{ all -> 0x0028 }
            r0.add(r2);	 Catch:{ all -> 0x0028 }
            monitor-exit(r1);	 Catch:{ all -> 0x0028 }
        L_0x001d:
            return;
        L_0x001e:
            monitor-exit(r1);	 Catch:{ all -> 0x0028 }
            r0 = 1;
            r1.f23513e = r0;
        L_0x0022:
            r0 = r1.f23509a;
            p000.duw.m29443a(r0, r2);
            goto L_0x001d;
        L_0x0028:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0028 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: dyr.b.a(java.lang.Object):void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: b */
        void m29874b(Object r3) {
            /*
            r2 = this;
            r0 = 0;
            monitor-enter(r2);
            r1 = r2.f23510b;	 Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x000a;
        L_0x0006:
            r1 = r2.f23511c;	 Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x000c;
        L_0x000a:
            monitor-exit(r2);	 Catch:{ all -> 0x001c }
        L_0x000b:
            return;
        L_0x000c:
            r1 = 0;
            r2.f23510b = r1;	 Catch:{ all -> 0x001c }
            if (r3 == 0) goto L_0x0012;
        L_0x0011:
            r0 = 1;
        L_0x0012:
            r2.f23511c = r0;	 Catch:{ all -> 0x001c }
            monitor-exit(r2);	 Catch:{ all -> 0x001c }
            if (r3 == 0) goto L_0x000b;
        L_0x0017:
            r0 = 0;
            r2.m29873a(r0, r3);
            goto L_0x000b;
        L_0x001c:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x001c }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: dyr.b.b(java.lang.Object):void");
        }

        /* renamed from: a */
        void m29873a(List<Object> list, Object obj) {
            Object obj2 = 1;
            Object obj3 = null;
            Object obj4 = 1;
            while (true) {
                if (list != null) {
                    for (Object c : list) {
                        m29875c(c);
                    }
                }
                if (obj4 != null) {
                    try {
                        m29875c(obj);
                        obj4 = null;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                    }
                }
                synchronized (this) {
                    list = this.f23512d;
                    this.f23512d = null;
                    if (list == null) {
                        this.f23511c = false;
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
                    this.f23511c = false;
                }
            }
            throw th2;
        }

        /* renamed from: c */
        void m29875c(Object obj) {
            if (obj != null) {
                duw.m29443a(this.f23509a, obj);
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m29877a((dtv) obj);
    }

    public dyr() {
        super(C5251a.f23506e);
    }

    /* renamed from: a */
    public void m29877a(dtv<? super T> dtv) {
        C5252b c5252b = new C5252b(dtv);
        m29878a(dtv, c5252b);
        this.f23516c.call(c5252b);
        if (!dtv.isUnsubscribed() && m29880a(c5252b) && dtv.isUnsubscribed()) {
            m29881b(c5252b);
        }
    }

    /* renamed from: a */
    void m29878a(dtv<? super T> dtv, final C5252b<T> c5252b) {
        dtv.add(dyw.m29893a(new duk(this) {
            /* renamed from: b */
            final /* synthetic */ dyr f23503b;

            /* renamed from: a */
            public void mo4643a() {
                this.f23503b.m29881b(c5252b);
            }
        }));
    }

    /* renamed from: a */
    void m29879a(Object obj) {
        this.f23514a = obj;
    }

    /* renamed from: a */
    Object m29876a() {
        return this.f23514a;
    }

    /* renamed from: a */
    boolean m29880a(C5252b<T> c5252b) {
        C5251a c5251a;
        do {
            c5251a = (C5251a) get();
            if (c5251a.f23507a) {
                this.f23518e.call(c5252b);
                return false;
            }
        } while (!compareAndSet(c5251a, c5251a.m29870a(c5252b)));
        this.f23517d.call(c5252b);
        return true;
    }

    /* renamed from: b */
    void m29881b(C5252b<T> c5252b) {
        C5251a c5251a;
        C5251a b;
        do {
            c5251a = (C5251a) get();
            if (!c5251a.f23507a) {
                b = c5251a.m29871b(c5252b);
                if (b == c5251a) {
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(c5251a, b));
    }

    /* renamed from: b */
    C5252b<T>[] m29882b(Object obj) {
        m29879a(obj);
        return ((C5251a) get()).f23508b;
    }

    /* renamed from: c */
    C5252b<T>[] m29883c(Object obj) {
        m29879a(obj);
        this.f23515b = false;
        if (((C5251a) get()).f23507a) {
            return C5251a.f23504c;
        }
        return ((C5251a) getAndSet(C5251a.f23505d)).f23508b;
    }
}
