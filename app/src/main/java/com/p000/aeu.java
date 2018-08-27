package com.p000;

import java.util.ArrayList;
import java.util.List;
import p000.aet.C0137a;
import p000.ahd.C0174a;

/* compiled from: VideoTagPayloadReader */
/* renamed from: aeu */
final class aeu extends aet {
    /* renamed from: b */
    private final ahk f900b = new ahk(ahi.f1485a);
    /* renamed from: c */
    private final ahk f901c = new ahk(4);
    /* renamed from: d */
    private int f902d;
    /* renamed from: e */
    private boolean f903e;
    /* renamed from: f */
    private int f904f;

    /* compiled from: VideoTagPayloadReader */
    /* renamed from: aeu$a */
    static final class C0138a {
        /* renamed from: a */
        public final List<byte[]> f895a;
        /* renamed from: b */
        public final int f896b;
        /* renamed from: c */
        public final float f897c;
        /* renamed from: d */
        public final int f898d;
        /* renamed from: e */
        public final int f899e;

        public C0138a(List<byte[]> list, int i, int i2, int i3, float f) {
            this.f895a = list;
            this.f896b = i;
            this.f897c = f;
            this.f898d = i2;
            this.f899e = i3;
        }
    }

    public aeu(aep aep) {
        super(aep);
    }

    /* renamed from: a */
    protected boolean mo152a(ahk ahk) throws C0137a {
        int f = ahk.m1570f();
        int i = (f >> 4) & 15;
        f &= 15;
        if (f != 7) {
            throw new C0137a("Video format not supported: " + f);
        }
        this.f904f = i;
        return i != 5;
    }

    /* renamed from: a */
    protected void mo151a(ahk ahk, long j) throws adq {
        int f = ahk.m1570f();
        long i = j + (((long) ahk.m1573i()) * 1000);
        if (f == 0 && !this.f903e) {
            ahk ahk2 = new ahk(new byte[ahk.m1563b()]);
            ahk.m1562a(ahk2.f1493a, 0, ahk.m1563b());
            C0138a b = m1130b(ahk2);
            this.f902d = b.f896b;
            this.a.mo126a(ado.m815a(null, "video/avc", -1, -1, m1101a(), b.f898d, b.f899e, b.f895a, -1, b.f897c));
            this.f903e = true;
        } else if (f == 1) {
            byte[] bArr = this.f901c.f1493a;
            bArr[0] = (byte) 0;
            bArr[1] = (byte) 0;
            bArr[2] = (byte) 0;
            f = 4 - this.f902d;
            int i2 = 0;
            while (ahk.m1563b() > 0) {
                ahk.m1562a(this.f901c.f1493a, f, this.f902d);
                this.f901c.m1564b(0);
                int o = this.f901c.m1579o();
                this.f900b.m1564b(0);
                this.a.mo127a(this.f900b, 4);
                int i3 = i2 + 4;
                this.a.mo127a(ahk, o);
                i2 = i3 + o;
            }
            this.a.mo125a(i, this.f904f == 1 ? 1 : 0, i2, 0, null);
        }
    }

    /* renamed from: b */
    private C0138a m1130b(ahk ahk) throws adq {
        boolean z;
        int i;
        int i2;
        int i3 = -1;
        ahk.m1564b(4);
        int f = (ahk.m1570f() & 3) + 1;
        if (f != 3) {
            z = true;
        } else {
            z = false;
        }
        ahb.m1516b(z);
        List arrayList = new ArrayList();
        int f2 = ahk.m1570f() & 31;
        for (i = 0; i < f2; i++) {
            arrayList.add(ahi.m1542a(ahk));
        }
        int f3 = ahk.m1570f();
        for (i = 0; i < f3; i++) {
            arrayList.add(ahi.m1542a(ahk));
        }
        float f4 = 1.0f;
        if (f2 > 0) {
            ahj ahj = new ahj((byte[]) arrayList.get(0));
            ahj.m1548a((f + 1) * 8);
            C0174a a = ahd.m1519a(ahj);
            i2 = a.f1459a;
            i3 = a.f1460b;
            f4 = a.f1461c;
        } else {
            i2 = -1;
        }
        return new C0138a(arrayList, f, i2, i3, f4);
    }
}
