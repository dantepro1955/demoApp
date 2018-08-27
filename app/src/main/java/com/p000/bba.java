package com.p000;

import android.content.SharedPreferences;
import android.os.ConditionVariable;
import java.util.concurrent.Callable;

@bhd
/* renamed from: bba */
public class bba {
    /* renamed from: a */
    private final Object f5363a = new Object();
    /* renamed from: b */
    private final ConditionVariable f5364b = new ConditionVariable();
    /* renamed from: c */
    private volatile boolean f5365c = false;
    /* renamed from: d */
    private SharedPreferences f5366d = null;

    /* renamed from: a */
    public <T> T m7124a(final baw<T> baw) {
        if (this.f5364b.block(5000)) {
            if (!this.f5365c) {
                synchronized (this.f5363a) {
                    if (!this.f5365c) {
                        T b = baw.m7063b();
                        return b;
                    }
                }
            }
            return bku.m9268a(new Callable<T>(this) {
                /* renamed from: b */
                final /* synthetic */ bba f5362b;

                public T call() {
                    return baw.mo912a(this.f5362b.f5366d);
                }
            });
        }
        throw new IllegalStateException("Flags.initialize() was not called!");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m7125a(android.content.Context r4) {
        /*
        r3 = this;
        r0 = r3.f5365c;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r1 = r3.f5363a;
        monitor-enter(r1);
        r0 = r3.f5365c;	 Catch:{ all -> 0x000e }
        if (r0 == 0) goto L_0x0011;
    L_0x000c:
        monitor-exit(r1);	 Catch:{ all -> 0x000e }
        goto L_0x0004;
    L_0x000e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x000e }
        throw r0;
    L_0x0011:
        r0 = p000.aqo.getRemoteContext(r4);	 Catch:{ all -> 0x0032 }
        if (r0 != 0) goto L_0x001e;
    L_0x0017:
        r0 = r3.f5364b;	 Catch:{ all -> 0x000e }
        r0.open();	 Catch:{ all -> 0x000e }
        monitor-exit(r1);	 Catch:{ all -> 0x000e }
        goto L_0x0004;
    L_0x001e:
        r2 = p000.ako.m2353o();	 Catch:{ all -> 0x0032 }
        r0 = r2.m7081a(r0);	 Catch:{ all -> 0x0032 }
        r3.f5366d = r0;	 Catch:{ all -> 0x0032 }
        r0 = 1;
        r3.f5365c = r0;	 Catch:{ all -> 0x0032 }
        r0 = r3.f5364b;	 Catch:{ all -> 0x000e }
        r0.open();	 Catch:{ all -> 0x000e }
        monitor-exit(r1);	 Catch:{ all -> 0x000e }
        goto L_0x0004;
    L_0x0032:
        r0 = move-exception;
        r2 = r3.f5364b;	 Catch:{ all -> 0x000e }
        r2.open();	 Catch:{ all -> 0x000e }
        throw r0;	 Catch:{ all -> 0x000e }
        */
        throw new UnsupportedOperationException("Method not decompiled: bba.a(android.content.Context):void");
    }
}
