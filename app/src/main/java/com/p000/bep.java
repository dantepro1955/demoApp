package com.p000;

import p000.ber.C1120a;
import p000.bez.C1116a;

@bhd
/* renamed from: bep */
public final class bep extends C1116a {
    /* renamed from: a */
    private final Object f5855a = new Object();
    /* renamed from: b */
    private C1120a f5856b;
    /* renamed from: c */
    private beo f5857c;

    /* renamed from: a */
    public void mo1038a() {
        synchronized (this.f5855a) {
            if (this.f5857c != null) {
                this.f5857c.mo275y();
            }
        }
    }

    /* renamed from: a */
    public void mo1039a(int i) {
        synchronized (this.f5855a) {
            if (this.f5856b != null) {
                this.f5856b.mo1047a(i == 3 ? 1 : 2);
                this.f5856b = null;
            }
        }
    }

    /* renamed from: a */
    public void m7861a(beo beo) {
        synchronized (this.f5855a) {
            this.f5857c = beo;
        }
    }

    /* renamed from: a */
    public void m7862a(C1120a c1120a) {
        synchronized (this.f5855a) {
            this.f5856b = c1120a;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void mo1040a(p000.bfa r4) {
        /*
        r3 = this;
        r1 = r3.f5855a;
        monitor-enter(r1);
        r0 = r3.f5856b;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0012;
    L_0x0007:
        r0 = r3.f5856b;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r0.mo1048a(r2, r4);	 Catch:{ all -> 0x001d }
        r0 = 0;
        r3.f5856b = r0;	 Catch:{ all -> 0x001d }
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
    L_0x0011:
        return;
    L_0x0012:
        r0 = r3.f5857c;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r0 = r3.f5857c;	 Catch:{ all -> 0x001d }
        r0.mo258C();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        goto L_0x0011;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bep.a(bfa):void");
    }

    /* renamed from: b */
    public void mo1041b() {
        synchronized (this.f5855a) {
            if (this.f5857c != null) {
                this.f5857c.mo276z();
            }
        }
    }

    /* renamed from: c */
    public void mo1042c() {
        synchronized (this.f5855a) {
            if (this.f5857c != null) {
                this.f5857c.mo256A();
            }
        }
    }

    /* renamed from: d */
    public void mo1043d() {
        synchronized (this.f5855a) {
            if (this.f5857c != null) {
                this.f5857c.mo257B();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    public void mo1044e() {
        /*
        r3 = this;
        r1 = r3.f5855a;
        monitor-enter(r1);
        r0 = r3.f5856b;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0012;
    L_0x0007:
        r0 = r3.f5856b;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r0.mo1047a(r2);	 Catch:{ all -> 0x001d }
        r0 = 0;
        r3.f5856b = r0;	 Catch:{ all -> 0x001d }
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
    L_0x0011:
        return;
    L_0x0012:
        r0 = r3.f5857c;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r0 = r3.f5857c;	 Catch:{ all -> 0x001d }
        r0.mo258C();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        goto L_0x0011;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bep.e():void");
    }

    /* renamed from: f */
    public void mo1045f() {
        synchronized (this.f5855a) {
            if (this.f5857c != null) {
                this.f5857c.mo259D();
            }
        }
    }
}
