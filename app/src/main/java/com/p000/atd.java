package com.p000;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import p000.ari.C0301a;

/* renamed from: atd */
abstract class atd<R extends ant> extends C0301a<R, ate> {

    /* renamed from: atd$a */
    static abstract class C0788a extends atd<Status> {
        public C0788a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: a */
        public Status m5580a(Status status) {
            return status;
        }

        /* renamed from: b */
        public /* synthetic */ ant mo352b(Status status) {
            return m5580a(status);
        }
    }

    public atd(GoogleApiClient googleApiClient) {
        super(ata.f4318b, googleApiClient);
    }
}
