package com.p000;

import android.graphics.Bitmap;
import android.os.Handler;

/* compiled from: ProcessAndDisplayImageTask */
/* renamed from: cxj */
final class cxj implements Runnable {
    /* renamed from: a */
    private final cxg f20590a;
    /* renamed from: b */
    private final Bitmap f20591b;
    /* renamed from: c */
    private final cxh f20592c;
    /* renamed from: d */
    private final Handler f20593d;

    public cxj(cxg cxg, Bitmap bitmap, cxh cxh, Handler handler) {
        this.f20590a = cxg;
        this.f20591b = bitmap;
        this.f20592c = cxh;
        this.f20593d = handler;
    }

    public void run() {
        cyj.m25644a("PostProcess image before displaying [%s]", this.f20592c.f20561b);
        cxi.m25519a(new cxc(this.f20592c.f20564e.m25476p().m25640a(this.f20591b), this.f20592c, this.f20590a, cxn.MEMORY_CACHE), this.f20592c.f20564e.m25479s(), this.f20593d, this.f20590a);
    }
}
