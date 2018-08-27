package com.p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import p000.ann.C0286b;
import p000.ann.C0290a.C0644b;
import p000.ann.C0297f;
import p000.ann.C0646g;

/* renamed from: ata */
public final class ata {
    /* renamed from: a */
    public static final C0646g<ate> f4317a = new C0646g();
    /* renamed from: b */
    public static final ann<C0644b> f4318b = new ann("Common.API", f4320d, f4317a);
    /* renamed from: c */
    public static final atb f4319c = new atc();
    /* renamed from: d */
    private static final C0286b<ate, C0644b> f4320d = new C07871();

    /* renamed from: ata$1 */
    class C07871 extends C0286b<ate, C0644b> {
        C07871() {
        }

        /* renamed from: a */
        public /* synthetic */ C0297f mo323a(Context context, Looper looper, aou aou, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return m5578a(context, looper, aou, (C0644b) obj, connectionCallbacks, onConnectionFailedListener);
        }

        /* renamed from: a */
        public ate m5578a(Context context, Looper looper, aou aou, C0644b c0644b, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new ate(context, looper, aou, connectionCallbacks, onConnectionFailedListener);
        }
    }
}
