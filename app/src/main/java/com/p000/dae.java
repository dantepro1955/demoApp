package com.p000;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: ActivityLifecycleHandler */
/* renamed from: dae */
public class dae {
    /* renamed from: a */
    static boolean f20924a;
    /* renamed from: b */
    static Activity f20925b;
    /* renamed from: c */
    public static C4735c f20926c = new C4735c();
    /* renamed from: d */
    private static C4181a f20927d;

    /* compiled from: ActivityLifecycleHandler */
    /* renamed from: dae$a */
    public interface C4181a {
        /* renamed from: a */
        void mo3873a(Activity activity);
    }

    /* compiled from: ActivityLifecycleHandler */
    /* renamed from: dae$b */
    static class C4734b implements Runnable {
        /* renamed from: a */
        private boolean f20920a;
        /* renamed from: b */
        private boolean f20921b;

        private C4734b() {
        }

        public void run() {
            if (dae.f20925b == null) {
                this.f20920a = true;
                dat.a(false);
                this.f20921b = true;
            }
        }
    }

    /* compiled from: ActivityLifecycleHandler */
    /* renamed from: dae$c */
    public static class C4735c extends HandlerThread {
        /* renamed from: a */
        Handler f20922a = null;
        /* renamed from: b */
        private C4734b f20923b;

        C4735c() {
            super("FocusHandlerThread");
            start();
            this.f20922a = new Handler(getLooper());
        }

        /* renamed from: a */
        void m26018a() {
            if (this.f20923b != null) {
                this.f20923b.f20920a = false;
            }
        }

        /* renamed from: b */
        public void m26020b() {
            this.f20922a.removeCallbacksAndMessages(null);
        }

        /* renamed from: a */
        void m26019a(C4734b c4734b) {
            if (this.f20923b == null || !this.f20923b.f20920a || this.f20923b.f20921b) {
                this.f20923b = c4734b;
                this.f20922a.removeCallbacksAndMessages(null);
                this.f20922a.postDelayed(c4734b, 2000);
            }
        }

        /* renamed from: c */
        boolean m26021c() {
            if (this.f20923b != null) {
                return this.f20923b.f20920a;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static void m26024a(C4181a c4181a) {
        if (f20925b != null) {
            c4181a.mo3873a(f20925b);
            f20927d = c4181a;
            return;
        }
        f20927d = c4181a;
    }

    /* renamed from: b */
    public static void m26027b(C4181a c4181a) {
        f20927d = null;
    }

    /* renamed from: g */
    private static void m26033g(Activity activity) {
        f20925b = activity;
        if (f20927d != null) {
            f20927d.mo3873a(f20925b);
        }
    }

    /* renamed from: a */
    static void m26023a(Activity activity) {
    }

    /* renamed from: b */
    static void m26026b(Activity activity) {
    }

    /* renamed from: c */
    static void m26029c(Activity activity) {
        dae.m26033g(activity);
        dae.m26022a();
        dae.m26028c();
    }

    /* renamed from: d */
    static void m26030d(Activity activity) {
        if (activity == f20925b) {
            f20925b = null;
            dae.m26025b();
        }
        dae.m26022a();
    }

    /* renamed from: e */
    static void m26031e(Activity activity) {
        dat.a(dat$c.DEBUG, "onActivityStopped: " + activity.getClass().getName());
        if (activity == f20925b) {
            f20925b = null;
            dae.m26025b();
        }
        dae.m26022a();
    }

    /* renamed from: f */
    static void m26032f(Activity activity) {
        dat.a(dat$c.DEBUG, "onActivityDestroyed: " + activity.getClass().getName());
        if (activity == f20925b) {
            f20925b = null;
            dae.m26025b();
        }
        dae.m26022a();
    }

    /* renamed from: a */
    private static void m26022a() {
        dat.a(dat$c.DEBUG, "curActivity is NOW: " + (f20925b != null ? "" + f20925b.getClass().getName() + ":" + f20925b : "null"));
    }

    /* renamed from: b */
    private static void m26025b() {
        f20926c.m26019a(new C4734b());
    }

    /* renamed from: c */
    private static void m26028c() {
        if (f20926c.m26021c() || f20924a) {
            f20924a = false;
            f20926c.m26018a();
            dat.b();
            return;
        }
        f20926c.m26020b();
    }
}
