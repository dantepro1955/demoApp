package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.facebook.ads.AdView;
import com.google.ads.mediation.nexage.NexageAdapter;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.ninegag.android.app.R;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import p000.aie.C0190a;

/* compiled from: BannerAdRenderer */
/* renamed from: crt */
public class crt {
    /* renamed from: a */
    private cct f20012a;

    /* renamed from: a */
    public void m24638a(ViewGroup viewGroup) {
        viewGroup.setTag(R.id.ad_view_container, null);
        try {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof PublisherAdView) {
                    PublisherAdView publisherAdView = (PublisherAdView) childAt;
                    publisherAdView.a();
                    m24636d(publisherAdView);
                    return;
                }
                if (childAt instanceof ViewGroup) {
                    m24638a((ViewGroup) childAt);
                }
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: d */
    private void m24636d(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof WebView) {
                WebView webView = (WebView) viewGroup.getChildAt(i);
                viewGroup.removeView(webView);
                webView.destroy();
                return;
            }
        }
    }

    /* renamed from: a */
    public void m24637a(Context context, ViewGroup viewGroup, buh buh, buh buh2, int i, String str) {
        try {
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof AdView) {
                    ((AdView) childAt).destroy();
                    m24639b(context, viewGroup, buh, buh2, i, str);
                    return;
                } else if (childAt instanceof PublisherAdView) {
                    ((PublisherAdView) childAt).a();
                    m24639b(context, viewGroup, buh, buh2, i, str);
                    return;
                } else {
                    if (childAt instanceof ViewGroup) {
                        m24637a(context, (ViewGroup) childAt, buh, buh2, i, str);
                    }
                    i2++;
                }
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: b */
    public void m24639b(Context context, ViewGroup viewGroup, buh buh, buh buh2, int i, String str) {
        try {
            dmm dmm;
            viewGroup.removeAllViews();
            if (str == null) {
                str = "/16921351/9gag-Android-overlay";
            }
            if (i == 0) {
                dmm = new dmm(str, true, null);
                if (buh2 == null && this.f20012a != null) {
                    buh2 = this.f20012a.Q();
                }
                dmm = crf.m24563a(dmm, buh, buh2);
            } else {
                dmm = new dmm(str, true, null);
                if (buh2 == null && this.f20012a != null) {
                    buh2 = this.f20012a.Q();
                }
                dmm = crf.m24566b(dmm, buh, buh2);
            }
            viewGroup.addView(m24634a(context, dmm, m24635a(context)));
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    private View m24634a(Context context, dmm dmm, Map<Class<? extends MediationAdapter>, Bundle> map) {
        if (!dmm.m28051b()) {
            return new View(context);
        }
        try {
            final View publisherAdView = new PublisherAdView(context);
            publisherAdView.setAdUnitId(dmm.m28047a());
            publisherAdView.setAdSizes(new ahw[]{ahw.f1525a});
            publisherAdView.setAdListener(new aht(this) {
                /* renamed from: b */
                final /* synthetic */ crt f20011b;

                public void onAdClosed() {
                    super.onAdClosed();
                }

                public void onAdFailedToLoad(int i) {
                    super.onAdFailedToLoad(i);
                    chn.r("SHOW_BANNER_AD_FAILED", "req:" + publisherAdView.getMediationAdapterClassName() + " code:" + i);
                }

                public void onAdLeftApplication() {
                    super.onAdLeftApplication();
                }

                public void onAdOpened() {
                    super.onAdOpened();
                }

                public void onAdLoaded() {
                    super.onAdLoaded();
                    String str = "SHOW_BANNER_AD";
                    chn.r(str, ("req:" + publisherAdView.getMediationAdapterClassName()) + " h:" + publisherAdView.getAdSize().a() + " w:" + publisherAdView.getAdSize().b());
                }
            });
            publisherAdView.a(m24633a((Map) map));
            return publisherAdView;
        } catch (Exception e) {
            return new View(context);
        }
    }

    /* renamed from: b */
    public void m24640b(ViewGroup viewGroup) {
        try {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof PublisherAdView) {
                    ((PublisherAdView) childAt).b();
                    return;
                }
                if (childAt instanceof ViewGroup) {
                    m24640b((ViewGroup) childAt);
                }
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: c */
    public void m24641c(ViewGroup viewGroup) {
        try {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof PublisherAdView) {
                    ((PublisherAdView) childAt).c();
                    return;
                }
                if (childAt instanceof ViewGroup) {
                    m24641c((ViewGroup) childAt);
                }
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    private aie m24633a(Map<Class<? extends MediationAdapter>, Bundle> map) {
        C0190a c0190a = new C0190a();
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                c0190a.a((Class) entry.getKey(), (Bundle) entry.getValue());
            }
        }
        ckn g = caf.a().g().g();
        if (g != null) {
            if (!TextUtils.isEmpty(g.f9562C)) {
                Date a = cqb.m24362a(g.f9562C);
                if (a != null) {
                    c0190a.a(a);
                }
            }
            if (!TextUtils.isEmpty(g.f9561B)) {
                c0190a.a("M".equals(g.f9561B) ? 1 : 2);
            }
        }
        return c0190a.a();
    }

    /* renamed from: a */
    private Map<Class<? extends MediationAdapter>, Bundle> m24635a(Context context) {
        Map hhVar = new hh();
        Bundle bundle = new Bundle();
        bundle.putString("dcn", context.getString(R.string.mm_sdk_site_id));
        hhVar.put(NexageAdapter.class, bundle);
        return hhVar;
    }
}
