package com.p000;

import android.content.Context;

/* renamed from: atm */
public class atm {
    /* renamed from: a */
    private static Context f4335a;
    /* renamed from: b */
    private static Boolean f4336b;

    /* renamed from: a */
    public static synchronized boolean m5603a(Context context) {
        boolean booleanValue;
        synchronized (atm.class) {
            Context applicationContext = context.getApplicationContext();
            if (f4335a == null || f4336b == null || f4335a != applicationContext) {
                f4336b = null;
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f4336b = Boolean.valueOf(true);
                } catch (ClassNotFoundException e) {
                    f4336b = Boolean.valueOf(false);
                }
                f4335a = applicationContext;
                booleanValue = f4336b.booleanValue();
            } else {
                booleanValue = f4336b.booleanValue();
            }
        }
        return booleanValue;
    }
}
