package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

/* renamed from: apw */
public final class apw {
    /* renamed from: a */
    private static Boolean f3930a;
    /* renamed from: b */
    private static Boolean f3931b;
    /* renamed from: c */
    private static Boolean f3932c;

    /* renamed from: a */
    public static boolean m4889a() {
        boolean z = aqo.zzayx;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    /* renamed from: a */
    public static boolean m4890a(Context context) {
        if (f3930a == null) {
            boolean z = aqd.m4918h() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
            f3930a = Boolean.valueOf(z);
        }
        return f3930a.booleanValue();
    }

    @TargetApi(24)
    /* renamed from: b */
    public static boolean m4891b(Context context) {
        return (!aqd.m4922l() || apw.m4892c(context)) && apw.m4890a(context);
    }

    @TargetApi(21)
    /* renamed from: c */
    public static boolean m4892c(Context context) {
        if (f3931b == null) {
            boolean z = aqd.m4920j() && context.getPackageManager().hasSystemFeature("cn.google");
            f3931b = Boolean.valueOf(z);
        }
        return f3931b.booleanValue();
    }

    /* renamed from: d */
    public static boolean m4893d(Context context) {
        if (f3932c == null) {
            f3932c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return f3932c.booleanValue();
    }
}
