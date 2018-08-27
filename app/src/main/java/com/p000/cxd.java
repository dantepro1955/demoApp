package com.p000;

import android.content.res.Resources;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: DisplayImageOptions */
/* renamed from: cxd */
public final class cxd {
    /* renamed from: a */
    private final int f20505a;
    /* renamed from: b */
    private final int f20506b;
    /* renamed from: c */
    private final int f20507c;
    /* renamed from: d */
    private final Drawable f20508d;
    /* renamed from: e */
    private final Drawable f20509e;
    /* renamed from: f */
    private final Drawable f20510f;
    /* renamed from: g */
    private final boolean f20511g;
    /* renamed from: h */
    private final boolean f20512h;
    /* renamed from: i */
    private final boolean f20513i;
    /* renamed from: j */
    private final cxl f20514j;
    /* renamed from: k */
    private final Options f20515k;
    /* renamed from: l */
    private final int f20516l;
    /* renamed from: m */
    private final boolean f20517m;
    /* renamed from: n */
    private final Object f20518n;
    /* renamed from: o */
    private final cyg f20519o;
    /* renamed from: p */
    private final cyg f20520p;
    /* renamed from: q */
    private final cxw f20521q;
    /* renamed from: r */
    private final Handler f20522r;
    /* renamed from: s */
    private final boolean f20523s;

    /* compiled from: DisplayImageOptions */
    /* renamed from: cxd$a */
    public static class C4646a {
        /* renamed from: a */
        private int f20486a = 0;
        /* renamed from: b */
        private int f20487b = 0;
        /* renamed from: c */
        private int f20488c = 0;
        /* renamed from: d */
        private Drawable f20489d = null;
        /* renamed from: e */
        private Drawable f20490e = null;
        /* renamed from: f */
        private Drawable f20491f = null;
        /* renamed from: g */
        private boolean f20492g = false;
        /* renamed from: h */
        private boolean f20493h = false;
        /* renamed from: i */
        private boolean f20494i = false;
        /* renamed from: j */
        private cxl f20495j = cxl.IN_SAMPLE_POWER_OF_2;
        /* renamed from: k */
        private Options f20496k = new Options();
        /* renamed from: l */
        private int f20497l = 0;
        /* renamed from: m */
        private boolean f20498m = false;
        /* renamed from: n */
        private Object f20499n = null;
        /* renamed from: o */
        private cyg f20500o = null;
        /* renamed from: p */
        private cyg f20501p = null;
        /* renamed from: q */
        private cxw f20502q = cxb.m25412a();
        /* renamed from: r */
        private Handler f20503r = null;
        /* renamed from: s */
        private boolean f20504s = false;

        /* renamed from: a */
        public C4646a m25436a(cxl cxl) {
            this.f20495j = cxl;
            return this;
        }

        /* renamed from: a */
        C4646a m25437a(boolean z) {
            this.f20504s = z;
            return this;
        }

        /* renamed from: a */
        public C4646a m25435a(cxd cxd) {
            this.f20486a = cxd.f20505a;
            this.f20487b = cxd.f20506b;
            this.f20488c = cxd.f20507c;
            this.f20489d = cxd.f20508d;
            this.f20490e = cxd.f20509e;
            this.f20491f = cxd.f20510f;
            this.f20492g = cxd.f20511g;
            this.f20493h = cxd.f20512h;
            this.f20494i = cxd.f20513i;
            this.f20495j = cxd.f20514j;
            this.f20496k = cxd.f20515k;
            this.f20497l = cxd.f20516l;
            this.f20498m = cxd.f20517m;
            this.f20499n = cxd.f20518n;
            this.f20500o = cxd.f20519o;
            this.f20501p = cxd.f20520p;
            this.f20502q = cxd.f20521q;
            this.f20503r = cxd.f20522r;
            this.f20504s = cxd.f20523s;
            return this;
        }

        /* renamed from: a */
        public cxd m25438a() {
            return new cxd();
        }
    }

    private cxd(C4646a c4646a) {
        this.f20505a = c4646a.f20486a;
        this.f20506b = c4646a.f20487b;
        this.f20507c = c4646a.f20488c;
        this.f20508d = c4646a.f20489d;
        this.f20509e = c4646a.f20490e;
        this.f20510f = c4646a.f20491f;
        this.f20511g = c4646a.f20492g;
        this.f20512h = c4646a.f20493h;
        this.f20513i = c4646a.f20494i;
        this.f20514j = c4646a.f20495j;
        this.f20515k = c4646a.f20496k;
        this.f20516l = c4646a.f20497l;
        this.f20517m = c4646a.f20498m;
        this.f20518n = c4646a.f20499n;
        this.f20519o = c4646a.f20500o;
        this.f20520p = c4646a.f20501p;
        this.f20521q = c4646a.f20502q;
        this.f20522r = c4646a.f20503r;
        this.f20523s = c4646a.f20504s;
    }

    /* renamed from: a */
    public boolean m25459a() {
        return (this.f20508d == null && this.f20505a == 0) ? false : true;
    }

    /* renamed from: b */
    public boolean m25461b() {
        return (this.f20509e == null && this.f20506b == 0) ? false : true;
    }

    /* renamed from: c */
    public boolean m25463c() {
        return (this.f20510f == null && this.f20507c == 0) ? false : true;
    }

    /* renamed from: d */
    public boolean m25464d() {
        return this.f20519o != null;
    }

    /* renamed from: e */
    public boolean m25465e() {
        return this.f20520p != null;
    }

    /* renamed from: f */
    public boolean m25466f() {
        return this.f20516l > 0;
    }

    /* renamed from: a */
    public Drawable m25458a(Resources resources) {
        return this.f20505a != 0 ? resources.getDrawable(this.f20505a) : this.f20508d;
    }

    /* renamed from: b */
    public Drawable m25460b(Resources resources) {
        return this.f20506b != 0 ? resources.getDrawable(this.f20506b) : this.f20509e;
    }

    /* renamed from: c */
    public Drawable m25462c(Resources resources) {
        return this.f20507c != 0 ? resources.getDrawable(this.f20507c) : this.f20510f;
    }

    /* renamed from: g */
    public boolean m25467g() {
        return this.f20511g;
    }

    /* renamed from: h */
    public boolean m25468h() {
        return this.f20512h;
    }

    /* renamed from: i */
    public boolean m25469i() {
        return this.f20513i;
    }

    /* renamed from: j */
    public cxl m25470j() {
        return this.f20514j;
    }

    /* renamed from: k */
    public Options m25471k() {
        return this.f20515k;
    }

    /* renamed from: l */
    public int m25472l() {
        return this.f20516l;
    }

    /* renamed from: m */
    public boolean m25473m() {
        return this.f20517m;
    }

    /* renamed from: n */
    public Object m25474n() {
        return this.f20518n;
    }

    /* renamed from: o */
    public cyg m25475o() {
        return this.f20519o;
    }

    /* renamed from: p */
    public cyg m25476p() {
        return this.f20520p;
    }

    /* renamed from: q */
    public cxw m25477q() {
        return this.f20521q;
    }

    /* renamed from: r */
    public Handler m25478r() {
        return this.f20522r;
    }

    /* renamed from: s */
    boolean m25479s() {
        return this.f20523s;
    }
}
