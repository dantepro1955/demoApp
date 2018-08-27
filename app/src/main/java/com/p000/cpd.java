package com.p000;

import android.content.Context;
import p000.cug.C4521a;
import p000.cuk.C4159a;

/* compiled from: GagMediaProcessor */
/* renamed from: cpd */
public class cpd extends cue {
    /* renamed from: a */
    private cip f19926a;

    public cpd(Context context, C4159a c4159a, C4521a c4521a, cip cip) {
        super(context, c4159a, c4521a);
        this.f19926a = cip;
    }

    /* renamed from: a */
    protected cul mo4104a(int i) {
        if (2 == i) {
            return new cpf(this.f19926a);
        }
        if (1 == i) {
            return new cpe(this.f19926a);
        }
        return super.mo4104a(i);
    }
}
