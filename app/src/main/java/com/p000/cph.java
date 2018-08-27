package com.p000;

import p000.cpg.C4132a;

/* renamed from: cph */
final /* synthetic */ class cph implements dul {
    /* renamed from: a */
    private final cpg f19935a;
    /* renamed from: b */
    private final C4132a f19936b;

    private cph(cpg cpg, C4132a c4132a) {
        this.f19935a = cpg;
        this.f19936b = c4132a;
    }

    /* renamed from: a */
    public static dul m24291a(cpg cpg, C4132a c4132a) {
        return new cph(cpg, c4132a);
    }

    public void call(Object obj) {
        cpg.m24280a(this.f19935a, this.f19936b, (Void) obj);
    }
}
