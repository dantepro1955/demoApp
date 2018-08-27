package com.p000;

import java.util.Collections;
import java.util.Map;

/* renamed from: avg */
public interface avg {

    /* renamed from: avg$a */
    public static class C0846a {
        /* renamed from: a */
        public byte[] f4658a;
        /* renamed from: b */
        public String f4659b;
        /* renamed from: c */
        public long f4660c;
        /* renamed from: d */
        public long f4661d;
        /* renamed from: e */
        public long f4662e;
        /* renamed from: f */
        public long f4663f;
        /* renamed from: g */
        public Map<String, String> f4664g = Collections.emptyMap();

        /* renamed from: a */
        public boolean m5984a() {
            return this.f4662e < System.currentTimeMillis();
        }

        /* renamed from: b */
        public boolean m5985b() {
            return this.f4663f < System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    C0846a mo1380a(String str);

    /* renamed from: a */
    void mo1381a();

    /* renamed from: a */
    void mo1382a(String str, C0846a c0846a);
}
