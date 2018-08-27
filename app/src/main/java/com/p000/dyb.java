package com.p000;

/* compiled from: SerializedObserver */
/* renamed from: dyb */
public class dyb<T> implements dtq<T> {
    /* renamed from: a */
    private final dtq<? super T> f23459a;
    /* renamed from: b */
    private boolean f23460b;
    /* renamed from: c */
    private volatile boolean f23461c;
    /* renamed from: d */
    private C5234a f23462d;

    /* compiled from: SerializedObserver */
    /* renamed from: dyb$a */
    static final class C5234a {
        /* renamed from: a */
        Object[] f23457a;
        /* renamed from: b */
        int f23458b;

        C5234a() {
        }

        /* renamed from: a */
        public void m29805a(Object obj) {
            Object[] objArr;
            int i = this.f23458b;
            Object obj2 = this.f23457a;
            if (obj2 == null) {
                objArr = new Object[16];
                this.f23457a = objArr;
            } else if (i == obj2.length) {
                objArr = new Object[((i >> 2) + i)];
                System.arraycopy(obj2, 0, objArr, 0, i);
                this.f23457a = objArr;
            } else {
                Object obj3 = obj2;
            }
            objArr[i] = obj;
            this.f23458b = i + 1;
        }
    }

    public dyb(dtq<? super T> dtq) {
        this.f23459a = dtq;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNext(T r8) {
        /*
        r7 = this;
        r1 = 0;
        r6 = 1;
        r0 = r7.f23461c;
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        monitor-enter(r7);
        r0 = r7.f23461c;	 Catch:{ all -> 0x000e }
        if (r0 == 0) goto L_0x0011;
    L_0x000c:
        monitor-exit(r7);	 Catch:{ all -> 0x000e }
        goto L_0x0006;
    L_0x000e:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x000e }
        throw r0;
    L_0x0011:
        r0 = r7.f23460b;	 Catch:{ all -> 0x000e }
        if (r0 == 0) goto L_0x0029;
    L_0x0015:
        r0 = r7.f23462d;	 Catch:{ all -> 0x000e }
        if (r0 != 0) goto L_0x0020;
    L_0x0019:
        r0 = new dyb$a;	 Catch:{ all -> 0x000e }
        r0.<init>();	 Catch:{ all -> 0x000e }
        r7.f23462d = r0;	 Catch:{ all -> 0x000e }
    L_0x0020:
        r1 = p000.duw.m29441a(r8);	 Catch:{ all -> 0x000e }
        r0.m29805a(r1);	 Catch:{ all -> 0x000e }
        monitor-exit(r7);	 Catch:{ all -> 0x000e }
        goto L_0x0006;
    L_0x0029:
        r0 = 1;
        r7.f23460b = r0;	 Catch:{ all -> 0x000e }
        monitor-exit(r7);	 Catch:{ all -> 0x000e }
        r0 = r7.f23459a;	 Catch:{ Throwable -> 0x003f }
        r0.onNext(r8);	 Catch:{ Throwable -> 0x003f }
    L_0x0032:
        monitor-enter(r7);
        r0 = r7.f23462d;	 Catch:{ all -> 0x003c }
        if (r0 != 0) goto L_0x0048;
    L_0x0037:
        r0 = 0;
        r7.f23460b = r0;	 Catch:{ all -> 0x003c }
        monitor-exit(r7);	 Catch:{ all -> 0x003c }
        goto L_0x0006;
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x003c }
        throw r0;
    L_0x003f:
        r0 = move-exception;
        r7.f23461c = r6;
        r1 = r7.f23459a;
        p000.dud.m29405a(r0, r1, r8);
        goto L_0x0006;
    L_0x0048:
        r2 = 0;
        r7.f23462d = r2;	 Catch:{ all -> 0x003c }
        monitor-exit(r7);	 Catch:{ all -> 0x003c }
        r2 = r0.f23457a;
        r3 = r2.length;
        r0 = r1;
    L_0x0050:
        if (r0 >= r3) goto L_0x0032;
    L_0x0052:
        r4 = r2[r0];
        if (r4 == 0) goto L_0x0032;
    L_0x0056:
        r5 = r7.f23459a;	 Catch:{ Throwable -> 0x0062 }
        r4 = p000.duw.m29443a(r5, r4);	 Catch:{ Throwable -> 0x0062 }
        if (r4 == 0) goto L_0x0072;
    L_0x005e:
        r0 = 1;
        r7.f23461c = r0;	 Catch:{ Throwable -> 0x0062 }
        goto L_0x0006;
    L_0x0062:
        r0 = move-exception;
        r7.f23461c = r6;
        p000.dud.m29409b(r0);
        r1 = r7.f23459a;
        r0 = p000.dui.m29414a(r0, r8);
        r1.onError(r0);
        goto L_0x0006;
    L_0x0072:
        r0 = r0 + 1;
        goto L_0x0050;
        */
        throw new UnsupportedOperationException("Method not decompiled: dyb.onNext(java.lang.Object):void");
    }

    public void onError(Throwable th) {
        dud.m29409b(th);
        if (!this.f23461c) {
            synchronized (this) {
                if (this.f23461c) {
                    return;
                }
                this.f23461c = true;
                if (this.f23460b) {
                    C5234a c5234a = this.f23462d;
                    if (c5234a == null) {
                        c5234a = new C5234a();
                        this.f23462d = c5234a;
                    }
                    c5234a.m29805a(duw.m29442a(th));
                    return;
                }
                this.f23460b = true;
                this.f23459a.onError(th);
            }
        }
    }

    public void onCompleted() {
        if (!this.f23461c) {
            synchronized (this) {
                if (this.f23461c) {
                    return;
                }
                this.f23461c = true;
                if (this.f23460b) {
                    C5234a c5234a = this.f23462d;
                    if (c5234a == null) {
                        c5234a = new C5234a();
                        this.f23462d = c5234a;
                    }
                    c5234a.m29805a(duw.m29440a());
                    return;
                }
                this.f23460b = true;
                this.f23459a.onCompleted();
            }
        }
    }
}
