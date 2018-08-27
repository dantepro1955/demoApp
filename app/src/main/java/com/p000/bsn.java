package com.p000;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: bsn */
class bsn<TResult> {
    /* renamed from: a */
    private final Object f7531a = new Object();
    /* renamed from: b */
    private Queue<bsm<TResult>> f7532b;
    /* renamed from: c */
    private boolean f7533c;

    bsn() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m10655a(p000.bsj<TResult> r3) {
        /*
        r2 = this;
        r1 = r2.f7531a;
        monitor-enter(r1);
        r0 = r2.f7532b;	 Catch:{ all -> 0x0026 }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r2.f7533c;	 Catch:{ all -> 0x0026 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
    L_0x000c:
        return;
    L_0x000d:
        r0 = 1;
        r2.f7533c = r0;	 Catch:{ all -> 0x0026 }
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
    L_0x0011:
        r1 = r2.f7531a;
        monitor-enter(r1);
        r0 = r2.f7532b;	 Catch:{ all -> 0x0023 }
        r0 = r0.poll();	 Catch:{ all -> 0x0023 }
        r0 = (p000.bsm) r0;	 Catch:{ all -> 0x0023 }
        if (r0 != 0) goto L_0x0029;
    L_0x001e:
        r0 = 0;
        r2.f7533c = r0;	 Catch:{ all -> 0x0023 }
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        goto L_0x000c;
    L_0x0023:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        throw r0;
    L_0x0026:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
        throw r0;
    L_0x0029:
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        r0.mo1430a(r3);
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: bsn.a(bsj):void");
    }

    /* renamed from: a */
    public void m10656a(bsm<TResult> bsm) {
        synchronized (this.f7531a) {
            if (this.f7532b == null) {
                this.f7532b = new ArrayDeque();
            }
            this.f7532b.add(bsm);
        }
    }
}
