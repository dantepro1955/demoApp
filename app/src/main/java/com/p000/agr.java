package com.p000;

import java.util.Arrays;

/* compiled from: DefaultAllocator */
/* renamed from: agr */
public final class agr implements agl {
    /* renamed from: a */
    private final int f1397a;
    /* renamed from: b */
    private final byte[] f1398b;
    /* renamed from: c */
    private int f1399c;
    /* renamed from: d */
    private int f1400d;
    /* renamed from: e */
    private agk[] f1401e;

    public agr(int i) {
        this(i, 0);
    }

    public agr(int i, int i2) {
        boolean z = true;
        int i3 = 0;
        ahb.m1514a(i > 0);
        if (i2 < 0) {
            z = false;
        }
        ahb.m1514a(z);
        this.f1397a = i;
        this.f1400d = i2;
        this.f1401e = new agk[(i2 + 100)];
        if (i2 > 0) {
            this.f1398b = new byte[(i2 * i)];
            while (i3 < i2) {
                this.f1401e[i3] = new agk(this.f1398b, i3 * i);
                i3++;
            }
            return;
        }
        this.f1398b = null;
    }

    /* renamed from: a */
    public synchronized agk mo183a() {
        agk agk;
        this.f1399c++;
        if (this.f1400d > 0) {
            agk[] agkArr = this.f1401e;
            int i = this.f1400d - 1;
            this.f1400d = i;
            agk = agkArr[i];
            this.f1401e[this.f1400d] = null;
        } else {
            agk = new agk(new byte[this.f1397a], 0);
        }
        return agk;
    }

    /* renamed from: a */
    public synchronized void mo185a(agk agk) {
        boolean z = agk.f1376a == this.f1398b || agk.f1376a.length == this.f1397a;
        ahb.m1514a(z);
        this.f1399c--;
        if (this.f1400d == this.f1401e.length) {
            this.f1401e = (agk[]) Arrays.copyOf(this.f1401e, this.f1401e.length * 2);
        }
        agk[] agkArr = this.f1401e;
        int i = this.f1400d;
        this.f1400d = i + 1;
        agkArr[i] = agk;
        notifyAll();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized void mo184a(int r8) {
        /*
        r7 = this;
        r1 = 0;
        monitor-enter(r7);
        r0 = r7.f1397a;	 Catch:{ all -> 0x005c }
        r0 = p000.ahr.m1592a(r8, r0);	 Catch:{ all -> 0x005c }
        r2 = 0;
        r3 = r7.f1399c;	 Catch:{ all -> 0x005c }
        r0 = r0 - r3;
        r3 = java.lang.Math.max(r2, r0);	 Catch:{ all -> 0x005c }
        r0 = r7.f1400d;	 Catch:{ all -> 0x005c }
        if (r3 < r0) goto L_0x0016;
    L_0x0014:
        monitor-exit(r7);
        return;
    L_0x0016:
        r0 = r7.f1398b;	 Catch:{ all -> 0x005c }
        if (r0 == 0) goto L_0x005f;
    L_0x001a:
        r0 = r7.f1400d;	 Catch:{ all -> 0x005c }
        r0 = r0 + -1;
    L_0x001e:
        if (r1 > r0) goto L_0x0049;
    L_0x0020:
        r2 = r7.f1401e;	 Catch:{ all -> 0x005c }
        r4 = r2[r1];	 Catch:{ all -> 0x005c }
        r2 = r4.f1376a;	 Catch:{ all -> 0x005c }
        r5 = r7.f1398b;	 Catch:{ all -> 0x005c }
        if (r2 != r5) goto L_0x002d;
    L_0x002a:
        r1 = r1 + 1;
        goto L_0x001e;
    L_0x002d:
        r2 = r7.f1401e;	 Catch:{ all -> 0x005c }
        r5 = r2[r1];	 Catch:{ all -> 0x005c }
        r2 = r5.f1376a;	 Catch:{ all -> 0x005c }
        r6 = r7.f1398b;	 Catch:{ all -> 0x005c }
        if (r2 == r6) goto L_0x003a;
    L_0x0037:
        r0 = r0 + -1;
        goto L_0x001e;
    L_0x003a:
        r6 = r7.f1401e;	 Catch:{ all -> 0x005c }
        r2 = r1 + 1;
        r6[r1] = r5;	 Catch:{ all -> 0x005c }
        r5 = r7.f1401e;	 Catch:{ all -> 0x005c }
        r1 = r0 + -1;
        r5[r0] = r4;	 Catch:{ all -> 0x005c }
        r0 = r1;
        r1 = r2;
        goto L_0x001e;
    L_0x0049:
        r0 = java.lang.Math.max(r3, r1);	 Catch:{ all -> 0x005c }
        r1 = r7.f1400d;	 Catch:{ all -> 0x005c }
        if (r0 >= r1) goto L_0x0014;
    L_0x0051:
        r1 = r7.f1401e;	 Catch:{ all -> 0x005c }
        r2 = r7.f1400d;	 Catch:{ all -> 0x005c }
        r3 = 0;
        java.util.Arrays.fill(r1, r0, r2, r3);	 Catch:{ all -> 0x005c }
        r7.f1400d = r0;	 Catch:{ all -> 0x005c }
        goto L_0x0014;
    L_0x005c:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
    L_0x005f:
        r0 = r3;
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: agr.a(int):void");
    }

    /* renamed from: c */
    public synchronized int m1473c() {
        return this.f1399c * this.f1397a;
    }

    /* renamed from: b */
    public synchronized void mo187b(int i) throws InterruptedException {
        while (m1473c() > i) {
            wait();
        }
    }

    /* renamed from: b */
    public int mo186b() {
        return this.f1397a;
    }
}
