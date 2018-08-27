package com.p000;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bmm */
public final class bmm extends alo<bmm> {
    /* renamed from: a */
    private String f6982a;
    /* renamed from: b */
    private String f6983b;
    /* renamed from: c */
    private String f6984c;
    /* renamed from: d */
    private String f6985d;
    /* renamed from: e */
    private boolean f6986e;
    /* renamed from: f */
    private String f6987f;
    /* renamed from: g */
    private boolean f6988g;
    /* renamed from: h */
    private double f6989h;

    /* renamed from: a */
    public String m9692a() {
        return this.f6982a;
    }

    /* renamed from: a */
    public void m9693a(double d) {
        boolean z = d >= 0.0d && d <= 100.0d;
        aoi.m4689b(z, "Sample rate must be between 0% and 100%");
        this.f6989h = d;
    }

    /* renamed from: a */
    public /* synthetic */ void mo1348a(alo alo) {
        m9695a((bmm) alo);
    }

    /* renamed from: a */
    public void m9695a(bmm bmm) {
        if (!TextUtils.isEmpty(this.f6982a)) {
            bmm.m9696a(this.f6982a);
        }
        if (!TextUtils.isEmpty(this.f6983b)) {
            bmm.m9699b(this.f6983b);
        }
        if (!TextUtils.isEmpty(this.f6984c)) {
            bmm.m9702c(this.f6984c);
        }
        if (!TextUtils.isEmpty(this.f6985d)) {
            bmm.m9704d(this.f6985d);
        }
        if (this.f6986e) {
            bmm.m9697a(true);
        }
        if (!TextUtils.isEmpty(this.f6987f)) {
            bmm.m9705e(this.f6987f);
        }
        if (this.f6988g) {
            bmm.m9700b(this.f6988g);
        }
        if (this.f6989h != 0.0d) {
            bmm.m9693a(this.f6989h);
        }
    }

    /* renamed from: a */
    public void m9696a(String str) {
        this.f6982a = str;
    }

    /* renamed from: a */
    public void m9697a(boolean z) {
        this.f6986e = z;
    }

    /* renamed from: b */
    public String m9698b() {
        return this.f6983b;
    }

    /* renamed from: b */
    public void m9699b(String str) {
        this.f6983b = str;
    }

    /* renamed from: b */
    public void m9700b(boolean z) {
        this.f6988g = z;
    }

    /* renamed from: c */
    public String m9701c() {
        return this.f6984c;
    }

    /* renamed from: c */
    public void m9702c(String str) {
        this.f6984c = str;
    }

    /* renamed from: d */
    public String m9703d() {
        return this.f6985d;
    }

    /* renamed from: d */
    public void m9704d(String str) {
        this.f6985d = str;
    }

    /* renamed from: e */
    public void m9705e(String str) {
        this.f6987f = str;
    }

    /* renamed from: e */
    public boolean m9706e() {
        return this.f6986e;
    }

    /* renamed from: f */
    public String m9707f() {
        return this.f6987f;
    }

    /* renamed from: g */
    public boolean m9708g() {
        return this.f6988g;
    }

    /* renamed from: h */
    public double m9709h() {
        return this.f6989h;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("hitType", this.f6982a);
        hashMap.put("clientId", this.f6983b);
        hashMap.put("userId", this.f6984c);
        hashMap.put("androidAdId", this.f6985d);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.f6986e));
        hashMap.put("sessionControl", this.f6987f);
        hashMap.put("nonInteraction", Boolean.valueOf(this.f6988g));
        hashMap.put("sampleRate", Double.valueOf(this.f6989h));
        return alo.m2502a((Object) hashMap);
    }
}
