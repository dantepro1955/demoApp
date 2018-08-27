package com.p000;

/* renamed from: bod */
class bod {
    /* renamed from: a */
    private final apt f7240a;
    /* renamed from: b */
    private long f7241b;

    public bod(apt apt) {
        aoi.m4679a((Object) apt);
        this.f7240a = apt;
    }

    public bod(apt apt, long j) {
        aoi.m4679a((Object) apt);
        this.f7240a = apt;
        this.f7241b = j;
    }

    /* renamed from: a */
    public void m10112a() {
        this.f7241b = this.f7240a.mo607b();
    }

    /* renamed from: a */
    public boolean m10113a(long j) {
        return this.f7241b == 0 || this.f7240a.mo607b() - this.f7241b > j;
    }

    /* renamed from: b */
    public void m10114b() {
        this.f7241b = 0;
    }
}
