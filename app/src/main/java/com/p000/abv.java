package com.p000;

import io.fabric.sdk.android.Fabric;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: InvalidSessionReport */
/* renamed from: abv */
class abv implements acg {
    /* renamed from: a */
    private final File[] f290a;
    /* renamed from: b */
    private final Map<String, String> f291b = new HashMap(ach.f353a);
    /* renamed from: c */
    private final String f292c;

    public abv(String str, File[] fileArr) {
        this.f290a = fileArr;
        this.f292c = str;
    }

    /* renamed from: a */
    public String mo17a() {
        return this.f290a[0].getName();
    }

    /* renamed from: b */
    public String mo18b() {
        return this.f292c;
    }

    /* renamed from: c */
    public File mo19c() {
        return this.f290a[0];
    }

    /* renamed from: d */
    public File[] mo20d() {
        return this.f290a;
    }

    /* renamed from: e */
    public Map<String, String> mo21e() {
        return Collections.unmodifiableMap(this.f291b);
    }

    /* renamed from: f */
    public void mo22f() {
        for (File file : this.f290a) {
            Fabric.h().a("CrashlyticsCore", "Removing invalid report file at " + file.getPath());
            file.delete();
        }
    }
}
