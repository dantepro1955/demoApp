package com.p000;

import android.util.Log;

/* compiled from: AppAuthLogger */
/* renamed from: cjq */
public class cjq implements dig {
    /* renamed from: a */
    private static final boolean f9432a = dik.f21704a;
    /* renamed from: b */
    private static final cjq f9433b = new cjq();

    /* renamed from: a */
    public static cjq m14085a() {
        return f9433b;
    }

    /* renamed from: a */
    public void m14086a(String str) {
        chn.m13420i(str);
        if (f9432a) {
            Log.d("AppAuthLogger", "logGplusAuthEvent: " + str);
        }
    }

    /* renamed from: b */
    public void m14087b(String str) {
        chn.m13438o(str);
        chn.m13445q("Auth", "GPlusLoginFail");
        if (f9432a) {
            Log.d("AppAuthLogger", "logGplusLoginFail: " + str);
        }
    }

    /* renamed from: c */
    public void m14088c(String str) {
        chn.m13417h(str);
        if (f9432a) {
            Log.d("AppAuthLogger", "logFacebookAuthEvent: " + str);
        }
    }

    /* renamed from: d */
    public void m14089d(String str) {
        chn.m13441p(str);
        if (f9432a) {
            Log.d("AppAuthLogger", "logFbLoginFail: " + str);
        }
    }
}
