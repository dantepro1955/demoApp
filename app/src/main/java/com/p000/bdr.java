package com.p000;

import android.content.Context;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzqh;

@bhd
/* renamed from: bdr */
public class bdr {
    /* renamed from: a */
    private final Context f5677a;
    /* renamed from: b */
    private final bex f5678b;
    /* renamed from: c */
    private final zzqh f5679c;
    /* renamed from: d */
    private final ajx f5680d;

    bdr(Context context, bex bex, zzqh zzqh, ajx ajx) {
        this.f5677a = context;
        this.f5678b = bex;
        this.f5679c = zzqh;
        this.f5680d = ajx;
    }

    /* renamed from: a */
    public akf m7617a(String str) {
        return new akf(this.f5677a, new zzeg(), str, this.f5678b, this.f5679c, this.f5680d);
    }

    /* renamed from: a */
    public Context m7618a() {
        return this.f5677a.getApplicationContext();
    }

    /* renamed from: b */
    public akf m7619b(String str) {
        return new akf(this.f5677a.getApplicationContext(), new zzeg(), str, this.f5678b, this.f5679c, this.f5680d);
    }

    /* renamed from: b */
    public bdr m7620b() {
        return new bdr(m7618a(), this.f5678b, this.f5679c, this.f5680d);
    }
}
