package com.p000;

import android.os.Build;
import android.os.Build.VERSION;

/* renamed from: dqa */
public final class dqa {
    /* renamed from: a */
    public static final int f22560a = Integer.parseInt(VERSION.SDK);
    /* renamed from: b */
    public static final boolean f22561b;
    /* renamed from: c */
    public static final boolean f22562c;
    /* renamed from: d */
    private static boolean f22563d;
    /* renamed from: e */
    private static boolean f22564e;
    /* renamed from: f */
    private static final boolean f22565f;

    static {
        String str;
        boolean z = false;
        try {
            str = (String) Build.class.getField("MANUFACTURER").get(null);
        } catch (Exception e) {
            str = "";
        }
        String str2 = Build.MODEL;
        boolean z2 = str.equalsIgnoreCase("samsung") && (str2.equalsIgnoreCase("SGH-T959") || str2.equalsIgnoreCase("SAMSUNG-SGH-I897") || str2.equalsIgnoreCase("SGH-I897") || str2.equalsIgnoreCase("GT-I9000"));
        f22563d = z2;
        z2 = str.equalsIgnoreCase("htc") && (str2.equalsIgnoreCase("PC36100") || str2.equalsIgnoreCase("ADR6300") || str2.equalsIgnoreCase("HTC Glacier") || str2.equalsIgnoreCase("T-Mobile myTouch 4G") || str2.equalsIgnoreCase("T-Mobile G2"));
        f22561b = z2;
        f22564e = str2.equalsIgnoreCase("Motorola_i1");
        z2 = str.equalsIgnoreCase("Motorola") && str2.equalsIgnoreCase("MB860");
        f22565f = z2;
        if (str.equalsIgnoreCase("samsung")) {
            int i = f22560a;
        }
        if (f22563d || f22564e) {
            z = true;
        }
        f22562c = z;
        boolean z3 = f22563d;
        z3 = f22565f;
    }
}
