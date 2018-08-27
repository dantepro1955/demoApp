package com.p000;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import java.util.Map;
import p000.bex.C1124a;

@bhd
/* renamed from: bev */
public final class bev extends C1124a {
    /* renamed from: a */
    private Map<Class<? extends NetworkExtras>, NetworkExtras> f5916a;

    /* renamed from: c */
    private <NETWORK_EXTRAS extends com.google.ads.mediation.NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> bey m7921c(String str) throws RemoteException {
        try {
            Class cls = Class.forName(str, false, bev.class.getClassLoader());
            if (MediationAdapter.class.isAssignableFrom(cls)) {
                MediationAdapter mediationAdapter = (MediationAdapter) cls.newInstance();
                return new bfj(mediationAdapter, (com.google.ads.mediation.NetworkExtras) this.f5916a.get(mediationAdapter.getAdditionalParametersType()));
            } else if (com.google.android.gms.ads.mediation.MediationAdapter.class.isAssignableFrom(cls)) {
                return new bfe((com.google.android.gms.ads.mediation.MediationAdapter) cls.newInstance());
            } else {
                bky.m9011e(new StringBuilder(String.valueOf(str).length() + 64).append("Could not instantiate mediation adapter: ").append(str).append(" (not a valid adapter).").toString());
                throw new RemoteException();
            }
        } catch (Throwable th) {
            return m7922d(str);
        }
    }

    /* renamed from: d */
    private bey m7922d(String str) throws RemoteException {
        try {
            bky.m9006b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new bfe(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new bfe(new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new bfe(new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                MediationAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new bfj(customEventAdapter, (CustomEventExtras) this.f5916a.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            bky.m9009c(new StringBuilder(String.valueOf(str).length() + 43).append("Could not instantiate mediation adapter: ").append(str).append(". ").toString(), th);
        }
    }

    /* renamed from: a */
    public bey mo1052a(String str) throws RemoteException {
        return m7921c(str);
    }

    /* renamed from: a */
    public void m7924a(Map<Class<? extends NetworkExtras>, NetworkExtras> map) {
        this.f5916a = map;
    }

    /* renamed from: b */
    public boolean mo1053b(String str) throws RemoteException {
        boolean z = false;
        try {
            z = CustomEvent.class.isAssignableFrom(Class.forName(str, false, bev.class.getClassLoader()));
        } catch (Throwable th) {
            bky.m9011e(new StringBuilder(String.valueOf(str).length() + 80).append("Could not load custom event implementation class: ").append(str).append(", assuming old implementation.").toString());
        }
        return z;
    }
}
