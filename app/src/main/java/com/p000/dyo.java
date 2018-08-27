package com.p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.dtp.C5092a;

/* compiled from: PublishSubject */
/* renamed from: dyo */
public final class dyo<T> extends dyq<T, T> {
    /* renamed from: b */
    final C5248b<T> f23498b;

    /* compiled from: PublishSubject */
    /* renamed from: dyo$a */
    static final class C5247a<T> extends AtomicLong implements dtq<T>, dtr, dtw {
        private static final long serialVersionUID = 6451806817170721536L;
        /* renamed from: a */
        final C5248b<T> f23492a;
        /* renamed from: b */
        final dtv<? super T> f23493b;
        /* renamed from: c */
        long f23494c;

        public C5247a(C5248b<T> c5248b, dtv<? super T> dtv) {
            this.f23492a = c5248b;
            this.f23493b = dtv;
        }

        public void request(long j) {
            if (dus.m29423a(j)) {
                long j2;
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                } while (!compareAndSet(j2, dus.m29420a(j2, j)));
            }
        }

        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        public void unsubscribe() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f23492a.m29866b(this);
            }
        }

        public void onNext(T t) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                long j2 = this.f23494c;
                if (j != j2) {
                    this.f23494c = 1 + j2;
                    this.f23493b.onNext(t);
                    return;
                }
                unsubscribe();
                this.f23493b.onError(new due("PublishSubject: could not emit value due to lack of requests"));
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.f23493b.onError(th);
            }
        }

        public void onCompleted() {
            if (get() != Long.MIN_VALUE) {
                this.f23493b.onCompleted();
            }
        }
    }

    /* compiled from: PublishSubject */
    /* renamed from: dyo$b */
    static final class C5248b<T> extends AtomicReference<C5247a<T>[]> implements C5092a<T>, dtq<T> {
        /* renamed from: a */
        static final C5247a[] f23495a = new C5247a[0];
        /* renamed from: b */
        static final C5247a[] f23496b = new C5247a[0];
        private static final long serialVersionUID = -7568940796666027140L;
        /* renamed from: c */
        Throwable f23497c;

        public /* synthetic */ void call(Object obj) {
            m29864a((dtv) obj);
        }

        public C5248b() {
            lazySet(f23495a);
        }

        /* renamed from: a */
        public void m29864a(dtv<? super T> dtv) {
            C5247a c5247a = new C5247a(this, dtv);
            dtv.add(c5247a);
            dtv.setProducer(c5247a);
            if (!m29865a(c5247a)) {
                Throwable th = this.f23497c;
                if (th != null) {
                    dtv.onError(th);
                } else {
                    dtv.onCompleted();
                }
            } else if (c5247a.isUnsubscribed()) {
                m29866b(c5247a);
            }
        }

        /* renamed from: a */
        boolean m29865a(C5247a<T> c5247a) {
            C5247a[] c5247aArr;
            Object obj;
            do {
                c5247aArr = (C5247a[]) get();
                if (c5247aArr == f23496b) {
                    return false;
                }
                int length = c5247aArr.length;
                obj = new C5247a[(length + 1)];
                System.arraycopy(c5247aArr, 0, obj, 0, length);
                obj[length] = c5247a;
            } while (!compareAndSet(c5247aArr, obj));
            return true;
        }

        /* renamed from: b */
        void m29866b(C5247a<T> c5247a) {
            C5247a[] c5247aArr;
            Object obj;
            do {
                c5247aArr = (C5247a[]) get();
                if (c5247aArr != f23496b && c5247aArr != f23495a) {
                    int length = c5247aArr.length;
                    int i = -1;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (c5247aArr[i2] == c5247a) {
                            i = i2;
                            break;
                        }
                    }
                    if (i < 0) {
                        return;
                    }
                    if (length == 1) {
                        obj = f23495a;
                    } else {
                        obj = new C5247a[(length - 1)];
                        System.arraycopy(c5247aArr, 0, obj, 0, i);
                        System.arraycopy(c5247aArr, i + 1, obj, i, (length - i) - 1);
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(c5247aArr, obj));
        }

        public void onNext(T t) {
            for (C5247a onNext : (C5247a[]) get()) {
                onNext.onNext(t);
            }
        }

        public void onError(Throwable th) {
            this.f23497c = th;
            List list = null;
            for (C5247a onError : (C5247a[]) getAndSet(f23496b)) {
                try {
                    onError.onError(th);
                } catch (Throwable th2) {
                    if (list == null) {
                        list = new ArrayList(1);
                    }
                    list.add(th2);
                }
            }
            dud.m29408a(list);
        }

        public void onCompleted() {
            for (C5247a onCompleted : (C5247a[]) getAndSet(f23496b)) {
                onCompleted.onCompleted();
            }
        }
    }

    /* renamed from: a */
    public static <T> dyo<T> m29867a() {
        return new dyo(new C5248b());
    }

    protected dyo(C5248b<T> c5248b) {
        super(c5248b);
        this.f23498b = c5248b;
    }

    public void onNext(T t) {
        this.f23498b.onNext(t);
    }

    public void onError(Throwable th) {
        this.f23498b.onError(th);
    }

    public void onCompleted() {
        this.f23498b.onCompleted();
    }
}
