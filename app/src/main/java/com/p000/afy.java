package com.p000;

/* compiled from: SeiReader */
/* renamed from: afy */
final class afy {
    /* renamed from: a */
    private final aep f1214a;

    public afy(aep aep) {
        this.f1214a = aep;
        aep.mo126a(ado.m818a(null, "application/eia-608", -1, -1, null));
    }

    /* renamed from: a */
    public void m1354a(long j, ahk ahk) {
        while (ahk.m1563b() > 1) {
            int f;
            int i = 0;
            do {
                f = ahk.m1570f();
                i += f;
            } while (f == 255);
            int i2 = 0;
            do {
                f = ahk.m1570f();
                i2 += f;
            } while (f == 255);
            if (agj.m1457a(i, i2, ahk)) {
                this.f1214a.mo127a(ahk, i2);
                this.f1214a.mo125a(j, 1, i2, 0, null);
            } else {
                ahk.m1566c(i2);
            }
        }
    }
}
