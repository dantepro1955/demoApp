package com.p000;

import com.ninegag.android.app.model.api.ApiUrlInfoResponse;
import p000.cou.C4131a;

/* renamed from: cpb */
final /* synthetic */ class cpb implements dul {
    /* renamed from: a */
    private final cou f19918a;
    /* renamed from: b */
    private final C4131a f19919b;

    private cpb(cou cou, C4131a c4131a) {
        this.f19918a = cou;
        this.f19919b = c4131a;
    }

    /* renamed from: a */
    public static dul m24251a(cou cou, C4131a c4131a) {
        return new cpb(cou, c4131a);
    }

    public void call(Object obj) {
        cou.m24230a(this.f19918a, this.f19919b, (ApiUrlInfoResponse) obj);
    }
}
