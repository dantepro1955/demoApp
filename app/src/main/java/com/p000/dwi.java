package com.p000;

import java.util.concurrent.ThreadFactory;
import p000.dts.C5094a;

/* compiled from: NewThreadScheduler */
/* renamed from: dwi */
public final class dwi extends dts {
    /* renamed from: b */
    private final ThreadFactory f23296b;

    public dwi(ThreadFactory threadFactory) {
        this.f23296b = threadFactory;
    }

    public C5094a createWorker() {
        return new dwj(this.f23296b);
    }
}
