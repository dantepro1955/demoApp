package com.p000;

import com.facebook.common.time.Clock;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.dtp.C5093b;

/* compiled from: OperatorOnBackpressureLatest */
/* renamed from: dvq */
public final class dvq<T> implements C5093b<T, T> {

    /* compiled from: OperatorOnBackpressureLatest */
    /* renamed from: dvq$a */
    static final class C5155a {
        /* renamed from: a */
        static final dvq<Object> f23147a = new dvq();
    }

    /* compiled from: OperatorOnBackpressureLatest */
    /* renamed from: dvq$b */
    static final class C5156b<T> extends AtomicLong implements dtq<T>, dtr, dtw {
        /* renamed from: h */
        static final Object f23148h = new Object();
        private static final long serialVersionUID = -1364393685005146274L;
        /* renamed from: a */
        final dtv<? super T> f23149a;
        /* renamed from: b */
        C5157c<? super T> f23150b;
        /* renamed from: c */
        final AtomicReference<Object> f23151c = new AtomicReference(f23148h);
        /* renamed from: d */
        Throwable f23152d;
        /* renamed from: e */
        volatile boolean f23153e;
        /* renamed from: f */
        boolean f23154f;
        /* renamed from: g */
        boolean f23155g;

        public C5156b(dtv<? super T> dtv) {
            this.f23149a = dtv;
            lazySet(-4611686018427387904L);
        }

        public void request(long j) {
            if (j >= 0) {
                long j2;
                long j3;
                do {
                    j2 = get();
                    if (j2 != Long.MIN_VALUE) {
                        if (j2 == -4611686018427387904L) {
                            j3 = j;
                        } else {
                            j3 = j2 + j;
                            if (j3 < 0) {
                                j3 = Clock.MAX_TIME;
                            }
                        }
                    } else {
                        return;
                    }
                } while (!compareAndSet(j2, j3));
                if (j2 == -4611686018427387904L) {
                    this.f23150b.m29541a(Clock.MAX_TIME);
                }
                m29540a();
            }
        }

        /* renamed from: a */
        long m29539a(long j) {
            long j2;
            long j3;
            do {
                j3 = get();
                if (j3 < 0) {
                    return j3;
                }
                j2 = j3 - j;
            } while (!compareAndSet(j3, j2));
            return j2;
        }

        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        public void unsubscribe() {
            if (get() >= 0) {
                getAndSet(Long.MIN_VALUE);
            }
        }

        public void onNext(T t) {
            this.f23151c.lazySet(t);
            m29540a();
        }

        public void onError(Throwable th) {
            this.f23152d = th;
            this.f23153e = true;
            m29540a();
        }

        public void onCompleted() {
            this.f23153e = true;
            m29540a();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        void m29540a() {
            /*
            r8 = this;
            r1 = 1;
            r2 = 0;
            monitor-enter(r8);
            r0 = r8.f23154f;	 Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x000c;
        L_0x0007:
            r0 = 1;
            r8.f23155g = r0;	 Catch:{ all -> 0x0028 }
            monitor-exit(r8);	 Catch:{ all -> 0x0028 }
        L_0x000b:
            return;
        L_0x000c:
            r0 = 1;
            r8.f23154f = r0;	 Catch:{ all -> 0x0028 }
            r0 = 0;
            r8.f23155g = r0;	 Catch:{ all -> 0x0028 }
            monitor-exit(r8);	 Catch:{ all -> 0x0028 }
        L_0x0013:
            r4 = r8.get();	 Catch:{ all -> 0x007c }
            r6 = -9223372036854775808;
            r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r0 != 0) goto L_0x002b;
        L_0x001d:
            if (r1 != 0) goto L_0x000b;
        L_0x001f:
            monitor-enter(r8);
            r0 = 0;
            r8.f23154f = r0;	 Catch:{ all -> 0x0025 }
            monitor-exit(r8);	 Catch:{ all -> 0x0025 }
            goto L_0x000b;
        L_0x0025:
            r0 = move-exception;
            monitor-exit(r8);	 Catch:{ all -> 0x0025 }
            throw r0;
        L_0x0028:
            r0 = move-exception;
            monitor-exit(r8);	 Catch:{ all -> 0x0028 }
            throw r0;
        L_0x002b:
            r0 = r8.f23151c;	 Catch:{ all -> 0x007c }
            r0 = r0.get();	 Catch:{ all -> 0x007c }
            r6 = 0;
            r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r3 <= 0) goto L_0x004e;
        L_0x0037:
            r3 = f23148h;	 Catch:{ all -> 0x007c }
            if (r0 == r3) goto L_0x004e;
        L_0x003b:
            r3 = r8.f23149a;	 Catch:{ all -> 0x007c }
            r3.onNext(r0);	 Catch:{ all -> 0x007c }
            r3 = r8.f23151c;	 Catch:{ all -> 0x007c }
            r4 = f23148h;	 Catch:{ all -> 0x007c }
            r3.compareAndSet(r0, r4);	 Catch:{ all -> 0x007c }
            r4 = 1;
            r8.m29539a(r4);	 Catch:{ all -> 0x007c }
            r0 = f23148h;	 Catch:{ all -> 0x007c }
        L_0x004e:
            r3 = f23148h;	 Catch:{ all -> 0x007c }
            if (r0 != r3) goto L_0x005f;
        L_0x0052:
            r0 = r8.f23153e;	 Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x005f;
        L_0x0056:
            r0 = r8.f23152d;	 Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0076;
        L_0x005a:
            r3 = r8.f23149a;	 Catch:{ all -> 0x007c }
            r3.onError(r0);	 Catch:{ all -> 0x007c }
        L_0x005f:
            monitor-enter(r8);	 Catch:{ all -> 0x007c }
            r0 = r8.f23155g;	 Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x007e;
        L_0x0064:
            r0 = 0;
            r8.f23154f = r0;	 Catch:{ all -> 0x0083 }
            monitor-exit(r8);	 Catch:{ all -> 0x0069 }
            goto L_0x001d;
        L_0x0069:
            r0 = move-exception;
        L_0x006a:
            monitor-exit(r8);	 Catch:{ all -> 0x0069 }
            throw r0;	 Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception;
            r2 = r1;
        L_0x006e:
            if (r2 != 0) goto L_0x0075;
        L_0x0070:
            monitor-enter(r8);
            r1 = 0;
            r8.f23154f = r1;	 Catch:{ all -> 0x0086 }
            monitor-exit(r8);	 Catch:{ all -> 0x0086 }
        L_0x0075:
            throw r0;
        L_0x0076:
            r0 = r8.f23149a;	 Catch:{ all -> 0x007c }
            r0.onCompleted();	 Catch:{ all -> 0x007c }
            goto L_0x005f;
        L_0x007c:
            r0 = move-exception;
            goto L_0x006e;
        L_0x007e:
            r0 = 0;
            r8.f23155g = r0;	 Catch:{ all -> 0x0083 }
            monitor-exit(r8);	 Catch:{ all -> 0x0083 }
            goto L_0x0013;
        L_0x0083:
            r0 = move-exception;
            r1 = r2;
            goto L_0x006a;
        L_0x0086:
            r0 = move-exception;
            monitor-exit(r8);	 Catch:{ all -> 0x0086 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: dvq.b.a():void");
        }
    }

    /* compiled from: OperatorOnBackpressureLatest */
    /* renamed from: dvq$c */
    static final class C5157c<T> extends dtv<T> {
        /* renamed from: a */
        private final C5156b<T> f23156a;

        C5157c(C5156b<T> c5156b) {
            this.f23156a = c5156b;
        }

        public void onStart() {
            request(0);
        }

        public void onNext(T t) {
            this.f23156a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f23156a.onError(th);
        }

        public void onCompleted() {
            this.f23156a.onCompleted();
        }

        /* renamed from: a */
        void m29541a(long j) {
            request(j);
        }
    }

    /* renamed from: a */
    public static <T> dvq<T> m29542a() {
        return C5155a.f23147a;
    }

    /* renamed from: a */
    public dtv<? super T> m29543a(dtv<? super T> dtv) {
        Object c5156b = new C5156b(dtv);
        Object c5157c = new C5157c(c5156b);
        c5156b.f23150b = c5157c;
        dtv.add(c5157c);
        dtv.add(c5156b);
        dtv.setProducer(c5156b);
        return c5157c;
    }
}
