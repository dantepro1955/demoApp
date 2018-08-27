package com.p000;

import p000.bin.C1236a;

@bhd
/* renamed from: bik */
public class bik extends C1236a {
    /* renamed from: a */
    private final String f6451a;
    /* renamed from: b */
    private final int f6452b;

    public bik(String str, int i) {
        this.f6451a = str;
        this.f6452b = i;
    }

    /* renamed from: a */
    public String mo1203a() {
        return this.f6451a;
    }

    /* renamed from: b */
    public int mo1204b() {
        return this.f6452b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bik)) {
            return false;
        }
        bik bik = (bik) obj;
        return aoh.m4677a(mo1203a(), bik.mo1203a()) && aoh.m4677a(Integer.valueOf(mo1204b()), Integer.valueOf(bik.mo1204b()));
    }
}
