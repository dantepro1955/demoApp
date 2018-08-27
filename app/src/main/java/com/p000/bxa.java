package com.p000;

import java.util.List;

/* compiled from: MultiplePermissionListenerThreadDecorator */
/* renamed from: bxa */
final class bxa implements bxl {
    /* renamed from: a */
    private final bxl f8060a;
    /* renamed from: b */
    private final bxf f8061b;

    bxa(bxl bxl, bxf bxf) {
        this.f8061b = bxf;
        this.f8060a = bxl;
    }

    /* renamed from: a */
    public void mo1586a(final bxc bxc) {
        this.f8061b.mo1585a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bxa f8056b;

            public void run() {
                this.f8056b.f8060a.mo1586a(bxc);
            }
        });
    }

    /* renamed from: a */
    public void mo1587a(final List<bxj> list, final bxe bxe) {
        this.f8061b.mo1585a(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ bxa f8059c;

            public void run() {
                this.f8059c.f8060a.mo1587a(list, bxe);
            }
        });
    }
}
