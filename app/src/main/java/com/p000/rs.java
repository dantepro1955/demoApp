package com.p000;

import java.io.Closeable;

/* compiled from: CancellationTokenRegistration */
/* renamed from: rs */
public class rs implements Closeable {
    /* renamed from: a */
    private final Object f25356a;
    /* renamed from: b */
    private rt f25357b;
    /* renamed from: c */
    private Runnable f25358c;
    /* renamed from: d */
    private boolean f25359d;

    public void close() {
        synchronized (this.f25356a) {
            if (this.f25359d) {
                return;
            }
            this.f25359d = true;
            this.f25357b.m33987a(this);
            this.f25357b = null;
            this.f25358c = null;
        }
    }
}
