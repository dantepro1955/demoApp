package com.p000;

import android.content.Context;
import android.os.Looper;
import p000.ann.C0290a;
import p000.ann.C0296c;
import p000.ari.C0301a;

/* renamed from: asb */
public class asb<O extends C0290a> extends ars {
    /* renamed from: a */
    private final aoa<O> f4237a;

    public asb(aoa<O> aoa) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f4237a = aoa;
    }

    public Context getContext() {
        return this.f4237a.m4609f();
    }

    public Looper getLooper() {
        return this.f4237a.m4608e();
    }

    public <A extends C0296c, R extends ant, T extends C0301a<R, A>> T zza(T t) {
        return this.f4237a.m4601a(t);
    }

    public void zza(asv asv) {
    }

    public <A extends C0296c, T extends C0301a<? extends ant, A>> T zzb(T t) {
        return this.f4237a.m4603b(t);
    }

    public void zzb(asv asv) {
    }
}
