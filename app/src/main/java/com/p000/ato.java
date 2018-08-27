package com.p000;

import android.content.Context;

/* renamed from: ato */
public class ato {
    /* renamed from: b */
    private static ato f4338b = new ato();
    /* renamed from: a */
    private atn f4339a = null;

    /* renamed from: b */
    public static atn m5611b(Context context) {
        return f4338b.m5612a(context);
    }

    /* renamed from: a */
    public synchronized atn m5612a(Context context) {
        if (this.f4339a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f4339a = new atn(context);
        }
        return this.f4339a;
    }
}
