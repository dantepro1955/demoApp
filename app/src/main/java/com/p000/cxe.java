package com.p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import p000.cxd.C4646a;

/* compiled from: ImageLoader */
/* renamed from: cxe */
public class cxe {
    /* renamed from: a */
    public static final String f20525a = cxe.class.getSimpleName();
    /* renamed from: e */
    private static volatile cxe f20526e;
    /* renamed from: b */
    private cxf f20527b;
    /* renamed from: c */
    private cxg f20528c;
    /* renamed from: d */
    private cyd f20529d = new cyf();

    /* compiled from: ImageLoader */
    /* renamed from: cxe$a */
    static class C4648a extends cyf {
        /* renamed from: a */
        private Bitmap f20524a;

        private C4648a() {
        }

        /* renamed from: a */
        public void mo4093a(String str, View view, Bitmap bitmap) {
            this.f20524a = bitmap;
        }

        /* renamed from: a */
        public Bitmap m25484a() {
            return this.f20524a;
        }
    }

    /* renamed from: a */
    public static cxe m25487a() {
        if (f20526e == null) {
            synchronized (cxe.class) {
                if (f20526e == null) {
                    f20526e = new cxe();
                }
            }
        }
        return f20526e;
    }

    protected cxe() {
    }

    /* renamed from: a */
    public void m25495a(String str, cxz cxz, cxd cxd, cyd cyd, cye cye) {
        m25494a(str, cxz, cxd, null, cyd, cye);
    }

    /* renamed from: a */
    public void m25494a(String str, cxz cxz, cxd cxd, cxm cxm, cyd cyd, cye cye) {
        m25488d();
        if (cxz == null) {
            throw new IllegalArgumentException("Wrong arguments were passed to displayImage() method (ImageView reference must not be null)");
        }
        cyd cyd2;
        cxd cxd2;
        if (cyd == null) {
            cyd2 = this.f20529d;
        } else {
            cyd2 = cyd;
        }
        if (cxd == null) {
            cxd2 = this.f20527b.f20545p;
        } else {
            cxd2 = cxd;
        }
        if (TextUtils.isEmpty(str)) {
            this.f20528c.m25513b(cxz);
            cyd2.mo4092a(str, cxz.mo4228d());
            if (cxd2.m25461b()) {
                cxz.mo4225a(cxd2.m25460b(this.f20527b.f20530a));
            } else {
                cxz.mo4225a(null);
            }
            cyd2.mo4093a(str, cxz.mo4228d(), null);
            return;
        }
        cxm a;
        if (cxm == null) {
            a = cyh.m25641a(cxz, this.f20527b.m25499a());
        } else {
            a = cxm;
        }
        String a2 = cyk.m25648a(str, a);
        this.f20528c.m25510a(cxz, a2);
        cyd2.mo4092a(str, cxz.mo4228d());
        Bitmap a3 = this.f20527b.f20541l.m25409a(a2);
        if (a3 == null || a3.isRecycled()) {
            if (cxd2.m25459a()) {
                cxz.mo4225a(cxd2.m25458a(this.f20527b.f20530a));
            } else if (cxd2.m25467g()) {
                cxz.mo4225a(null);
            }
            cxi cxi = new cxi(this.f20528c, new cxh(str, cxz, a, a2, cxd2, cyd2, cye, this.f20528c.m25507a(str)), cxe.m25486a(cxd2));
            if (cxd2.m25479s()) {
                cxi.run();
                return;
            } else {
                this.f20528c.m25508a(cxi);
                return;
            }
        }
        cyj.m25644a("Load image from memory cache [%s]", a2);
        if (cxd2.m25465e()) {
            cxj cxj = new cxj(this.f20528c, a3, new cxh(str, cxz, a, a2, cxd2, cyd2, cye, this.f20528c.m25507a(str)), cxe.m25486a(cxd2));
            if (cxd2.m25479s()) {
                cxj.run();
                return;
            } else {
                this.f20528c.m25509a(cxj);
                return;
            }
        }
        cxd2.m25477q().mo4214a(a3, cxz, cxn.MEMORY_CACHE);
        cyd2.mo4093a(str, cxz.mo4228d(), a3);
    }

    /* renamed from: a */
    public void m25491a(String str, ImageView imageView, cxd cxd, cyd cyd, cye cye) {
        m25495a(str, new cya(imageView), cxd, cyd, cye);
    }

    /* renamed from: a */
    public void m25496a(String str, cyd cyd) {
        m25493a(str, null, null, cyd, null);
    }

    /* renamed from: a */
    public void m25492a(String str, cxm cxm, cxd cxd, cyd cyd) {
        m25493a(str, cxm, cxd, cyd, null);
    }

    /* renamed from: a */
    public void m25493a(String str, cxm cxm, cxd cxd, cyd cyd, cye cye) {
        cxd cxd2;
        m25488d();
        if (cxm == null) {
            cxm = this.f20527b.m25499a();
        }
        if (cxd == null) {
            cxd2 = this.f20527b.f20545p;
        } else {
            cxd2 = cxd;
        }
        m25495a(str, new cyb(str, cxm, cxp.CROP), cxd2, cyd, cye);
    }

    /* renamed from: a */
    public Bitmap m25489a(String str) {
        return m25490a(str, null, null);
    }

    /* renamed from: a */
    public Bitmap m25490a(String str, cxm cxm, cxd cxd) {
        if (cxd == null) {
            cxd = this.f20527b.f20545p;
        }
        cxd a = new C4646a().m25435a(cxd).m25437a(true).m25438a();
        Object c4648a = new C4648a();
        m25492a(str, cxm, a, c4648a);
        return c4648a.m25484a();
    }

    /* renamed from: d */
    private void m25488d() {
        if (this.f20527b == null) {
            throw new IllegalStateException("ImageLoader must be init with configuration before using");
        }
    }

    /* renamed from: b */
    public cxa m25497b() {
        m25488d();
        return this.f20527b.f20541l;
    }

    /* renamed from: c */
    public cwz m25498c() {
        m25488d();
        return this.f20527b.f20542m;
    }

    /* renamed from: a */
    private static Handler m25486a(cxd cxd) {
        Handler r = cxd.m25478r();
        if (cxd.m25479s()) {
            return null;
        }
        if (r == null && Looper.myLooper() == Looper.getMainLooper()) {
            return new Handler();
        }
        return r;
    }
}
