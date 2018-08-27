package com.p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

/* renamed from: bog */
public class bog extends bmu {
    /* renamed from: a */
    protected String f7250a;
    /* renamed from: b */
    protected String f7251b;
    /* renamed from: c */
    protected int f7252c;
    /* renamed from: d */
    protected boolean f7253d;
    /* renamed from: e */
    protected int f7254e;
    /* renamed from: f */
    protected boolean f7255f;
    /* renamed from: g */
    protected boolean f7256g;

    public bog(bmw bmw) {
        super(bmw);
    }

    /* renamed from: a */
    private static int m10144a(String str) {
        String toLowerCase = str.toLowerCase();
        return "verbose".equals(toLowerCase) ? 0 : "info".equals(toLowerCase) ? 1 : "warning".equals(toLowerCase) ? 2 : "error".equals(toLowerCase) ? 3 : -1;
    }

    /* renamed from: a */
    public String m10145a() {
        zzob();
        return this.f7250a;
    }

    /* renamed from: a */
    void m10146a(bnr bnr) {
        int a;
        zzbP("Loading global XML config values");
        if (bnr.m9992a()) {
            String b = bnr.m9993b();
            this.f7251b = b;
            zzb("XML config - app name", b);
        }
        if (bnr.m9994c()) {
            b = bnr.m9995d();
            this.f7250a = b;
            zzb("XML config - app version", b);
        }
        if (bnr.m9996e()) {
            a = bog.m10144a(bnr.m9997f());
            if (a >= 0) {
                this.f7252c = a;
                zza("XML config - log level", Integer.valueOf(a));
            }
        }
        if (bnr.m9998g()) {
            a = bnr.m9999h();
            this.f7254e = a;
            this.f7253d = true;
            zzb("XML config - dispatch period (sec)", Integer.valueOf(a));
        }
        if (bnr.m10000i()) {
            boolean j = bnr.m10001j();
            this.f7256g = j;
            this.f7255f = true;
            zzb("XML config - dry run", Boolean.valueOf(j));
        }
    }

    /* renamed from: b */
    public String m10147b() {
        zzob();
        return this.f7251b;
    }

    /* renamed from: c */
    public boolean m10148c() {
        zzob();
        return false;
    }

    /* renamed from: d */
    public boolean m10149d() {
        zzob();
        return this.f7253d;
    }

    /* renamed from: e */
    public int m10150e() {
        zzob();
        return this.f7254e;
    }

    /* renamed from: f */
    public boolean m10151f() {
        zzob();
        return this.f7255f;
    }

    /* renamed from: g */
    public boolean m10152g() {
        zzob();
        return this.f7256g;
    }

    /* renamed from: h */
    protected void m10153h() {
        ApplicationInfo applicationInfo;
        Context context = getContext();
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 129);
        } catch (NameNotFoundException e) {
            zzd("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            zzbS("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            int i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource");
            if (i > 0) {
                bnr bnr = (bnr) new bnq(zznQ()).m9931a(i);
                if (bnr != null) {
                    m10146a(bnr);
                }
            }
        }
    }

    protected void zzmS() {
        m10153h();
    }
}
