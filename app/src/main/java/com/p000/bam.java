package com.p000;

import android.os.RemoteException;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzhc;
import p000.azu.C0246a;
import p000.azv.C0247a;

/* renamed from: bam */
public class bam extends C0247a {
    /* renamed from: a */
    private azt f5281a;

    /* renamed from: bam$a */
    class C0968a extends C0246a {
        /* renamed from: a */
        final /* synthetic */ bam f5280a;

        /* renamed from: bam$a$1 */
        class C09671 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C0968a f5279a;

            C09671(C0968a c0968a) {
                this.f5279a = c0968a;
            }

            public void run() {
                if (this.f5279a.f5280a.f5281a != null) {
                    try {
                        this.f5279a.f5280a.f5281a.mo860a(1);
                    } catch (Throwable e) {
                        bky.m9009c("Could not notify onAdFailedToLoad event.", e);
                    }
                }
            }
        }

        private C0968a(bam bam) {
            this.f5280a = bam;
        }

        /* renamed from: a */
        public String mo294a() throws RemoteException {
            return null;
        }

        /* renamed from: a */
        public void mo295a(zzec zzec) throws RemoteException {
            bky.m9008c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
            bkx.f6798a.post(new C09671(this));
        }

        /* renamed from: b */
        public boolean mo296b() throws RemoteException {
            return false;
        }
    }

    /* renamed from: a */
    public azu mo297a() throws RemoteException {
        return new C0968a();
    }

    /* renamed from: a */
    public void mo298a(azt azt) throws RemoteException {
        this.f5281a = azt;
    }

    /* renamed from: a */
    public void mo299a(bab bab) throws RemoteException {
    }

    /* renamed from: a */
    public void mo300a(bcl bcl) throws RemoteException {
    }

    /* renamed from: a */
    public void mo301a(bcm bcm) throws RemoteException {
    }

    /* renamed from: a */
    public void mo302a(zzhc zzhc) throws RemoteException {
    }

    /* renamed from: a */
    public void mo303a(String str, bco bco, bcn bcn) throws RemoteException {
    }
}
