package com.p000;

import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;

@bhd
/* renamed from: bff */
public final class bff implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {
    /* renamed from: a */
    private final bez f5933a;
    /* renamed from: b */
    private NativeAdMapper f5934b;

    public bff(bez bez) {
        this.f5933a = bez;
    }

    /* renamed from: a */
    public NativeAdMapper m8085a() {
        return this.f5934b;
    }

    public void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        aoi.m4687b("onAdClicked must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdClicked.");
        try {
            this.f5933a.mo1038a();
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdClicked.", e);
        }
    }

    public void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        aoi.m4687b("onAdClicked must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdClicked.");
        try {
            this.f5933a.mo1038a();
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdClicked.", e);
        }
    }

    public void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        aoi.m4687b("onAdClicked must be called on the main UI thread.");
        NativeAdMapper a = m8085a();
        if (a == null) {
            bky.m9011e("Could not call onAdClicked since NativeAdMapper is null.");
        } else if (a.getOverrideClickHandling()) {
            bky.m9006b("Adapter called onAdClicked.");
            try {
                this.f5933a.mo1038a();
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdClicked.", e);
            }
        } else {
            bky.m9006b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
        }
    }

    public void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        aoi.m4687b("onAdClosed must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdClosed.");
        try {
            this.f5933a.mo1041b();
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdClosed.", e);
        }
    }

    public void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        aoi.m4687b("onAdClosed must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdClosed.");
        try {
            this.f5933a.mo1041b();
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdClosed.", e);
        }
    }

    public void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        aoi.m4687b("onAdClosed must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdClosed.");
        try {
            this.f5933a.mo1041b();
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdClosed.", e);
        }
    }

    public void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        aoi.m4687b("onAdFailedToLoad must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdFailedToLoad with error. " + i);
        try {
            this.f5933a.mo1039a(i);
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdFailedToLoad.", e);
        }
    }

    public void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        aoi.m4687b("onAdFailedToLoad must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.f5933a.mo1039a(i);
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdFailedToLoad.", e);
        }
    }

    public void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        aoi.m4687b("onAdFailedToLoad must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.f5933a.mo1039a(i);
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdFailedToLoad.", e);
        }
    }

    public void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        aoi.m4687b("onAdImpression must be called on the main UI thread.");
        NativeAdMapper a = m8085a();
        if (a == null) {
            bky.m9011e("Could not call onAdImpression since NativeAdMapper is null. ");
        } else if (a.getOverrideImpressionRecording()) {
            bky.m9006b("Adapter called onAdImpression.");
            try {
                this.f5933a.mo1045f();
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdImpression.", e);
            }
        } else {
            bky.m9006b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
        }
    }

    public void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        aoi.m4687b("onAdLeftApplication must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdLeftApplication.");
        try {
            this.f5933a.mo1042c();
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdLeftApplication.", e);
        }
    }

    public void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        aoi.m4687b("onAdLeftApplication must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdLeftApplication.");
        try {
            this.f5933a.mo1042c();
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdLeftApplication.", e);
        }
    }

    public void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        aoi.m4687b("onAdLeftApplication must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdLeftApplication.");
        try {
            this.f5933a.mo1042c();
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdLeftApplication.", e);
        }
    }

    public void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        aoi.m4687b("onAdLoaded must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdLoaded.");
        try {
            this.f5933a.mo1044e();
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdLoaded.", e);
        }
    }

    public void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        aoi.m4687b("onAdLoaded must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdLoaded.");
        try {
            this.f5933a.mo1044e();
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdLoaded.", e);
        }
    }

    public void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, NativeAdMapper nativeAdMapper) {
        aoi.m4687b("onAdLoaded must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdLoaded.");
        this.f5934b = nativeAdMapper;
        try {
            this.f5933a.mo1044e();
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdLoaded.", e);
        }
    }

    public void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        aoi.m4687b("onAdOpened must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdOpened.");
        try {
            this.f5933a.mo1043d();
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdOpened.", e);
        }
    }

    public void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        aoi.m4687b("onAdOpened must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdOpened.");
        try {
            this.f5933a.mo1043d();
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdOpened.", e);
        }
    }

    public void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        aoi.m4687b("onAdOpened must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdOpened.");
        try {
            this.f5933a.mo1043d();
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdOpened.", e);
        }
    }
}
