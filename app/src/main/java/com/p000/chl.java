package com.p000;

import com.ninegag.android.app.R;
import com.ninegag.android.app.ui.HomeActivity;

/* compiled from: HomeSocialController */
/* renamed from: chl */
public class chl {
    /* renamed from: f */
    private static caf f9227f = caf.m12046a();
    /* renamed from: a */
    dik f9228a;
    /* renamed from: b */
    HomeActivity f9229b;
    /* renamed from: c */
    boolean f9230c = false;
    /* renamed from: d */
    long f9231d = 0;
    /* renamed from: e */
    long f9232e = 0;

    /* renamed from: a */
    public void m13292a() {
        f9227f.m12066c((Object) this);
    }

    /* renamed from: b */
    public void m13296b() {
        f9227f.m12074f((Object) this);
    }

    /* renamed from: a */
    public void m13293a(HomeActivity homeActivity) {
        this.f9229b = homeActivity;
    }

    /* renamed from: a */
    public void m13294a(dik dik) {
        this.f9228a = dik;
    }

    @dhg
    public void onFacebookSessionOpened(din din) {
        if (cqw.a(this.f9231d) >= 2000) {
            this.f9231d = cqw.a();
            if (this.f9230c) {
                this.f9230c = false;
                String a = ctm.a(din.f21747a, cip.m13967a().m13976H());
                m13295a(String.format(this.f9229b.getString(R.string.loading_logging_in_service), new Object[]{this.f9229b.getString(R.string.service_facebook)}));
                chr.m13522a().m13548a(a, f9227f.m12068d().m12028g(), -1);
            }
        }
    }

    @dhg
    public void onGplusTokenReady(dip dip) {
        if (cqw.a(this.f9232e) >= 2000) {
            this.f9232e = cqw.a();
            chr.m13522a().m13548a(ctm.b(dip.f21750a, dip.f21751b, cip.m13967a().m13976H()), f9227f.m12068d().m12028g(), -1);
        }
    }

    /* renamed from: a */
    protected void m13295a(String str) {
        if (this.f9229b != null && !this.f9229b.isFinishing()) {
            this.f9229b.getNavHelper().a(this.f9229b.getSupportFragmentManager(), str);
        }
    }
}
