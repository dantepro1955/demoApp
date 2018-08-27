package com.p000;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p000.aot.C0665f;

/* renamed from: ann */
public final class ann<O extends C0290a> {
    /* renamed from: a */
    private final C0286b<?, O> f3780a;
    /* renamed from: b */
    private final C0648i<?, O> f3781b = null;
    /* renamed from: c */
    private final C0646g<?> f3782c;
    /* renamed from: d */
    private final C0649j<?> f3783d;
    /* renamed from: e */
    private final String f3784e;

    /* renamed from: ann$e */
    public static abstract class C0285e<T extends C0296c, O> {
        /* renamed from: a */
        public int m2531a() {
            return MoPubClientPositioning.NO_REPEAT;
        }

        /* renamed from: a */
        public List<Scope> mo324a(O o) {
            return Collections.emptyList();
        }
    }

    /* renamed from: ann$b */
    public static abstract class C0286b<T extends C0297f, O> extends C0285e<T, O> {
        /* renamed from: a */
        public abstract T mo323a(Context context, Looper looper, aou aou, O o, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener);
    }

    /* renamed from: ann$a */
    public interface C0290a {

        /* renamed from: ann$a$a */
        public interface C0291a extends C0290a {
        }

        /* renamed from: ann$a$c */
        public interface C0292c extends C0290a {
        }

        /* renamed from: ann$a$d */
        public interface C0293d extends C0291a, C0292c {
        }

        /* renamed from: ann$a$b */
        public static final class C0644b implements C0292c {
            private C0644b() {
            }
        }
    }

    /* renamed from: ann$c */
    public interface C0296c {
    }

    /* renamed from: ann$f */
    public interface C0297f extends C0296c {
        /* renamed from: a */
        void m2641a(C0665f c0665f);

        /* renamed from: a */
        void m2642a(ape ape, Set<Scope> set);

        /* renamed from: a */
        void m2643a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        /* renamed from: c */
        boolean mo342c();

        /* renamed from: d */
        Intent mo343d();

        /* renamed from: f */
        void mo779f();

        /* renamed from: g */
        boolean m2647g();

        /* renamed from: h */
        boolean m2648h();

        /* renamed from: i */
        boolean mo799i();

        /* renamed from: j */
        boolean m2650j();

        /* renamed from: k */
        IBinder m2651k();
    }

    /* renamed from: ann$d */
    public static class C0645d<C extends C0296c> {
    }

    /* renamed from: ann$g */
    public static final class C0646g<C extends C0297f> extends C0645d<C> {
    }

    /* renamed from: ann$h */
    public interface C0647h<T extends IInterface> extends C0296c {
        /* renamed from: a */
        T m4555a(IBinder iBinder);

        /* renamed from: a */
        String m4556a();

        /* renamed from: b */
        String m4557b();
    }

    /* renamed from: ann$i */
    public static abstract class C0648i<T extends C0647h, O> extends C0285e<T, O> {
    }

    /* renamed from: ann$j */
    public static final class C0649j<C extends C0647h> extends C0645d<C> {
    }

    public <C extends C0297f> ann(String str, C0286b<C, O> c0286b, C0646g<C> c0646g) {
        aoi.m4680a((Object) c0286b, (Object) "Cannot construct an Api with a null ClientBuilder");
        aoi.m4680a((Object) c0646g, (Object) "Cannot construct an Api with a null ClientKey");
        this.f3784e = str;
        this.f3780a = c0286b;
        this.f3782c = c0646g;
        this.f3783d = null;
    }

    /* renamed from: a */
    public C0285e<?, O> m4558a() {
        return this.f3780a;
    }

    /* renamed from: b */
    public C0286b<?, O> m4559b() {
        aoi.m4685a(this.f3780a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f3780a;
    }

    /* renamed from: c */
    public C0645d<?> m4560c() {
        if (this.f3782c != null) {
            return this.f3782c;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* renamed from: d */
    public String m4561d() {
        return this.f3784e;
    }
}
