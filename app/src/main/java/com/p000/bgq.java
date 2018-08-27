package com.p000;

import com.google.android.gms.internal.zzmn;
import p000.bgo.C0218a;
import p000.bjt.C1254a;

@bhd
/* renamed from: bgq */
public class bgq extends bkb {
    /* renamed from: a */
    private final C0218a f6103a;
    /* renamed from: b */
    private final zzmn f6104b = this.f6105c.f6530b;
    /* renamed from: c */
    private final C1254a f6105c;

    public bgq(C1254a c1254a, C0218a c0218a) {
        this.f6105c = c1254a;
        this.f6103a = c0218a;
    }

    /* renamed from: a */
    private bjt m8320a(int i) {
        return new bjt(this.f6105c.f6529a.f15034c, null, null, i, null, null, this.f6104b.f15086l, this.f6104b.f15085k, this.f6105c.f6529a.f15040i, false, null, null, null, null, null, this.f6104b.f15083i, this.f6105c.f6532d, this.f6104b.f15081g, this.f6105c.f6534f, this.f6104b.f15088n, this.f6104b.f15089o, this.f6105c.f6536h, null, null, null, null, this.f6105c.f6530b.f15063F, this.f6105c.f6530b.f15064G, null, null, null);
    }

    /* renamed from: a */
    public void mo196a() {
        final bjt a = m8320a(0);
        bkg.f6710a.post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bgq f6102b;

            public void run() {
                this.f6102b.f6103a.mo243b(a);
            }
        });
    }

    /* renamed from: b */
    public void mo197b() {
    }
}
