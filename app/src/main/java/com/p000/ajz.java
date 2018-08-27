package com.p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzqh;
import java.util.List;
import p000.bjt.C1254a;
import p000.blp.C0233e;
import p000.blp.C0235c;

@bhd
/* renamed from: ajz */
public class ajz extends ajv implements OnGlobalLayoutListener, OnScrollChangedListener {
    /* renamed from: l */
    private boolean f1765l;

    /* renamed from: ajz$1 */
    class C02321 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ajz f1759a;

        C02321(ajz ajz) {
            this.f1759a = ajz;
        }

        public void run() {
            this.f1759a.m2084e(this.f1759a.f.f14558j);
        }
    }

    /* renamed from: ajz$a */
    public class C0237a {
        /* renamed from: a */
        final /* synthetic */ ajz f1764a;

        public C0237a(ajz ajz) {
            this.f1764a = ajz;
        }

        /* renamed from: a */
        public void m2073a() {
            this.f1764a.onAdClicked();
        }
    }

    public ajz(Context context, zzeg zzeg, String str, bex bex, zzqh zzqh, ajx ajx) {
        super(context, zzeg, str, bex, zzqh, ajx);
    }

    /* renamed from: b */
    private zzeg m2074b(C1254a c1254a) {
        if (c1254a.f6530b.f15058A) {
            return this.f.f14557i;
        }
        ahw ahw;
        String str = c1254a.f6530b.f15087m;
        if (str != null) {
            String[] split = str.split("[xX]");
            split[0] = split[0].trim();
            split[1] = split[1].trim();
            ahw = new ahw(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        } else {
            ahw = this.f.f14557i.m19671b();
        }
        return new zzeg(this.f.f14551c, ahw);
    }

    /* renamed from: b */
    private boolean m2075b(bjt bjt, bjt bjt2) {
        if (bjt2.f6559n) {
            View a = akh.m2198a(bjt2);
            if (a == null) {
                bky.m9011e("Could not get mediation view");
                return false;
            }
            View nextView = this.f.f14554f.getNextView();
            if (nextView != null) {
                if (nextView instanceof blo) {
                    ((blo) nextView).destroy();
                }
                this.f.f14554f.removeView(nextView);
            }
            if (!akh.m2218b(bjt2)) {
                try {
                    m1955a(a);
                } catch (Throwable th) {
                    ako.m2347i().m8934a(th, "BannerAdManager.swapViews");
                    bky.m9009c("Could not add mediation view to view hierarchy.", th);
                    return false;
                }
            }
        } else if (!(bjt2.f6567v == null || bjt2.f6547b == null)) {
            bjt2.f6547b.mo1301a(bjt2.f6567v);
            this.f.f14554f.removeAllViews();
            this.f.f14554f.setMinimumWidth(bjt2.f6567v.f14936f);
            this.f.f14554f.setMinimumHeight(bjt2.f6567v.f14933c);
            m1955a(bjt2.f6547b.mo1305b());
        }
        if (this.f.f14554f.getChildCount() > 1) {
            this.f.f14554f.showNext();
        }
        if (bjt != null) {
            View nextView2 = this.f.f14554f.getNextView();
            if (nextView2 instanceof blo) {
                ((blo) nextView2).mo1298a(this.f.f14551c, this.f.f14557i, this.a);
            } else if (nextView2 != null) {
                this.f.f14554f.removeView(nextView2);
            }
            this.f.m19373d();
        }
        this.f.f14554f.setVisibility(0);
        return true;
    }

    /* renamed from: f */
    private void m2076f(final bjt bjt) {
        aqd.m4912b();
        if (this.f.m19374e()) {
            if (bjt.f6547b != null) {
                if (bjt.f6555j != null) {
                    this.h.m6450a(this.f.f14557i, bjt);
                }
                final ayf ayf = new ayf(this.f.f14551c, bjt.f6547b.mo1305b());
                if (ako.m2336D().m8882b()) {
                    ayf.m6565a(new bjm(this.f.f14551c, this.f.f14550b));
                }
                if (bjt.m8899a()) {
                    ayf.m6565a(bjt.f6547b);
                } else {
                    bjt.f6547b.mo1322l().m9415a(new C0235c(this) {
                        /* renamed from: a */
                        public void mo285a() {
                            ayf.m6565a(bjt.f6547b);
                        }
                    });
                }
            }
        } else if (this.f.f14538E != null && bjt.f6555j != null) {
            this.h.m6451a(this.f.f14557i, bjt, this.f.f14538E);
        }
    }

    /* renamed from: G */
    public void mo261G() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    /* renamed from: a */
    protected blo mo286a(C1254a c1254a, ajy ajy, bjk bjk) {
        if (this.f.f14557i.f14937g == null && this.f.f14557i.f14939i) {
            this.f.f14557i = m2074b(c1254a);
        }
        return super.mo286a(c1254a, ajy, bjk);
    }

    /* renamed from: a */
    protected void mo287a(bjt bjt, boolean z) {
        super.mo287a(bjt, z);
        if (akh.m2218b(bjt)) {
            akh.m2207a(bjt, new C0237a(this));
        }
    }

    /* renamed from: a */
    public void mo241a(boolean z) {
        aoi.m4687b("setManualImpressionsEnabled must be called from the main thread.");
        this.f1765l = z;
    }

    /* renamed from: a */
    public boolean mo268a(bjt bjt, final bjt bjt2) {
        if (!super.mo268a(bjt, bjt2)) {
            return false;
        }
        if (!this.f.m19374e() || m2075b(bjt, bjt2)) {
            blu z;
            if (bjt2.f6556k) {
                m2084e(bjt2);
                ako.m2335C().m9330a(this.f.f14554f, (OnGlobalLayoutListener) this);
                ako.m2335C().m9331a(this.f.f14554f, (OnScrollChangedListener) this);
                if (!bjt2.f6558m) {
                    final Runnable c02321 = new C02321(this);
                    blp l = bjt2.f6547b != null ? bjt2.f6547b.mo1322l() : null;
                    if (l != null) {
                        l.m9416a(new C0233e(this) {
                            /* renamed from: a */
                            public void mo284a() {
                                if (!bjt2.f6558m) {
                                    ako.m2343e();
                                    bkg.m9074b(c02321);
                                }
                            }
                        });
                    }
                }
            } else if (!this.f.m19375f() || ((Boolean) bbb.cb.m7064c()).booleanValue()) {
                mo287a(bjt2, false);
            }
            if (bjt2.f6547b != null) {
                z = bjt2.f6547b.mo1346z();
                blp l2 = bjt2.f6547b.mo1322l();
                if (l2 != null) {
                    l2.m9431h();
                }
            } else {
                z = null;
            }
            if (!(this.f.f14572x == null || z == null)) {
                z.m9594b(this.f.f14572x.f14958a);
            }
            m2076f(bjt2);
            return true;
        }
        m1954a(0);
        return false;
    }

    /* renamed from: a */
    public boolean mo242a(zzec zzec) {
        return super.mo242a(mo288d(zzec));
    }

    /* renamed from: d */
    zzec mo288d(zzec zzec) {
        if (zzec.f14920h == this.f1765l) {
            return zzec;
        }
        int i = zzec.f14913a;
        long j = zzec.f14914b;
        Bundle bundle = zzec.f14915c;
        int i2 = zzec.f14916d;
        List list = zzec.f14917e;
        boolean z = zzec.f14918f;
        int i3 = zzec.f14919g;
        boolean z2 = zzec.f14920h || this.f1765l;
        return new zzec(i, j, bundle, i2, list, z, i3, z2, zzec.f14921i, zzec.f14922j, zzec.f14923k, zzec.f14924l, zzec.f14925m, zzec.f14926n, zzec.f14927o, zzec.f14928p, zzec.f14929q, zzec.f14930r);
    }

    /* renamed from: e */
    void m2084e(bjt bjt) {
        if (bjt != null && !bjt.f6558m && this.f.f14554f != null && ako.m2343e().m9113a(this.f.f14554f, this.f.f14551c) && this.f.f14554f.getGlobalVisibleRect(new Rect(), null)) {
            if (!(bjt == null || bjt.f6547b == null || bjt.f6547b.mo1322l() == null)) {
                bjt.f6547b.mo1322l().m9416a(null);
            }
            mo287a(bjt, false);
            bjt.f6558m = true;
        }
    }

    public void onGlobalLayout() {
        m2084e(this.f.f14558j);
    }

    public void onScrollChanged() {
        m2084e(this.f.f14558j);
    }

    /* renamed from: q */
    public baf mo255q() {
        aoi.m4687b("getVideoController must be called from the main thread.");
        return (this.f.f14558j == null || this.f.f14558j.f6547b == null) ? null : this.f.f14558j.f6547b.mo1346z();
    }

    /* renamed from: x */
    protected boolean mo274x() {
        boolean z = true;
        if (!ako.m2343e().m9112a(this.f.f14551c, this.f.f14551c.getPackageName(), "android.permission.INTERNET")) {
            azp.m6789a().m9292a(this.f.f14554f, this.f.f14557i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        if (!ako.m2343e().m9111a(this.f.f14551c)) {
            azp.m6789a().m9292a(this.f.f14554f, this.f.f14557i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!(z || this.f.f14554f == null)) {
            this.f.f14554f.setVisibility(0);
        }
        return z;
    }
}
