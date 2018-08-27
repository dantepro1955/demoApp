package com.p000;

import com.facebook.common.time.Clock;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: BackpressureDrainManager */
/* renamed from: dwt */
public final class dwt extends AtomicLong implements dtr {
    private static final long serialVersionUID = 2826241102729529449L;
    /* renamed from: a */
    boolean f23345a;
    /* renamed from: b */
    volatile boolean f23346b;
    /* renamed from: c */
    Throwable f23347c;
    /* renamed from: d */
    final C5152a f23348d;

    /* compiled from: BackpressureDrainManager */
    /* renamed from: dwt$a */
    public interface C5152a {
        /* renamed from: a */
        Object mo4656a();

        /* renamed from: a */
        void mo4657a(Throwable th);

        /* renamed from: a */
        boolean mo4658a(Object obj);

        /* renamed from: b */
        Object mo4659b();
    }

    public dwt(C5152a c5152a) {
        this.f23348d = c5152a;
    }

    /* renamed from: a */
    public void m29652a() {
        this.f23346b = true;
        m29654b();
    }

    /* renamed from: a */
    public void m29653a(Throwable th) {
        if (!this.f23346b) {
            this.f23347c = th;
            this.f23346b = true;
            m29654b();
        }
    }

    public void request(long j) {
        if (j != 0) {
            Object obj;
            long j2;
            long j3;
            do {
                j2 = get();
                obj = j2 == 0 ? 1 : null;
                if (j2 == Clock.MAX_TIME) {
                    break;
                } else if (j == Clock.MAX_TIME) {
                    j3 = j;
                    obj = 1;
                } else {
                    j3 = j2 > Clock.MAX_TIME - j ? Clock.MAX_TIME : j2 + j;
                }
            } while (!compareAndSet(j2, j3));
            if (obj != null) {
                m29654b();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public void m29654b() {
        /*
        r13 = this;
        monitor-enter(r13);
        r0 = r13.f23345a;	 Catch:{ all -> 0x0038 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r13);	 Catch:{ all -> 0x0038 }
    L_0x0006:
        return;
    L_0x0007:
        r0 = 1;
        r13.f23345a = r0;	 Catch:{ all -> 0x0038 }
        r2 = r13.f23346b;	 Catch:{ all -> 0x0038 }
        monitor-exit(r13);	 Catch:{ all -> 0x0038 }
        r0 = r13.get();
        r3 = 0;
        r6 = r13.f23348d;	 Catch:{ all -> 0x002f }
    L_0x0014:
        r4 = 0;
        r12 = r4;
        r4 = r0;
        r1 = r12;
    L_0x0018:
        r8 = 0;
        r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r0 > 0) goto L_0x0020;
    L_0x001e:
        if (r2 == 0) goto L_0x0041;
    L_0x0020:
        if (r2 == 0) goto L_0x0069;
    L_0x0022:
        r0 = r6.mo4656a();	 Catch:{ all -> 0x002f }
        if (r0 != 0) goto L_0x003b;
    L_0x0028:
        r3 = 1;
        r0 = r13.f23347c;	 Catch:{ all -> 0x002f }
        r6.mo4657a(r0);	 Catch:{ all -> 0x002f }
        goto L_0x0006;
    L_0x002f:
        r0 = move-exception;
    L_0x0030:
        if (r3 != 0) goto L_0x0037;
    L_0x0032:
        monitor-enter(r13);
        r1 = 0;
        r13.f23345a = r1;	 Catch:{ all -> 0x00a2 }
        monitor-exit(r13);	 Catch:{ all -> 0x00a2 }
    L_0x0037:
        throw r0;
    L_0x0038:
        r0 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x0038 }
        throw r0;
    L_0x003b:
        r8 = 0;
        r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r0 != 0) goto L_0x0069;
    L_0x0041:
        monitor-enter(r13);	 Catch:{ all -> 0x002f }
        r2 = r13.f23346b;	 Catch:{ all -> 0x0086 }
        r0 = r6.mo4656a();	 Catch:{ all -> 0x0086 }
        if (r0 == 0) goto L_0x007c;
    L_0x004a:
        r0 = 1;
        r4 = r0;
    L_0x004c:
        r8 = r13.get();	 Catch:{ all -> 0x0086 }
        r10 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r0 != 0) goto L_0x0089;
    L_0x0059:
        if (r4 != 0) goto L_0x007f;
    L_0x005b:
        if (r2 != 0) goto L_0x007f;
    L_0x005d:
        r1 = 1;
        r0 = 0;
        r13.f23345a = r0;	 Catch:{ all -> 0x0063 }
        monitor-exit(r13);	 Catch:{ all -> 0x0063 }
        goto L_0x0006;
    L_0x0063:
        r0 = move-exception;
    L_0x0064:
        monitor-exit(r13);	 Catch:{ all -> 0x0063 }
        throw r0;	 Catch:{ all -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        r3 = r1;
        goto L_0x0030;
    L_0x0069:
        r0 = r6.mo4659b();	 Catch:{ all -> 0x002f }
        if (r0 == 0) goto L_0x0041;
    L_0x006f:
        r0 = r6.mo4658a(r0);	 Catch:{ all -> 0x002f }
        if (r0 != 0) goto L_0x0006;
    L_0x0075:
        r8 = 1;
        r4 = r4 - r8;
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0018;
    L_0x007c:
        r0 = 0;
        r4 = r0;
        goto L_0x004c;
    L_0x007f:
        r0 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x0084:
        monitor-exit(r13);	 Catch:{ all -> 0x0086 }
        goto L_0x0014;
    L_0x0086:
        r0 = move-exception;
        r1 = r3;
        goto L_0x0064;
    L_0x0089:
        r0 = -r1;
        r0 = (long) r0;	 Catch:{ all -> 0x0086 }
        r0 = r13.addAndGet(r0);	 Catch:{ all -> 0x0086 }
        r8 = 0;
        r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r5 == 0) goto L_0x0097;
    L_0x0095:
        if (r4 != 0) goto L_0x0084;
    L_0x0097:
        if (r2 == 0) goto L_0x009b;
    L_0x0099:
        if (r4 == 0) goto L_0x0084;
    L_0x009b:
        r1 = 1;
        r0 = 0;
        r13.f23345a = r0;	 Catch:{ all -> 0x0063 }
        monitor-exit(r13);	 Catch:{ all -> 0x0063 }
        goto L_0x0006;
    L_0x00a2:
        r0 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x00a2 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: dwt.b():void");
    }
}
