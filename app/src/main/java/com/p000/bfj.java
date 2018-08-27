package com.p000;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzhc;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p000.bey.C1127a;

@bhd
/* renamed from: bfj */
public final class bfj<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends C1127a {
    /* renamed from: a */
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> f5946a;
    /* renamed from: b */
    private final NETWORK_EXTRAS f5947b;

    public bfj(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.f5946a = mediationAdapter;
        this.f5947b = network_extras;
    }

    /* renamed from: a */
    private SERVER_PARAMETERS m8118a(String str, int i, String str2) throws RemoteException {
        Map hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    hashMap.put(str3, jSONObject.getString(str3));
                }
            } catch (Throwable th) {
                bky.m9009c("Could not get MediationServerParameters.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class serverParametersType = this.f5946a.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        MediationServerParameters mediationServerParameters = (MediationServerParameters) serverParametersType.newInstance();
        mediationServerParameters.load(hashMap);
        return mediationServerParameters;
    }

    /* renamed from: a */
    public aqq mo1054a() throws RemoteException {
        if (this.f5946a instanceof MediationBannerAdapter) {
            try {
                return aqr.m4967a(((MediationBannerAdapter) this.f5946a).getBannerView());
            } catch (Throwable th) {
                bky.m9009c("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f5946a.getClass().getCanonicalName());
            bky.m9011e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public void mo1055a(aqq aqq) throws RemoteException {
    }

    /* renamed from: a */
    public void mo1056a(aqq aqq, bjf bjf, List<String> list) {
    }

    /* renamed from: a */
    public void mo1057a(aqq aqq, zzec zzec, String str, bez bez) throws RemoteException {
        mo1059a(aqq, zzec, str, null, bez);
    }

    /* renamed from: a */
    public void mo1058a(aqq aqq, zzec zzec, String str, bjf bjf, String str2) throws RemoteException {
    }

    /* renamed from: a */
    public void mo1059a(aqq aqq, zzec zzec, String str, String str2, bez bez) throws RemoteException {
        if (this.f5946a instanceof MediationInterstitialAdapter) {
            bky.m9006b("Requesting interstitial ad from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f5946a).requestInterstitialAd(new bfk(bez), (Activity) aqr.m4968a(aqq), m8118a(str, zzec.f14919g, str2), bfl.m8146a(zzec), this.f5947b);
            } catch (Throwable th) {
                bky.m9009c("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f5946a.getClass().getCanonicalName());
            bky.m9011e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public void mo1060a(aqq aqq, zzec zzec, String str, String str2, bez bez, zzhc zzhc, List<String> list) {
    }

    /* renamed from: a */
    public void mo1061a(aqq aqq, zzeg zzeg, zzec zzec, String str, bez bez) throws RemoteException {
        mo1062a(aqq, zzeg, zzec, str, null, bez);
    }

    /* renamed from: a */
    public void mo1062a(aqq aqq, zzeg zzeg, zzec zzec, String str, String str2, bez bez) throws RemoteException {
        if (this.f5946a instanceof MediationBannerAdapter) {
            bky.m9006b("Requesting banner ad from adapter.");
            try {
                ((MediationBannerAdapter) this.f5946a).requestBannerAd(new bfk(bez), (Activity) aqr.m4968a(aqq), m8118a(str, zzec.f14919g, str2), bfl.m8145a(zzeg), bfl.m8146a(zzec), this.f5947b);
            } catch (Throwable th) {
                bky.m9009c("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f5946a.getClass().getCanonicalName());
            bky.m9011e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public void mo1063a(zzec zzec, String str) {
    }

    /* renamed from: a */
    public void mo1064a(zzec zzec, String str, String str2) {
    }

    /* renamed from: b */
    public void mo1065b() throws RemoteException {
        if (this.f5946a instanceof MediationInterstitialAdapter) {
            bky.m9006b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f5946a).showInterstitial();
            } catch (Throwable th) {
                bky.m9009c("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f5946a.getClass().getCanonicalName());
            bky.m9011e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    /* renamed from: c */
    public void mo1066c() throws RemoteException {
        try {
            this.f5946a.destroy();
        } catch (Throwable th) {
            bky.m9009c("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    /* renamed from: d */
    public void mo1067d() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: e */
    public void mo1068e() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: f */
    public void mo1069f() {
    }

    /* renamed from: g */
    public boolean mo1070g() {
        return true;
    }

    /* renamed from: h */
    public bfb mo1071h() {
        return null;
    }

    /* renamed from: i */
    public bfc mo1072i() {
        return null;
    }

    /* renamed from: j */
    public Bundle mo1073j() {
        return new Bundle();
    }

    /* renamed from: k */
    public Bundle mo1074k() {
        return new Bundle();
    }

    /* renamed from: l */
    public Bundle mo1075l() {
        return new Bundle();
    }

    /* renamed from: m */
    public boolean mo1076m() {
        return false;
    }
}
