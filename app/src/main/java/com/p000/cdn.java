package com.p000;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AdChoicesView;
import com.google.android.gms.ads.formats.NativeAdView;
import com.mopub.nativeads.AdMobStaticNativeAd;
import com.mopub.nativeads.FacebookNative.FacebookStaticNativeAd;
import com.mopub.nativeads.FacebookNative.FacebookVideoEnabledNativeAd;
import com.mopub.nativeads.NativeAd;
import com.ninegag.android.app.R;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.aig.C0191a;

/* compiled from: MoPubAdPostRenderer */
/* renamed from: cdn */
public class cdn extends ccp implements Closeable {
    /* renamed from: d */
    private final List<NativeAd> f8816d = new ArrayList();
    /* renamed from: e */
    private final List<NativeAdView> f8817e = new ArrayList();
    /* renamed from: f */
    private final Map<View, NativeAd> f8818f = new hh();
    /* renamed from: g */
    private final Map<View, NativeAdView> f8819g = new hh();
    /* renamed from: h */
    private final Map<Integer, NativeAd> f8820h = new hh();
    /* renamed from: i */
    private cdl f8821i;
    /* renamed from: j */
    private int f8822j;
    /* renamed from: k */
    private int f8823k;

    public cdn(String str, com com, boolean z, cco cco) {
        super(str, com, z, cco);
    }

    /* renamed from: a */
    public void m12681a(cdl cdl) {
        this.f8821i = cdl;
    }

    /* renamed from: b */
    public void mo1660b(C0605t c0605t, int i, cct cct) {
        NativeAd nativeAd;
        NativeAd nativeAd2 = null;
        cdt cdt = (cdt) c0605t;
        if (this.f8821i != null) {
            if (this.f8820h.containsKey(Integer.valueOf(i))) {
                nativeAd = (NativeAd) this.f8820h.get(Integer.valueOf(i));
                if (!this.f8816d.contains(nativeAd) || nativeAd.isDestroyed()) {
                    this.f8820h.remove(Integer.valueOf(i));
                    nativeAd = null;
                }
            } else {
                nativeAd = null;
            }
            if (nativeAd == null) {
                nativeAd2 = this.f8821i.m12668a();
            } else {
                nativeAd2 = nativeAd;
            }
        }
        if (nativeAd2 != null) {
            cdt.f8845y.setVisibility(0);
            if (cdt.t != null) {
                cdt.t.setVisibility(0);
            }
            this.f8820h.put(Integer.valueOf(i), nativeAd2);
            if (!this.f8816d.add(nativeAd2)) {
                this.f8816d.add(nativeAd2);
                m12679c();
            }
            m12674a(cdt, nativeAd2);
            com.facebook.ads.NativeAd nativeAd3;
            if (nativeAd2.getBaseNativeAd() instanceof FacebookStaticNativeAd) {
                nativeAd3 = ((FacebookStaticNativeAd) nativeAd2.getBaseNativeAd()).getNativeAd();
                if (!m12677a(c0605t.itemView, nativeAd3)) {
                    cdt.m12693a(new AdChoicesView(c0605t.itemView.getContext(), nativeAd3, true), nativeAd3.getAdChoicesLinkUrl());
                }
                if (cdt.f8831A != null) {
                    cdt.f8831A.setVisibility(0);
                }
            } else if (nativeAd2.getBaseNativeAd() instanceof FacebookVideoEnabledNativeAd) {
                nativeAd3 = ((FacebookVideoEnabledNativeAd) nativeAd2.getBaseNativeAd()).getNativeAd();
                if (!m12677a(c0605t.itemView, nativeAd3)) {
                    cdt.m12693a(new AdChoicesView(c0605t.itemView.getContext(), nativeAd3, true), nativeAd3.getAdChoicesLinkUrl());
                }
                if (cdt.f8831A != null) {
                    cdt.f8831A.setVisibility(0);
                }
            } else if (cdt.f8831A != null) {
                cdt.f8831A.setVisibility(8);
            }
            cdt.f8841u.setOnClickListener(cdo.m12683a(cdt));
            if (this.f8818f.get(cdt.f8845y) != null) {
                nativeAd = (NativeAd) this.f8818f.get(cdt.f8835E);
                if (!(nativeAd == null || nativeAd.equals(nativeAd2))) {
                    nativeAd.clear(cdt.f8835E);
                }
            }
            if (this.f8819g.get(cdt.f8845y) != null) {
                new Handler(Looper.getMainLooper()).post(cdp.m12684a((NativeAdView) this.f8819g.remove(cdt.f8845y)));
            }
            boolean z = nativeAd2.getBaseNativeAd() instanceof AdMobStaticNativeAd;
            if (z) {
                try {
                    nativeAd2.renderAdView(cdt.f8834D);
                    nativeAd2.prepare(cdt.f8834D);
                    cdt.f8835E.setVisibility(8);
                } catch (NullPointerException e) {
                }
            } else {
                nativeAd2.renderAdView(cdt.f8835E);
                nativeAd2.prepare(cdt.f8835E);
            }
            this.f8822j = djh.a(cdt.f8841u.getContext()).x;
            this.f8823k = (int) (((double) this.f8822j) / 1.91d);
            cdt.f8841u.setLayoutParams(new LayoutParams(this.f8822j, this.f8823k));
            cdt.f8841u.requestLayout();
            if (z) {
                AdMobStaticNativeAd adMobStaticNativeAd = (AdMobStaticNativeAd) nativeAd2.getBaseNativeAd();
                if (adMobStaticNativeAd.getNativeAd() != null) {
                    m12672a(cdt.f8845y, adMobStaticNativeAd.getNativeAd(), cdt);
                }
            }
            this.f8818f.put(cdt.f8845y, nativeAd2);
            if (!this.f8816d.contains(nativeAd2)) {
                this.f8816d.add(nativeAd2);
                m12679c();
            }
            this.f8821i.r_();
            return;
        }
        cdt.f8845y.setVisibility(8);
        if (cdt.t != null) {
            cdt.t.setVisibility(8);
        }
    }

    public void close() {
        this.f8818f.clear();
        this.f8819g.clear();
        this.f8820h.clear();
    }

    /* renamed from: c */
    private void m12679c() {
        while (this.f8816d.size() > 5) {
            try {
                NativeAd nativeAd = (NativeAd) this.f8816d.remove(0);
                if (nativeAd.getBaseNativeAd() instanceof AdMobStaticNativeAd) {
                    AdMobStaticNativeAd adMobStaticNativeAd = (AdMobStaticNativeAd) nativeAd.getBaseNativeAd();
                    if (adMobStaticNativeAd != null) {
                        new Handler(Looper.getMainLooper()).post(cdq.m12685a(adMobStaticNativeAd));
                        this.f8817e.remove(adMobStaticNativeAd);
                    }
                }
                nativeAd.destroy();
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: d */
    private void m12680d() {
        while (this.f8817e.size() > 5) {
            new Handler(Looper.getMainLooper()).post(cdr.m12686a((NativeAdView) this.f8817e.remove(0)));
        }
    }

    /* renamed from: a */
    private void m12674a(cdt cdt, NativeAd nativeAd) {
        if (!(nativeAd.getBaseNativeAd() instanceof AdMobStaticNativeAd)) {
            cdt.m12692a(0, nativeAd);
        } else if (((AdMobStaticNativeAd) nativeAd.getBaseNativeAd()).getNativeAd() instanceof aii) {
            cdt.m12692a(1, nativeAd);
        } else {
            cdt.m12692a(2, nativeAd);
        }
    }

    /* renamed from: a */
    private boolean m12677a(View view, com.facebook.ads.NativeAd nativeAd) {
        View findViewById = view.findViewById(R.id.adchoices_view);
        if (findViewById == null) {
            return false;
        }
        String str = (String) findViewById.getTag();
        if (str == null || nativeAd.getAdChoicesLinkUrl() == null) {
            return false;
        }
        return str.equals(nativeAd.getAdChoicesLinkUrl());
    }

    /* renamed from: a */
    private void m12672a(View view, aig aig, cdt cdt) {
        try {
            NativeAdView nativeAdView;
            List c;
            if (aig instanceof aii) {
                cdt.f8832B.setHeadlineView(cdt.f8839a);
                cdt.f8832B.setBodyView(cdt.f8840b);
                cdt.f8832B.setImageView(cdt.f8841u);
                cdt.f8832B.setCallToActionView(cdt.f8844x);
                cdt.f8839a.setText(((aii) aig).mo981b());
                cdt.f8840b.setText(((aii) aig).mo983d());
                cdt.f8844x.setText(((aii) aig).mo985f());
                c = ((aii) aig).mo982c();
                if (!c.isEmpty()) {
                    cdt.f8841u.setImageDrawable(((C0191a) c.get(0)).getDrawable());
                }
                nativeAdView = cdt.f8832B;
            } else if (aig instanceof aij) {
                cdt.f8833C.setHeadlineView(cdt.f8839a);
                cdt.f8833C.setBodyView(cdt.f8840b);
                cdt.f8833C.setImageView(cdt.f8841u);
                cdt.f8833C.setCallToActionView(cdt.f8844x);
                cdt.f8839a.setText(((aij) aig).mo991b());
                cdt.f8840b.setText(((aij) aig).mo993d());
                cdt.f8844x.setText(((aij) aig).mo995f());
                c = ((aij) aig).mo992c();
                if (!c.isEmpty()) {
                    cdt.f8841u.setImageDrawable(((C0191a) c.get(0)).getDrawable());
                }
                nativeAdView = cdt.f8833C;
            } else {
                return;
            }
            nativeAdView.setNativeAd(aig);
            this.f8819g.put(view, nativeAdView);
            if (!this.f8817e.contains(nativeAdView)) {
                this.f8817e.add(nativeAdView);
                m12680d();
            }
        } catch (Exception e) {
            cdt.f8845y.setVisibility(8);
        }
    }
}
