package com.p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import p000.ann.C0286b;
import p000.ann.C0646g;

/* renamed from: ana */
public final class ana {
    /* renamed from: a */
    public static final C0646g<bow> f2097a = new C0646g();
    /* renamed from: b */
    public static final ann<anb> f2098b = new ann("Auth.PROXY_API", f2099c, f2097a);
    /* renamed from: c */
    private static final C0286b<bow, anb> f2099c = new C03181();

    /* renamed from: ana$1 */
    class C03181 extends C0286b<bow, anb> {
        C03181() {
        }

        /* renamed from: a */
        public bow m2807a(Context context, Looper looper, aou aou, anb anb, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new bow(context, looper, aou, anb, connectionCallbacks, onConnectionFailedListener);
        }
    }
}
