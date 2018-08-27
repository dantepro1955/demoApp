package com.p000;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bme */
public final class bme extends alo<bme> {
    /* renamed from: a */
    private String f6953a;
    /* renamed from: b */
    private String f6954b;
    /* renamed from: c */
    private String f6955c;
    /* renamed from: d */
    private String f6956d;
    /* renamed from: e */
    private String f6957e;
    /* renamed from: f */
    private String f6958f;
    /* renamed from: g */
    private String f6959g;
    /* renamed from: h */
    private String f6960h;
    /* renamed from: i */
    private String f6961i;
    /* renamed from: j */
    private String f6962j;

    /* renamed from: a */
    public String m9622a() {
        return this.f6953a;
    }

    /* renamed from: a */
    public /* synthetic */ void mo1348a(alo alo) {
        m9624a((bme) alo);
    }

    /* renamed from: a */
    public void m9624a(bme bme) {
        if (!TextUtils.isEmpty(this.f6953a)) {
            bme.m9625a(this.f6953a);
        }
        if (!TextUtils.isEmpty(this.f6954b)) {
            bme.m9627b(this.f6954b);
        }
        if (!TextUtils.isEmpty(this.f6955c)) {
            bme.m9629c(this.f6955c);
        }
        if (!TextUtils.isEmpty(this.f6956d)) {
            bme.m9631d(this.f6956d);
        }
        if (!TextUtils.isEmpty(this.f6957e)) {
            bme.m9633e(this.f6957e);
        }
        if (!TextUtils.isEmpty(this.f6958f)) {
            bme.m9635f(this.f6958f);
        }
        if (!TextUtils.isEmpty(this.f6959g)) {
            bme.m9637g(this.f6959g);
        }
        if (!TextUtils.isEmpty(this.f6960h)) {
            bme.m9639h(this.f6960h);
        }
        if (!TextUtils.isEmpty(this.f6961i)) {
            bme.m9641i(this.f6961i);
        }
        if (!TextUtils.isEmpty(this.f6962j)) {
            bme.m9643j(this.f6962j);
        }
    }

    /* renamed from: a */
    public void m9625a(String str) {
        this.f6953a = str;
    }

    /* renamed from: b */
    public String m9626b() {
        return this.f6954b;
    }

    /* renamed from: b */
    public void m9627b(String str) {
        this.f6954b = str;
    }

    /* renamed from: c */
    public String m9628c() {
        return this.f6955c;
    }

    /* renamed from: c */
    public void m9629c(String str) {
        this.f6955c = str;
    }

    /* renamed from: d */
    public String m9630d() {
        return this.f6956d;
    }

    /* renamed from: d */
    public void m9631d(String str) {
        this.f6956d = str;
    }

    /* renamed from: e */
    public String m9632e() {
        return this.f6957e;
    }

    /* renamed from: e */
    public void m9633e(String str) {
        this.f6957e = str;
    }

    /* renamed from: f */
    public String m9634f() {
        return this.f6958f;
    }

    /* renamed from: f */
    public void m9635f(String str) {
        this.f6958f = str;
    }

    /* renamed from: g */
    public String m9636g() {
        return this.f6959g;
    }

    /* renamed from: g */
    public void m9637g(String str) {
        this.f6959g = str;
    }

    /* renamed from: h */
    public String m9638h() {
        return this.f6960h;
    }

    /* renamed from: h */
    public void m9639h(String str) {
        this.f6960h = str;
    }

    /* renamed from: i */
    public String m9640i() {
        return this.f6961i;
    }

    /* renamed from: i */
    public void m9641i(String str) {
        this.f6961i = str;
    }

    /* renamed from: j */
    public String m9642j() {
        return this.f6962j;
    }

    /* renamed from: j */
    public void m9643j(String str) {
        this.f6962j = str;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("name", this.f6953a);
        hashMap.put("source", this.f6954b);
        hashMap.put("medium", this.f6955c);
        hashMap.put("keyword", this.f6956d);
        hashMap.put("content", this.f6957e);
        hashMap.put("id", this.f6958f);
        hashMap.put("adNetworkId", this.f6959g);
        hashMap.put("gclid", this.f6960h);
        hashMap.put("dclid", this.f6961i);
        hashMap.put("aclid", this.f6962j);
        return alo.m2502a((Object) hashMap);
    }
}
