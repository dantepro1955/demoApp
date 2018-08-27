package com.p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C0370e;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.mopub.nativeads.NativeAd;
import com.ninegag.android.app.R;
import com.ninegag.android.app.component.postlist.overlay.AdOverlayFragment;
import com.ninegag.android.app.otto.overlay.GagItemUpdatedEvent;
import com.ninegag.android.app.otto.overlay.OverlayPageScrollStateChangedEvent;
import com.ninegag.android.app.otto.overlay.OverlayPageSwitchEvent;
import com.ninegag.android.app.ui.OverlayActivityV2;
import java.lang.ref.WeakReference;
import p000.crw.C4102a;

/* compiled from: OverlayModuleV2 */
/* renamed from: ces */
public class ces implements cee {
    /* renamed from: a */
    private final boolean f8948a;
    /* renamed from: b */
    private final String f8949b;
    /* renamed from: c */
    private caf f8950c = caf.m12046a();
    /* renamed from: d */
    private cco f8951d;
    /* renamed from: e */
    private cge f8952e;
    /* renamed from: f */
    private Handler f8953f;
    /* renamed from: g */
    private Handler f8954g;
    /* renamed from: h */
    private HandlerThread f8955h;
    /* renamed from: i */
    private ceo f8956i;
    /* renamed from: j */
    private C0370e f8957j;
    /* renamed from: k */
    private C4102a f8958k;
    /* renamed from: l */
    private col f8959l;
    /* renamed from: m */
    private cew f8960m;
    /* renamed from: n */
    private ceu f8961n;
    /* renamed from: o */
    private cer f8962o;
    /* renamed from: p */
    private WeakReference<AppCompatActivity> f8963p;
    /* renamed from: q */
    private ViewPager f8964q;
    /* renamed from: r */
    private long f8965r = 0;
    /* renamed from: s */
    private cnv f8966s;
    /* renamed from: t */
    private cti f8967t;
    /* renamed from: u */
    private final hi<String> f8968u = new hi();
    /* renamed from: v */
    private int f8969v = -1;

    /* compiled from: OverlayModuleV2 */
    /* renamed from: ces$a */
    public static class C1696a implements C4102a {
        /* renamed from: a */
        private WeakReference<ces> f8944a;

        public C1696a(ces ces) {
            this.f8944a = new WeakReference(ces);
        }

        /* renamed from: a */
        public void m12843a() {
        }

        /* renamed from: a */
        public void m12844a(boolean z, boolean z2) {
            m12842b();
        }

        /* renamed from: b */
        public void m12845b(boolean z, boolean z2) {
            m12842b();
        }

        /* renamed from: b */
        private void m12842b() {
            ces ces = (ces) this.f8944a.get();
            if (ces != null) {
                ces.f8956i.notifyDataSetChanged();
            }
        }
    }

    /* compiled from: OverlayModuleV2 */
    /* renamed from: ces$b */
    public static class C1697b implements C0370e {
        /* renamed from: a */
        private WeakReference<ces> f8945a;
        /* renamed from: b */
        private int f8946b = -1;
        /* renamed from: c */
        private boolean f8947c;

        public C1697b(ces ces, boolean z) {
            this.f8945a = new WeakReference(ces);
            this.f8947c = z;
        }

        /* renamed from: a */
        public void mo424a(int i, float f, int i2) {
        }

        /* renamed from: b */
        public void mo425b(int i) {
            ces ces = (ces) this.f8945a.get();
            if (ces != null) {
                boolean z;
                cct e;
                if (i != this.f8946b && this.f8946b > -1 && cip.m13967a().m14017v()) {
                    dhe.c("hint-swipe-overlay", new cbm(false));
                    cip.m13967a().m14018w();
                    chn.m13445q("OnBoarding", "CompleteSwipeOverlayTutorial");
                }
                if (this.f8946b <= -1 || i <= this.f8946b) {
                    z = false;
                } else {
                    z = true;
                }
                ces.f8969v = i;
                if (!ces.m12875e().b_(i)) {
                    dhe.c(ces.f8951d.f8730b, new GagItemUpdatedEvent(ces.m12875e().mo1693e(i)));
                } else if (this.f8946b > -1) {
                    if (i > this.f8946b) {
                        if (!ces.m12877g()) {
                            ces.m12865a(i + 1);
                            return;
                        }
                    } else if (!ces.m12877g()) {
                        ces.m12865a(i - 1);
                        return;
                    }
                }
                if (this.f8946b < 0) {
                    this.f8946b = 0;
                }
                ces.f8952e.m13091b(ces.m12875e().m12827c(i));
                m12847d(ces.m12875e().m12827c(i));
                this.f8946b = i;
                m12846c(i);
                if (ces.m12875e().b_(i)) {
                    e = ces.m12875e().mo1693e(i);
                } else {
                    e = ces.f8952e.m13101m();
                }
                String str = null;
                if (e != null) {
                    String e2 = e.m12282e();
                    AppCompatActivity appCompatActivity = (AppCompatActivity) ces.f8963p.get();
                    if (appCompatActivity != null) {
                        ces.f8961n.m12909a(appCompatActivity.findViewById(R.id.layout), e);
                    }
                    ces.m12856b(i, z);
                    str = e2;
                }
                cnv f = ces.f8966s;
                if (f != null) {
                    f.m14919a(e);
                }
                if (str != null) {
                    int l = ces.f8952e.m13100l() + 1;
                    int l2 = ces.f8952e.m13100l() - 1;
                    if (l < ces.m12875e().getCount() && !ces.m12875e().b_(ces.m12875e().m12829d(l))) {
                        cct e3 = ces.m12875e().mo1693e(ces.m12875e().m12829d(l));
                        if (!(e3 == null || f == null)) {
                            f.m14920b(e3);
                            if (e3.m12287j()) {
                                cqk.a(e3);
                                cqk.c(e3);
                            } else {
                                cqk.b(e3);
                            }
                        }
                    }
                    if (l2 >= 0 && ces.m12875e().getCount() < l2 && !ces.m12875e().b_(ces.m12875e().m12829d(l2))) {
                        cct e4 = ces.m12875e().mo1693e(ces.m12875e().m12829d(l2));
                        if (!(e4 == null || f == null)) {
                            f.m14920b(e4);
                        }
                    }
                }
                dhe.c(ces.m12858c(str), new OverlayPageSwitchEvent(str));
            }
        }

        /* renamed from: a */
        public void mo423a(int i) {
            if (!this.f8947c) {
                ces ces = (ces) this.f8945a.get();
                if (ces != null) {
                    cct m = ces.f8952e.m13101m();
                    String str = null;
                    if (m != null) {
                        str = m.m12282e();
                    }
                    if (str != null) {
                        dhe.c(ces.m12858c(str), new OverlayPageScrollStateChangedEvent(i, str));
                    }
                }
            }
        }

        /* renamed from: c */
        private void m12846c(int i) {
            ces ces = (ces) this.f8945a.get();
            if (ces != null && !ces.m12875e().b_(i)) {
                Log.d("OverlayModuleV2", "checkLoadMore(): " + i + " + " + 6 + " >= " + ces.f8952e.size());
                if (i + 6 > ces.f8952e.size()) {
                    ces.f8952e.m12581a(ces.f8956i);
                }
            }
        }

        /* renamed from: d */
        private void m12847d(int i) {
            ces ces = (ces) this.f8945a.get();
            if (ces != null) {
                if (i == this.f8946b + 1) {
                    chn.m13400c("OverlayList", "SwipeRight", ces.f8951d.m12564c());
                } else if (i == this.f8946b - 1) {
                    chn.m13400c("OverlayList", "SwipeLeft", ces.f8951d.m12564c());
                }
            }
        }
    }

    public ces(cco cco, col col, boolean z, String str) {
        this.f8951d = cco;
        this.f8959l = col;
        this.f8949b = str;
        this.f8948a = z;
    }

    /* renamed from: a */
    public void m12868a(Bundle bundle, AppCompatActivity appCompatActivity) {
        this.f8963p = new WeakReference(appCompatActivity);
        this.f8952e = new cge(cgb.m13071a(this.f8951d), new cit(ckv.m14212a(), caf.m12046a(), true), caf.m12046a());
        if (this.f8951d.f8731c == 13) {
            this.f8952e.clear();
            this.f8952e.m13090a(cct.m12254a(caf.m12046a().m12075g().f9370c.m13832i(this.f8949b)));
        } else {
            this.f8952e.m13098j();
        }
        this.f8956i = new ceo(appCompatActivity, this.f8952e, this.f8951d, this.f8949b);
        this.f8957j = new C1697b(this, this.f8948a);
        this.f8958k = new C1696a(this);
        this.f8960m = new cew(this.f8948a);
        this.f8961n = new ceu(this.f8951d);
        this.f8962o = new cer(this.f8951d);
        if (this.f8963p.get() instanceof OverlayActivityV2) {
            this.f8964q = ((OverlayActivityV2) this.f8963p.get()).getViewPager();
        }
        this.f8966s = new cnv("OverlayModuleV2:comment");
        this.f8966s.start();
        this.f8967t = new cti();
    }

    /* renamed from: a */
    public void m12864a() {
        if (this.f8966s == null) {
            this.f8966s = new cnv("OverlayModuleV2:comment");
            this.f8966s.start();
        }
        if (this.f8953f == null) {
            this.f8953f = new Handler(Looper.getMainLooper());
            this.f8955h = new HandlerThread("blitz-bg-thread");
            this.f8955h.start();
            this.f8954g = new Handler(this.f8955h.getLooper());
        }
        dhe.a(this.f8951d.f8730b, this.f8952e);
        dhe.a(this.f8951d.f8730b, this.f8962o);
        m12862o();
        if (this.f8969v <= -1 || m12875e().getCount() <= 0 || !m12875e().b_(this.f8969v)) {
            m12865a(m12875e().m12829d(this.f8952e.m13100l()));
        } else {
            m12865a(this.f8969v);
        }
    }

    /* renamed from: b */
    public void m12870b() {
        this.f8955h.quit();
        this.f8955h = null;
        this.f8954g = null;
        this.f8953f = null;
        if (this.f8966s != null) {
            this.f8966s.quit();
            this.f8966s = null;
        }
        m12863p();
        dhe.b(this.f8951d.f8730b, this.f8952e);
        dhe.b(this.f8951d.f8730b, this.f8962o);
    }

    /* renamed from: c */
    public void m12873c() {
        if (this.f8969v <= -1 || !m12875e().b_(this.f8969v)) {
            this.f8960m.m12914a(m12875e().m12829d(this.f8952e.m13100l()), false);
        } else {
            this.f8960m.m12914a(this.f8969v, false);
        }
        if (m12875e() != null) {
            m12875e().notifyDataSetChanged();
            if (m12875e().b_(this.f8969v)) {
                try {
                    int i = this.f8969v;
                    m12866a(i + 2, false);
                    m12865a(i);
                } catch (Exception e) {
                }
            }
        }
        this.f8961n.m12910e();
    }

    /* renamed from: d */
    public void m12874d() {
        this.f8952e.m13097i();
        this.f8950c.m12077h().m13981a(this.f8951d.f8731c, this.f8951d.f8732d, m12883m(), djy.a(this.f8950c.f8449a), 0, 0);
    }

    /* renamed from: a */
    public void m12867a(Bundle bundle) {
    }

    /* renamed from: e */
    public ceo m12875e() {
        return this.f8956i;
    }

    /* renamed from: a */
    public void m12866a(int i, boolean z) {
        AppCompatActivity appCompatActivity = (AppCompatActivity) this.f8963p.get();
        if (appCompatActivity != null) {
            cct c;
            if (i == 0) {
                c = m12875e().mo1692c();
                if (c != null && z) {
                    this.f8961n.m12909a(appCompatActivity.findViewById(R.id.layout), c);
                }
            } else {
                ((ViewPager) appCompatActivity.findViewById(R.id.pager)).setCurrentItem(i, false);
                c = m12875e().b_(i) ? m12875e().mo1693e(i) : m12875e().mo1692c();
                if (c != null && z) {
                    this.f8961n.m12909a(appCompatActivity.findViewById(R.id.layout), c);
                    m12856b(i, false);
                }
            }
            if (!m12875e().b_(i)) {
                new Handler().postDelayed(cet.m12885a(this, i), 1000);
            }
        }
    }

    /* renamed from: a */
    public void m12865a(int i) {
        m12866a(i, true);
    }

    /* renamed from: b */
    private void m12856b(int i, boolean z) {
        if (m12875e().b_(i)) {
            dhe.c(this.f8951d.f8730b, new cdm(false));
            try {
                AdOverlayFragment adOverlayFragment = (AdOverlayFragment) m12875e().i(i);
                if (adOverlayFragment != null) {
                    cct e = m12875e().mo1693e(i);
                    if (e != null) {
                        NativeAd a = ((cdj) e.R()).m12665a();
                        if (a != null && !a.isDestroyed()) {
                            adOverlayFragment.a(a);
                        } else if (z) {
                            m12865a(i + 1);
                        } else {
                            m12865a(i - 1);
                        }
                    }
                }
            } catch (Exception e2) {
            }
        }
    }

    /* renamed from: f */
    public C0370e m12876f() {
        return this.f8957j;
    }

    /* renamed from: g */
    public boolean m12877g() {
        return this.f8956i.m12825a();
    }

    /* renamed from: b */
    public void m12871b(int i) {
        this.f8952e.m13091b(i);
    }

    /* renamed from: o */
    private void m12862o() {
        String str = "";
        if (this.f8952e.m13101m() != null) {
            str = this.f8952e.m13101m().m12282e();
        }
        this.f8960m.m12834a(ces.m12858c(str), this);
        this.f8961n.m12834a(ces.m12858c(str), this);
        this.f8962o.m12834a(ces.m12858c(str), this);
    }

    /* renamed from: p */
    private void m12863p() {
        this.f8960m.mo1696a();
        this.f8961n.mo1696a();
        this.f8962o.mo1696a();
    }

    /* renamed from: h */
    public OverlayActivityV2 m12878h() {
        return (OverlayActivityV2) this.f8963p.get();
    }

    /* renamed from: i */
    public ViewPager m12879i() {
        return this.f8964q;
    }

    /* renamed from: j */
    public cew m12880j() {
        return this.f8960m;
    }

    /* renamed from: k */
    public ceu m12881k() {
        return this.f8961n;
    }

    /* renamed from: l */
    public col m12882l() {
        return this.f8959l;
    }

    /* renamed from: m */
    public String m12883m() {
        if (this.f8952e.m13101m() == null) {
            return "";
        }
        return this.f8952e.m13101m().m12282e();
    }

    /* renamed from: n */
    public cti m12884n() {
        return this.f8967t;
    }

    /* renamed from: c */
    protected static String m12858c(String str) {
        return "OverlayModule-" + str;
    }

    /* renamed from: a */
    public boolean mo1687a(String str) {
        return this.f8968u.contains(str);
    }

    /* renamed from: b */
    public void mo1688b(String str) {
        this.f8968u.add(str);
    }
}
