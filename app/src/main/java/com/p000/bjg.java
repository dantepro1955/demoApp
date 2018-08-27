package com.p000;

import com.google.android.gms.internal.zzoo;

@bhd
/* renamed from: bjg */
public class bjg implements akx {
    /* renamed from: a */
    private final bjf f6519a;

    public bjg(bjf bjf) {
        this.f6519a = bjf;
    }

    /* renamed from: a */
    public void mo1239a(akw akw) {
        aoi.m4687b("onInitializationSucceeded must be called on the main UI thread.");
        bky.m9006b("Adapter called onInitializationSucceeded.");
        try {
            this.f6519a.mo1229a(aqr.m4967a((Object) akw));
        } catch (Throwable e) {
            bky.m9009c("Could not call onInitializationSucceeded.", e);
        }
    }

    /* renamed from: a */
    public void mo1240a(akw akw, int i) {
        aoi.m4687b("onInitializationFailed must be called on the main UI thread.");
        bky.m9006b("Adapter called onInitializationFailed.");
        try {
            this.f6519a.mo1230a(aqr.m4967a((Object) akw), i);
        } catch (Throwable e) {
            bky.m9009c("Could not call onInitializationFailed.", e);
        }
    }

    /* renamed from: a */
    public void mo1241a(akw akw, akt akt) {
        aoi.m4687b("onRewarded must be called on the main UI thread.");
        bky.m9006b("Adapter called onRewarded.");
        if (akt != null) {
            try {
                this.f6519a.mo1231a(aqr.m4967a((Object) akw), new zzoo(akt));
                return;
            } catch (Throwable e) {
                bky.m9009c("Could not call onRewarded.", e);
                return;
            }
        }
        this.f6519a.mo1231a(aqr.m4967a((Object) akw), new zzoo("", 1));
    }

    /* renamed from: b */
    public void mo1242b(akw akw) {
        aoi.m4687b("onAdLoaded must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdLoaded.");
        try {
            this.f6519a.mo1232b(aqr.m4967a((Object) akw));
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdLoaded.", e);
        }
    }

    /* renamed from: b */
    public void mo1243b(akw akw, int i) {
        aoi.m4687b("onAdFailedToLoad must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdFailedToLoad.");
        try {
            this.f6519a.mo1233b(aqr.m4967a((Object) akw), i);
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdFailedToLoad.", e);
        }
    }

    /* renamed from: c */
    public void mo1244c(akw akw) {
        aoi.m4687b("onAdOpened must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdOpened.");
        try {
            this.f6519a.mo1234c(aqr.m4967a((Object) akw));
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdOpened.", e);
        }
    }

    /* renamed from: d */
    public void mo1245d(akw akw) {
        aoi.m4687b("onVideoStarted must be called on the main UI thread.");
        bky.m9006b("Adapter called onVideoStarted.");
        try {
            this.f6519a.mo1235d(aqr.m4967a((Object) akw));
        } catch (Throwable e) {
            bky.m9009c("Could not call onVideoStarted.", e);
        }
    }

    /* renamed from: e */
    public void mo1246e(akw akw) {
        aoi.m4687b("onAdClosed must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdClosed.");
        try {
            this.f6519a.mo1236e(aqr.m4967a((Object) akw));
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdClosed.", e);
        }
    }

    /* renamed from: f */
    public void mo1247f(akw akw) {
        aoi.m4687b("onAdClicked must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdClicked.");
        try {
            this.f6519a.mo1237f(aqr.m4967a((Object) akw));
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdClicked.", e);
        }
    }

    /* renamed from: g */
    public void mo1248g(akw akw) {
        aoi.m4687b("onAdLeftApplication must be called on the main UI thread.");
        bky.m9006b("Adapter called onAdLeftApplication.");
        try {
            this.f6519a.mo1238g(aqr.m4967a((Object) akw));
        } catch (Throwable e) {
            bky.m9009c("Could not call onAdLeftApplication.", e);
        }
    }
}
