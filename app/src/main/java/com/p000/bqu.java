package com.p000;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;

/* renamed from: bqu */
public class bqu {
    /* renamed from: l */
    private static Object f7420l = new Object();
    /* renamed from: m */
    private static bqu f7421m;
    /* renamed from: a */
    private volatile long f7422a;
    /* renamed from: b */
    private volatile long f7423b;
    /* renamed from: c */
    private volatile boolean f7424c;
    /* renamed from: d */
    private volatile Info f7425d;
    /* renamed from: e */
    private volatile long f7426e;
    /* renamed from: f */
    private volatile long f7427f;
    /* renamed from: g */
    private final Context f7428g;
    /* renamed from: h */
    private final apt f7429h;
    /* renamed from: i */
    private final Thread f7430i;
    /* renamed from: j */
    private final Object f7431j;
    /* renamed from: k */
    private C1423a f7432k;

    /* renamed from: bqu$a */
    public interface C1423a {
        /* renamed from: a */
        Info mo1405a();
    }

    /* renamed from: bqu$1 */
    class C14241 implements C1423a {
        /* renamed from: a */
        final /* synthetic */ bqu f7418a;

        C14241(bqu bqu) {
            this.f7418a = bqu;
        }

        /* renamed from: a */
        public Info mo1405a() {
            Info info = null;
            try {
                info = AdvertisingIdClient.getAdvertisingIdInfo(this.f7418a.f7428g);
            } catch (Throwable e) {
                brd.m10496b("IllegalStateException getting Advertising Id Info", e);
            } catch (Throwable e2) {
                brd.m10496b("GooglePlayServicesRepairableException getting Advertising Id Info", e2);
            } catch (Throwable e22) {
                brd.m10496b("IOException getting Ad Id Info", e22);
            } catch (Throwable e222) {
                brd.m10496b("GooglePlayServicesNotAvailableException getting Advertising Id Info", e222);
            } catch (Throwable e2222) {
                brd.m10496b("Unknown exception. Could not get the Advertising Id Info.", e2222);
            }
            return info;
        }
    }

    /* renamed from: bqu$2 */
    class C14252 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bqu f7419a;

        C14252(bqu bqu) {
            this.f7419a = bqu;
        }

        public void run() {
            this.f7419a.m10473b();
        }
    }

    private bqu(Context context) {
        this(context, null, apv.m4885d());
    }

    public bqu(Context context, C1423a c1423a, apt apt) {
        this.f7422a = 900000;
        this.f7423b = 30000;
        this.f7424c = false;
        this.f7431j = new Object();
        this.f7432k = new C14241(this);
        this.f7429h = apt;
        if (context != null) {
            this.f7428g = context.getApplicationContext();
        } else {
            this.f7428g = context;
        }
        if (c1423a != null) {
            this.f7432k = c1423a;
        }
        this.f7426e = this.f7429h.mo606a();
        this.f7430i = new Thread(new C14252(this));
    }

    /* renamed from: a */
    public static bqu m10472a(Context context) {
        if (f7421m == null) {
            synchronized (f7420l) {
                if (f7421m == null) {
                    f7421m = new bqu(context);
                    f7421m.m10475a();
                }
            }
        }
        return f7421m;
    }

    /* renamed from: b */
    private void m10473b() {
        Process.setThreadPriority(10);
        while (true) {
            boolean z = this.f7424c;
            Info a = this.f7432k.mo1405a();
            if (a != null) {
                this.f7425d = a;
                this.f7427f = this.f7429h.mo606a();
                brd.m10497c("Obtained fresh AdvertisingId info from GmsCore.");
            }
            synchronized (this) {
                notifyAll();
            }
            try {
                synchronized (this.f7431j) {
                    this.f7431j.wait(this.f7422a);
                }
            } catch (InterruptedException e) {
                brd.m10497c("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    /* renamed from: a */
    public void m10475a() {
        this.f7430i.start();
    }
}
