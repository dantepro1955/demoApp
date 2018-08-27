package com.p000;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: CompositePermissionListener */
/* renamed from: bxm */
public class bxm implements bxo {
    /* renamed from: a */
    private final Collection<bxo> f8071a;

    public bxm(bxo... bxoArr) {
        this(Arrays.asList(bxoArr));
    }

    public bxm(Collection<bxo> collection) {
        this.f8071a = collection;
    }

    /* renamed from: a */
    public void mo1591a(bxi bxi) {
        for (bxo a : this.f8071a) {
            a.mo1591a(bxi);
        }
    }

    /* renamed from: a */
    public void mo1590a(bxh bxh) {
        for (bxo a : this.f8071a) {
            a.mo1590a(bxh);
        }
    }

    /* renamed from: a */
    public void mo1592a(bxj bxj, bxe bxe) {
        for (bxo a : this.f8071a) {
            a.mo1592a(bxj, bxe);
        }
    }
}
