package com.p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import p000.ann.C0296c;
import p000.ari.C0301a;
import p000.asa.C0763a;
import p000.asj.C0771b;

/* renamed from: bpq */
public abstract class bpq {
    /* renamed from: a */
    public final int f7381a;

    /* renamed from: bpq$a */
    static abstract class C1404a extends bpq {
        /* renamed from: b */
        protected final bsk<Void> f7382b;

        public C1404a(int i, bsk<Void> bsk) {
            super(i);
            this.f7382b = bsk;
        }

        /* renamed from: a */
        public void mo1395a(arq arq, boolean z) {
        }

        /* renamed from: a */
        public final void mo1396a(C0763a<?> c0763a) throws DeadObjectException {
            try {
                mo1398b(c0763a);
            } catch (RemoteException e) {
                mo1397a(bpq.m10356b(e));
                throw e;
            } catch (RemoteException e2) {
                mo1397a(bpq.m10356b(e2));
            }
        }

        /* renamed from: a */
        public void mo1397a(Status status) {
            this.f7382b.m10650b(new any(status));
        }

        /* renamed from: b */
        protected abstract void mo1398b(C0763a<?> c0763a) throws RemoteException;
    }

    /* renamed from: bpq$b */
    public static class C1405b<A extends C0301a<? extends ant, C0296c>> extends bpq {
        /* renamed from: b */
        protected final A f7383b;

        public C1405b(int i, A a) {
            super(i);
            this.f7383b = a;
        }

        /* renamed from: a */
        public void mo1395a(arq arq, boolean z) {
            arq.m5230a(this.f7383b, z);
        }

        /* renamed from: a */
        public void mo1396a(C0763a<?> c0763a) throws DeadObjectException {
            this.f7383b.m2698b(c0763a.m5402b());
        }

        /* renamed from: a */
        public void mo1397a(Status status) {
            this.f7383b.m2699c(status);
        }
    }

    /* renamed from: bpq$c */
    public static final class C1406c extends C1404a {
        /* renamed from: c */
        public final C0771b<?> f7384c;

        public C1406c(C0771b<?> c0771b, bsk<Void> bsk) {
            super(4, bsk);
            this.f7384c = c0771b;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo1395a(arq arq, boolean z) {
            super.mo1395a(arq, z);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo1397a(Status status) {
            super.mo1397a(status);
        }

        /* renamed from: b */
        public void mo1398b(C0763a<?> c0763a) throws RemoteException {
            aso aso = (aso) c0763a.m5403c().remove(this.f7384c);
            if (aso != null) {
                aso.f4260a.m5493a();
                return;
            }
            Log.wtf("UnregisterListenerTask", "Received call to unregister a listener without a matching registration call.", new Exception());
            this.b.m10650b(new any(Status.f14763c));
        }
    }

    public bpq(int i) {
        this.f7381a = i;
    }

    /* renamed from: b */
    private static Status m10356b(RemoteException remoteException) {
        StringBuilder stringBuilder = new StringBuilder();
        if (aqd.m4913c() && (remoteException instanceof TransactionTooLargeException)) {
            stringBuilder.append("TransactionTooLargeException: ");
        }
        stringBuilder.append(remoteException.getLocalizedMessage());
        return new Status(8, stringBuilder.toString());
    }

    /* renamed from: a */
    public abstract void mo1395a(arq arq, boolean z);

    /* renamed from: a */
    public abstract void mo1396a(C0763a<?> c0763a) throws DeadObjectException;

    /* renamed from: a */
    public abstract void mo1397a(Status status);
}
