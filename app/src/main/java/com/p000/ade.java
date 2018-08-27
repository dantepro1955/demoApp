package com.p000;

/* compiled from: ExoPlaybackException */
/* renamed from: ade */
public final class ade extends Exception {
    /* renamed from: a */
    public final boolean f477a;

    public ade(String str) {
        super(str);
        this.f477a = false;
    }

    public ade(Throwable th) {
        super(th);
        this.f477a = false;
    }

    ade(Throwable th, boolean z) {
        super(th);
        this.f477a = z;
    }
}
