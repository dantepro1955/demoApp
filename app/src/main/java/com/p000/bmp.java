package com.p000;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bmp */
public final class bmp extends alo<bmp> {
    /* renamed from: a */
    public String f7000a;
    /* renamed from: b */
    public long f7001b;
    /* renamed from: c */
    public String f7002c;
    /* renamed from: d */
    public String f7003d;

    /* renamed from: a */
    public String m9731a() {
        return this.f7000a;
    }

    /* renamed from: a */
    public void m9732a(long j) {
        this.f7001b = j;
    }

    /* renamed from: a */
    public /* synthetic */ void mo1348a(alo alo) {
        m9734a((bmp) alo);
    }

    /* renamed from: a */
    public void m9734a(bmp bmp) {
        if (!TextUtils.isEmpty(this.f7000a)) {
            bmp.m9735a(this.f7000a);
        }
        if (this.f7001b != 0) {
            bmp.m9732a(this.f7001b);
        }
        if (!TextUtils.isEmpty(this.f7002c)) {
            bmp.m9737b(this.f7002c);
        }
        if (!TextUtils.isEmpty(this.f7003d)) {
            bmp.m9739c(this.f7003d);
        }
    }

    /* renamed from: a */
    public void m9735a(String str) {
        this.f7000a = str;
    }

    /* renamed from: b */
    public long m9736b() {
        return this.f7001b;
    }

    /* renamed from: b */
    public void m9737b(String str) {
        this.f7002c = str;
    }

    /* renamed from: c */
    public String m9738c() {
        return this.f7002c;
    }

    /* renamed from: c */
    public void m9739c(String str) {
        this.f7003d = str;
    }

    /* renamed from: d */
    public String m9740d() {
        return this.f7003d;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("variableName", this.f7000a);
        hashMap.put("timeInMillis", Long.valueOf(this.f7001b));
        hashMap.put("category", this.f7002c);
        hashMap.put("label", this.f7003d);
        return alo.m2502a((Object) hashMap);
    }
}
