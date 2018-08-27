package com.p000;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bmd */
public final class bmd extends alo<bmd> {
    /* renamed from: a */
    private String f6949a;
    /* renamed from: b */
    private String f6950b;
    /* renamed from: c */
    private String f6951c;
    /* renamed from: d */
    private String f6952d;

    /* renamed from: a */
    public String m9612a() {
        return this.f6949a;
    }

    /* renamed from: a */
    public /* synthetic */ void mo1348a(alo alo) {
        m9614a((bmd) alo);
    }

    /* renamed from: a */
    public void m9614a(bmd bmd) {
        if (!TextUtils.isEmpty(this.f6949a)) {
            bmd.m9615a(this.f6949a);
        }
        if (!TextUtils.isEmpty(this.f6950b)) {
            bmd.m9617b(this.f6950b);
        }
        if (!TextUtils.isEmpty(this.f6951c)) {
            bmd.m9619c(this.f6951c);
        }
        if (!TextUtils.isEmpty(this.f6952d)) {
            bmd.m9621d(this.f6952d);
        }
    }

    /* renamed from: a */
    public void m9615a(String str) {
        this.f6949a = str;
    }

    /* renamed from: b */
    public String m9616b() {
        return this.f6950b;
    }

    /* renamed from: b */
    public void m9617b(String str) {
        this.f6950b = str;
    }

    /* renamed from: c */
    public String m9618c() {
        return this.f6951c;
    }

    /* renamed from: c */
    public void m9619c(String str) {
        this.f6951c = str;
    }

    /* renamed from: d */
    public String m9620d() {
        return this.f6952d;
    }

    /* renamed from: d */
    public void m9621d(String str) {
        this.f6952d = str;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("appName", this.f6949a);
        hashMap.put("appVersion", this.f6950b);
        hashMap.put("appId", this.f6951c);
        hashMap.put("appInstallerId", this.f6952d);
        return alo.m2502a((Object) hashMap);
    }
}
