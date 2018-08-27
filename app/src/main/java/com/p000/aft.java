package com.p000;

/* compiled from: Id3Reader */
/* renamed from: aft */
final class aft extends afp {
    /* renamed from: b */
    private final ahk f1177b = new ahk(10);
    /* renamed from: c */
    private boolean f1178c;
    /* renamed from: d */
    private long f1179d;
    /* renamed from: e */
    private int f1180e;
    /* renamed from: f */
    private int f1181f;

    public aft(aep aep) {
        super(aep);
        aep.mo126a(ado.m813a());
    }

    /* renamed from: a */
    public void mo160a() {
        this.f1178c = false;
    }

    /* renamed from: a */
    public void mo161a(long j, boolean z) {
        if (z) {
            this.f1178c = true;
            this.f1179d = j;
            this.f1180e = 0;
            this.f1181f = 0;
        }
    }

    /* renamed from: a */
    public void mo162a(ahk ahk) {
        if (this.f1178c) {
            int b = ahk.m1563b();
            if (this.f1181f < 10) {
                int min = Math.min(b, 10 - this.f1181f);
                System.arraycopy(ahk.f1493a, ahk.m1567d(), this.f1177b.f1493a, this.f1181f, min);
                if (min + this.f1181f == 10) {
                    this.f1177b.m1564b(6);
                    this.f1180e = this.f1177b.m1578n() + 10;
                }
            }
            this.a.mo127a(ahk, b);
            this.f1181f = b + this.f1181f;
        }
    }

    /* renamed from: b */
    public void mo163b() {
        if (this.f1178c && this.f1180e != 0 && this.f1181f == this.f1180e) {
            this.a.mo125a(this.f1179d, 1, this.f1180e, 0, null);
            this.f1178c = false;
        }
    }
}
