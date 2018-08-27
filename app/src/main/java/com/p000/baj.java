package com.p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzej;
import com.google.android.gms.internal.zzft;
import java.util.concurrent.atomic.AtomicBoolean;

@bhd
/* renamed from: baj */
public class baj {
    /* renamed from: a */
    final azr f5243a;
    /* renamed from: b */
    private final bev f5244b;
    /* renamed from: c */
    private final azl f5245c;
    /* renamed from: d */
    private final AtomicBoolean f5246d;
    /* renamed from: e */
    private final ahz f5247e;
    /* renamed from: f */
    private azd f5248f;
    /* renamed from: g */
    private aht f5249g;
    /* renamed from: h */
    private ahw[] f5250h;
    /* renamed from: i */
    private aib f5251i;
    /* renamed from: j */
    private ahx f5252j;
    /* renamed from: k */
    private azx f5253k;
    /* renamed from: l */
    private akq f5254l;
    /* renamed from: m */
    private aid f5255m;
    /* renamed from: n */
    private aks f5256n;
    /* renamed from: o */
    private aia f5257o;
    /* renamed from: p */
    private String f5258p;
    /* renamed from: q */
    private String f5259q;
    /* renamed from: r */
    private ViewGroup f5260r;
    /* renamed from: s */
    private int f5261s;
    /* renamed from: t */
    private boolean f5262t;

    /* renamed from: baj$1 */
    class C09651 extends azr {
        /* renamed from: a */
        final /* synthetic */ baj f5242a;

        C09651(baj baj) {
            this.f5242a = baj;
        }

        public void onAdFailedToLoad(int i) {
            this.f5242a.f5247e.m1643a(this.f5242a.m6970m());
            super.onAdFailedToLoad(i);
        }

        public void onAdLoaded() {
            this.f5242a.f5247e.m1643a(this.f5242a.m6970m());
            super.onAdLoaded();
        }
    }

    public baj(ViewGroup viewGroup) {
        this(viewGroup, null, false, azl.m6730a(), 0);
    }

    public baj(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, azl.m6730a(), i);
    }

    public baj(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, azl.m6730a(), 0);
    }

    public baj(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, azl.m6730a(), i);
    }

    baj(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, azl azl, int i) {
        this(viewGroup, attributeSet, z, azl, null, i);
    }

    baj(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, azl azl, azx azx, int i) {
        this.f5244b = new bev();
        this.f5247e = new ahz();
        this.f5243a = new C09651(this);
        this.f5260r = viewGroup;
        this.f5245c = azl;
        this.f5253k = azx;
        this.f5246d = new AtomicBoolean(false);
        this.f5261s = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzej zzej = new zzej(context, attributeSet);
                this.f5250h = zzej.m19674a(z);
                this.f5258p = zzej.m19673a();
                if (viewGroup.isInEditMode()) {
                    azp.m6789a().m9291a(viewGroup, baj.m6940a(context, this.f5250h[0], this.f5261s), "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                azp.m6789a().m9292a(viewGroup, new zzeg(context, ahw.f1525a), e.getMessage(), e.getMessage());
            }
        }
    }

    /* renamed from: a */
    private static zzeg m6940a(Context context, ahw ahw, int i) {
        zzeg zzeg = new zzeg(context, ahw);
        zzeg.m19670a(baj.m6942a(i));
        return zzeg;
    }

    /* renamed from: a */
    private static zzeg m6941a(Context context, ahw[] ahwArr, int i) {
        zzeg zzeg = new zzeg(context, ahwArr);
        zzeg.m19670a(baj.m6942a(i));
        return zzeg;
    }

    /* renamed from: a */
    private static boolean m6942a(int i) {
        return i == 1;
    }

    /* renamed from: q */
    private void m6943q() {
        try {
            aqq i = this.f5253k.mo246i();
            if (i != null) {
                this.f5260r.addView((View) aqr.m4968a(i));
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to get an ad frame.", e);
        }
    }

    /* renamed from: a */
    public void m6944a() {
        try {
            if (this.f5253k != null) {
                this.f5253k.mo245h();
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to destroy AdView.", e);
        }
    }

    /* renamed from: a */
    public void m6945a(aht aht) {
        this.f5249g = aht;
        this.f5243a.m6796a(aht);
    }

    /* renamed from: a */
    public void m6946a(ahx ahx) {
        this.f5252j = ahx;
        try {
            if (this.f5253k != null) {
                this.f5253k.mo229a(this.f5252j == null ? null : this.f5252j.m1633a());
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to set correlator.", e);
        }
    }

    /* renamed from: a */
    public void m6947a(aia aia) {
        this.f5257o = aia;
        try {
            if (this.f5253k != null) {
                this.f5253k.mo237a(aia == null ? null : new zzft(aia));
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to set video options.", e);
        }
    }

    /* renamed from: a */
    public void m6948a(aib aib) {
        try {
            this.f5251i = aib;
            if (this.f5253k != null) {
                this.f5253k.mo228a(aib != null ? new azn(aib) : null);
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to set the AppEventListener.", e);
        }
    }

    /* renamed from: a */
    public void m6949a(aid aid) {
        this.f5255m = aid;
        try {
            if (this.f5253k != null) {
                this.f5253k.mo230a(aid != null ? new bbo(aid) : null);
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to set the onCustomRenderedAdLoadedListener.", e);
        }
    }

    /* renamed from: a */
    public void m6950a(akq akq) {
        if (this.f5256n != null) {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        try {
            this.f5254l = akq;
            if (this.f5253k != null) {
                this.f5253k.mo231a(akq != null ? new bgh(akq) : null);
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to set the InAppPurchaseListener.", e);
        }
    }

    /* renamed from: a */
    public void m6951a(aks aks, String str) {
        if (this.f5254l != null) {
            throw new IllegalStateException("InAppPurchaseListener has already been set.");
        }
        try {
            this.f5256n = aks;
            this.f5259q = str;
            if (this.f5253k != null) {
                this.f5253k.mo232a(aks != null ? new bgl(aks) : null, str);
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to set the play store purchase parameter.", e);
        }
    }

    /* renamed from: a */
    public void m6952a(azd azd) {
        try {
            this.f5248f = azd;
            if (this.f5253k != null) {
                this.f5253k.mo226a(azd != null ? new aze(azd) : null);
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to set the AdClickListener.", e);
        }
    }

    /* renamed from: a */
    public void m6953a(bai bai) {
        try {
            if (this.f5253k == null) {
                m6972o();
            }
            if (this.f5253k.mo242a(this.f5245c.m6731a(this.f5260r.getContext(), bai))) {
                this.f5244b.m7924a(bai.m6933j());
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to load ad.", e);
        }
    }

    /* renamed from: a */
    public void m6954a(String str) {
        if (this.f5258p != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f5258p = str;
    }

    /* renamed from: a */
    public void m6955a(boolean z) {
        this.f5262t = z;
        try {
            if (this.f5253k != null) {
                this.f5253k.mo241a(this.f5262t);
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to set manual impressions.", e);
        }
    }

    /* renamed from: a */
    public void m6956a(ahw... ahwArr) {
        if (this.f5250h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        m6959b(ahwArr);
    }

    /* renamed from: a */
    public boolean m6957a(zzeg zzeg) {
        return "search_v2".equals(zzeg.f14931a);
    }

    /* renamed from: b */
    public aht m6958b() {
        return this.f5249g;
    }

    /* renamed from: b */
    public void m6959b(ahw... ahwArr) {
        this.f5250h = ahwArr;
        try {
            if (this.f5253k != null) {
                this.f5253k.mo235a(baj.m6941a(this.f5260r.getContext(), this.f5250h, this.f5261s));
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to set the ad size.", e);
        }
        this.f5260r.requestLayout();
    }

    /* renamed from: c */
    public ahw m6960c() {
        try {
            if (this.f5253k != null) {
                zzeg j = this.f5253k.mo247j();
                if (j != null) {
                    return j.m19671b();
                }
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to get the current AdSize.", e);
        }
        return this.f5250h != null ? this.f5250h[0] : null;
    }

    /* renamed from: d */
    public ahw[] m6961d() {
        return this.f5250h;
    }

    /* renamed from: e */
    public String m6962e() {
        return this.f5258p;
    }

    /* renamed from: f */
    public aib m6963f() {
        return this.f5251i;
    }

    /* renamed from: g */
    public akq m6964g() {
        return this.f5254l;
    }

    /* renamed from: h */
    public aid m6965h() {
        return this.f5255m;
    }

    /* renamed from: i */
    public void m6966i() {
        try {
            if (this.f5253k != null) {
                this.f5253k.mo250m();
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to call pause.", e);
        }
    }

    /* renamed from: j */
    public void m6967j() {
        try {
            if (this.f5253k != null) {
                this.f5253k.mo251n();
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to call resume.", e);
        }
    }

    /* renamed from: k */
    public String m6968k() {
        try {
            if (this.f5253k != null) {
                return this.f5253k.mo260F();
            }
        } catch (Throwable e) {
            bky.m9009c("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    /* renamed from: l */
    public ahz m6969l() {
        return this.f5247e;
    }

    /* renamed from: m */
    public baf m6970m() {
        baf baf = null;
        if (this.f5253k != null) {
            try {
                baf = this.f5253k.mo255q();
            } catch (Throwable e) {
                bky.m9009c("Failed to retrieve VideoController.", e);
            }
        }
        return baf;
    }

    /* renamed from: n */
    public aia m6971n() {
        return this.f5257o;
    }

    /* renamed from: o */
    void m6972o() throws RemoteException {
        if ((this.f5250h == null || this.f5258p == null) && this.f5253k == null) {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        this.f5253k = m6973p();
        this.f5253k.mo227a(new azf(this.f5243a));
        if (this.f5248f != null) {
            this.f5253k.mo226a(new aze(this.f5248f));
        }
        if (this.f5251i != null) {
            this.f5253k.mo228a(new azn(this.f5251i));
        }
        if (this.f5254l != null) {
            this.f5253k.mo231a(new bgh(this.f5254l));
        }
        if (this.f5256n != null) {
            this.f5253k.mo232a(new bgl(this.f5256n), this.f5259q);
        }
        if (this.f5255m != null) {
            this.f5253k.mo230a(new bbo(this.f5255m));
        }
        if (this.f5252j != null) {
            this.f5253k.mo229a(this.f5252j.m1633a());
        }
        if (this.f5257o != null) {
            this.f5253k.mo237a(new zzft(this.f5257o));
        }
        this.f5253k.mo241a(this.f5262t);
        m6943q();
    }

    /* renamed from: p */
    protected azx m6973p() throws RemoteException {
        Context context = this.f5260r.getContext();
        zzeg a = baj.m6941a(context, this.f5250h, this.f5261s);
        return m6957a(a) ? azp.m6791b().m6782a(context, a, this.f5258p) : azp.m6791b().m6783a(context, a, this.f5258p, this.f5244b);
    }
}
