package com.p000;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bmi */
public final class bmi extends alo<bmi> {
    /* renamed from: a */
    public int f6966a;
    /* renamed from: b */
    public int f6967b;
    /* renamed from: c */
    public int f6968c;
    /* renamed from: d */
    public int f6969d;
    /* renamed from: e */
    public int f6970e;
    /* renamed from: f */
    private String f6971f;

    /* renamed from: a */
    public int m9655a() {
        return this.f6966a;
    }

    /* renamed from: a */
    public void m9656a(int i) {
        this.f6966a = i;
    }

    /* renamed from: a */
    public /* synthetic */ void mo1348a(alo alo) {
        m9658a((bmi) alo);
    }

    /* renamed from: a */
    public void m9658a(bmi bmi) {
        if (this.f6966a != 0) {
            bmi.m9656a(this.f6966a);
        }
        if (this.f6967b != 0) {
            bmi.m9661b(this.f6967b);
        }
        if (this.f6968c != 0) {
            bmi.m9663c(this.f6968c);
        }
        if (this.f6969d != 0) {
            bmi.m9665d(this.f6969d);
        }
        if (this.f6970e != 0) {
            bmi.m9667e(this.f6970e);
        }
        if (!TextUtils.isEmpty(this.f6971f)) {
            bmi.m9659a(this.f6971f);
        }
    }

    /* renamed from: a */
    public void m9659a(String str) {
        this.f6971f = str;
    }

    /* renamed from: b */
    public int m9660b() {
        return this.f6967b;
    }

    /* renamed from: b */
    public void m9661b(int i) {
        this.f6967b = i;
    }

    /* renamed from: c */
    public int m9662c() {
        return this.f6968c;
    }

    /* renamed from: c */
    public void m9663c(int i) {
        this.f6968c = i;
    }

    /* renamed from: d */
    public int m9664d() {
        return this.f6969d;
    }

    /* renamed from: d */
    public void m9665d(int i) {
        this.f6969d = i;
    }

    /* renamed from: e */
    public int m9666e() {
        return this.f6970e;
    }

    /* renamed from: e */
    public void m9667e(int i) {
        this.f6970e = i;
    }

    /* renamed from: f */
    public String m9668f() {
        return this.f6971f;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("language", this.f6971f);
        hashMap.put("screenColors", Integer.valueOf(this.f6966a));
        hashMap.put("screenWidth", Integer.valueOf(this.f6967b));
        hashMap.put("screenHeight", Integer.valueOf(this.f6968c));
        hashMap.put("viewportWidth", Integer.valueOf(this.f6969d));
        hashMap.put("viewportHeight", Integer.valueOf(this.f6970e));
        return alo.m2502a((Object) hashMap);
    }
}
