package com.p000;

import android.content.Context;
import android.text.TextUtils;
import com.inmobi.commons.analytics.iat.impl.AdTrackerConstants;
import java.math.BigInteger;
import java.util.Locale;

@bhd
/* renamed from: bka */
public final class bka {
    /* renamed from: a */
    private static final Object f6652a = new Object();
    /* renamed from: b */
    private static String f6653b;

    /* renamed from: a */
    public static String m9001a() {
        String str;
        synchronized (f6652a) {
            str = f6653b;
        }
        return str;
    }

    /* renamed from: a */
    public static String m9002a(Context context, String str, String str2) {
        String str3;
        synchronized (f6652a) {
            if (f6653b == null && !TextUtils.isEmpty(str)) {
                bka.m9003b(context, str, str2);
            }
            str3 = f6653b;
        }
        return str3;
    }

    /* renamed from: b */
    private static void m9003b(Context context, String str, String str2) {
        try {
            ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
            Class cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
            BigInteger bigInteger = new BigInteger(new byte[1]);
            String[] split = str.split(",");
            BigInteger bigInteger2 = bigInteger;
            for (int i = 0; i < split.length; i++) {
                if (ako.m2343e().m9115a(classLoader, cls, split[i])) {
                    bigInteger2 = bigInteger2.setBit(i);
                }
            }
            f6653b = String.format(Locale.US, "%X", new Object[]{bigInteger2});
        } catch (Throwable th) {
            f6653b = AdTrackerConstants.ERROR;
        }
    }
}
