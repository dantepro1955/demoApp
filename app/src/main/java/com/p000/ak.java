package com.p000;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager */
/* renamed from: ak */
class ak {
    /* renamed from: a */
    private static ak f1770a;
    /* renamed from: b */
    private final Object f1771b = new Object();
    /* renamed from: c */
    private final Handler f1772c = new Handler(Looper.getMainLooper(), new C02381(this));
    /* renamed from: d */
    private C0240b f1773d;
    /* renamed from: e */
    private C0240b f1774e;

    /* compiled from: SnackbarManager */
    /* renamed from: ak$1 */
    class C02381 implements Callback {
        /* renamed from: a */
        final /* synthetic */ ak f1766a;

        C02381(ak akVar) {
            this.f1766a = akVar;
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    this.f1766a.m2099a((C0240b) message.obj);
                    return true;
                default:
                    return false;
            }
        }
    }

    /* compiled from: SnackbarManager */
    /* renamed from: ak$a */
    interface C0239a {
        /* renamed from: a */
        void m2087a();

        /* renamed from: a */
        void m2088a(int i);
    }

    /* compiled from: SnackbarManager */
    /* renamed from: ak$b */
    static class C0240b {
        /* renamed from: a */
        final WeakReference<C0239a> f1767a;
        /* renamed from: b */
        int f1768b;
        /* renamed from: c */
        boolean f1769c;

        C0240b(int i, C0239a c0239a) {
            this.f1767a = new WeakReference(c0239a);
            this.f1768b = i;
        }

        /* renamed from: a */
        boolean m2089a(C0239a c0239a) {
            return c0239a != null && this.f1767a.get() == c0239a;
        }
    }

    /* renamed from: a */
    static ak m2090a() {
        if (f1770a == null) {
            f1770a = new ak();
        }
        return f1770a;
    }

    private ak() {
    }

    /* renamed from: a */
    public void m2096a(int i, C0239a c0239a) {
        synchronized (this.f1771b) {
            if (m2094f(c0239a)) {
                this.f1773d.f1768b = i;
                this.f1772c.removeCallbacksAndMessages(this.f1773d);
                m2093b(this.f1773d);
                return;
            }
            if (m2095g(c0239a)) {
                this.f1774e.f1768b = i;
            } else {
                this.f1774e = new C0240b(i, c0239a);
            }
            if (this.f1773d == null || !m2091a(this.f1773d, 4)) {
                this.f1773d = null;
                m2092b();
                return;
            }
        }
    }

    /* renamed from: a */
    public void m2098a(C0239a c0239a, int i) {
        synchronized (this.f1771b) {
            if (m2094f(c0239a)) {
                m2091a(this.f1773d, i);
            } else if (m2095g(c0239a)) {
                m2091a(this.f1774e, i);
            }
        }
    }

    /* renamed from: a */
    public void m2097a(C0239a c0239a) {
        synchronized (this.f1771b) {
            if (m2094f(c0239a)) {
                this.f1773d = null;
                if (this.f1774e != null) {
                    m2092b();
                }
            }
        }
    }

    /* renamed from: b */
    public void m2100b(C0239a c0239a) {
        synchronized (this.f1771b) {
            if (m2094f(c0239a)) {
                m2093b(this.f1773d);
            }
        }
    }

    /* renamed from: c */
    public void m2101c(C0239a c0239a) {
        synchronized (this.f1771b) {
            if (m2094f(c0239a) && !this.f1773d.f1769c) {
                this.f1773d.f1769c = true;
                this.f1772c.removeCallbacksAndMessages(this.f1773d);
            }
        }
    }

    /* renamed from: d */
    public void m2102d(C0239a c0239a) {
        synchronized (this.f1771b) {
            if (m2094f(c0239a) && this.f1773d.f1769c) {
                this.f1773d.f1769c = false;
                m2093b(this.f1773d);
            }
        }
    }

    /* renamed from: e */
    public boolean m2103e(C0239a c0239a) {
        boolean z;
        synchronized (this.f1771b) {
            z = m2094f(c0239a) || m2095g(c0239a);
        }
        return z;
    }

    /* renamed from: b */
    private void m2092b() {
        if (this.f1774e != null) {
            this.f1773d = this.f1774e;
            this.f1774e = null;
            C0239a c0239a = (C0239a) this.f1773d.f1767a.get();
            if (c0239a != null) {
                c0239a.m2087a();
            } else {
                this.f1773d = null;
            }
        }
    }

    /* renamed from: a */
    private boolean m2091a(C0240b c0240b, int i) {
        C0239a c0239a = (C0239a) c0240b.f1767a.get();
        if (c0239a == null) {
            return false;
        }
        this.f1772c.removeCallbacksAndMessages(c0240b);
        c0239a.m2088a(i);
        return true;
    }

    /* renamed from: f */
    private boolean m2094f(C0239a c0239a) {
        return this.f1773d != null && this.f1773d.m2089a(c0239a);
    }

    /* renamed from: g */
    private boolean m2095g(C0239a c0239a) {
        return this.f1774e != null && this.f1774e.m2089a(c0239a);
    }

    /* renamed from: b */
    private void m2093b(C0240b c0240b) {
        if (c0240b.f1768b != -2) {
            int i = 2750;
            if (c0240b.f1768b > 0) {
                i = c0240b.f1768b;
            } else if (c0240b.f1768b == -1) {
                i = 1500;
            }
            this.f1772c.removeCallbacksAndMessages(c0240b);
            this.f1772c.sendMessageDelayed(Message.obtain(this.f1772c, 0, c0240b), (long) i);
        }
    }

    /* renamed from: a */
    void m2099a(C0240b c0240b) {
        synchronized (this.f1771b) {
            if (this.f1773d == c0240b || this.f1774e == c0240b) {
                m2091a(c0240b, 2);
            }
        }
    }
}
