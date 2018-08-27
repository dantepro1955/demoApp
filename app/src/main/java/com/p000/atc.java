package com.p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import p000.ari.C0300b;
import p000.atd.C0788a;

/* renamed from: atc */
public final class atc implements atb {

    /* renamed from: atc$a */
    static class C0790a extends asz {
        /* renamed from: a */
        private final C0300b<Status> f4321a;

        public C0790a(C0300b<Status> c0300b) {
            this.f4321a = c0300b;
        }

        /* renamed from: a */
        public void mo714a(int i) throws RemoteException {
            this.f4321a.mo349a(new Status(i));
        }
    }

    /* renamed from: a */
    public anq<Status> mo716a(GoogleApiClient googleApiClient) {
        return googleApiClient.zzb(new C0788a(this, googleApiClient) {
            /* renamed from: a */
            protected void m5583a(ate ate) throws RemoteException {
                ((atg) ate.m2638v()).mo717a(new C0790a(this));
            }
        });
    }
}
