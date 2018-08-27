package com.p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: NetworkController */
/* renamed from: chp */
public class chp extends chh {
    /* renamed from: b */
    private static boolean f9258b;
    /* renamed from: g */
    private static chp f9259g = new chp();
    /* renamed from: c */
    private final LinkedBlockingQueue<Runnable> f9260c = new LinkedBlockingQueue();
    /* renamed from: d */
    private boolean f9261d = false;
    /* renamed from: e */
    private ThreadPoolExecutor f9262e = m13475a(this.f9260c);
    /* renamed from: f */
    private Handler f9263f;

    /* compiled from: NetworkController */
    /* renamed from: chp$a */
    class C1733a extends cnh {
        /* renamed from: a */
        final /* synthetic */ chp f9257a;

        public C1733a(chp chp, Context context, cnf cnf) {
            this.f9257a = chp;
            super(context, cnf);
        }

        public void run() {
            super.run();
            if (this.f9257a.f9263f != null && this.f9257a.m13486c()) {
                try {
                    this.f9257a.f9263f.sendEmptyMessageDelayed(0, 20000);
                } catch (Exception e) {
                }
            }
        }
    }

    /* renamed from: b */
    public static chp m13478b() {
        return f9259g;
    }

    private chp() {
    }

    /* renamed from: c */
    public boolean m13486c() {
        return this.f9260c.size() == 0;
    }

    /* renamed from: b */
    public void m13484b(Context context) {
        if (!this.f9261d) {
            this.f9261d = true;
            m13254a(context);
        }
    }

    /* renamed from: a */
    public void m13482a(Handler handler) {
        this.f9263f = handler;
    }

    /* renamed from: d */
    public void m13487d() {
        synchronized (this.f9260c) {
            this.f9260c.clear();
        }
    }

    /* renamed from: a */
    private ThreadPoolExecutor m13475a(LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        return m13476a(linkedBlockingQueue, 1, 1);
    }

    /* renamed from: a */
    private ThreadPoolExecutor m13476a(LinkedBlockingQueue<Runnable> linkedBlockingQueue, int i, int i2) {
        return new ThreadPoolExecutor(i, i2, 1, a, linkedBlockingQueue);
    }

    /* renamed from: b */
    public void m13485b(cnf cnf) {
        if (cnf != null && cnf.m14466p()) {
            m13483a((cmg) cnf);
            if (chh.m13251a(this.f9260c, cnf)) {
                this.f9262e.execute(m13479c(cnf));
            }
        }
    }

    /* renamed from: a */
    public boolean m13483a(cmg cmg) {
        if (cmg != null && cmg.mo1803f()) {
            return false;
        }
        if (!cpm.a() && !cpm.b()) {
            return false;
        }
        this.f9262e.execute(m13253a(new cng(m13252a()).m14742a()));
        return true;
    }

    /* renamed from: c */
    private cnh m13479c(cnf cnf) {
        return new C1733a(this, m13252a(), cnf);
    }

    /* renamed from: e */
    public boolean m13488e() {
        return chp.m13480c(m13252a());
    }

    /* renamed from: c */
    public static boolean m13480c(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: a */
    public static void m13477a(boolean z) {
        f9258b = z;
    }

    /* renamed from: f */
    public static boolean m13481f() {
        return f9258b;
    }
}
