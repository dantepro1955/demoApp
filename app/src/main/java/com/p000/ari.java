package com.p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import p000.ann.C0296c;
import p000.ann.C0645d;

/* renamed from: ari */
public class ari {

    /* renamed from: ari$b */
    public interface C0300b<R> {
        /* renamed from: a */
        void mo349a(R r);
    }

    /* renamed from: ari$a */
    public static abstract class C0301a<R extends ant, A extends C0296c> extends ark<R> implements C0300b<R> {
        /* renamed from: a */
        private final C0645d<A> f2076a;
        /* renamed from: b */
        private final ann<?> f2077b;

        protected C0301a(ann<?> ann, GoogleApiClient googleApiClient) {
            super((GoogleApiClient) aoi.m4680a((Object) googleApiClient, (Object) "GoogleApiClient must not be null"));
            this.f2076a = ann.m4560c();
            this.f2077b = ann;
        }

        /* renamed from: a */
        private void m2693a(RemoteException remoteException) {
            m2699c(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        /* renamed from: a */
        public final C0645d<A> mo348a() {
            return this.f2076a;
        }

        /* renamed from: a */
        protected abstract void mo351a(A a) throws RemoteException;

        /* renamed from: a */
        public /* synthetic */ void mo349a(Object obj) {
            super.m2680a((ant) obj);
        }

        /* renamed from: b */
        public final ann<?> mo350b() {
            return this.f2077b;
        }

        /* renamed from: b */
        public final void m2698b(A a) throws DeadObjectException {
            try {
                mo351a((C0296c) a);
            } catch (RemoteException e) {
                m2693a(e);
                throw e;
            } catch (RemoteException e2) {
                m2693a(e2);
            }
        }

        /* renamed from: c */
        public final void m2699c(Status status) {
            aoi.m4689b(!status.m19519e(), "Failed result must not be success");
            m2680a(mo352b(status));
        }
    }
}
