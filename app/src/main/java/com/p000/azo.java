package com.p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.facebook.internal.NativeProtocol;
import com.flurry.android.AdCreative;
import com.google.android.gms.internal.zzeg;
import com.mopub.common.AdType;
import p000.baa.C0953a;

@bhd
/* renamed from: azo */
public class azo {
    /* renamed from: a */
    private baa f5174a;
    /* renamed from: b */
    private final Object f5175b = new Object();
    /* renamed from: c */
    private final azi f5176c;
    /* renamed from: d */
    private final azh f5177d;
    /* renamed from: e */
    private final bal f5178e;
    /* renamed from: f */
    private final bcp f5179f;
    /* renamed from: g */
    private final bis f5180g;
    /* renamed from: h */
    private final bgi f5181h;
    /* renamed from: i */
    private final bfv f5182i;

    /* renamed from: azo$a */
    abstract class C0932a<T> {
        /* renamed from: f */
        final /* synthetic */ azo f5147f;

        C0932a(azo azo) {
            this.f5147f = azo;
        }

        /* renamed from: b */
        protected abstract T mo868b() throws RemoteException;

        /* renamed from: b */
        protected abstract T mo869b(baa baa) throws RemoteException;

        /* renamed from: c */
        protected final T m6740c() {
            T t = null;
            baa a = this.f5147f.m6776b();
            if (a == null) {
                bky.m9011e("ClientApi class cannot be loaded.");
            } else {
                try {
                    t = mo869b(a);
                } catch (Throwable e) {
                    bky.m9009c("Cannot invoke local loader using ClientApi class", e);
                }
            }
            return t;
        }

        /* renamed from: d */
        protected final T m6741d() {
            try {
                return mo868b();
            } catch (Throwable e) {
                bky.m9009c("Cannot invoke remote loader", e);
                return null;
            }
        }
    }

    public azo(azi azi, azh azh, bal bal, bcp bcp, bis bis, bgi bgi, bfv bfv) {
        this.f5176c = azi;
        this.f5177d = azh;
        this.f5178e = bal;
        this.f5179f = bcp;
        this.f5180g = bis;
        this.f5181h = bgi;
        this.f5182i = bfv;
    }

    /* renamed from: a */
    private static baa m6770a() {
        try {
            Object newInstance = azo.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return C0953a.asInterface((IBinder) newInstance);
            }
            bky.m9011e("ClientApi class is not an instance of IBinder");
            return null;
        } catch (Throwable e) {
            bky.m9009c("Failed to instantiate ClientApi class.", e);
            return null;
        }
    }

    /* renamed from: a */
    private void m6772a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(NativeProtocol.WEB_DIALOG_ACTION, "no_ads_fallback");
        bundle.putString("flow", str);
        azp.m6789a().m9289a(context, null, "gmob-apps", bundle, true);
    }

    /* renamed from: a */
    private static boolean m6774a(Activity activity, String str) {
        Intent intent = activity.getIntent();
        if (intent.hasExtra(str)) {
            return intent.getBooleanExtra(str, false);
        }
        bky.m9008c("useClientJar flag not found in activity intent extras.");
        return false;
    }

    /* renamed from: b */
    private baa m6776b() {
        baa baa;
        synchronized (this.f5175b) {
            if (this.f5174a == null) {
                this.f5174a = azo.m6770a();
            }
            baa = this.f5174a;
        }
        return baa;
    }

    /* renamed from: a */
    public azv m6781a(final Context context, final String str, final bex bex) {
        return (azv) m6786a(context, false, new C0932a<azv>(this) {
            /* renamed from: d */
            final /* synthetic */ azo f5165d;

            /* renamed from: a */
            public azv m6754a() {
                azv a = this.f5165d.f5177d.m6719a(context, str, bex);
                if (a != null) {
                    return a;
                }
                this.f5165d.m6772a(context, "native_ad");
                return new bam();
            }

            /* renamed from: a */
            public azv m6755a(baa baa) throws RemoteException {
                return baa.createAdLoaderBuilder(aqr.m4967a(context), str, bex, 10260000);
            }

            /* renamed from: b */
            public /* synthetic */ Object mo868b() throws RemoteException {
                return m6754a();
            }

            /* renamed from: b */
            public /* synthetic */ Object mo869b(baa baa) throws RemoteException {
                return m6755a(baa);
            }
        });
    }

    /* renamed from: a */
    public azx m6782a(final Context context, final zzeg zzeg, final String str) {
        return (azx) m6786a(context, false, new C0932a<azx>(this) {
            /* renamed from: d */
            final /* synthetic */ azo f5156d;

            /* renamed from: a */
            public azx m6746a() {
                azx a = this.f5156d.f5176c.m6722a(context, zzeg, str, null, 3);
                if (a != null) {
                    return a;
                }
                this.f5156d.m6772a(context, "search");
                return new ban();
            }

            /* renamed from: a */
            public azx m6747a(baa baa) throws RemoteException {
                return baa.createSearchAdManager(aqr.m4967a(context), zzeg, str, 10260000);
            }

            /* renamed from: b */
            public /* synthetic */ Object mo868b() throws RemoteException {
                return m6746a();
            }

            /* renamed from: b */
            public /* synthetic */ Object mo869b(baa baa) throws RemoteException {
                return m6747a(baa);
            }
        });
    }

    /* renamed from: a */
    public azx m6783a(Context context, zzeg zzeg, String str, bex bex) {
        final Context context2 = context;
        final zzeg zzeg2 = zzeg;
        final String str2 = str;
        final bex bex2 = bex;
        return (azx) m6786a(context, false, new C0932a<azx>(this) {
            /* renamed from: e */
            final /* synthetic */ azo f5152e;

            /* renamed from: a */
            public azx m6742a() {
                azx a = this.f5152e.f5176c.m6722a(context2, zzeg2, str2, bex2, 1);
                if (a != null) {
                    return a;
                }
                this.f5152e.m6772a(context2, AdCreative.kFormatBanner);
                return new ban();
            }

            /* renamed from: a */
            public azx m6743a(baa baa) throws RemoteException {
                return baa.createBannerAdManager(aqr.m4967a(context2), zzeg2, str2, bex2, 10260000);
            }

            /* renamed from: b */
            public /* synthetic */ Object mo868b() throws RemoteException {
                return m6742a();
            }

            /* renamed from: b */
            public /* synthetic */ Object mo869b(baa baa) throws RemoteException {
                return m6743a(baa);
            }
        });
    }

    /* renamed from: a */
    public bce m6784a(final Context context, final FrameLayout frameLayout, final FrameLayout frameLayout2) {
        return (bce) m6786a(context, false, new C0932a<bce>(this) {
            /* renamed from: d */
            final /* synthetic */ azo f5169d;

            /* renamed from: a */
            public bce m6758a() {
                bce a = this.f5169d.f5179f.m7501a(context, frameLayout, frameLayout2);
                if (a != null) {
                    return a;
                }
                this.f5169d.m6772a(context, "native_ad_view_delegate");
                return new bao();
            }

            /* renamed from: a */
            public bce m6759a(baa baa) throws RemoteException {
                return baa.createNativeAdViewDelegate(aqr.m4967a(frameLayout), aqr.m4967a(frameLayout2));
            }

            /* renamed from: b */
            public /* synthetic */ Object mo868b() throws RemoteException {
                return m6758a();
            }

            /* renamed from: b */
            public /* synthetic */ Object mo869b(baa baa) throws RemoteException {
                return m6759a(baa);
            }
        });
    }

    /* renamed from: a */
    public bgd m6785a(final Activity activity) {
        return (bgd) m6786a((Context) activity, azo.m6774a(activity, "com.google.android.gms.ads.internal.purchase.useClientJar"), new C0932a<bgd>(this) {
            /* renamed from: b */
            final /* synthetic */ azo f5171b;

            /* renamed from: a */
            public bgd m6762a() {
                bgd a = this.f5171b.f5181h.m8296a(activity);
                if (a != null) {
                    return a;
                }
                this.f5171b.m6772a(activity, "iap");
                return null;
            }

            /* renamed from: a */
            public bgd m6763a(baa baa) throws RemoteException {
                return baa.createInAppPurchaseManager(aqr.m4967a(activity));
            }

            /* renamed from: b */
            public /* synthetic */ Object mo868b() throws RemoteException {
                return m6762a();
            }

            /* renamed from: b */
            public /* synthetic */ Object mo869b(baa baa) throws RemoteException {
                return m6763a(baa);
            }
        });
    }

    /* renamed from: a */
    <T> T m6786a(Context context, boolean z, C0932a<T> c0932a) {
        if (!(z || azp.m6789a().m9299c(context))) {
            bky.m9006b("Google Play Services is not available");
            z = true;
        }
        T c;
        if (z) {
            c = c0932a.m6740c();
            return c == null ? c0932a.m6741d() : c;
        } else {
            c = c0932a.m6741d();
            return c == null ? c0932a.m6740c() : c;
        }
    }

    /* renamed from: b */
    public azx m6787b(Context context, zzeg zzeg, String str, bex bex) {
        final Context context2 = context;
        final zzeg zzeg2 = zzeg;
        final String str2 = str;
        final bex bex2 = bex;
        return (azx) m6786a(context, false, new C0932a<azx>(this) {
            /* renamed from: e */
            final /* synthetic */ azo f5161e;

            /* renamed from: a */
            public azx m6750a() {
                azx a = this.f5161e.f5176c.m6722a(context2, zzeg2, str2, bex2, 2);
                if (a != null) {
                    return a;
                }
                this.f5161e.m6772a(context2, AdType.INTERSTITIAL);
                return new ban();
            }

            /* renamed from: a */
            public azx m6751a(baa baa) throws RemoteException {
                return baa.createInterstitialAdManager(aqr.m4967a(context2), zzeg2, str2, bex2, 10260000);
            }

            /* renamed from: b */
            public /* synthetic */ Object mo868b() throws RemoteException {
                return m6750a();
            }

            /* renamed from: b */
            public /* synthetic */ Object mo869b(baa baa) throws RemoteException {
                return m6751a(baa);
            }
        });
    }

    /* renamed from: b */
    public bfw m6788b(final Activity activity) {
        return (bfw) m6786a((Context) activity, azo.m6774a(activity, "com.google.android.gms.ads.internal.overlay.useClientJar"), new C0932a<bfw>(this) {
            /* renamed from: b */
            final /* synthetic */ azo f5173b;

            /* renamed from: a */
            public bfw m6766a() {
                bfw a = this.f5173b.f5182i.m8206a(activity);
                if (a != null) {
                    return a;
                }
                this.f5173b.m6772a(activity, "ad_overlay");
                return null;
            }

            /* renamed from: a */
            public bfw m6767a(baa baa) throws RemoteException {
                return baa.createAdOverlay(aqr.m4967a(activity));
            }

            /* renamed from: b */
            public /* synthetic */ Object mo868b() throws RemoteException {
                return m6766a();
            }

            /* renamed from: b */
            public /* synthetic */ Object mo869b(baa baa) throws RemoteException {
                return m6767a(baa);
            }
        });
    }
}
