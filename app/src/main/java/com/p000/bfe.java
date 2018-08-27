package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzhc;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p000.bey.C1127a;

@bhd
/* renamed from: bfe */
public final class bfe extends C1127a {
    /* renamed from: a */
    private final MediationAdapter f5931a;
    /* renamed from: b */
    private bff f5932b;

    public bfe(MediationAdapter mediationAdapter) {
        this.f5931a = mediationAdapter;
    }

    /* renamed from: a */
    private Bundle m8061a(String str, zzec zzec, String str2) throws RemoteException {
        String str3 = "Server parameters: ";
        String valueOf = String.valueOf(str);
        bky.m9011e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    valueOf = (String) keys.next();
                    bundle2.putString(valueOf, jSONObject.getString(valueOf));
                }
                bundle = bundle2;
            }
            if (this.f5931a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzec != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzec.f14919g);
                }
            }
            return bundle;
        } catch (Throwable th) {
            bky.m9009c("Could not get Server Parameters Bundle.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    /* renamed from: a */
    public aqq mo1054a() throws RemoteException {
        if (this.f5931a instanceof MediationBannerAdapter) {
            try {
                return aqr.m4967a(((MediationBannerAdapter) this.f5931a).getBannerView());
            } catch (Throwable th) {
                bky.m9009c("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f5931a.getClass().getCanonicalName());
            bky.m9011e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public void mo1055a(aqq aqq) throws RemoteException {
        try {
            ((OnContextChangedListener) this.f5931a).onContextChanged((Context) aqr.m4968a(aqq));
        } catch (Throwable th) {
            bky.m9004a("Could not inform adapter of changed context", th);
        }
    }

    /* renamed from: a */
    public void mo1056a(aqq aqq, bjf bjf, List<String> list) throws RemoteException {
        String str;
        if (this.f5931a instanceof akv) {
            bky.m9006b("Initialize rewarded video adapter.");
            try {
                akv akv = (akv) this.f5931a;
                List arrayList = new ArrayList();
                for (String str2 : list) {
                    arrayList.add(m8061a(str2, null, null));
                }
                akv.m2368a((Context) aqr.m4968a(aqq), new bjg(bjf), arrayList);
            } catch (Throwable th) {
                bky.m9009c("Could not initialize rewarded video adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            str2 = "MediationAdapter is not an InitializableMediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f5931a.getClass().getCanonicalName());
            bky.m9011e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public void mo1057a(aqq aqq, zzec zzec, String str, bez bez) throws RemoteException {
        mo1059a(aqq, zzec, str, null, bez);
    }

    /* renamed from: a */
    public void mo1058a(aqq aqq, zzec zzec, String str, bjf bjf, String str2) throws RemoteException {
        if (this.f5931a instanceof akw) {
            bky.m9006b("Initialize rewarded video adapter.");
            try {
                Bundle bundle;
                MediationAdRequest mediationAdRequest;
                akw akw = (akw) this.f5931a;
                Bundle a = m8061a(str2, zzec, null);
                if (zzec != null) {
                    bfd bfd = new bfd(zzec.f14914b == -1 ? null : new Date(zzec.f14914b), zzec.f14916d, zzec.f14917e != null ? new HashSet(zzec.f14917e) : null, zzec.f14923k, zzec.f14918f, zzec.f14919g, zzec.f14930r);
                    if (zzec.f14925m != null) {
                        bundle = zzec.f14925m.getBundle(akw.getClass().getName());
                        mediationAdRequest = bfd;
                    } else {
                        bundle = null;
                        Object obj = bfd;
                    }
                } else {
                    bundle = null;
                    mediationAdRequest = null;
                }
                akw.initialize((Context) aqr.m4968a(aqq), mediationAdRequest, str, new bjg(bjf), a, bundle);
            } catch (Throwable th) {
                bky.m9009c("Could not initialize rewarded video adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f5931a.getClass().getCanonicalName());
            bky.m9011e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public void mo1059a(aqq aqq, zzec zzec, String str, String str2, bez bez) throws RemoteException {
        if (this.f5931a instanceof MediationInterstitialAdapter) {
            bky.m9006b("Requesting interstitial ad from adapter.");
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f5931a;
                mediationInterstitialAdapter.requestInterstitialAd((Context) aqr.m4968a(aqq), new bff(bez), m8061a(str, zzec, str2), new bfd(zzec.f14914b == -1 ? null : new Date(zzec.f14914b), zzec.f14916d, zzec.f14917e != null ? new HashSet(zzec.f14917e) : null, zzec.f14923k, zzec.f14918f, zzec.f14919g, zzec.f14930r), zzec.f14925m != null ? zzec.f14925m.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                bky.m9009c("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f5931a.getClass().getCanonicalName());
            bky.m9011e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public void mo1060a(aqq aqq, zzec zzec, String str, String str2, bez bez, zzhc zzhc, List<String> list) throws RemoteException {
        if (this.f5931a instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) this.f5931a;
                bfi bfi = new bfi(zzec.f14914b == -1 ? null : new Date(zzec.f14914b), zzec.f14916d, zzec.f14917e != null ? new HashSet(zzec.f14917e) : null, zzec.f14923k, zzec.f14918f, zzec.f14919g, zzhc, list, zzec.f14930r);
                Bundle bundle = zzec.f14925m != null ? zzec.f14925m.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f5932b = new bff(bez);
                mediationNativeAdapter.requestNativeAd((Context) aqr.m4968a(aqq), this.f5932b, m8061a(str, zzec, str2), bfi, bundle);
            } catch (Throwable th) {
                bky.m9009c("Could not request native ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationNativeAdapter: ";
            String valueOf = String.valueOf(this.f5931a.getClass().getCanonicalName());
            bky.m9011e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public void mo1061a(aqq aqq, zzeg zzeg, zzec zzec, String str, bez bez) throws RemoteException {
        mo1062a(aqq, zzeg, zzec, str, null, bez);
    }

    /* renamed from: a */
    public void mo1062a(aqq aqq, zzeg zzeg, zzec zzec, String str, String str2, bez bez) throws RemoteException {
        if (this.f5931a instanceof MediationBannerAdapter) {
            bky.m9006b("Requesting banner ad from adapter.");
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f5931a;
                mediationBannerAdapter.requestBannerAd((Context) aqr.m4968a(aqq), new bff(bez), m8061a(str, zzec, str2), akz.m2393a(zzeg.f14935e, zzeg.f14932b, zzeg.f14931a), new bfd(zzec.f14914b == -1 ? null : new Date(zzec.f14914b), zzec.f14916d, zzec.f14917e != null ? new HashSet(zzec.f14917e) : null, zzec.f14923k, zzec.f14918f, zzec.f14919g, zzec.f14930r), zzec.f14925m != null ? zzec.f14925m.getBundle(mediationBannerAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                bky.m9009c("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f5931a.getClass().getCanonicalName());
            bky.m9011e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public void mo1063a(zzec zzec, String str) throws RemoteException {
        mo1064a(zzec, str, null);
    }

    /* renamed from: a */
    public void mo1064a(zzec zzec, String str, String str2) throws RemoteException {
        if (this.f5931a instanceof akw) {
            bky.m9006b("Requesting rewarded video ad from adapter.");
            try {
                akw akw = (akw) this.f5931a;
                akw.loadAd(new bfd(zzec.f14914b == -1 ? null : new Date(zzec.f14914b), zzec.f14916d, zzec.f14917e != null ? new HashSet(zzec.f14917e) : null, zzec.f14923k, zzec.f14918f, zzec.f14919g, zzec.f14930r), m8061a(str, zzec, str2), zzec.f14925m != null ? zzec.f14925m.getBundle(akw.getClass().getName()) : null);
            } catch (Throwable th) {
                bky.m9009c("Could not load rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f5931a.getClass().getCanonicalName());
            bky.m9011e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    /* renamed from: b */
    public void mo1065b() throws RemoteException {
        if (this.f5931a instanceof MediationInterstitialAdapter) {
            bky.m9006b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f5931a).showInterstitial();
            } catch (Throwable th) {
                bky.m9009c("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f5931a.getClass().getCanonicalName());
            bky.m9011e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    /* renamed from: c */
    public void mo1066c() throws RemoteException {
        try {
            this.f5931a.onDestroy();
        } catch (Throwable th) {
            bky.m9009c("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    /* renamed from: d */
    public void mo1067d() throws RemoteException {
        try {
            this.f5931a.onPause();
        } catch (Throwable th) {
            bky.m9009c("Could not pause adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    /* renamed from: e */
    public void mo1068e() throws RemoteException {
        try {
            this.f5931a.onResume();
        } catch (Throwable th) {
            bky.m9009c("Could not resume adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    /* renamed from: f */
    public void mo1069f() throws RemoteException {
        if (this.f5931a instanceof akw) {
            bky.m9006b("Show rewarded video ad from adapter.");
            try {
                ((akw) this.f5931a).showVideo();
            } catch (Throwable th) {
                bky.m9009c("Could not show rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f5931a.getClass().getCanonicalName());
            bky.m9011e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    /* renamed from: g */
    public boolean mo1070g() throws RemoteException {
        if (this.f5931a instanceof akw) {
            bky.m9006b("Check if adapter is initialized.");
            try {
                return ((akw) this.f5931a).isInitialized();
            } catch (Throwable th) {
                bky.m9009c("Could not check if adapter is initialized.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f5931a.getClass().getCanonicalName());
            bky.m9011e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    /* renamed from: h */
    public bfb mo1071h() {
        NativeAdMapper a = this.f5932b.m8085a();
        return a instanceof NativeAppInstallAdMapper ? new bfg((NativeAppInstallAdMapper) a) : null;
    }

    /* renamed from: i */
    public bfc mo1072i() {
        NativeAdMapper a = this.f5932b.m8085a();
        return a instanceof NativeContentAdMapper ? new bfh((NativeContentAdMapper) a) : null;
    }

    /* renamed from: j */
    public Bundle mo1073j() {
        if (this.f5931a instanceof bmb) {
            return ((bmb) this.f5931a).m9611a();
        }
        String str = "MediationAdapter is not a v2 MediationBannerAdapter: ";
        String valueOf = String.valueOf(this.f5931a.getClass().getCanonicalName());
        bky.m9011e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    /* renamed from: k */
    public Bundle mo1074k() {
        if (this.f5931a instanceof bmc) {
            return ((bmc) this.f5931a).getInterstitialAdapterInfo();
        }
        String str = "MediationAdapter is not a v2 MediationInterstitialAdapter: ";
        String valueOf = String.valueOf(this.f5931a.getClass().getCanonicalName());
        bky.m9011e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    /* renamed from: l */
    public Bundle mo1075l() {
        return new Bundle();
    }

    /* renamed from: m */
    public boolean mo1076m() {
        return this.f5931a instanceof akv;
    }
}
