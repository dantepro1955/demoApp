package com.p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: avu */
public class avu {
    /* renamed from: a */
    private static String f4689a = "WakeLock";
    /* renamed from: b */
    private static String f4690b = "*gcore*:";
    /* renamed from: c */
    private static boolean f4691c = false;
    /* renamed from: d */
    private final WakeLock f4692d;
    /* renamed from: e */
    private WorkSource f4693e;
    /* renamed from: f */
    private final int f4694f;
    /* renamed from: g */
    private final String f4695g;
    /* renamed from: h */
    private final String f4696h;
    /* renamed from: i */
    private final String f4697i;
    /* renamed from: j */
    private final Context f4698j;
    /* renamed from: k */
    private boolean f4699k;
    /* renamed from: l */
    private int f4700l;
    /* renamed from: m */
    private int f4701m;

    public avu(Context context, int i, String str) {
        this(context, i, str, null, context == null ? null : context.getPackageName());
    }

    @SuppressLint({"UnwrappedWakeLock"})
    public avu(Context context, int i, String str, String str2, String str3) {
        this(context, i, str, str2, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    public avu(Context context, int i, String str, String str2, String str3, String str4) {
        this.f4699k = true;
        aoi.m4682a(str, (Object) "Wake lock name can NOT be empty");
        this.f4694f = i;
        this.f4696h = str2;
        this.f4697i = str4;
        this.f4698j = context.getApplicationContext();
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f4695g = str;
        } else {
            String valueOf = String.valueOf(f4690b);
            String valueOf2 = String.valueOf(str);
            this.f4695g = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        this.f4692d = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (aqi.m4937a(this.f4698j)) {
            if (aqf.m4926a(str3)) {
                str3 = context.getPackageName();
            }
            this.f4693e = aqi.m4933a(context, str3);
            m6069a(this.f4693e);
        }
    }

    /* renamed from: a */
    private String m6062a(String str, boolean z) {
        return this.f4699k ? z ? str : this.f4696h : this.f4696h;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m6063a(String r10) {
        /*
        r9 = this;
        r0 = r9.m6066b(r10);
        r5 = r9.m6062a(r10, r0);
        monitor-enter(r9);
        r1 = r9.f4699k;	 Catch:{ all -> 0x0045 }
        if (r1 == 0) goto L_0x0017;
    L_0x000d:
        r1 = r9.f4700l;	 Catch:{ all -> 0x0045 }
        r1 = r1 + -1;
        r9.f4700l = r1;	 Catch:{ all -> 0x0045 }
        if (r1 == 0) goto L_0x0020;
    L_0x0015:
        if (r0 != 0) goto L_0x0020;
    L_0x0017:
        r0 = r9.f4699k;	 Catch:{ all -> 0x0045 }
        if (r0 != 0) goto L_0x0043;
    L_0x001b:
        r0 = r9.f4701m;	 Catch:{ all -> 0x0045 }
        r1 = 1;
        if (r0 != r1) goto L_0x0043;
    L_0x0020:
        r0 = p000.apq.m4868a();	 Catch:{ all -> 0x0045 }
        r1 = r9.f4698j;	 Catch:{ all -> 0x0045 }
        r2 = r9.f4692d;	 Catch:{ all -> 0x0045 }
        r2 = p000.apo.m4862a(r2, r5);	 Catch:{ all -> 0x0045 }
        r3 = 8;
        r4 = r9.f4695g;	 Catch:{ all -> 0x0045 }
        r6 = r9.f4697i;	 Catch:{ all -> 0x0045 }
        r7 = r9.f4694f;	 Catch:{ all -> 0x0045 }
        r8 = r9.f4693e;	 Catch:{ all -> 0x0045 }
        r8 = p000.aqi.m4939b(r8);	 Catch:{ all -> 0x0045 }
        r0.m4870a(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0045 }
        r0 = r9.f4701m;	 Catch:{ all -> 0x0045 }
        r0 = r0 + -1;
        r9.f4701m = r0;	 Catch:{ all -> 0x0045 }
    L_0x0043:
        monitor-exit(r9);	 Catch:{ all -> 0x0045 }
        return;
    L_0x0045:
        r0 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x0045 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: avu.a(java.lang.String):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m6064a(String r13, long r14) {
        /*
        r12 = this;
        r0 = r12.m6066b(r13);
        r6 = r12.m6062a(r13, r0);
        monitor-enter(r12);
        r1 = r12.f4699k;	 Catch:{ all -> 0x0044 }
        if (r1 == 0) goto L_0x0017;
    L_0x000d:
        r1 = r12.f4700l;	 Catch:{ all -> 0x0044 }
        r2 = r1 + 1;
        r12.f4700l = r2;	 Catch:{ all -> 0x0044 }
        if (r1 == 0) goto L_0x001f;
    L_0x0015:
        if (r0 != 0) goto L_0x001f;
    L_0x0017:
        r0 = r12.f4699k;	 Catch:{ all -> 0x0044 }
        if (r0 != 0) goto L_0x0042;
    L_0x001b:
        r0 = r12.f4701m;	 Catch:{ all -> 0x0044 }
        if (r0 != 0) goto L_0x0042;
    L_0x001f:
        r1 = p000.apq.m4868a();	 Catch:{ all -> 0x0044 }
        r2 = r12.f4698j;	 Catch:{ all -> 0x0044 }
        r0 = r12.f4692d;	 Catch:{ all -> 0x0044 }
        r3 = p000.apo.m4862a(r0, r6);	 Catch:{ all -> 0x0044 }
        r4 = 7;
        r5 = r12.f4695g;	 Catch:{ all -> 0x0044 }
        r7 = r12.f4697i;	 Catch:{ all -> 0x0044 }
        r8 = r12.f4694f;	 Catch:{ all -> 0x0044 }
        r0 = r12.f4693e;	 Catch:{ all -> 0x0044 }
        r9 = p000.aqi.m4939b(r0);	 Catch:{ all -> 0x0044 }
        r10 = r14;
        r1.m4871a(r2, r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x0044 }
        r0 = r12.f4701m;	 Catch:{ all -> 0x0044 }
        r0 = r0 + 1;
        r12.f4701m = r0;	 Catch:{ all -> 0x0044 }
    L_0x0042:
        monitor-exit(r12);	 Catch:{ all -> 0x0044 }
        return;
    L_0x0044:
        r0 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x0044 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: avu.a(java.lang.String, long):void");
    }

    /* renamed from: b */
    private void m6065b(WorkSource workSource) {
        try {
            this.f4692d.setWorkSource(workSource);
        } catch (IllegalArgumentException e) {
            Log.wtf(f4689a, e.toString());
        }
    }

    /* renamed from: b */
    private boolean m6066b(String str) {
        return (TextUtils.isEmpty(str) || str.equals(this.f4696h)) ? false : true;
    }

    /* renamed from: a */
    public void m6067a() {
        m6063a(null);
        this.f4692d.release();
    }

    /* renamed from: a */
    public void m6068a(long j) {
        aqd.m4912b();
        m6064a(null, j);
        this.f4692d.acquire(j);
    }

    /* renamed from: a */
    public void m6069a(WorkSource workSource) {
        if (workSource != null && aqi.m4937a(this.f4698j)) {
            if (this.f4693e != null) {
                this.f4693e.add(workSource);
            } else {
                this.f4693e = workSource;
            }
            m6065b(this.f4693e);
        }
    }

    /* renamed from: a */
    public void m6070a(boolean z) {
        this.f4692d.setReferenceCounted(z);
        this.f4699k = z;
    }

    /* renamed from: b */
    public boolean m6071b() {
        return this.f4692d.isHeld();
    }
}
