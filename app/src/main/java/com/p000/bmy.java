package com.p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bmy */
public class bmy {
    /* renamed from: a */
    private final long f7044a;
    /* renamed from: b */
    private final String f7045b;
    /* renamed from: c */
    private final String f7046c;
    /* renamed from: d */
    private final boolean f7047d;
    /* renamed from: e */
    private long f7048e;
    /* renamed from: f */
    private final Map<String, String> f7049f;

    public bmy(long j, String str, String str2, boolean z, long j2, Map<String, String> map) {
        aoi.m4681a(str);
        aoi.m4681a(str2);
        this.f7044a = j;
        this.f7045b = str;
        this.f7046c = str2;
        this.f7047d = z;
        this.f7048e = j2;
        if (map != null) {
            this.f7049f = new HashMap(map);
        } else {
            this.f7049f = Collections.emptyMap();
        }
    }

    /* renamed from: a */
    public long m9805a() {
        return this.f7044a;
    }

    /* renamed from: a */
    public void m9806a(long j) {
        this.f7048e = j;
    }

    /* renamed from: b */
    public String m9807b() {
        return this.f7045b;
    }

    /* renamed from: c */
    public String m9808c() {
        return this.f7046c;
    }

    /* renamed from: d */
    public boolean m9809d() {
        return this.f7047d;
    }

    /* renamed from: e */
    public long m9810e() {
        return this.f7048e;
    }

    /* renamed from: f */
    public Map<String, String> m9811f() {
        return this.f7049f;
    }
}
