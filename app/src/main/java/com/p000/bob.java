package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: bob */
public final class bob {
    /* renamed from: a */
    static Object f7228a = new Object();
    /* renamed from: b */
    static avu f7229b;
    /* renamed from: c */
    static Boolean f7230c;

    /* renamed from: a */
    public static boolean m10100a(Context context) {
        aoi.m4679a((Object) context);
        if (f7230c != null) {
            return f7230c.booleanValue();
        }
        boolean a = bof.m10138a(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        f7230c = Boolean.valueOf(a);
        return a;
    }

    /* renamed from: a */
    public void m10101a(Context context, Intent intent) {
        bnx f = bmw.m9764a(context).m9771f();
        if (intent == null) {
            f.zzbS("AnalyticsReceiver called with null intent");
            return;
        }
        String action = intent.getAction();
        f.zza("Local AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean a = boc.m10106a(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (f7228a) {
                context.startService(intent2);
                if (a) {
                    try {
                        if (f7229b == null) {
                            f7229b = new avu(context, 1, "Analytics WakeLock");
                            f7229b.m6070a(false);
                        }
                        f7229b.m6068a(1000);
                    } catch (SecurityException e) {
                        f.zzbS("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                    return;
                }
            }
        }
    }
}
