package com.p000;

import com.facebook.common.time.Clock;
import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import p000.dtp.C5093b;

/* compiled from: OperatorMerge */
/* renamed from: dvn */
public final class dvn<T> implements C5093b<T, dtp<? extends T>> {
    /* renamed from: a */
    final boolean f23120a;
    /* renamed from: b */
    final int f23121b;

    /* compiled from: OperatorMerge */
    /* renamed from: dvn$a */
    static final class C5145a {
        /* renamed from: a */
        static final dvn<Object> f23093a = new dvn(true, MoPubClientPositioning.NO_REPEAT);
    }

    /* compiled from: OperatorMerge */
    /* renamed from: dvn$b */
    static final class C5146b {
        /* renamed from: a */
        static final dvn<Object> f23094a = new dvn(false, MoPubClientPositioning.NO_REPEAT);
    }

    /* compiled from: OperatorMerge */
    /* renamed from: dvn$c */
    static final class C5147c<T> extends dtv<T> {
        /* renamed from: f */
        static final int f23095f = (dwx.f23363b / 4);
        /* renamed from: a */
        final C5149e<T> f23096a;
        /* renamed from: b */
        final long f23097b;
        /* renamed from: c */
        volatile boolean f23098c;
        /* renamed from: d */
        volatile dwx f23099d;
        /* renamed from: e */
        int f23100e;

        public C5147c(C5149e<T> c5149e, long j) {
            this.f23096a = c5149e;
            this.f23097b = j;
        }

        public void onStart() {
            this.f23100e = dwx.f23363b;
            request((long) dwx.f23363b);
        }

        public void onNext(T t) {
            this.f23096a.m29505a(this, (Object) t);
        }

        public void onError(Throwable th) {
            this.f23098c = true;
            this.f23096a.m29501a().offer(th);
            this.f23096a.m29514d();
        }

        public void onCompleted() {
            this.f23098c = true;
            this.f23096a.m29514d();
        }

        /* renamed from: a */
        public void m29498a(long j) {
            int i = this.f23100e - ((int) j);
            if (i > f23095f) {
                this.f23100e = i;
                return;
            }
            this.f23100e = dwx.f23363b;
            i = dwx.f23363b - i;
            if (i > 0) {
                request((long) i);
            }
        }
    }

    /* compiled from: OperatorMerge */
    /* renamed from: dvn$d */
    static final class C5148d<T> extends AtomicLong implements dtr {
        private static final long serialVersionUID = -1214379189873595503L;
        /* renamed from: a */
        final C5149e<T> f23101a;

        public C5148d(C5149e<T> c5149e) {
            this.f23101a = c5149e;
        }

        public void request(long j) {
            if (j > 0) {
                if (get() != Clock.MAX_TIME) {
                    dus.m29421a((AtomicLong) this, j);
                    this.f23101a.m29514d();
                }
            } else if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
        }

        /* renamed from: a */
        public long m29499a(int i) {
            return addAndGet((long) (-i));
        }
    }

    /* compiled from: OperatorMerge */
    /* renamed from: dvn$e */
    static final class C5149e<T> extends dtv<dtp<? extends T>> {
        /* renamed from: p */
        static final C5147c<?>[] f23102p = new C5147c[0];
        /* renamed from: a */
        final dtv<? super T> f23103a;
        /* renamed from: b */
        final boolean f23104b;
        /* renamed from: c */
        final int f23105c;
        /* renamed from: d */
        C5148d<T> f23106d;
        /* renamed from: e */
        volatile Queue<Object> f23107e;
        /* renamed from: f */
        volatile dyt f23108f;
        /* renamed from: g */
        volatile ConcurrentLinkedQueue<Throwable> f23109g;
        /* renamed from: h */
        volatile boolean f23110h;
        /* renamed from: i */
        boolean f23111i;
        /* renamed from: j */
        boolean f23112j;
        /* renamed from: k */
        final Object f23113k = new Object();
        /* renamed from: l */
        volatile C5147c<?>[] f23114l = f23102p;
        /* renamed from: m */
        long f23115m;
        /* renamed from: n */
        long f23116n;
        /* renamed from: o */
        int f23117o;
        /* renamed from: q */
        final int f23118q;
        /* renamed from: r */
        int f23119r;

        public /* synthetic */ void onNext(Object obj) {
            m29503a((dtp) obj);
        }

        public C5149e(dtv<? super T> dtv, boolean z, int i) {
            this.f23103a = dtv;
            this.f23104b = z;
            this.f23105c = i;
            if (i == MoPubClientPositioning.NO_REPEAT) {
                this.f23118q = MoPubClientPositioning.NO_REPEAT;
                request(Clock.MAX_TIME);
                return;
            }
            this.f23118q = Math.max(1, i >> 1);
            request((long) i);
        }

        /* renamed from: a */
        Queue<Throwable> m29501a() {
            Queue<Throwable> queue = this.f23109g;
            if (queue == null) {
                synchronized (this) {
                    queue = this.f23109g;
                    if (queue == null) {
                        queue = new ConcurrentLinkedQueue();
                        this.f23109g = queue;
                    }
                }
            }
            return queue;
        }

        /* renamed from: b */
        dyt m29509b() {
            dyt dyt = this.f23108f;
            if (dyt == null) {
                Object obj;
                synchronized (this) {
                    dyt dyt2 = this.f23108f;
                    if (dyt2 == null) {
                        dyt2 = new dyt();
                        this.f23108f = dyt2;
                        dyt = dyt2;
                        obj = 1;
                    } else {
                        dyt = dyt2;
                        obj = null;
                    }
                }
                if (obj != null) {
                    add(dyt);
                }
            }
            return dyt;
        }

        /* renamed from: a */
        public void m29503a(dtp<? extends T> dtp) {
            if (dtp != null) {
                if (dtp == dtp.m29321d()) {
                    m29513c();
                } else if (dtp instanceof dwz) {
                    m29507a(((dwz) dtp).m29700a());
                } else {
                    long j = this.f23115m;
                    this.f23115m = 1 + j;
                    dtv c5147c = new C5147c(this, j);
                    m29504a((C5147c) c5147c);
                    dtp.m29331a(c5147c);
                    m29514d();
                }
            }
        }

        /* renamed from: c */
        void m29513c() {
            int i = this.f23119r + 1;
            if (i == this.f23118q) {
                this.f23119r = 0;
                m29502a((long) i);
                return;
            }
            this.f23119r = i;
        }

        /* renamed from: g */
        private void m29500g() {
            Collection arrayList = new ArrayList(this.f23109g);
            if (arrayList.size() == 1) {
                this.f23103a.onError((Throwable) arrayList.get(0));
            } else {
                this.f23103a.onError(new duc(arrayList));
            }
        }

        public void onError(Throwable th) {
            m29501a().offer(th);
            this.f23110h = true;
            m29514d();
        }

        public void onCompleted() {
            this.f23110h = true;
            m29514d();
        }

        /* renamed from: a */
        void m29504a(C5147c<T> c5147c) {
            m29509b().m29887a((dtw) c5147c);
            synchronized (this.f23113k) {
                Object obj = this.f23114l;
                int length = obj.length;
                Object obj2 = new C5147c[(length + 1)];
                System.arraycopy(obj, 0, obj2, 0, length);
                obj2[length] = c5147c;
                this.f23114l = obj2;
            }
        }

        /* renamed from: b */
        void m29510b(C5147c<T> c5147c) {
            int i = 0;
            dwx dwx = c5147c.f23099d;
            if (dwx != null) {
                dwx.m29684c();
            }
            this.f23108f.m29889b(c5147c);
            synchronized (this.f23113k) {
                Object obj = this.f23114l;
                int length = obj.length;
                while (i < length) {
                    if (c5147c.equals(obj[i])) {
                        break;
                    }
                    i++;
                }
                i = -1;
                if (i < 0) {
                } else if (length == 1) {
                    this.f23114l = f23102p;
                } else {
                    Object obj2 = new C5147c[(length - 1)];
                    System.arraycopy(obj, 0, obj2, 0, i);
                    System.arraycopy(obj, i + 1, obj2, i, (length - i) - 1);
                    this.f23114l = obj2;
                }
            }
        }

        /* renamed from: a */
        void m29505a(C5147c<T> c5147c, T t) {
            Object obj = null;
            long j = this.f23106d.get();
            if (j != 0) {
                synchronized (this) {
                    j = this.f23106d.get();
                    if (!(this.f23111i || j == 0)) {
                        this.f23111i = true;
                        obj = 1;
                    }
                }
            }
            if (obj != null) {
                dwx dwx = c5147c.f23099d;
                if (dwx == null || dwx.m29686e()) {
                    m29506a(c5147c, t, j);
                    return;
                }
                m29511b(c5147c, t);
                m29515e();
                return;
            }
            m29511b(c5147c, t);
            m29514d();
        }

        /* renamed from: b */
        protected void m29511b(C5147c<T> c5147c, T t) {
            dwx dwx = c5147c.f23099d;
            if (dwx == null) {
                dwx = dwx.m29679a();
                c5147c.add(dwx);
                c5147c.f23099d = dwx;
            }
            try {
                dwx.m29681a(duw.m29441a((Object) t));
            } catch (Throwable e) {
                c5147c.unsubscribe();
                c5147c.onError(e);
            } catch (Throwable e2) {
                if (!c5147c.isUnsubscribed()) {
                    c5147c.unsubscribe();
                    c5147c.onError(e2);
                }
            }
        }

        /* renamed from: a */
        protected void m29506a(C5147c<T> c5147c, T t, long j) {
            Throwable th;
            Object obj = null;
            try {
                this.f23103a.onNext(t);
            } catch (Throwable th2) {
                th = th2;
                obj = 1;
            }
            if (j != Clock.MAX_TIME) {
                this.f23106d.m29499a(1);
            }
            c5147c.m29498a(1);
            synchronized (this) {
                if (this.f23112j) {
                    this.f23112j = false;
                    m29515e();
                    return;
                }
                this.f23111i = false;
                return;
            }
            if (obj == null) {
                synchronized (this) {
                    this.f23111i = false;
                }
            }
            throw th;
        }

        /* renamed from: a */
        public void m29502a(long j) {
            request(j);
        }

        /* renamed from: a */
        void m29507a(T t) {
            Object obj = null;
            long j = this.f23106d.get();
            if (j != 0) {
                synchronized (this) {
                    j = this.f23106d.get();
                    if (!(this.f23111i || j == 0)) {
                        this.f23111i = true;
                        obj = 1;
                    }
                }
            }
            if (obj != null) {
                Queue queue = this.f23107e;
                if (queue == null || queue.isEmpty()) {
                    m29508a((Object) t, j);
                    return;
                }
                m29512b((Object) t);
                m29515e();
                return;
            }
            m29512b((Object) t);
            m29514d();
        }

        /* renamed from: b */
        protected void m29512b(T t) {
            Queue queue = this.f23107e;
            if (queue == null) {
                int i = this.f23105c;
                if (i == MoPubClientPositioning.NO_REPEAT) {
                    queue = new dxf(dwx.f23363b);
                } else if (!dxi.m29771b(i)) {
                    queue = new dxe(i);
                } else if (dxy.m29783a()) {
                    queue = new dxr(i);
                } else {
                    queue = new dxd(i);
                }
                this.f23107e = queue;
            }
            if (!queue.offer(duw.m29441a((Object) t))) {
                unsubscribe();
                onError(dui.m29414a(new due(), t));
            }
        }

        /* renamed from: a */
        protected void m29508a(T t, long j) {
            Throwable th;
            Object obj = null;
            try {
                this.f23103a.onNext(t);
            } catch (Throwable th2) {
                th = th2;
                obj = 1;
            }
            if (j != Clock.MAX_TIME) {
                this.f23106d.m29499a(1);
            }
            int i = this.f23119r + 1;
            if (i == this.f23118q) {
                this.f23119r = 0;
                m29502a((long) i);
            } else {
                this.f23119r = i;
            }
            synchronized (this) {
                if (this.f23112j) {
                    this.f23112j = false;
                    m29515e();
                    return;
                }
                this.f23111i = false;
                return;
            }
            if (obj == null) {
                synchronized (this) {
                    this.f23111i = false;
                }
            }
            throw th;
        }

        /* renamed from: d */
        void m29514d() {
            synchronized (this) {
                if (this.f23111i) {
                    this.f23112j = true;
                    return;
                }
                this.f23111i = true;
                m29515e();
            }
        }

        /* renamed from: e */
        void m29515e() {
            Object obj = null;
            dtv dtv = this.f23103a;
            while (!m29516f()) {
                Object obj2;
                long j;
                int i;
                boolean z;
                Queue queue;
                C5147c[] c5147cArr;
                int length;
                int i2;
                int i3;
                int i4;
                Queue queue2 = this.f23107e;
                long j2 = this.f23106d.get();
                if (j2 == Clock.MAX_TIME) {
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                int i5 = 0;
                Object obj3;
                int i6;
                int i7;
                C5147c c5147c;
                Object obj4;
                int i8;
                dwx dwx;
                if (queue2 != null) {
                    do {
                        i6 = 0;
                        obj3 = null;
                        while (j2 > 0) {
                            obj3 = queue2.poll();
                            if (!m29516f()) {
                                if (obj3 == null) {
                                    break;
                                }
                                try {
                                    try {
                                        dtv.onNext(duw.m29445c(obj3));
                                    } catch (Throwable th) {
                                        if (this.f23104b) {
                                            m29501a().offer(th);
                                        } else {
                                            dud.m29409b(th);
                                            unsubscribe();
                                            dtv.onError(th);
                                            return;
                                        }
                                    }
                                    j2--;
                                    i6++;
                                    i5++;
                                } catch (Throwable th2) {
                                    if (obj == null) {
                                        synchronized (this) {
                                            this.f23111i = false;
                                        }
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                        if (i6 > 0) {
                            if (obj2 != null) {
                                j2 = Clock.MAX_TIME;
                            } else {
                                j2 = this.f23106d.m29499a(i6);
                            }
                        }
                        if (j2 != 0) {
                        }
                    } while (obj3 != null);
                    j = j2;
                    i = i5;
                    z = this.f23110h;
                    queue = this.f23107e;
                    c5147cArr = this.f23114l;
                    length = c5147cArr.length;
                    if (z || !((queue == null || queue.isEmpty()) && length == 0)) {
                        if (length <= 0) {
                            long j3 = this.f23116n;
                            i5 = this.f23117o;
                            if (length <= i5 || c5147cArr[i5].f23097b != j3) {
                                if (length <= i5) {
                                    i5 = 0;
                                }
                                for (i2 = 0; i2 < length && c5147cArr[i5].f23097b != j3; i2++) {
                                    i5++;
                                    if (i5 == length) {
                                        i5 = 0;
                                    }
                                }
                                this.f23117o = i5;
                                this.f23116n = c5147cArr[i5].f23097b;
                            }
                            i3 = i5;
                            i6 = i;
                            j2 = j;
                            i7 = 0;
                            obj3 = null;
                            while (i7 < length) {
                                if (!m29516f()) {
                                    c5147c = c5147cArr[i3];
                                    obj4 = null;
                                    do {
                                        i8 = 0;
                                        while (j2 > 0) {
                                            if (!m29516f()) {
                                                dwx = c5147c.f23099d;
                                                if (dwx != null) {
                                                    obj4 = dwx.m29687f();
                                                    if (obj4 != null) {
                                                        break;
                                                    }
                                                    try {
                                                        dtv.onNext(duw.m29445c(obj4));
                                                        i8++;
                                                        j2--;
                                                    } catch (Throwable th3) {
                                                        obj = 1;
                                                        dud.m29409b(th3);
                                                        dtv.onError(th3);
                                                        return;
                                                    } finally {
                                                        unsubscribe();
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                            return;
                                        }
                                        if (i8 > 0) {
                                            if (obj2 != null) {
                                                j2 = this.f23106d.m29499a(i8);
                                            } else {
                                                j2 = Clock.MAX_TIME;
                                            }
                                            c5147c.m29498a((long) i8);
                                        }
                                        if (j2 == 0) {
                                            break;
                                        }
                                    } while (obj4 != null);
                                    z = c5147c.f23098c;
                                    dwx dwx2 = c5147c.f23099d;
                                    if (z && (dwx2 == null || dwx2.m29686e())) {
                                        m29510b(c5147c);
                                        if (!m29516f()) {
                                            i6++;
                                            obj3 = 1;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j2 == 0) {
                                        obj4 = obj3;
                                        i4 = i6;
                                        break;
                                    }
                                    i5 = i3 + 1;
                                    if (i5 == length) {
                                        i5 = 0;
                                    }
                                    i7++;
                                    i3 = i5;
                                } else {
                                    return;
                                }
                            }
                            obj4 = obj3;
                            i4 = i6;
                            this.f23117o = i3;
                            this.f23116n = c5147cArr[i3].f23097b;
                        } else {
                            obj4 = null;
                            i4 = i;
                        }
                        if (i4 > 0) {
                            request((long) i4);
                        }
                        if (obj4 == null) {
                            synchronized (this) {
                                if (this.f23112j) {
                                    this.f23111i = false;
                                    return;
                                }
                                this.f23112j = false;
                            }
                        }
                    } else {
                        Queue queue3 = this.f23109g;
                        if (queue3 == null || queue3.isEmpty()) {
                            dtv.onCompleted();
                            return;
                        } else {
                            m29500g();
                            return;
                        }
                    }
                }
                j = j2;
                i = i5;
                z = this.f23110h;
                queue = this.f23107e;
                c5147cArr = this.f23114l;
                length = c5147cArr.length;
                if (z) {
                }
                if (length <= 0) {
                    obj4 = null;
                    i4 = i;
                } else {
                    long j32 = this.f23116n;
                    i5 = this.f23117o;
                    if (length <= i5) {
                        i5 = 0;
                    }
                    for (i2 = 0; i2 < length; i2++) {
                        i5++;
                        if (i5 == length) {
                            i5 = 0;
                        }
                    }
                    this.f23117o = i5;
                    this.f23116n = c5147cArr[i5].f23097b;
                    i3 = i5;
                    i6 = i;
                    j2 = j;
                    i7 = 0;
                    obj3 = null;
                    while (i7 < length) {
                        if (!m29516f()) {
                            c5147c = c5147cArr[i3];
                            obj4 = null;
                            do {
                                i8 = 0;
                                while (j2 > 0) {
                                    if (!m29516f()) {
                                        dwx = c5147c.f23099d;
                                        if (dwx != null) {
                                            break;
                                        }
                                        obj4 = dwx.m29687f();
                                        if (obj4 != null) {
                                            break;
                                        }
                                        dtv.onNext(duw.m29445c(obj4));
                                        i8++;
                                        j2--;
                                    } else {
                                        return;
                                    }
                                }
                                if (i8 > 0) {
                                    if (obj2 != null) {
                                        j2 = Clock.MAX_TIME;
                                    } else {
                                        j2 = this.f23106d.m29499a(i8);
                                    }
                                    c5147c.m29498a((long) i8);
                                }
                                if (j2 == 0) {
                                    break;
                                }
                                break;
                            } while (obj4 != null);
                            z = c5147c.f23098c;
                            dwx dwx22 = c5147c.f23099d;
                            m29510b(c5147c);
                            if (!m29516f()) {
                                i6++;
                                obj3 = 1;
                                if (j2 == 0) {
                                    obj4 = obj3;
                                    i4 = i6;
                                    break;
                                }
                                i5 = i3 + 1;
                                if (i5 == length) {
                                    i5 = 0;
                                }
                                i7++;
                                i3 = i5;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    obj4 = obj3;
                    i4 = i6;
                    this.f23117o = i3;
                    this.f23116n = c5147cArr[i3].f23097b;
                }
                if (i4 > 0) {
                    request((long) i4);
                }
                if (obj4 == null) {
                    synchronized (this) {
                        if (this.f23112j) {
                            this.f23112j = false;
                        } else {
                            this.f23111i = false;
                            return;
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        boolean m29516f() {
            if (this.f23103a.isUnsubscribed()) {
                return true;
            }
            Queue queue = this.f23109g;
            if (this.f23104b || queue == null || queue.isEmpty()) {
                return false;
            }
            try {
                m29500g();
                return true;
            } finally {
                unsubscribe();
            }
        }
    }

    /* renamed from: a */
    public static <T> dvn<T> m29517a(boolean z) {
        if (z) {
            return C5145a.f23093a;
        }
        return C5146b.f23094a;
    }

    dvn(boolean z, int i) {
        this.f23120a = z;
        this.f23121b = i;
    }

    /* renamed from: a */
    public dtv<dtp<? extends T>> m29518a(dtv<? super T> dtv) {
        Object c5149e = new C5149e(dtv, this.f23120a, this.f23121b);
        dtr c5148d = new C5148d(c5149e);
        c5149e.f23106d = c5148d;
        dtv.add(c5149e);
        dtv.setProducer(c5148d);
        return c5149e;
    }
}
