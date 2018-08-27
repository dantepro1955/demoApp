package com.p000;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: ami */
public class ami implements ant {
    /* renamed from: a */
    private Status f2026a;
    /* renamed from: b */
    private GoogleSignInAccount f2027b;

    public ami(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f2027b = googleSignInAccount;
        this.f2026a = status;
    }

    /* renamed from: a */
    public GoogleSignInAccount m2574a() {
        return this.f2027b;
    }

    /* renamed from: b */
    public Status mo325b() {
        return this.f2026a;
    }

    /* renamed from: c */
    public boolean m2576c() {
        return this.f2026a.m19519e();
    }
}
