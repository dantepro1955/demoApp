package com.p000;

import android.content.Context;
import android.util.Log;

/* renamed from: zl */
public abstract class zl {
    /* renamed from: a */
    private static zl[] f25720a = new zl[0];
    /* renamed from: b */
    private static final Object f25721b = new Object();

    /* renamed from: b */
    public static zl m34378b(String str, zm zmVar, Context context) {
        zl zlVar;
        synchronized (f25721b) {
            if (f25720a.length == 1 && f25720a[0].mo5557a().equals(str)) {
                zlVar = f25720a[0];
            } else {
                for (zl zlVar2 : f25720a) {
                    if (zlVar2.mo5557a().equals(str)) {
                        break;
                    }
                }
                try {
                    zlVar2 = new vm();
                    zlVar2.m34393a(str, zmVar, context.getApplicationContext());
                    zlVar2.m34394a(zlVar2.m34395a(context));
                    Object obj = new zl[(f25720a.length + 1)];
                    System.arraycopy(f25720a, 0, obj, 0, f25720a.length);
                    obj[f25720a.length] = zlVar2;
                    f25720a = obj;
                } catch (Throwable th) {
                    Log.e("AppLovinSdk", "Failed to build AppLovin SDK. Try cleaning application data and starting the application again.", th);
                    RuntimeException runtimeException = new RuntimeException("Unable to build AppLovin SDK");
                }
            }
        }
        return zlVar2;
    }

    /* renamed from: b */
    public static void m34379b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        zl c = zl.m34380c(context);
        if (c != null) {
            c.mo5562k();
        } else {
            Log.e("AppLovinSdk", "Unable to initialize AppLovin SDK: SDK object not created");
        }
    }

    /* renamed from: c */
    public static zl m34380c(Context context) {
        if (context != null) {
            return zl.m34378b(zn.m34833a(context), zn.m34838b(context), context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    /* renamed from: a */
    public abstract String mo5557a();

    /* renamed from: c */
    public abstract boolean mo5558c();

    /* renamed from: d */
    public abstract zc mo5559d();

    /* renamed from: e */
    public abstract zo mo5560e();

    /* renamed from: g */
    public abstract zi mo5561g();

    /* renamed from: k */
    public abstract void mo5562k();

    /* renamed from: r */
    public abstract yx mo5563r();

    /* renamed from: z */
    public abstract zk mo5564z();
}
