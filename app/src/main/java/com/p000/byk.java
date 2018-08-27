package com.p000;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
import p000.byj.C1599a;
import p000.byj.C1600b;

/* compiled from: OnOffSwitchImpl */
/* renamed from: byk */
class byk implements byj {
    /* renamed from: a */
    private static final AtomicReference<ExecutorService> f8205a = new AtomicReference();
    /* renamed from: b */
    private static final Queue<C1599a> f8206b = new ConcurrentLinkedQueue();
    /* renamed from: c */
    private static volatile C1600b f8207c = C1600b.OFF;
    /* renamed from: d */
    private static volatile boolean f8208d = bxu.f8112a.booleanValue();
    /* renamed from: e */
    private static volatile int f8209e = HttpStatus.HTTP_OK;

    /* compiled from: OnOffSwitchImpl */
    /* renamed from: byk$1 */
    class C16011 implements ThreadFactory {
        /* renamed from: a */
        final /* synthetic */ byk f8196a;

        C16011(byk byk) {
            this.f8196a = byk;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "MoatStatus");
            thread.setDaemon(true);
            return thread;
        }
    }

    /* compiled from: OnOffSwitchImpl */
    /* renamed from: byk$2 */
    class C16032 implements C1602a {
        /* renamed from: a */
        final /* synthetic */ byk f8197a;

        C16032(byk byk) {
            this.f8197a = byk;
        }

        /* renamed from: a */
        public void mo1618a(C1600b c1600b) throws byu {
            if (byk.f8207c != c1600b) {
                synchronized (byk.f8206b) {
                    if (c1600b == C1600b.ON && byk.f8208d) {
                        Log.d("MoatOnOff", "Moat enabled - Version 1.7.11");
                    }
                    byk.f8207c = c1600b;
                    Iterator it = byk.f8206b.iterator();
                    while (it.hasNext()) {
                        C1599a c1599a = (C1599a) it.next();
                        if (c1600b == C1600b.ON) {
                            c1599a.mo1619a();
                        } else {
                            c1599a.mo1620b();
                        }
                        it.remove();
                    }
                }
            }
            this.f8197a.m11786g();
        }
    }

    /* compiled from: OnOffSwitchImpl */
    /* renamed from: byk$a */
    static class C1605a implements Runnable {
        /* renamed from: b */
        private static final long f8200b;
        /* renamed from: a */
        private final byd f8201a;
        /* renamed from: c */
        private final String f8202c;
        /* renamed from: d */
        private final C1602a f8203d;
        /* renamed from: e */
        private C1600b f8204e;

        /* compiled from: OnOffSwitchImpl */
        /* renamed from: byk$a$a */
        interface C1602a {
            /* renamed from: a */
            void mo1618a(C1600b c1600b) throws byu;
        }

        static {
            if (bxu.f8112a.booleanValue()) {
                f8200b = 2000;
            } else {
                f8200b = 90000;
            }
        }

        private C1605a(String str, byd byd, C1602a c1602a) {
            this.f8204e = C1600b.OFF;
            this.f8201a = byd;
            this.f8203d = c1602a;
            this.f8202c = "https://z.moatads.com/" + str + "/android/" + "4724e28a731f8ba73e9eecc4d5c807705dd80963".substring(0, 7) + "/status.json";
        }

        public void run() {
            try {
                m11777a();
            } catch (Exception e) {
                this.f8204e = C1600b.OFF;
                byt.m11829a(e);
            }
        }

        /* renamed from: a */
        private void m11777a() throws byu {
            long j = 0;
            while (true) {
                long currentTimeMillis = System.currentTimeMillis() - j;
                if (currentTimeMillis < f8200b) {
                    try {
                        Thread.sleep((10 + f8200b) - currentTimeMillis);
                    } catch (Throwable e) {
                        if (bxu.f8112a.booleanValue()) {
                            Log.e("MoatOnOffLoop", "Interruption attempted (and ignored): " + Log.getStackTraceString(e));
                        }
                    }
                }
                j = System.currentTimeMillis();
                final C1600b b = m11778b();
                Handler handler = new Handler(Looper.getMainLooper());
                if (!b.equals(this.f8204e) && bxu.f8112a.booleanValue()) {
                    Log.i("MoatOnOffLoop", "Moat is now " + this.f8204e);
                }
                this.f8204e = b;
                handler.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C1605a f8199b;

                    public void run() {
                        try {
                            this.f8199b.f8203d.mo1618a(b);
                        } catch (Exception e) {
                            byt.m11829a(e);
                        }
                    }
                });
            }
        }

        /* renamed from: b */
        private C1600b m11778b() {
            byv a = this.f8201a.mo1603a(this.f8202c + "?ts=" + System.currentTimeMillis() + "&v=" + "1.7.11");
            if (!a.m11834c()) {
                return C1600b.OFF;
            }
            bya bya = new bya((String) a.m11832b());
            byk.f8208d = bya.m11718a();
            byk.f8209e = bya.m11720c();
            return bya.m11719b() ? C1600b.ON : C1600b.OFF;
        }
    }

    byk(byd byd) throws byu {
        if (f8205a.get() == null) {
            if (f8205a.compareAndSet(null, Executors.newSingleThreadExecutor(new C16011(this)))) {
                String str = "AOL";
                ((ExecutorService) f8205a.get()).submit(new C1605a("AOL", byd, new C16032(this)));
            }
        }
    }

    /* renamed from: a */
    public C1600b mo1613a() {
        return f8207c;
    }

    /* renamed from: b */
    public boolean mo1615b() {
        return f8208d;
    }

    /* renamed from: c */
    public int mo1616c() {
        return f8209e;
    }

    /* renamed from: a */
    public void mo1614a(C1599a c1599a) throws byu {
        m11786g();
        f8206b.add(c1599a);
    }

    /* renamed from: g */
    private void m11786g() {
        synchronized (f8206b) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = f8206b.iterator();
            while (it.hasNext()) {
                C1599a c1599a = (C1599a) it.next();
                if (c1599a.mo1621c()) {
                    it.remove();
                } else if (currentTimeMillis - c1599a.mo1622d() >= 300000) {
                    it.remove();
                }
            }
            if (f8206b.size() >= 15) {
                for (int i = 0; i < 5; i++) {
                    f8206b.remove();
                }
            }
        }
    }
}
