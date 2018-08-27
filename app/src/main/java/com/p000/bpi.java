package com.p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzzm;
import p000.ann.C0290a.C0644b;
import p000.ari.C0301a;
import p000.bpl.C1395a;

/* renamed from: bpi */
public class bpi extends aoa<C0644b> implements bpg {

    /* renamed from: bpi$a */
    static class C1396a extends C1395a {
        C1396a() {
        }

        /* renamed from: a */
        public void mo1383a(Status status) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo1384a(Status status, long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo1385b(Status status) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo1386b(Status status, long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo1387c(Status status) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: bpi$b */
    static final class C1398b extends C0301a<Status, bpj> {
        /* renamed from: a */
        private final zzzm f7371a;

        /* renamed from: bpi$b$1 */
        class C13971 extends C1396a {
            /* renamed from: a */
            final /* synthetic */ C1398b f7370a;

            C13971(C1398b c1398b) {
                this.f7370a = c1398b;
            }

            /* renamed from: a */
            public void mo1383a(Status status) {
                this.f7370a.m2680a((ant) status);
            }
        }

        C1398b(zzzm zzzm, GoogleApiClient googleApiClient) {
            super(bpf.f7357c, googleApiClient);
            this.f7371a = zzzm;
        }

        /* renamed from: a */
        protected Status m10305a(Status status) {
            return status;
        }

        /* renamed from: a */
        protected void m10307a(bpj bpj) throws RemoteException {
            bpl c13971 = new C13971(this);
            try {
                bpi.m10311b(this.f7371a);
                bpj.m10315a(c13971, this.f7371a);
            } catch (Throwable e) {
                Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
                m2699c(new Status(10, "MessageProducer"));
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo349a(Object obj) {
            super.m2680a((ant) (Status) obj);
        }

        /* renamed from: b */
        protected /* synthetic */ ant mo352b(Status status) {
            return m10305a(status);
        }
    }

    bpi(Context context) {
        super(context, bpf.f7357c, null, new bpr());
    }

    /* renamed from: a */
    public static bpg m10310a(Context context) {
        return new bpi(context);
    }

    /* renamed from: b */
    static void m10311b(zzzm zzzm) {
        if (zzzm.f15143i != null && zzzm.f15142h.f4870k.length == 0) {
            zzzm.f15142h.f4870k = zzzm.f15143i.m10267a();
        }
        if (zzzm.f15144j != null && zzzm.f15142h.f4877r.length == 0) {
            zzzm.f15142h.f4877r = zzzm.f15144j.m10267a();
        }
        zzzm.f15136b = axf.m5615a(zzzm.f15142h);
    }

    /* renamed from: a */
    public anq<Status> mo1388a(zzzm zzzm) {
        return m4606c(new C1398b(zzzm, m4607d()));
    }
}
