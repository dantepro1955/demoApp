package com.p000;

import p000.bss.C1449a;

/* renamed from: bst */
public abstract class bst implements bss {
    /* renamed from: a */
    private C1449a f7572a;
    /* renamed from: b */
    private boolean f7573b;

    /* renamed from: a */
    protected boolean m10698a() {
        return !this.f7573b;
    }

    /* renamed from: b */
    public final void m10699b() {
        if (m10698a()) {
            this.f7573b = true;
            this.f7572a = null;
            m10701d();
        }
    }

    /* renamed from: c */
    public final void m10700c() {
        if (m10698a()) {
            bts.m10952a("The finalize() method for a YouTubeThumbnailLoader has work to do. You should have called release().", new Object[0]);
            m10699b();
        }
    }

    /* renamed from: d */
    public abstract void m10701d();
}
