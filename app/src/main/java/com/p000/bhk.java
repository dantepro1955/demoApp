package com.p000;

import com.google.android.gms.internal.zzmn;
import java.lang.ref.WeakReference;
import p000.bhg.C1201a;
import p000.bhp.C1208a;

@bhd
/* renamed from: bhk */
public final class bhk extends C1208a {
    /* renamed from: a */
    private final WeakReference<C1201a> f6258a;

    public bhk(C1201a c1201a) {
        this.f6258a = new WeakReference(c1201a);
    }

    /* renamed from: a */
    public void mo1192a(zzmn zzmn) {
        C1201a c1201a = (C1201a) this.f6258a.get();
        if (c1201a != null) {
            c1201a.mo1188a(zzmn);
        }
    }
}
