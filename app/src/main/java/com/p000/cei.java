package com.p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C0370e;
import android.support.v7.app.AppCompatActivity;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.overlay.OverlayPageScrollStateChangedEvent;
import com.ninegag.android.app.otto.overlay.OverlayPageSwitchEvent;
import com.ninegag.android.app.ui.OverlayActivity;
import java.lang.ref.WeakReference;
import p000.crw.C4102a;

/* compiled from: OverlayModule */
/* renamed from: cei */
public class cei implements cee {
    /* renamed from: a */
    private caf f8882a = caf.m12046a();
    /* renamed from: b */
    private cco f8883b;
    /* renamed from: c */
    private ccs f8884c;
    /* renamed from: d */
    private Handler f8885d;
    /* renamed from: e */
    private Handler f8886e;
    /* renamed from: f */
    private HandlerThread f8887f;
    /* renamed from: g */
    private cef f8888g;
    /* renamed from: h */
    private C0370e f8889h;
    /* renamed from: i */
    private C4102a f8890i;
    /* renamed from: j */
    private col f8891j;
    /* renamed from: k */
    private cen f8892k;
    /* renamed from: l */
    private cej f8893l;
    /* renamed from: m */
    private ceh f8894m;
    /* renamed from: n */
    private WeakReference<AppCompatActivity> f8895n;
    /* renamed from: o */
    private int f8896o;
    /* renamed from: p */
    private ViewPager f8897p;
    /* renamed from: q */
    private long f8898q = 0;
    /* renamed from: r */
    private cnv f8899r;
    /* renamed from: s */
    private cti f8900s;
    /* renamed from: t */
    private final hi<String> f8901t = new hi();

    /* compiled from: OverlayModule */
    /* renamed from: cei$a */
    public static class C1691a implements C4102a {
        /* renamed from: a */
        private WeakReference<cei> f8879a;

        public C1691a(cei cei) {
            this.f8879a = new WeakReference(cei);
        }

        /* renamed from: a */
        public void m12744a() {
        }

        /* renamed from: a */
        public void m12745a(boolean z, boolean z2) {
            m12743b();
        }

        /* renamed from: b */
        public void m12746b(boolean z, boolean z2) {
            m12743b();
        }

        /* renamed from: b */
        private void m12743b() {
            cei cei = (cei) this.f8879a.get();
            if (cei != null) {
                cei.f8888g.notifyDataSetChanged();
            }
        }
    }

    /* compiled from: OverlayModule */
    /* renamed from: cei$b */
    public static class C1692b implements C0370e {
        /* renamed from: a */
        private WeakReference<cei> f8880a;
        /* renamed from: b */
        private int f8881b = -1;

        public C1692b(cei cei) {
            this.f8880a = new WeakReference(cei);
        }

        /* renamed from: a */
        public void mo424a(int i, float f, int i2) {
        }

        /* renamed from: b */
        public void mo425b(int i) {
            cei cei = (cei) this.f8880a.get();
            if (cei != null) {
                String e;
                if (i != this.f8881b && this.f8881b > -1 && cip.m13967a().m14017v()) {
                    dhe.c("hint-swipe-overlay", new cbm(false));
                    cip.m13967a().m14018w();
                    chn.m13445q("OnBoarding", "CompleteSwipeOverlayTutorial");
                }
                if (this.f8881b < 0) {
                    this.f8881b = 0;
                }
                cei.f8884c.d(i);
                m12748d(i);
                this.f8881b = i;
                m12747c(i);
                cct l = cei.f8884c.m12347l();
                if (l != null) {
                    e = l.m12282e();
                    AppCompatActivity appCompatActivity = (AppCompatActivity) cei.f8895n.get();
                    if (appCompatActivity != null) {
                        cei.f8893l.m12798a(appCompatActivity.findViewById(R.id.layout), l);
                    }
                } else {
                    e = null;
                }
                cnv e2 = cei.f8899r;
                if (e2 != null) {
                    e2.m14919a(l);
                }
                if (e != null) {
                    int r = cei.f8884c.r() + 1;
                    int r2 = cei.f8884c.r() - 1;
                    if (r < cei.f8884c.size()) {
                        cct cct = (cct) cei.f8884c.get(r);
                        if (!(cct == null || e2 == null)) {
                            e2.m14920b(cct);
                            if (cct.m12287j()) {
                                cqk.a(cct);
                                cqk.c(cct);
                            } else {
                                cqk.b(cct);
                            }
                        }
                    }
                    if (r2 >= 0 && cei.f8884c.size() < r2) {
                        cct cct2 = (cct) cei.f8884c.get(r2);
                        if (!(cct2 == null || e2 == null)) {
                            e2.m14920b(cct2);
                        }
                    }
                }
                dhe.c(cei.m12754c(e), new OverlayPageSwitchEvent(e));
            }
        }

        /* renamed from: a */
        public void mo423a(int i) {
            cei cei = (cei) this.f8880a.get();
            if (cei != null) {
                cct l = cei.f8884c.m12347l();
                String str = null;
                if (l != null) {
                    str = l.m12282e();
                }
                dhe.c(cei.m12754c(str), new OverlayPageScrollStateChangedEvent(i, str));
            }
        }

        /* renamed from: c */
        private void m12747c(int i) {
            cei cei = (cei) this.f8880a.get();
            if (cei != null && (cei.f8884c.m12350o() + i) + 6 > cei.f8884c.m12349n()) {
                cei.f8884c.B();
            }
        }

        /* renamed from: d */
        private void m12748d(int i) {
            cei cei = (cei) this.f8880a.get();
            if (cei != null) {
                if (i == this.f8881b + 1) {
                    chn.m13400c("OverlayList", "SwipeRight", cei.f8883b.m12564c());
                } else if (i == this.f8881b - 1) {
                    chn.m13400c("OverlayList", "SwipeLeft", cei.f8883b.m12564c());
                }
            }
        }
    }

    public cei(cco cco, col col) {
        this.f8883b = cco;
        this.f8891j = col;
    }

    /* renamed from: a */
    public void m12764a(Bundle bundle, AppCompatActivity appCompatActivity) {
        this.f8895n = new WeakReference(appCompatActivity);
        if (this.f8883b.f8731c == 14) {
            this.f8884c = new cfe(this.f8883b);
        } else {
            this.f8884c = new ccs(this.f8883b);
        }
        this.f8884c.m12345j();
        new cge(cgb.m13071a(this.f8883b), new cit(ckv.m14212a(), caf.m12046a(), true), caf.m12046a()).m13098j();
        this.f8888g = new cef(appCompatActivity.getSupportFragmentManager(), this.f8884c, this.f8883b, m12779m());
        this.f8889h = new C1692b(this);
        this.f8890i = new C1691a(this);
        this.f8892k = new cen();
        this.f8893l = new cej(this.f8883b);
        this.f8894m = new ceh(this.f8883b);
        if (this.f8895n.get() != null) {
            this.f8897p = ((OverlayActivity) this.f8895n.get()).getViewPager();
        }
        this.f8899r = new cnv("OverlayModule:comment");
        this.f8899r.start();
        this.f8900s = new cti();
    }

    /* renamed from: a */
    public void m12761a() {
        if (this.f8899r == null) {
            this.f8899r = new cnv("OverlayModule:comment");
            this.f8899r.start();
        }
        if (this.f8885d == null) {
            this.f8885d = new Handler(Looper.getMainLooper());
            this.f8887f = new HandlerThread("blitz-bg-thread");
            this.f8887f.start();
            this.f8886e = new Handler(this.f8887f.getLooper());
        }
        dhe.a(this.f8883b.f8730b, this.f8884c);
        dhe.a(this.f8883b.f8730b, this.f8894m);
        this.f8884c.a(this.f8885d, this.f8886e);
        this.f8884c.a(this.f8890i);
        m12759o();
        m12762a(this.f8884c.r());
    }

    /* renamed from: b */
    public void m12766b() {
        this.f8884c.a(null);
        this.f8884c.a(null, null);
        this.f8887f.quit();
        this.f8887f = null;
        this.f8886e = null;
        this.f8885d = null;
        if (this.f8899r != null) {
            this.f8899r.quit();
            this.f8899r = null;
        }
        m12760p();
        dhe.b(this.f8883b.f8730b, this.f8884c);
        dhe.b(this.f8883b.f8730b, this.f8894m);
    }

    /* renamed from: c */
    public void m12769c() {
        this.f8892k.m12811a(m12771e().r(), false);
        if (!(this.f8885d == null || this.f8886e == null)) {
            this.f8884c.a(this.f8885d, this.f8886e);
            this.f8884c.a(this.f8890i);
        }
        this.f8893l.m12799e();
    }

    /* renamed from: d */
    public void m12770d() {
        this.f8884c.m12344i();
        this.f8882a.m12077h().m13981a(this.f8883b.f8731c, this.f8883b.f8732d, m12779m(), djy.a(this.f8882a.f8449a), 0, 0);
    }

    /* renamed from: a */
    public void m12763a(Bundle bundle) {
        this.f8884c.m12334a(bundle);
    }

    /* renamed from: e */
    public ccs m12771e() {
        return this.f8884c;
    }

    /* renamed from: f */
    public cef m12772f() {
        return this.f8888g;
    }

    /* renamed from: a */
    public void m12762a(int i) {
        AppCompatActivity appCompatActivity = (AppCompatActivity) this.f8895n.get();
        if (appCompatActivity != null) {
            cct l;
            if (i == 0) {
                l = this.f8884c.m12347l();
                if (l != null) {
                    this.f8893l.m12798a(appCompatActivity.findViewById(R.id.layout), l);
                    return;
                }
                return;
            }
            ((ViewPager) appCompatActivity.findViewById(R.id.pager)).setCurrentItem(i, false);
            l = this.f8884c.m12347l();
            if (l != null) {
                this.f8893l.m12798a(appCompatActivity.findViewById(R.id.layout), l);
            }
        }
    }

    /* renamed from: g */
    public C0370e m12773g() {
        return this.f8889h;
    }

    /* renamed from: b */
    public void m12767b(int i) {
        this.f8896o = i;
        m12771e().d(this.f8896o);
    }

    /* renamed from: o */
    private void m12759o() {
        String str = "";
        if (this.f8884c.m12347l() != null) {
            str = this.f8884c.m12347l().m12282e();
        }
        this.f8892k.m12735a(cei.m12754c(str), this);
        this.f8893l.m12735a(cei.m12754c(str), this);
        this.f8894m.m12735a(cei.m12754c(str), this);
    }

    /* renamed from: p */
    private void m12760p() {
        this.f8892k.mo1689a();
        this.f8893l.mo1689a();
        this.f8894m.mo1689a();
    }

    /* renamed from: h */
    public OverlayActivity m12774h() {
        return (OverlayActivity) this.f8895n.get();
    }

    /* renamed from: i */
    public ViewPager m12775i() {
        return this.f8897p;
    }

    /* renamed from: j */
    public cen m12776j() {
        return this.f8892k;
    }

    /* renamed from: k */
    public cej m12777k() {
        return this.f8893l;
    }

    /* renamed from: l */
    public col m12778l() {
        return this.f8891j;
    }

    /* renamed from: m */
    public String m12779m() {
        if (m12771e().m12347l() == null) {
            return "";
        }
        return m12771e().m12347l().m12282e();
    }

    /* renamed from: n */
    public cti m12780n() {
        return this.f8900s;
    }

    /* renamed from: c */
    public static String m12754c(String str) {
        return "OverlayModule-" + str;
    }

    /* renamed from: a */
    public boolean mo1687a(String str) {
        return this.f8901t.contains(str);
    }

    /* renamed from: b */
    public void mo1688b(String str) {
        this.f8901t.add(str);
    }
}
