package com.p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: NormalHandlerThread */
/* renamed from: cnw */
public class cnw extends HandlerThread {
    /* renamed from: a */
    private static cnw f9897a;
    /* renamed from: b */
    private Handler f9898b = new Handler(Looper.getMainLooper());
    /* renamed from: c */
    private Handler f9899c = new Handler(getLooper());

    /* compiled from: NormalHandlerThread */
    /* renamed from: cnw$a */
    public static abstract class C1651a<Params, Result> {
        /* renamed from: a */
        protected abstract Result mo1631a(Params... paramsArr);

        /* renamed from: a */
        protected void m12221a(Result result) {
        }

        /* renamed from: b */
        public void m12222b(final Params... paramsArr) {
            cnw.m14921a().m14926b(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C1651a f9896b;

                public void run() {
                    final Object a = this.f9896b.mo1631a(paramsArr);
                    cnw.m14921a().m14923a(new Runnable(this) {
                        /* renamed from: b */
                        final /* synthetic */ C17851 f9894b;

                        public void run() {
                            this.f9894b.f9896b.m12221a(a);
                        }
                    });
                }
            });
        }
    }

    private cnw(String str) {
        super(str);
        start();
    }

    /* renamed from: a */
    public static cnw m14921a() {
        if (f9897a == null) {
            f9897a = new cnw("NormalHandlerThread");
        }
        return f9897a;
    }

    /* renamed from: b */
    public static void m14924b() {
        cnw.m14921a();
    }

    /* renamed from: a */
    private void m14923a(Runnable runnable) {
        this.f9898b.post(runnable);
    }

    /* renamed from: b */
    private void m14926b(Runnable runnable) {
        this.f9899c.post(runnable);
    }
}
