package com.p000;

import android.util.Pair;
import java.util.Collections;
import p000.aet.C0137a;

/* compiled from: AudioTagPayloadReader */
/* renamed from: aeq */
final class aeq extends aet {
    /* renamed from: b */
    private static final int[] f878b = new int[]{5500, 11000, 22000, 44000};
    /* renamed from: c */
    private boolean f879c;
    /* renamed from: d */
    private boolean f880d;

    public aeq(aep aep) {
        super(aep);
    }

    /* renamed from: a */
    protected boolean mo152a(ahk ahk) throws C0137a {
        if (this.f879c) {
            ahk.m1566c(1);
        } else {
            int f = ahk.m1570f();
            int i = (f >> 4) & 15;
            f = (f >> 2) & 3;
            if (f < 0 || f >= f878b.length) {
                throw new C0137a("Invalid sample rate index: " + f);
            } else if (i != 10) {
                throw new C0137a("Audio format not supported: " + i);
            } else {
                this.f879c = true;
            }
        }
        return true;
    }

    /* renamed from: a */
    protected void mo151a(ahk ahk, long j) {
        int f = ahk.m1570f();
        if (f == 0 && !this.f880d) {
            byte[] bArr = new byte[ahk.m1563b()];
            ahk.m1562a(bArr, 0, bArr.length);
            Pair a = ahd.m1520a(bArr);
            this.a.mo126a(ado.m816a(null, "audio/mp4a-latm", -1, -1, m1101a(), ((Integer) a.second).intValue(), ((Integer) a.first).intValue(), Collections.singletonList(bArr), null));
            this.f880d = true;
        } else if (f == 1) {
            int b = ahk.m1563b();
            this.a.mo127a(ahk, b);
            this.a.mo125a(j, 1, b, 0, null);
        }
    }
}
