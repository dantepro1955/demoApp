package com.p000;

import android.util.Log;

@Deprecated
/* renamed from: bnw */
public class bnw {
    /* renamed from: a */
    private static volatile ale f7187a;

    static {
        bnw.m10033a(new bnj());
    }

    /* renamed from: a */
    public static ale m10032a() {
        return f7187a;
    }

    /* renamed from: a */
    public static void m10033a(ale ale) {
        f7187a = ale;
    }

    /* renamed from: a */
    public static void m10034a(String str) {
        bnx a = bnx.m10038a();
        if (a != null) {
            a.zzbP(str);
        } else if (bnw.m10036a(0)) {
            Log.v((String) bnp.f7133c.m9985a(), str);
        }
        ale ale = f7187a;
        if (ale != null) {
            ale.mo1353a(str);
        }
    }

    /* renamed from: a */
    public static void m10035a(String str, Object obj) {
        bnx a = bnx.m10038a();
        if (a != null) {
            a.zze(str, obj);
        } else if (bnw.m10036a(3)) {
            String stringBuilder;
            if (obj != null) {
                String valueOf = String.valueOf(obj);
                stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length()).append(str).append(":").append(valueOf).toString();
            } else {
                stringBuilder = str;
            }
            Log.e((String) bnp.f7133c.m9985a(), stringBuilder);
        }
        ale ale = f7187a;
        if (ale != null) {
            ale.mo1355c(str);
        }
    }

    /* renamed from: a */
    public static boolean m10036a(int i) {
        return bnw.m10032a() != null && bnw.m10032a().mo1352a() <= i;
    }

    /* renamed from: b */
    public static void m10037b(String str) {
        bnx a = bnx.m10038a();
        if (a != null) {
            a.zzbS(str);
        } else if (bnw.m10036a(2)) {
            Log.w((String) bnp.f7133c.m9985a(), str);
        }
        ale ale = f7187a;
        if (ale != null) {
            ale.mo1354b(str);
        }
    }
}
