package com.p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.anq.C0650a;
import p000.asw.C0776b;

/* renamed from: ark */
public abstract class ark<R extends ant> extends anq<R> {
    /* renamed from: c */
    static final ThreadLocal<Boolean> f2059c = new C07271();
    /* renamed from: a */
    private final Object f2060a;
    /* renamed from: b */
    private final CountDownLatch f2061b;
    /* renamed from: d */
    protected final C0728a<R> f2062d;
    /* renamed from: e */
    protected final WeakReference<GoogleApiClient> f2063e;
    /* renamed from: f */
    private final ArrayList<C0650a> f2064f;
    /* renamed from: g */
    private anu<? super R> f2065g;
    /* renamed from: h */
    private final AtomicReference<C0776b> f2066h;
    /* renamed from: i */
    private R f2067i;
    /* renamed from: j */
    private Status f2068j;
    /* renamed from: k */
    private C0729b f2069k;
    /* renamed from: l */
    private volatile boolean f2070l;
    /* renamed from: m */
    private boolean f2071m;
    /* renamed from: n */
    private boolean f2072n;
    /* renamed from: o */
    private apf f2073o;
    /* renamed from: p */
    private volatile asv<R> f2074p;
    /* renamed from: q */
    private boolean f2075q;

    /* renamed from: ark$1 */
    class C07271 extends ThreadLocal<Boolean> {
        C07271() {
        }

        /* renamed from: a */
        protected Boolean m5116a() {
            return Boolean.valueOf(false);
        }

        protected /* synthetic */ Object initialValue() {
            return m5116a();
        }
    }

    /* renamed from: ark$a */
    public static class C0728a<R extends ant> extends Handler {
        public C0728a() {
            this(Looper.getMainLooper());
        }

        public C0728a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public void m5117a() {
            removeMessages(2);
        }

        /* renamed from: a */
        public void m5118a(anu<? super R> anu, R r) {
            sendMessage(obtainMessage(1, new Pair(anu, r)));
        }

        /* renamed from: b */
        protected void m5119b(anu<? super R> anu, R r) {
            try {
                anu.mo687a(r);
            } catch (RuntimeException e) {
                ark.m2676b((ant) r);
                throw e;
            }
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    m5119b((anu) pair.first, (ant) pair.second);
                    return;
                case 2:
                    ((ark) message.obj).m2685d(Status.f14764d);
                    return;
                default:
                    Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
                    return;
            }
        }
    }

    /* renamed from: ark$b */
    final class C0729b {
        /* renamed from: a */
        final /* synthetic */ ark f4041a;

        private C0729b(ark ark) {
            this.f4041a = ark;
        }

        protected void finalize() throws Throwable {
            ark.m2676b(this.f4041a.f2067i);
            super.finalize();
        }
    }

    @Deprecated
    ark() {
        this.f2060a = new Object();
        this.f2061b = new CountDownLatch(1);
        this.f2064f = new ArrayList();
        this.f2066h = new AtomicReference();
        this.f2075q = false;
        this.f2062d = new C0728a(Looper.getMainLooper());
        this.f2063e = new WeakReference(null);
    }

    @Deprecated
    protected ark(Looper looper) {
        this.f2060a = new Object();
        this.f2061b = new CountDownLatch(1);
        this.f2064f = new ArrayList();
        this.f2066h = new AtomicReference();
        this.f2075q = false;
        this.f2062d = new C0728a(looper);
        this.f2063e = new WeakReference(null);
    }

    protected ark(GoogleApiClient googleApiClient) {
        this.f2060a = new Object();
        this.f2061b = new CountDownLatch(1);
        this.f2064f = new ArrayList();
        this.f2066h = new AtomicReference();
        this.f2075q = false;
        this.f2062d = new C0728a(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.f2063e = new WeakReference(googleApiClient);
    }

    /* renamed from: a */
    private void mo348a() {
        C0776b c0776b = (C0776b) this.f2066h.getAndSet(null);
        if (c0776b != null) {
            c0776b.mo710a(this);
        }
    }

    /* renamed from: b */
    private R mo350b() {
        R r;
        boolean z = true;
        synchronized (this.f2060a) {
            if (this.f2070l) {
                z = false;
            }
            aoi.m4685a(z, (Object) "Result has already been consumed.");
            aoi.m4685a(m2686d(), (Object) "Result is not ready.");
            r = this.f2067i;
            this.f2067i = null;
            this.f2065g = null;
            this.f2070l = true;
        }
        mo348a();
        return r;
    }

    /* renamed from: b */
    public static void m2676b(ant ant) {
        if (ant instanceof ans) {
            try {
                ((ans) ant).mo1004a();
            } catch (Throwable e) {
                String valueOf = String.valueOf(ant);
                Log.w("BasePendingResult", new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf).toString(), e);
            }
        }
    }

    /* renamed from: c */
    private void m2677c(R r) {
        this.f2067i = r;
        this.f2073o = null;
        this.f2061b.countDown();
        this.f2068j = this.f2067i.mo325b();
        if (this.f2071m) {
            this.f2065g = null;
        } else if (this.f2065g != null) {
            this.f2062d.m5117a();
            this.f2062d.m5118a(this.f2065g, mo350b());
        } else if (this.f2067i instanceof ans) {
            this.f2069k = new C0729b();
        }
        Iterator it = this.f2064f.iterator();
        while (it.hasNext()) {
            ((C0650a) it.next()).mo651a(this.f2068j);
        }
        this.f2064f.clear();
    }

    /* renamed from: a */
    public final R m2678a(long j, TimeUnit timeUnit) {
        boolean z = true;
        boolean z2 = j <= 0 || Looper.myLooper() != Looper.getMainLooper();
        aoi.m4685a(z2, (Object) "await must not be called on the UI thread when time is greater than zero.");
        aoi.m4685a(!this.f2070l, (Object) "Result has already been consumed.");
        if (this.f2074p != null) {
            z = false;
        }
        aoi.m4685a(z, (Object) "Cannot await if then() has been called.");
        try {
            if (!this.f2061b.await(j, timeUnit)) {
                m2685d(Status.f14764d);
            }
        } catch (InterruptedException e) {
            m2685d(Status.f14762b);
        }
        aoi.m4685a(m2686d(), (Object) "Result is not ready.");
        return mo350b();
    }

    /* renamed from: a */
    public final void mo345a(C0650a c0650a) {
        aoi.m4689b(c0650a != null, "Callback cannot be null.");
        synchronized (this.f2060a) {
            if (m2686d()) {
                c0650a.mo651a(this.f2068j);
            } else {
                this.f2064f.add(c0650a);
            }
        }
    }

    /* renamed from: a */
    public final void m2680a(R r) {
        boolean z = true;
        synchronized (this.f2060a) {
            if (this.f2072n || this.f2071m) {
                ark.m2676b((ant) r);
                return;
            }
            if (m2686d()) {
            }
            aoi.m4685a(!m2686d(), (Object) "Results have already been set");
            if (this.f2070l) {
                z = false;
            }
            aoi.m4685a(z, (Object) "Result has already been consumed");
            m2677c(r);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo346a(p000.anu<? super R> r6) {
        /*
        r5 = this;
        r0 = 1;
        r1 = 0;
        r3 = r5.f2060a;
        monitor-enter(r3);
        if (r6 != 0) goto L_0x000c;
    L_0x0007:
        r0 = 0;
        r5.f2065g = r0;	 Catch:{ all -> 0x0027 }
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
    L_0x000b:
        return;
    L_0x000c:
        r2 = r5.f2070l;	 Catch:{ all -> 0x0027 }
        if (r2 != 0) goto L_0x002a;
    L_0x0010:
        r2 = r0;
    L_0x0011:
        r4 = "Result has already been consumed.";
        p000.aoi.m4685a(r2, r4);	 Catch:{ all -> 0x0027 }
        r2 = r5.f2074p;	 Catch:{ all -> 0x0027 }
        if (r2 != 0) goto L_0x002c;
    L_0x001a:
        r1 = "Cannot set callbacks if then() has been called.";
        p000.aoi.m4685a(r0, r1);	 Catch:{ all -> 0x0027 }
        r0 = r5.m2689g();	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x002e;
    L_0x0025:
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        goto L_0x000b;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        throw r0;
    L_0x002a:
        r2 = r1;
        goto L_0x0011;
    L_0x002c:
        r0 = r1;
        goto L_0x001a;
    L_0x002e:
        r0 = r5.m2686d();	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x003f;
    L_0x0034:
        r0 = r5.f2062d;	 Catch:{ all -> 0x0027 }
        r1 = r5.mo350b();	 Catch:{ all -> 0x0027 }
        r0.m5118a(r6, r1);	 Catch:{ all -> 0x0027 }
    L_0x003d:
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        goto L_0x000b;
    L_0x003f:
        r5.f2065g = r6;	 Catch:{ all -> 0x0027 }
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: ark.a(anu):void");
    }

    /* renamed from: a */
    public void m2682a(C0776b c0776b) {
        this.f2066h.set(c0776b);
    }

    /* renamed from: b */
    protected abstract R mo352b(Status status);

    /* renamed from: c */
    public Integer mo347c() {
        return null;
    }

    /* renamed from: d */
    public final void m2685d(Status status) {
        synchronized (this.f2060a) {
            if (!m2686d()) {
                m2680a(mo352b(status));
                this.f2072n = true;
            }
        }
    }

    /* renamed from: d */
    public final boolean m2686d() {
        return this.f2061b.getCount() == 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    public void m2687e() {
        /*
        r2 = this;
        r1 = r2.f2060a;
        monitor-enter(r1);
        r0 = r2.f2071m;	 Catch:{ all -> 0x0029 }
        if (r0 != 0) goto L_0x000b;
    L_0x0007:
        r0 = r2.f2070l;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
    L_0x000c:
        return;
    L_0x000d:
        r0 = r2.f2073o;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x0016;
    L_0x0011:
        r0 = r2.f2073o;	 Catch:{ RemoteException -> 0x002c }
        r0.m4835a();	 Catch:{ RemoteException -> 0x002c }
    L_0x0016:
        r0 = r2.f2067i;	 Catch:{ all -> 0x0029 }
        p000.ark.m2676b(r0);	 Catch:{ all -> 0x0029 }
        r0 = 1;
        r2.f2071m = r0;	 Catch:{ all -> 0x0029 }
        r0 = com.google.android.gms.common.api.Status.f14765e;	 Catch:{ all -> 0x0029 }
        r0 = r2.mo352b(r0);	 Catch:{ all -> 0x0029 }
        r2.m2677c(r0);	 Catch:{ all -> 0x0029 }
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        goto L_0x000c;
    L_0x0029:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        throw r0;
    L_0x002c:
        r0 = move-exception;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: ark.e():void");
    }

    /* renamed from: f */
    public boolean m2688f() {
        boolean g;
        synchronized (this.f2060a) {
            if (((GoogleApiClient) this.f2063e.get()) == null || !this.f2075q) {
                m2687e();
            }
            g = m2689g();
        }
        return g;
    }

    /* renamed from: g */
    public boolean m2689g() {
        boolean z;
        synchronized (this.f2060a) {
            z = this.f2071m;
        }
        return z;
    }

    /* renamed from: h */
    public void m2690h() {
        mo346a(null);
    }

    /* renamed from: i */
    public void m2691i() {
        boolean z = this.f2075q || ((Boolean) f2059c.get()).booleanValue();
        this.f2075q = z;
    }
}
