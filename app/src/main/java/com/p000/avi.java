package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.millennialmedia.android.MMSDK$Event;
import p000.ann.C0286b;
import p000.ann.C0290a.C0291a;
import p000.ann.C0646g;

/* renamed from: avi */
public final class avi {
    /* renamed from: a */
    public static final C0646g<avr> f4666a = new C0646g();
    /* renamed from: b */
    public static final C0646g<avr> f4667b = new C0646g();
    /* renamed from: c */
    public static final C0286b<avr, avk> f4668c = new C08471();
    /* renamed from: d */
    static final C0286b<avr, C0849a> f4669d = new C08482();
    /* renamed from: e */
    public static final Scope f4670e = new Scope("profile");
    /* renamed from: f */
    public static final Scope f4671f = new Scope(MMSDK$Event.INTENT_EMAIL);
    /* renamed from: g */
    public static final ann<avk> f4672g = new ann("SignIn.API", f4668c, f4666a);
    /* renamed from: h */
    public static final ann<C0849a> f4673h = new ann("SignIn.INTERNAL_API", f4669d, f4667b);

    /* renamed from: avi$1 */
    class C08471 extends C0286b<avr, avk> {
        C08471() {
        }

        /* renamed from: a */
        public avr m5990a(Context context, Looper looper, aou aou, avk avk, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new avr(context, looper, true, aou, avk == null ? avk.f4674a : avk, connectionCallbacks, onConnectionFailedListener);
        }
    }

    /* renamed from: avi$2 */
    class C08482 extends C0286b<avr, C0849a> {
        C08482() {
        }

        /* renamed from: a */
        public avr m5992a(Context context, Looper looper, aou aou, C0849a c0849a, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new avr(context, looper, false, aou, c0849a.m5993a(), connectionCallbacks, onConnectionFailedListener);
        }
    }

    /* renamed from: avi$a */
    public static class C0849a implements C0291a {
        /* renamed from: a */
        private final Bundle f4665a;

        /* renamed from: a */
        public Bundle m5993a() {
            return this.f4665a;
        }
    }
}
