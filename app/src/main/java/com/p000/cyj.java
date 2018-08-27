package com.p000;

import android.util.Log;

/* compiled from: L */
/* renamed from: cyj */
public final class cyj {
    /* renamed from: a */
    private static volatile boolean f20670a = false;
    /* renamed from: b */
    private static volatile boolean f20671b = true;

    /* renamed from: a */
    public static void m25644a(String str, Object... objArr) {
        if (f20670a) {
            cyj.m25643a(3, null, str, objArr);
        }
    }

    /* renamed from: b */
    public static void m25646b(String str, Object... objArr) {
        cyj.m25643a(5, null, str, objArr);
    }

    /* renamed from: a */
    public static void m25645a(Throwable th) {
        cyj.m25643a(6, th, null, new Object[0]);
    }

    /* renamed from: c */
    public static void m25647c(String str, Object... objArr) {
        cyj.m25643a(6, null, str, objArr);
    }

    /* renamed from: a */
    private static void m25643a(int i, Throwable th, String str, Object... objArr) {
        if (f20671b) {
            String format;
            if (objArr.length > 0) {
                format = String.format(str, objArr);
            } else {
                format = str;
            }
            if (th != null) {
                if (format == null) {
                    format = th.getMessage();
                }
                String stackTraceString = Log.getStackTraceString(th);
                format = String.format("%1$s\n%2$s", new Object[]{format, stackTraceString});
            }
            Log.println(i, cxe.f20525a, format);
        }
    }
}
