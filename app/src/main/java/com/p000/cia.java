package com.p000;

/* compiled from: FireLogsEvent */
/* renamed from: cia */
public class cia {
    /* renamed from: a */
    public String f9319a;
    /* renamed from: b */
    public String f9320b;
    /* renamed from: c */
    public String f9321c;
    /* renamed from: d */
    public Long f9322d;
    /* renamed from: e */
    public diu f9323e;

    public cia(String str, String str2, String str3, Long l, diu diu) {
        this.f9319a = str;
        this.f9320b = str2;
        this.f9321c = str3;
        this.f9322d = l;
        this.f9323e = diu;
    }

    public String toString() {
        return "FireLogsEvent{category='" + this.f9319a + '\'' + ", action='" + this.f9320b + '\'' + ", label='" + this.f9321c + '\'' + ", value=" + this.f9322d + ", cvars=" + this.f9323e + '}';
    }
}
