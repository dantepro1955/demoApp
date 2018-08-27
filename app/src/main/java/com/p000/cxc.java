package com.p000;

import android.graphics.Bitmap;

/* compiled from: DisplayBitmapTask */
/* renamed from: cxc */
final class cxc implements Runnable {
    /* renamed from: a */
    private final Bitmap f20478a;
    /* renamed from: b */
    private final String f20479b;
    /* renamed from: c */
    private final cxz f20480c;
    /* renamed from: d */
    private final String f20481d;
    /* renamed from: e */
    private final cxw f20482e;
    /* renamed from: f */
    private final cyd f20483f;
    /* renamed from: g */
    private final cxg f20484g;
    /* renamed from: h */
    private final cxn f20485h;

    public cxc(Bitmap bitmap, cxh cxh, cxg cxg, cxn cxn) {
        this.f20478a = bitmap;
        this.f20479b = cxh.f20560a;
        this.f20480c = cxh.f20562c;
        this.f20481d = cxh.f20561b;
        this.f20482e = cxh.f20564e.m25477q();
        this.f20483f = cxh.f20565f;
        this.f20484g = cxg;
        this.f20485h = cxn;
    }

    public void run() {
        if (this.f20480c.mo4229e()) {
            cyj.m25644a("ImageAware was collected by GC. Task is cancelled. [%s]", this.f20481d);
            this.f20483f.mo4095b(this.f20479b, this.f20480c.mo4228d());
        } else if (m25415a()) {
            cyj.m25644a("ImageAware is reused for another image. Task is cancelled. [%s]", this.f20481d);
            this.f20483f.mo4095b(this.f20479b, this.f20480c.mo4228d());
        } else {
            cyj.m25644a("Display image in ImageAware (loaded from %1$s) [%2$s]", this.f20485h, this.f20481d);
            this.f20482e.mo4214a(this.f20478a, this.f20480c, this.f20485h);
            this.f20484g.m25513b(this.f20480c);
            this.f20483f.mo4093a(this.f20479b, this.f20480c.mo4228d(), this.f20478a);
        }
    }

    /* renamed from: a */
    private boolean m25415a() {
        return !this.f20481d.equals(this.f20484g.m25505a(this.f20480c));
    }
}
