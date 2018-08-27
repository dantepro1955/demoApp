package com.p000;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

/* renamed from: aps */
public class aps {
    /* renamed from: a */
    public static boolean m4873a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            return (ato.m5611b(context).m5606a(str, 0).flags & 2097152) != 0;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
