package com.p000;

import java.util.HashSet;
import java.util.Set;
import p000.aao.C0006b;

/* compiled from: SamplingEventFilter */
/* renamed from: aaj */
class aaj implements aaf {
    /* renamed from: b */
    static final Set<C0006b> f75b = new C00031();
    /* renamed from: a */
    final int f76a;

    /* compiled from: SamplingEventFilter */
    /* renamed from: aaj$1 */
    static class C00031 extends HashSet<C0006b> {
        C00031() {
            add(C0006b.START);
            add(C0006b.RESUME);
            add(C0006b.PAUSE);
            add(C0006b.STOP);
        }
    }

    public aaj(int i) {
        this.f76a = i;
    }

    /* renamed from: a */
    public boolean mo5a(aao aao) {
        boolean z;
        if (f75b.contains(aao.f102c) && aao.f100a.f115g == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z2;
        if (Math.abs(aao.f100a.f111c.hashCode() % this.f76a) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && r3) {
            return true;
        }
        return false;
    }
}
