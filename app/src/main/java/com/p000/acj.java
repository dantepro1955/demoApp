package com.p000;

import io.fabric.sdk.android.Fabric;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SessionReport */
/* renamed from: acj */
class acj implements acg {
    /* renamed from: a */
    private final File f363a;
    /* renamed from: b */
    private final File[] f364b;
    /* renamed from: c */
    private final Map<String, String> f365c;

    public acj(File file) {
        this(file, Collections.emptyMap());
    }

    public acj(File file, Map<String, String> map) {
        this.f363a = file;
        this.f364b = new File[]{file};
        this.f365c = new HashMap(map);
        if (this.f363a.length() == 0) {
            this.f365c.putAll(ach.f353a);
        }
    }

    /* renamed from: c */
    public File mo19c() {
        return this.f363a;
    }

    /* renamed from: d */
    public File[] mo20d() {
        return this.f364b;
    }

    /* renamed from: a */
    public String mo17a() {
        return mo19c().getName();
    }

    /* renamed from: b */
    public String mo18b() {
        String a = mo17a();
        return a.substring(0, a.lastIndexOf(46));
    }

    /* renamed from: e */
    public Map<String, String> mo21e() {
        return Collections.unmodifiableMap(this.f365c);
    }

    /* renamed from: f */
    public void mo22f() {
        Fabric.h().a("CrashlyticsCore", "Removing report at " + this.f363a.getPath());
        this.f363a.delete();
    }
}
