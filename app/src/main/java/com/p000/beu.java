package com.p000;

import android.content.Context;
import com.google.android.gms.internal.zzmk;
import java.util.ArrayList;
import java.util.List;

@bhd
/* renamed from: beu */
public class beu implements bel {
    /* renamed from: a */
    private final zzmk f5903a;
    /* renamed from: b */
    private final bex f5904b;
    /* renamed from: c */
    private final Context f5905c;
    /* renamed from: d */
    private final Object f5906d = new Object();
    /* renamed from: e */
    private final ben f5907e;
    /* renamed from: f */
    private final boolean f5908f;
    /* renamed from: g */
    private final long f5909g;
    /* renamed from: h */
    private final long f5910h;
    /* renamed from: i */
    private final bbj f5911i;
    /* renamed from: j */
    private final boolean f5912j;
    /* renamed from: k */
    private boolean f5913k = false;
    /* renamed from: l */
    private beq f5914l;
    /* renamed from: m */
    private List<ber> f5915m = new ArrayList();

    public beu(Context context, zzmk zzmk, bex bex, ben ben, boolean z, boolean z2, long j, long j2, bbj bbj) {
        this.f5905c = context;
        this.f5903a = zzmk;
        this.f5904b = bex;
        this.f5907e = ben;
        this.f5908f = z;
        this.f5912j = z2;
        this.f5909g = j;
        this.f5910h = j2;
        this.f5911i = bbj;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public p000.ber mo1049a(List<p000.bem> r22) {
        /*
        r21 = this;
        r2 = "Starting mediation.";
        p000.bky.m9006b(r2);
        r15 = new java.util.ArrayList;
        r15.<init>();
        r0 = r21;
        r2 = r0.f5911i;
        r16 = r2.m7161a();
        r17 = r22.iterator();
    L_0x0016:
        r2 = r17.hasNext();
        if (r2 == 0) goto L_0x0133;
    L_0x001c:
        r7 = r17.next();
        r7 = (p000.bem) r7;
        r3 = "Trying mediation network: ";
        r2 = r7.f5823b;
        r2 = java.lang.String.valueOf(r2);
        r4 = r2.length();
        if (r4 == 0) goto L_0x0066;
    L_0x0030:
        r2 = r3.concat(r2);
    L_0x0034:
        p000.bky.m9010d(r2);
        r2 = r7.f5824c;
        r18 = r2.iterator();
    L_0x003d:
        r2 = r18.hasNext();
        if (r2 == 0) goto L_0x0016;
    L_0x0043:
        r4 = r18.next();
        r4 = (java.lang.String) r4;
        r0 = r21;
        r2 = r0.f5911i;
        r19 = r2.m7161a();
        r0 = r21;
        r0 = r0.f5906d;
        r20 = r0;
        monitor-enter(r20);
        r0 = r21;
        r2 = r0.f5913k;	 Catch:{ all -> 0x010a }
        if (r2 == 0) goto L_0x006c;
    L_0x005e:
        r2 = new ber;	 Catch:{ all -> 0x010a }
        r3 = -1;
        r2.<init>(r3);	 Catch:{ all -> 0x010a }
        monitor-exit(r20);	 Catch:{ all -> 0x010a }
    L_0x0065:
        return r2;
    L_0x0066:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x0034;
    L_0x006c:
        r2 = new beq;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r3 = r0.f5905c;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r5 = r0.f5904b;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r6 = r0.f5907e;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r8 = r0.f5903a;	 Catch:{ all -> 0x010a }
        r8 = r8.f15034c;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r9 = r0.f5903a;	 Catch:{ all -> 0x010a }
        r9 = r9.f15035d;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r10 = r0.f5903a;	 Catch:{ all -> 0x010a }
        r10 = r10.f15042k;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r11 = r0.f5908f;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r12 = r0.f5912j;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r13 = r0.f5903a;	 Catch:{ all -> 0x010a }
        r13 = r13.f15056y;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r14 = r0.f5903a;	 Catch:{ all -> 0x010a }
        r14 = r14.f15045n;	 Catch:{ all -> 0x010a }
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);	 Catch:{ all -> 0x010a }
        r0 = r21;
        r0.f5914l = r2;	 Catch:{ all -> 0x010a }
        monitor-exit(r20);	 Catch:{ all -> 0x010a }
        r0 = r21;
        r2 = r0.f5914l;
        r0 = r21;
        r8 = r0.f5909g;
        r0 = r21;
        r10 = r0.f5910h;
        r2 = r2.m7896a(r8, r10);
        r0 = r21;
        r3 = r0.f5915m;
        r3.add(r2);
        r3 = r2.f5878a;
        if (r3 != 0) goto L_0x010d;
    L_0x00c3:
        r3 = "Adapter succeeded.";
        p000.bky.m9006b(r3);
        r0 = r21;
        r3 = r0.f5911i;
        r5 = "mediation_network_succeed";
        r3.m7165a(r5, r4);
        r3 = r15.isEmpty();
        if (r3 != 0) goto L_0x00e6;
    L_0x00d7:
        r0 = r21;
        r3 = r0.f5911i;
        r4 = "mediation_networks_fail";
        r5 = ",";
        r5 = android.text.TextUtils.join(r5, r15);
        r3.m7165a(r4, r5);
    L_0x00e6:
        r0 = r21;
        r3 = r0.f5911i;
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = "mls";
        r4[r5] = r6;
        r0 = r19;
        r3.m7167a(r0, r4);
        r0 = r21;
        r3 = r0.f5911i;
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = "ttm";
        r4[r5] = r6;
        r0 = r16;
        r3.m7167a(r0, r4);
        goto L_0x0065;
    L_0x010a:
        r2 = move-exception;
        monitor-exit(r20);	 Catch:{ all -> 0x010a }
        throw r2;
    L_0x010d:
        r15.add(r4);
        r0 = r21;
        r3 = r0.f5911i;
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = "mlf";
        r4[r5] = r6;
        r0 = r19;
        r3.m7167a(r0, r4);
        r3 = r2.f5880c;
        if (r3 == 0) goto L_0x003d;
    L_0x0125:
        r3 = p000.bkg.f6710a;
        r4 = new beu$1;
        r0 = r21;
        r4.<init>(r0, r2);
        r3.post(r4);
        goto L_0x003d;
    L_0x0133:
        r2 = r15.isEmpty();
        if (r2 != 0) goto L_0x0148;
    L_0x0139:
        r0 = r21;
        r2 = r0.f5911i;
        r3 = "mediation_networks_fail";
        r4 = ",";
        r4 = android.text.TextUtils.join(r4, r15);
        r2.m7165a(r3, r4);
    L_0x0148:
        r2 = new ber;
        r3 = 1;
        r2.<init>(r3);
        goto L_0x0065;
        */
        throw new UnsupportedOperationException("Method not decompiled: beu.a(java.util.List):ber");
    }

    /* renamed from: a */
    public void mo1050a() {
        synchronized (this.f5906d) {
            this.f5913k = true;
            if (this.f5914l != null) {
                this.f5914l.m7898a();
            }
        }
    }

    /* renamed from: b */
    public List<ber> mo1051b() {
        return this.f5915m;
    }
}
