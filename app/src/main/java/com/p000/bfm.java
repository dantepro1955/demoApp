package com.p000;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsIntent.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.zzqh;
import p000.bbp.C0994a;

@bhd
/* renamed from: bfm */
public class bfm implements MediationInterstitialAdapter {
    /* renamed from: a */
    private Activity f5967a;
    /* renamed from: b */
    private bbp f5968b;
    /* renamed from: c */
    private MediationInterstitialListener f5969c;
    /* renamed from: d */
    private Uri f5970d;

    /* renamed from: bfm$1 */
    class C11441 implements C0994a {
        C11441(bfm bfm) {
        }
    }

    /* renamed from: bfm$2 */
    class C11452 implements air {
        /* renamed from: a */
        final /* synthetic */ bfm f5964a;

        C11452(bfm bfm) {
            this.f5964a = bfm;
        }

        /* renamed from: a */
        public void mo264a() {
            bky.m9006b("AdMobCustomTabsAdapter overlay is closed.");
            this.f5964a.f5969c.onAdClosed(this.f5964a);
            try {
                this.f5964a.f5968b.m7194a(this.f5964a.f5967a);
            } catch (Throwable e) {
                bky.m9007b("Exception while unbinding from CustomTabsService.", e);
            }
        }

        /* renamed from: b */
        public void mo270b() {
            bky.m9006b("AdMobCustomTabsAdapter overlay is paused.");
        }

        /* renamed from: c */
        public void mo272c() {
            bky.m9006b("AdMobCustomTabsAdapter overlay is resumed.");
        }

        /* renamed from: d */
        public void mo273d() {
            bky.m9006b("Opening AdMobCustomTabsAdapter overlay.");
            this.f5964a.f5969c.onAdOpened(this.f5964a);
        }
    }

    /* renamed from: a */
    public static boolean m8152a(Context context) {
        return bbp.m7192a(context);
    }

    public void onDestroy() {
        bky.m9006b("Destroying AdMobCustomTabsAdapter adapter.");
        try {
            this.f5968b.m7194a(this.f5967a);
        } catch (Throwable e) {
            bky.m9007b("Exception while unbinding from CustomTabsService.", e);
        }
    }

    public void onPause() {
        bky.m9006b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public void onResume() {
        bky.m9006b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f5969c = mediationInterstitialListener;
        if (this.f5969c == null) {
            bky.m9011e("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            bky.m9011e("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f5969c.onAdFailedToLoad(this, 0);
        } else if (bfm.m8152a(context)) {
            Object string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                bky.m9011e("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f5969c.onAdFailedToLoad(this, 0);
                return;
            }
            this.f5967a = (Activity) context;
            this.f5970d = Uri.parse(string);
            this.f5968b = new bbp();
            this.f5968b.m7195a(new C11441(this));
            this.f5968b.m7196b(this.f5967a);
            this.f5969c.onAdLoaded(this);
        } else {
            bky.m9011e("Default browser does not support custom tabs. Bailing out.");
            this.f5969c.onAdFailedToLoad(this, 0);
        }
    }

    public void showInterstitial() {
        CustomTabsIntent build = new Builder(this.f5968b.m7193a()).build();
        build.intent.setData(this.f5970d);
        final AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(new zzc(build.intent), null, new C11452(this), null, new zzqh(0, 0, false));
        bkg.f6710a.post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bfm f5966b;

            public void run() {
                ako.m2341c().m1778a(this.f5966b.f5967a, adOverlayInfoParcel);
            }
        });
        ako.m2347i().m8948d(false);
    }
}
