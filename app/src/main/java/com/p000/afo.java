package com.p000;

/* compiled from: DtsReader */
/* renamed from: afo */
final class afo extends afp {
    /* renamed from: b */
    private final ahk f1111b = new ahk(new byte[15]);
    /* renamed from: c */
    private int f1112c;
    /* renamed from: d */
    private int f1113d;
    /* renamed from: e */
    private int f1114e;
    /* renamed from: f */
    private long f1115f;
    /* renamed from: g */
    private ado f1116g;
    /* renamed from: h */
    private int f1117h;
    /* renamed from: i */
    private long f1118i;

    public afo(aep aep) {
        super(aep);
        this.f1111b.f1493a[0] = Byte.MAX_VALUE;
        this.f1111b.f1493a[1] = (byte) -2;
        this.f1111b.f1493a[2] = Byte.MIN_VALUE;
        this.f1111b.f1493a[3] = (byte) 1;
        this.f1112c = 0;
    }

    /* renamed from: a */
    public void mo160a() {
        this.f1112c = 0;
        this.f1113d = 0;
        this.f1114e = 0;
    }

    /* renamed from: a */
    public void mo161a(long j, boolean z) {
        this.f1118i = j;
    }

    /* renamed from: a */
    public void mo162a(ahk ahk) {
        while (ahk.m1563b() > 0) {
            switch (this.f1112c) {
                case 0:
                    if (!m1285b(ahk)) {
                        break;
                    }
                    this.f1113d = 4;
                    this.f1112c = 1;
                    break;
                case 1:
                    if (!m1284a(ahk, this.f1111b.f1493a, 15)) {
                        break;
                    }
                    m1286c();
                    this.f1111b.m1564b(0);
                    this.a.mo127a(this.f1111b, 15);
                    this.f1112c = 2;
                    break;
                case 2:
                    int min = Math.min(ahk.m1563b(), this.f1117h - this.f1113d);
                    this.a.mo127a(ahk, min);
                    this.f1113d = min + this.f1113d;
                    if (this.f1113d != this.f1117h) {
                        break;
                    }
                    this.a.mo125a(this.f1118i, 1, this.f1117h, 0, null);
                    this.f1118i += this.f1115f;
                    this.f1112c = 0;
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
    private boolean m1284a(ahk ahk, byte[] bArr, int i) {
        int min = Math.min(ahk.m1563b(), i - this.f1113d);
        ahk.m1562a(bArr, this.f1113d, min);
        this.f1113d = min + this.f1113d;
        return this.f1113d == i;
    }

    /* renamed from: b */
    private boolean m1285b(ahk ahk) {
        while (ahk.m1563b() > 0) {
            this.f1114e <<= 8;
            this.f1114e |= ahk.m1570f();
            if (this.f1114e == 2147385345) {
                this.f1114e = 0;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m1286c() {
        byte[] bArr = this.f1111b.f1493a;
        if (this.f1116g == null) {
            this.f1116g = ahe.m1526a(bArr, null, -1, null);
            this.a.mo126a(this.f1116g);
        }
        this.f1117h = ahe.m1527b(bArr);
        this.f1115f = (long) ((int) ((((long) ahe.m1525a(bArr)) * 1000000) / ((long) this.f1116g.f634o)));
    }
}
