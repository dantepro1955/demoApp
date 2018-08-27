package com.p000;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: Piwik */
/* renamed from: dtb */
public class dtb {
    /* renamed from: d */
    private static dtb f22873d;
    /* renamed from: a */
    private final Context f22874a;
    /* renamed from: b */
    private boolean f22875b = false;
    /* renamed from: c */
    private boolean f22876c = false;
    /* renamed from: e */
    private boolean f22877e = false;
    /* renamed from: f */
    private final SharedPreferences f22878f;

    /* renamed from: a */
    public static synchronized dtb m29229a(Context context) {
        dtb dtb;
        synchronized (dtb.class) {
            if (f22873d == null) {
                f22873d = new dtb(context);
            }
            dtb = f22873d;
        }
        return dtb;
    }

    private dtb(Context context) {
        this.f22874a = context.getApplicationContext();
        this.f22878f = m29230a().getSharedPreferences("org.piwik.sdk", 0);
        this.f22875b = m29234e().getBoolean("piwik.optout", false);
    }

    /* renamed from: a */
    protected Context m29230a() {
        return this.f22874a;
    }

    /* renamed from: b */
    public boolean m29231b() {
        return this.f22875b;
    }

    /* renamed from: c */
    public boolean m29232c() {
        return this.f22876c;
    }

    /* renamed from: d */
    public String m29233d() {
        return m29230a().getPackageName();
    }

    /* renamed from: e */
    public SharedPreferences m29234e() {
        return this.f22878f;
    }
}
