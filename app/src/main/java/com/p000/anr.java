package com.p000;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* renamed from: anr */
public final class anr {

    /* renamed from: anr$a */
    static final class C0651a<R extends ant> extends ark<R> {
        public C0651a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: b */
        protected R mo352b(Status status) {
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }

    /* renamed from: a */
    public static <R extends ant> anp<R> m4566a(R r, GoogleApiClient googleApiClient) {
        aoi.m4680a((Object) r, (Object) "Result must not be null");
        anq c0651a = new C0651a(googleApiClient);
        c0651a.m2680a((ant) r);
        return new asl(c0651a);
    }

    /* renamed from: a */
    public static anq<Status> m4567a(Status status) {
        aoi.m4680a((Object) status, (Object) "Result must not be null");
        anq asu = new asu(Looper.getMainLooper());
        asu.m2680a((ant) status);
        return asu;
    }
}
