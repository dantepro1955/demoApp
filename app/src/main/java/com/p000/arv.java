package com.p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import p000.ann.C0296c;
import p000.ari.C0301a;

/* renamed from: arv */
public class arv implements arx {
    /* renamed from: a */
    private final ary f4136a;

    public arv(ary ary) {
        this.f4136a = ary;
    }

    /* renamed from: a */
    public <A extends C0296c, R extends ant, T extends C0301a<R, A>> T mo671a(T t) {
        this.f4136a.f4180g.f4148a.add(t);
        return t;
    }

    /* renamed from: a */
    public void mo672a() {
        this.f4136a.m5378j();
        this.f4136a.f4180g.f4151d = Collections.emptySet();
    }

    /* renamed from: a */
    public void mo673a(int i) {
    }

    /* renamed from: a */
    public void mo674a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo675a(ConnectionResult connectionResult, ann<?> ann, boolean z) {
    }

    /* renamed from: b */
    public <A extends C0296c, T extends C0301a<? extends ant, A>> T mo676b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: b */
    public boolean mo677b() {
        return true;
    }

    /* renamed from: c */
    public void mo678c() {
        this.f4136a.m5376h();
    }
}
