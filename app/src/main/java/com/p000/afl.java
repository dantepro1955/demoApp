package com.p000;

/* compiled from: Ac3Reader */
/* renamed from: afl */
final class afl extends afp {
    /* renamed from: b */
    private final boolean f1082b;
    /* renamed from: c */
    private final ahj f1083c = new ahj(new byte[8]);
    /* renamed from: d */
    private final ahk f1084d = new ahk(this.f1083c.f1489a);
    /* renamed from: e */
    private int f1085e = 0;
    /* renamed from: f */
    private int f1086f;
    /* renamed from: g */
    private boolean f1087g;
    /* renamed from: h */
    private long f1088h;
    /* renamed from: i */
    private ado f1089i;
    /* renamed from: j */
    private int f1090j;
    /* renamed from: k */
    private long f1091k;

    public afl(aep aep, boolean z) {
        super(aep);
        this.f1082b = z;
    }

    /* renamed from: a */
    public void mo160a() {
        this.f1085e = 0;
        this.f1086f = 0;
        this.f1087g = false;
    }

    /* renamed from: a */
    public void mo161a(long j, boolean z) {
        this.f1091k = j;
    }

    /* renamed from: a */
    public void mo162a(ahk ahk) {
        while (ahk.m1563b() > 0) {
            switch (this.f1085e) {
                case 0:
                    if (!m1261b(ahk)) {
                        break;
                    }
                    this.f1085e = 1;
                    this.f1084d.f1493a[0] = (byte) 11;
                    this.f1084d.f1493a[1] = (byte) 119;
                    this.f1086f = 2;
                    break;
                case 1:
                    if (!m1260a(ahk, this.f1084d.f1493a, 8)) {
                        break;
                    }
                    m1262c();
                    this.f1084d.m1564b(0);
                    this.a.mo127a(this.f1084d, 8);
                    this.f1085e = 2;
                    break;
                case 2:
                    int min = Math.min(ahk.m1563b(), this.f1090j - this.f1086f);
                    this.a.mo127a(ahk, min);
                    this.f1086f = min + this.f1086f;
                    if (this.f1086f != this.f1090j) {
                        break;
                    }
                    this.a.mo125a(this.f1091k, 1, this.f1090j, 0, null);
                    this.f1091k += this.f1088h;
                    this.f1085e = 0;
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: b */
    public void mo163b() {
    }

    /* renamed from: a */
    private boolean m1260a(ahk ahk, byte[] bArr, int i) {
        int min = Math.min(ahk.m1563b(), i - this.f1086f);
        ahk.m1562a(bArr, this.f1086f, min);
        this.f1086f = min + this.f1086f;
        return this.f1086f == i;
    }

    /* renamed from: b */
    private boolean m1261b(ahk ahk) {
        while (ahk.m1563b() > 0) {
            if (this.f1087g) {
                int f = ahk.m1570f();
                if (f == 119) {
                    this.f1087g = false;
                    return true;
                }
                this.f1087g = f == 11;
            } else {
                this.f1087g = ahk.m1570f() == 11;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m1262c() {
        if (this.f1089i == null) {
            this.f1089i = this.f1082b ? aha.m1509b(this.f1083c, null, -1, null) : aha.m1506a(this.f1083c, null, -1, null);
            this.a.mo126a(this.f1089i);
        }
        this.f1090j = this.f1082b ? aha.m1508b(this.f1083c.f1489a) : aha.m1505a(this.f1083c.f1489a);
        this.f1088h = (long) ((int) ((((long) (this.f1082b ? aha.m1511c(this.f1083c.f1489a) : aha.m1502a())) * 1000000) / ((long) this.f1089i.f634o)));
    }
}
