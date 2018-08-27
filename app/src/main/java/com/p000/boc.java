package com.p000;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: boc */
public final class boc {
    /* renamed from: d */
    private static Boolean f7236d;
    /* renamed from: a */
    private final Handler f7237a = new Handler();
    /* renamed from: b */
    private final C1371a f7238b;
    /* renamed from: c */
    private final Context f7239c;

    /* renamed from: boc$a */
    public interface C1371a {
        /* renamed from: a */
        Context mo3124a();

        /* renamed from: a */
        boolean mo3125a(int i);
    }

    public boc(C1371a c1371a) {
        this.f7239c = c1371a.mo3124a();
        aoi.m4679a(this.f7239c);
        this.f7238b = c1371a;
    }

    /* renamed from: a */
    public static boolean m10106a(Context context) {
        aoi.m4679a((Object) context);
        if (f7236d != null) {
            return f7236d.booleanValue();
        }
        boolean a = bof.m10137a(context, "com.google.android.gms.analytics.AnalyticsService");
        f7236d = Boolean.valueOf(a);
        return a;
    }

    /* renamed from: c */
    private void m10108c() {
        try {
            synchronized (bob.f7228a) {
                avu avu = bob.f7229b;
                if (avu != null && avu.m6071b()) {
                    avu.m6067a();
                }
            }
        } catch (SecurityException e) {
        }
    }

    /* renamed from: a */
    public int m10109a(Intent intent, int i, final int i2) {
        m10108c();
        final bmw a = bmw.m9764a(this.f7239c);
        final bnx f = a.m9771f();
        if (intent == null) {
            f.zzbS("AnalyticsService started with null intent");
        } else {
            String action = intent.getAction();
            f.zza("Local AnalyticsService called. startId, action", Integer.valueOf(i2), action);
            if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
                a.m9774i().m9754a(new bnn(this) {
                    /* renamed from: d */
                    final /* synthetic */ boc f7235d;

                    /* renamed from: boc$1$1 */
                    class C13691 implements Runnable {
                        /* renamed from: a */
                        final /* synthetic */ C13701 f7231a;

                        C13691(C13701 c13701) {
                            this.f7231a = c13701;
                        }

                        public void run() {
                            if (this.f7231a.f7235d.f7238b.mo3125a(i2)) {
                                f.zzbP("Local AnalyticsService processed last dispatch request");
                            }
                        }
                    }

                    /* renamed from: a */
                    public void mo1351a(Throwable th) {
                        this.f7235d.f7237a.post(new C13691(this));
                    }
                });
            }
        }
        return 2;
    }

    /* renamed from: a */
    public void m10110a() {
        bmw.m9764a(this.f7239c).m9771f().zzbP("Local AnalyticsService is starting up");
    }

    /* renamed from: b */
    public void m10111b() {
        bmw.m9764a(this.f7239c).m9771f().zzbP("Local AnalyticsService is shutting down");
    }
}
