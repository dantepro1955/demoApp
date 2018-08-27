package com.p000;

import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import p000.acx.C0073a;
import p000.bky;

@bhd
/* renamed from: bfk */
public final class bfk<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    /* renamed from: a */
    private final bez f5961a;

    /* renamed from: bfk$1 */
    class C11341 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bfk f5950a;

        C11341(bfk bfk) {
            this.f5950a = bfk;
        }

        public void run() {
            try {
                this.f5950a.f5961a.mo1038a();
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdClicked.", e);
            }
        }
    }

    /* renamed from: bfk$3 */
    class C11363 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bfk f5953a;

        C11363(bfk bfk) {
            this.f5953a = bfk;
        }

        public void run() {
            try {
                this.f5953a.f5961a.mo1042c();
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdLeftApplication.", e);
            }
        }
    }

    /* renamed from: bfk$4 */
    class C11374 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bfk f5954a;

        C11374(bfk bfk) {
            this.f5954a = bfk;
        }

        public void run() {
            try {
                this.f5954a.f5961a.mo1043d();
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdOpened.", e);
            }
        }
    }

    /* renamed from: bfk$5 */
    class C11385 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bfk f5955a;

        C11385(bfk bfk) {
            this.f5955a = bfk;
        }

        public void run() {
            try {
                this.f5955a.f5961a.mo1044e();
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdLoaded.", e);
            }
        }
    }

    /* renamed from: bfk$6 */
    class C11396 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bfk f5956a;

        C11396(bfk bfk) {
            this.f5956a = bfk;
        }

        public void run() {
            try {
                this.f5956a.f5961a.mo1041b();
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdClosed.", e);
            }
        }
    }

    /* renamed from: bfk$8 */
    class C11418 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bfk f5959a;

        C11418(bfk bfk) {
            this.f5959a = bfk;
        }

        public void run() {
            try {
                this.f5959a.f5961a.mo1042c();
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdLeftApplication.", e);
            }
        }
    }

    /* renamed from: bfk$9 */
    class C11429 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bfk f5960a;

        C11429(bfk bfk) {
            this.f5960a = bfk;
        }

        public void run() {
            try {
                this.f5960a.f5961a.mo1043d();
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdOpened.", e);
            }
        }
    }

    public bfk(bez bez) {
        this.f5961a = bez;
    }

    public void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        bky.m9006b("Adapter called onClick.");
        if (azp.m6789a().m9298b()) {
            try {
                this.f5961a.mo1038a();
                return;
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdClicked.", e);
                return;
            }
        }
        bky.m9011e("onClick must be called on the main UI thread.");
        bkx.f6798a.post(new C11341(this));
    }

    public void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        bky.m9006b("Adapter called onDismissScreen.");
        if (azp.m6789a().m9298b()) {
            try {
                this.f5961a.mo1041b();
                return;
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdClosed.", e);
                return;
            }
        }
        bky.m9011e("onDismissScreen must be called on the main UI thread.");
        bkx.f6798a.post(new C11396(this));
    }

    public void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        bky.m9006b("Adapter called onDismissScreen.");
        if (azp.m6789a().m9298b()) {
            try {
                this.f5961a.mo1041b();
                return;
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdClosed.", e);
                return;
            }
        }
        bky.m9011e("onDismissScreen must be called on the main UI thread.");
        bkx.f6798a.post(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ p000.bfk f5949a;

            {
                this.f5949a = r1;
            }

            public void run() {
                try {
                    this.f5949a.f5961a.mo1041b();
                } catch (Throwable e) {
                    bky.m9009c("Could not call onAdClosed.", e);
                }
            }
        });
    }

    public void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, final C0073a c0073a) {
        String valueOf = String.valueOf(c0073a);
        bky.m9006b(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error. ").append(valueOf).toString());
        if (azp.m6789a().m9298b()) {
            try {
                this.f5961a.mo1039a(bfl.m8143a(c0073a));
                return;
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        bky.m9011e("onFailedToReceiveAd must be called on the main UI thread.");
        bkx.f6798a.post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bfk f5958b;

            public void run() {
                try {
                    this.f5958b.f5961a.mo1039a(bfl.m8143a(c0073a));
                } catch (Throwable e) {
                    bky.m9009c("Could not call onAdFailedToLoad.", e);
                }
            }
        });
    }

    public void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, final C0073a c0073a) {
        String valueOf = String.valueOf(c0073a);
        bky.m9006b(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error ").append(valueOf).append(".").toString());
        if (azp.m6789a().m9298b()) {
            try {
                this.f5961a.mo1039a(bfl.m8143a(c0073a));
                return;
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        bky.m9011e("onFailedToReceiveAd must be called on the main UI thread.");
        bkx.f6798a.post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bfk f5952b;

            public void run() {
                try {
                    this.f5952b.f5961a.mo1039a(bfl.m8143a(c0073a));
                } catch (Throwable e) {
                    bky.m9009c("Could not call onAdFailedToLoad.", e);
                }
            }
        });
    }

    public void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        bky.m9006b("Adapter called onLeaveApplication.");
        if (azp.m6789a().m9298b()) {
            try {
                this.f5961a.mo1042c();
                return;
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        bky.m9011e("onLeaveApplication must be called on the main UI thread.");
        bkx.f6798a.post(new C11418(this));
    }

    public void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        bky.m9006b("Adapter called onLeaveApplication.");
        if (azp.m6789a().m9298b()) {
            try {
                this.f5961a.mo1042c();
                return;
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        bky.m9011e("onLeaveApplication must be called on the main UI thread.");
        bkx.f6798a.post(new C11363(this));
    }

    public void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        bky.m9006b("Adapter called onPresentScreen.");
        if (azp.m6789a().m9298b()) {
            try {
                this.f5961a.mo1043d();
                return;
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdOpened.", e);
                return;
            }
        }
        bky.m9011e("onPresentScreen must be called on the main UI thread.");
        bkx.f6798a.post(new C11429(this));
    }

    public void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        bky.m9006b("Adapter called onPresentScreen.");
        if (azp.m6789a().m9298b()) {
            try {
                this.f5961a.mo1043d();
                return;
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdOpened.", e);
                return;
            }
        }
        bky.m9011e("onPresentScreen must be called on the main UI thread.");
        bkx.f6798a.post(new C11374(this));
    }

    public void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        bky.m9006b("Adapter called onReceivedAd.");
        if (azp.m6789a().m9298b()) {
            try {
                this.f5961a.mo1044e();
                return;
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdLoaded.", e);
                return;
            }
        }
        bky.m9011e("onReceivedAd must be called on the main UI thread.");
        bkx.f6798a.post(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ p000.bfk f5948a;

            {
                this.f5948a = r1;
            }

            public void run() {
                try {
                    this.f5948a.f5961a.mo1044e();
                } catch (Throwable e) {
                    bky.m9009c("Could not call onAdLoaded.", e);
                }
            }
        });
    }

    public void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        bky.m9006b("Adapter called onReceivedAd.");
        if (azp.m6789a().m9298b()) {
            try {
                this.f5961a.mo1044e();
                return;
            } catch (Throwable e) {
                bky.m9009c("Could not call onAdLoaded.", e);
                return;
            }
        }
        bky.m9011e("onReceivedAd must be called on the main UI thread.");
        bkx.f6798a.post(new C11385(this));
    }
}
