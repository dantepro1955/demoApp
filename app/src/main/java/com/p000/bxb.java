package com.p000;

import java.util.List;

/* compiled from: MultiplePermissionsListenerToPermissionListenerAdapter */
/* renamed from: bxb */
final class bxb implements bxl {
    /* renamed from: a */
    private final bxo f8062a;

    public bxb(bxo bxo) {
        this.f8062a = bxo;
    }

    /* renamed from: a */
    public void mo1586a(bxc bxc) {
        List b = bxc.m11624b();
        List a = bxc.m11621a();
        if (b.isEmpty()) {
            this.f8062a.mo1591a((bxi) a.get(0));
            return;
        }
        this.f8062a.mo1590a((bxh) b.get(0));
    }

    /* renamed from: a */
    public void mo1587a(List<bxj> list, bxe bxe) {
        this.f8062a.mo1592a((bxj) list.get(0), bxe);
    }
}
