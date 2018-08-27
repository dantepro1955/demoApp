package com.p000;

/* compiled from: MpegAudioReader */
/* renamed from: afu */
final class afu extends afp {
    /* renamed from: b */
    private final ahk f1182b = new ahk(4);
    /* renamed from: c */
    private final ahh f1183c;
    /* renamed from: d */
    private int f1184d = 0;
    /* renamed from: e */
    private int f1185e;
    /* renamed from: f */
    private boolean f1186f;
    /* renamed from: g */
    private boolean f1187g;
    /* renamed from: h */
    private long f1188h;
    /* renamed from: i */
    private int f1189i;
    /* renamed from: j */
    private long f1190j;

    public afu(aep aep) {
        super(aep);
        this.f1182b.f1493a[0] = (byte) -1;
        this.f1183c = new ahh();
    }

    /* renamed from: a */
    public void mo160a() {
        this.f1184d = 0;
        this.f1185e = 0;
        this.f1187g = false;
    }

    /* renamed from: a */
    public void mo161a(long j, boolean z) {
        this.f1190j = j;
    }

    /* renamed from: a */
    public void mo162a(ahk ahk) {
        while (ahk.m1563b() > 0) {
            switch (this.f1184d) {
                case 0:
                    m1331b(ahk);
                    break;
                case 1:
                    m1332c(ahk);
                    break;
                case 2:
                    m1333d(ahk);
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: b */
    public void mo163b() {
    }

    /* renamed from: b */
    private void m1331b(ahk ahk) {
        byte[] bArr = ahk.f1493a;
        int d = ahk.m1567d();
        int c = ahk.m1565c();
        int i = d;
        while (i < c) {
            boolean z = (bArr[i] & 255) == 255;
            if (this.f1187g && (bArr[i] & 224) == 224) {
                int i2 = 1;
            } else {
                boolean z2 = false;
            }
            this.f1187g = z;
            if (i2 != 0) {
                ahk.m1564b(i + 1);
                this.f1187g = false;
                this.f1182b.f1493a[1] = bArr[i];
                this.f1185e = 2;
                this.f1184d = 1;
                return;
            }
            i++;
        }
        ahk.m1564b(c);
    }

    /* renamed from: c */
    private void m1332c(ahk ahk) {
        int min = Math.min(ahk.m1563b(), 4 - this.f1185e);
        ahk.m1562a(this.f1182b.f1493a, this.f1185e, min);
        this.f1185e = min + this.f1185e;
        if (this.f1185e >= 4) {
            this.f1182b.m1564b(0);
            if (ahh.m1536a(this.f1182b.m1575k(), this.f1183c)) {
                this.f1189i = this.f1183c.f1480c;
                if (!this.f1186f) {
                    this.f1188h = (1000000 * ((long) this.f1183c.f1484g)) / ((long) this.f1183c.f1481d);
                    this.a.mo126a(ado.m816a(null, this.f1183c.f1479b, -1, 4096, -1, this.f1183c.f1482e, this.f1183c.f1481d, null, null));
                    this.f1186f = true;
                }
                this.f1182b.m1564b(0);
                this.a.mo127a(this.f1182b, 4);
                this.f1184d = 2;
                return;
            }
            this.f1185e = 0;
            this.f1184d = 1;
        }
    }

    /* renamed from: d */
    private void m1333d(ahk ahk) {
        int min = Math.min(ahk.m1563b(), this.f1189i - this.f1185e);
        this.a.mo127a(ahk, min);
        this.f1185e = min + this.f1185e;
        if (this.f1185e >= this.f1189i) {
            this.a.mo125a(this.f1190j, 1, this.f1189i, 0, null);
            this.f1190j += this.f1188h;
            this.f1185e = 0;
            this.f1184d = 0;
        }
    }
}
