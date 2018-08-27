package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

/* renamed from: apl */
public class apl {
    /* renamed from: a */
    private static Object f3907a = new Object();
    /* renamed from: b */
    private static boolean f3908b;
    /* renamed from: c */
    private static String f3909c;
    /* renamed from: d */
    private static int f3910d;

    /* renamed from: a */
    public static int m4853a(Context context) {
        apl.m4854b(context);
        return f3910d;
    }

    /* renamed from: b */
    private static void m4854b(Context context) {
        synchronized (f3907a) {
            if (f3908b) {
                return;
            }
            f3908b = true;
            try {
                Bundle bundle = ato.m5611b(context).m5606a(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    return;
                }
                f3909c = bundle.getString("com.google.app.id");
                f3910d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
        }
    }
}
