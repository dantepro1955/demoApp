package com.p000;

import android.content.Context;
import com.google.android.gms.internal.zzmk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@bhd
/* renamed from: bet */
public class bet implements bel {
    /* renamed from: a */
    private final zzmk f5889a;
    /* renamed from: b */
    private final bex f5890b;
    /* renamed from: c */
    private final Context f5891c;
    /* renamed from: d */
    private final ben f5892d;
    /* renamed from: e */
    private final boolean f5893e;
    /* renamed from: f */
    private final long f5894f;
    /* renamed from: g */
    private final long f5895g;
    /* renamed from: h */
    private final int f5896h;
    /* renamed from: i */
    private final Object f5897i = new Object();
    /* renamed from: j */
    private boolean f5898j = false;
    /* renamed from: k */
    private final Map<ble<ber>, beq> f5899k = new HashMap();
    /* renamed from: l */
    private final boolean f5900l;
    /* renamed from: m */
    private List<ber> f5901m = new ArrayList();

    public bet(Context context, zzmk zzmk, bex bex, ben ben, boolean z, boolean z2, long j, long j2, int i) {
        this.f5891c = context;
        this.f5889a = zzmk;
        this.f5890b = bex;
        this.f5892d = ben;
        this.f5893e = z;
        this.f5900l = z2;
        this.f5894f = j;
        this.f5895g = j2;
        this.f5896h = i;
    }

    /* renamed from: a */
    private void m7905a(final ble<ber> ble) {
        bkg.f6710a.post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bet f5888b;

            public void run() {
                for (ble ble : this.f5888b.f5899k.keySet()) {
                    if (ble != ble) {
                        ((beq) this.f5888b.f5899k.get(ble)).m7898a();
                    }
                }
            }
        });
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private p000.ber m7906b(List<p000.ble<p000.ber>> r5) {
        /*
        r4 = this;
        r2 = r4.f5897i;
        monitor-enter(r2);
        r0 = r4.f5898j;	 Catch:{ all -> 0x003c }
        if (r0 == 0) goto L_0x000f;
    L_0x0007:
        r1 = new ber;	 Catch:{ all -> 0x003c }
        r0 = -1;
        r1.<init>(r0);	 Catch:{ all -> 0x003c }
        monitor-exit(r2);	 Catch:{ all -> 0x003c }
    L_0x000e:
        return r1;
    L_0x000f:
        monitor-exit(r2);	 Catch:{ all -> 0x003c }
        r2 = r5.iterator();
    L_0x0014:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x003f;
    L_0x001a:
        r0 = r2.next();
        r0 = (p000.ble) r0;
        r1 = r0.get();	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        r1 = (p000.ber) r1;	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        r3 = r4.f5901m;	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        r3.add(r1);	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        if (r1 == 0) goto L_0x0014;
    L_0x002d:
        r3 = r1.f5878a;	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        if (r3 != 0) goto L_0x0014;
    L_0x0031:
        r4.m7905a(r0);	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        goto L_0x000e;
    L_0x0035:
        r0 = move-exception;
    L_0x0036:
        r1 = "Exception while processing an adapter; continuing with other adapters";
        p000.bky.m9009c(r1, r0);
        goto L_0x0014;
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x003c }
        throw r0;
    L_0x003f:
        r0 = 0;
        r4.m7905a(r0);
        r1 = new ber;
        r0 = 1;
        r1.<init>(r0);
        goto L_0x000e;
    L_0x004a:
        r0 = move-exception;
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: bet.b(java.util.List):ber");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    private p000.ber m7909c(List<p000.ble<p000.ber>> r16) {
        /*
        r15 = this;
        r1 = r15.f5897i;
        monitor-enter(r1);
        r0 = r15.f5898j;	 Catch:{ all -> 0x0080 }
        if (r0 == 0) goto L_0x000f;
    L_0x0007:
        r2 = new ber;	 Catch:{ all -> 0x0080 }
        r0 = -1;
        r2.<init>(r0);	 Catch:{ all -> 0x0080 }
        monitor-exit(r1);	 Catch:{ all -> 0x0080 }
    L_0x000e:
        return r2;
    L_0x000f:
        monitor-exit(r1);	 Catch:{ all -> 0x0080 }
        r4 = -1;
        r3 = 0;
        r2 = 0;
        r0 = r15.f5892d;
        r0 = r0.f5850m;
        r6 = -1;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 == 0) goto L_0x0083;
    L_0x001d:
        r0 = r15.f5892d;
        r0 = r0.f5850m;
    L_0x0021:
        r8 = r16.iterator();
        r6 = r0;
    L_0x0026:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x00b9;
    L_0x002c:
        r0 = r8.next();
        r0 = (p000.ble) r0;
        r1 = p000.ako.m2349k();
        r10 = r1.mo606a();
        r12 = 0;
        r1 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r1 != 0) goto L_0x0086;
    L_0x0040:
        r1 = r0.isDone();	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        if (r1 == 0) goto L_0x0086;
    L_0x0046:
        r1 = r0.get();	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        r1 = (p000.ber) r1;	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
    L_0x004c:
        r5 = r15.f5901m;	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        r5.add(r1);	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        if (r1 == 0) goto L_0x00cc;
    L_0x0053:
        r5 = r1.f5878a;	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        if (r5 != 0) goto L_0x00cc;
    L_0x0057:
        r5 = r1.f5883f;	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        if (r5 == 0) goto L_0x00cc;
    L_0x005b:
        r9 = r5.mo1046a();	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        if (r9 <= r4) goto L_0x00cc;
    L_0x0061:
        r2 = r5.mo1046a();	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        r14 = r1;
        r1 = r0;
        r0 = r14;
    L_0x0068:
        r3 = p000.ako.m2349k();
        r4 = r3.mo606a();
        r4 = r4 - r10;
        r4 = r6 - r4;
        r6 = 0;
        r4 = java.lang.Math.max(r4, r6);
        r3 = r1;
        r14 = r0;
        r0 = r4;
        r4 = r2;
        r2 = r14;
    L_0x007e:
        r6 = r0;
        goto L_0x0026;
    L_0x0080:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0080 }
        throw r0;
    L_0x0083:
        r0 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        goto L_0x0021;
    L_0x0086:
        r1 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        r1 = r0.get(r6, r1);	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        r1 = (p000.ber) r1;	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        goto L_0x004c;
    L_0x008f:
        r0 = move-exception;
    L_0x0090:
        r1 = "Exception while processing an adapter; continuing with other adapters";
        p000.bky.m9009c(r1, r0);	 Catch:{ all -> 0x00a7 }
        r0 = p000.ako.m2349k();
        r0 = r0.mo606a();
        r0 = r0 - r10;
        r0 = r6 - r0;
        r6 = 0;
        r0 = java.lang.Math.max(r0, r6);
        goto L_0x007e;
    L_0x00a7:
        r0 = move-exception;
        r1 = p000.ako.m2349k();
        r2 = r1.mo606a();
        r2 = r2 - r10;
        r2 = r6 - r2;
        r4 = 0;
        java.lang.Math.max(r2, r4);
        throw r0;
    L_0x00b9:
        r15.m7905a(r3);
        if (r2 != 0) goto L_0x000e;
    L_0x00be:
        r2 = new ber;
        r0 = 1;
        r2.<init>(r0);
        goto L_0x000e;
    L_0x00c6:
        r0 = move-exception;
        goto L_0x0090;
    L_0x00c8:
        r0 = move-exception;
        goto L_0x0090;
    L_0x00ca:
        r0 = move-exception;
        goto L_0x0090;
    L_0x00cc:
        r0 = r2;
        r1 = r3;
        r2 = r4;
        goto L_0x0068;
        */
        throw new UnsupportedOperationException("Method not decompiled: bet.c(java.util.List):ber");
    }

    /* renamed from: a */
    public ber mo1049a(List<bem> list) {
        bky.m9006b("Starting mediation.");
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        List arrayList = new ArrayList();
        for (bem bem : list) {
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(bem.f5823b);
            bky.m9010d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            for (String beq : bem.f5824c) {
                final beq beq2 = new beq(this.f5891c, beq, this.f5890b, this.f5892d, bem, this.f5889a.f15034c, this.f5889a.f15035d, this.f5889a.f15042k, this.f5893e, this.f5900l, this.f5889a.f15056y, this.f5889a.f15045n);
                ble a = bkf.m9061a(newCachedThreadPool, new Callable<ber>(this) {
                    /* renamed from: b */
                    final /* synthetic */ bet f5886b;

                    /* renamed from: a */
                    public ber m7903a() throws Exception {
                        synchronized (this.f5886b.f5897i) {
                            if (this.f5886b.f5898j) {
                                return null;
                            }
                            return beq2.m7896a(this.f5886b.f5894f, this.f5886b.f5895g);
                        }
                    }

                    public /* synthetic */ Object call() throws Exception {
                        return m7903a();
                    }
                });
                this.f5899k.put(a, beq2);
                arrayList.add(a);
            }
        }
        switch (this.f5896h) {
            case 2:
                return m7909c(arrayList);
            default:
                return m7906b(arrayList);
        }
    }

    /* renamed from: a */
    public void mo1050a() {
        synchronized (this.f5897i) {
            this.f5898j = true;
            for (beq a : this.f5899k.values()) {
                a.m7898a();
            }
        }
    }

    /* renamed from: b */
    public List<ber> mo1051b() {
        return this.f5901m;
    }
}
