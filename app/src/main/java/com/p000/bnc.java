package com.p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.CampaignTrackingService;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: bnc */
class bnc extends bmu {
    /* renamed from: a */
    private boolean f7077a;
    /* renamed from: b */
    private final bna f7078b;
    /* renamed from: c */
    private final bnz f7079c;
    /* renamed from: d */
    private final bny f7080d;
    /* renamed from: e */
    private final bmz f7081e;
    /* renamed from: f */
    private long f7082f = Long.MIN_VALUE;
    /* renamed from: g */
    private final bnk f7083g;
    /* renamed from: h */
    private final bnk f7084h;
    /* renamed from: i */
    private final bod f7085i;
    /* renamed from: j */
    private long f7086j;
    /* renamed from: k */
    private boolean f7087k;

    /* renamed from: bnc$3 */
    class C13513 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bnc f7075a;

        C13513(bnc bnc) {
            this.f7075a = bnc;
        }

        public void run() {
            this.f7075a.m9901b();
        }
    }

    /* renamed from: bnc$4 */
    class C13524 implements bnn {
        /* renamed from: a */
        final /* synthetic */ bnc f7076a;

        C13524(bnc bnc) {
            this.f7076a = bnc;
        }

        /* renamed from: a */
        public void mo1351a(Throwable th) {
            this.f7076a.m9910k();
        }
    }

    protected bnc(bmw bmw, bmx bmx) {
        super(bmw);
        aoi.m4679a((Object) bmx);
        this.f7080d = bmx.m9798k(bmw);
        this.f7078b = bmx.m9800m(bmw);
        this.f7079c = bmx.m9801n(bmw);
        this.f7081e = bmx.m9802o(bmw);
        this.f7085i = new bod(zznR());
        this.f7083g = new bnk(this, bmw) {
            /* renamed from: a */
            final /* synthetic */ bnc f7073a;

            /* renamed from: a */
            public void mo1350a() {
                this.f7073a.m9883o();
            }
        };
        this.f7084h = new bnk(this, bmw) {
            /* renamed from: a */
            final /* synthetic */ bnc f7074a;

            /* renamed from: a */
            public void mo1350a() {
                this.f7074a.m9884p();
            }
        };
    }

    /* renamed from: a */
    private void m9878a(bmy bmy, bme bme) {
        aoi.m4679a((Object) bmy);
        aoi.m4679a((Object) bme);
        alj alj = new alj(zznQ());
        alj.m2412b(bmy.m9808c());
        alj.m2413b(bmy.m9809d());
        aln k = alj.mo318k();
        bmm bmm = (bmm) k.m2491b(bmm.class);
        bmm.m9696a("data");
        bmm.m9700b(true);
        k.m2490a((alo) bme);
        bmh bmh = (bmh) k.m2491b(bmh.class);
        bmd bmd = (bmd) k.m2491b(bmd.class);
        for (Entry entry : bmy.m9811f().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if ("an".equals(str)) {
                bmd.m9615a(str2);
            } else if ("av".equals(str)) {
                bmd.m9617b(str2);
            } else if ("aid".equals(str)) {
                bmd.m9619c(str2);
            } else if ("aiid".equals(str)) {
                bmd.m9621d(str2);
            } else if ("uid".equals(str)) {
                bmm.m9702c(str2);
            } else {
                bmh.m9654a(str, str2);
            }
        }
        zzb("Sending installation campaign to", bmy.m9808c(), bme);
        k.m2489a(zznW().m10093a());
        k.m2495e();
    }

    /* renamed from: b */
    private boolean m9881b(String str) {
        return ato.m5611b(getContext()).m5604a(str) == 0;
    }

    /* renamed from: n */
    private void m9882n() {
        zzmR();
        Context b = zznQ().m9767b();
        if (!bob.m10100a(b)) {
            zzbS("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!boc.m10106a(b)) {
            zzbT("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!CampaignTrackingReceiver.m19384a(b)) {
            zzbS("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!CampaignTrackingService.m19388a(b)) {
            zzbS("CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
    }

    /* renamed from: o */
    private void m9883o() {
        m9895a(new C13524(this));
    }

    /* renamed from: p */
    private void m9884p() {
        try {
            this.f7078b.m9869f();
            m9910k();
        } catch (SQLiteException e) {
            zzd("Failed to delete stale hits", e);
        }
        this.f7084h.m9816a(86400000);
    }

    /* renamed from: q */
    private boolean m9885q() {
        return !this.f7087k && m9911l() > 0;
    }

    /* renamed from: r */
    private void m9886r() {
        bnm zznV = zznV();
        if (zznV.m9969a() && !zznV.m9970b()) {
            long j = m9909j();
            if (j != 0 && Math.abs(zznR().mo606a() - j) <= zznT().m9945j()) {
                zza("Dispatch alarm scheduled (ms)", Long.valueOf(zznT().m9944i()));
                zznV.m9971c();
            }
        }
    }

    /* renamed from: s */
    private void m9887s() {
        m9886r();
        long l = m9911l();
        long c = zznW().m10096c();
        if (c != 0) {
            c = l - Math.abs(zznR().mo606a() - c);
            if (c <= 0) {
                c = Math.min(zznT().m9942g(), l);
            }
        } else {
            c = Math.min(zznT().m9942g(), l);
        }
        zza("Dispatch scheduled (ms)", Long.valueOf(c));
        if (this.f7083g.m9819c()) {
            this.f7083g.m9818b(Math.max(1, c + this.f7083g.m9817b()));
            return;
        }
        this.f7083g.m9816a(c);
    }

    /* renamed from: t */
    private void m9888t() {
        m9889u();
        m9890v();
    }

    /* renamed from: u */
    private void m9889u() {
        if (this.f7083g.m9819c()) {
            zzbP("All hits dispatched or no network/service. Going to power save mode");
        }
        this.f7083g.m9820d();
    }

    /* renamed from: v */
    private void m9890v() {
        bnm zznV = zznV();
        if (zznV.m9970b()) {
            zznV.m9972d();
        }
    }

    /* renamed from: a */
    public long m9891a(bmy bmy, boolean z) {
        aoi.m4679a((Object) bmy);
        zzob();
        zzmR();
        try {
            this.f7078b.m9856a();
            this.f7078b.m9857a(bmy.m9805a(), bmy.m9807b());
            long a = this.f7078b.m9853a(bmy.m9805a(), bmy.m9807b(), bmy.m9808c());
            if (z) {
                bmy.m9806a(1 + a);
            } else {
                bmy.m9806a(a);
            }
            this.f7078b.m9858a(bmy);
            this.f7078b.m9863b();
            try {
                this.f7078b.m9864c();
                return a;
            } catch (SQLiteException e) {
                zze("Failed to end transaction", e);
                return a;
            }
        } catch (SQLiteException e2) {
            zze("Failed to update Analytics property", e2);
            try {
                this.f7078b.m9864c();
            } catch (SQLiteException e22) {
                zze("Failed to end transaction", e22);
            }
            return -1;
        } catch (Throwable th) {
            try {
                this.f7078b.m9864c();
            } catch (SQLiteException e3) {
                zze("Failed to end transaction", e3);
            }
            throw th;
        }
    }

    /* renamed from: a */
    void m9892a() {
        zzob();
        aoi.m4685a(!this.f7077a, (Object) "Analytics backend already started");
        this.f7077a = true;
        zznU().m2515a(new C13513(this));
    }

    /* renamed from: a */
    public void m9893a(long j) {
        alq.m2511d();
        zzob();
        if (j < 0) {
            j = 0;
        }
        this.f7082f = j;
        m9910k();
    }

    /* renamed from: a */
    protected void m9894a(bmy bmy) {
        zzmR();
        zzb("Sending first hit to property", bmy.m9808c());
        if (!zznW().m10095b().m10113a(zznT().m9934C())) {
            String e = zznW().m10098e();
            if (!TextUtils.isEmpty(e)) {
                bme a = bof.m10130a(zznS(), e);
                zzb("Found relevant installation campaign", a);
                m9878a(bmy, a);
            }
        }
    }

    /* renamed from: a */
    public void m9895a(bnn bnn) {
        m9896a(bnn, this.f7086j);
    }

    /* renamed from: a */
    public void m9896a(bnn bnn, long j) {
        alq.m2511d();
        zzob();
        long j2 = -1;
        long c = zznW().m10096c();
        if (c != 0) {
            j2 = Math.abs(zznR().mo606a() - c);
        }
        zzb("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j2));
        m9905f();
        try {
            m9907h();
            zznW().m10097d();
            m9910k();
            if (bnn != null) {
                bnn.mo1351a(null);
            }
            if (this.f7086j != j) {
                this.f7080d.m10050c();
            }
        } catch (Throwable th) {
            zze("Local dispatch failed", th);
            zznW().m10097d();
            m9910k();
            if (bnn != null) {
                bnn.mo1351a(th);
            }
        }
    }

    /* renamed from: a */
    public void m9897a(bns bns) {
        aoi.m4679a((Object) bns);
        alq.m2511d();
        zzob();
        if (this.f7087k) {
            zzbQ("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            zza("Delivering hit", bns);
        }
        bns b = m9900b(bns);
        m9905f();
        if (this.f7081e.m9833a(b)) {
            zzbQ("Hit sent to the device AnalyticsService for delivery");
            return;
        }
        try {
            this.f7078b.m9859a(b);
            m9910k();
        } catch (SQLiteException e) {
            zze("Delivery failed to save hit to a database", e);
            zznS().m10041a(b, "deliver: failed to insert hit to database");
        }
    }

    /* renamed from: a */
    public void m9898a(String str) {
        aoi.m4681a(str);
        zzmR();
        bme a = bof.m10130a(zznS(), str);
        if (a == null) {
            zzd("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        CharSequence e = zznW().m10098e();
        if (str.equals(e)) {
            zzbS("Ignoring duplicate install campaign");
        } else if (TextUtils.isEmpty(e)) {
            zznW().m10094a(str);
            if (zznW().m10095b().m10113a(zznT().m9934C())) {
                zzd("Campaign received too late, ignoring", a);
                return;
            }
            zzb("Received installation campaign", a);
            for (bmy a2 : this.f7078b.m9867d(0)) {
                m9878a(a2, a);
            }
        } else {
            zzd("Ignoring multiple install campaigns. original, new", e, str);
        }
    }

    /* renamed from: a */
    public void m9899a(boolean z) {
        m9910k();
    }

    /* renamed from: b */
    bns m9900b(bns bns) {
        if (!TextUtils.isEmpty(bns.m10015h())) {
            return bns;
        }
        Pair a = zznW().m10099f().m10089a();
        if (a == null) {
            return bns;
        }
        Long l = (Long) a.second;
        String str = (String) a.first;
        String valueOf = String.valueOf(l);
        valueOf = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(":").append(str).toString();
        Map hashMap = new HashMap(bns.m10009b());
        hashMap.put("_m", valueOf);
        return bns.m10002a(this, bns, hashMap);
    }

    /* renamed from: b */
    protected void m9901b() {
        zzob();
        m9882n();
        zznW().m10093a();
        if (!m9881b("android.permission.ACCESS_NETWORK_STATE")) {
            zzbT("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m9912m();
        }
        if (!m9881b("android.permission.INTERNET")) {
            zzbT("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m9912m();
        }
        if (boc.m10106a(getContext())) {
            zzbP("AnalyticsService registered in the app manifest and enabled");
        } else {
            zzbS("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!(this.f7087k || this.f7078b.m9868e())) {
            m9905f();
        }
        m9910k();
    }

    /* renamed from: c */
    void m9902c() {
        zzmR();
        this.f7086j = zznR().mo606a();
    }

    /* renamed from: d */
    protected void m9903d() {
        zzmR();
        m9906g();
    }

    /* renamed from: e */
    public void m9904e() {
        alq.m2511d();
        zzob();
        zzbP("Service disconnected");
    }

    /* renamed from: f */
    protected void m9905f() {
        if (!this.f7087k && zznT().m9937b() && !this.f7081e.m9832a()) {
            if (this.f7085i.m10113a(zznT().m9958w())) {
                this.f7085i.m10112a();
                zzbP("Connecting to service");
                if (this.f7081e.m9834b()) {
                    zzbP("Connected to service");
                    this.f7085i.m10114b();
                    m9903d();
                }
            }
        }
    }

    /* renamed from: g */
    public void m9906g() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1976752685.run(Unknown Source)
*/
        /*
        r6 = this;
        p000.alq.m2511d();
        r6.zzob();
        r0 = r6.zznT();
        r0 = r0.m9937b();
        if (r0 != 0) goto L_0x0015;
    L_0x0010:
        r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService";
        r6.zzbS(r0);
    L_0x0015:
        r0 = r6.f7081e;
        r0 = r0.m9832a();
        if (r0 != 0) goto L_0x0023;
    L_0x001d:
        r0 = "Service not connected";
        r6.zzbP(r0);
    L_0x0022:
        return;
    L_0x0023:
        r0 = r6.f7078b;
        r0 = r0.m9868e();
        if (r0 != 0) goto L_0x0022;
    L_0x002b:
        r0 = "Dispatching local hits to device AnalyticsService";
        r6.zzbP(r0);
    L_0x0030:
        r0 = r6.f7078b;	 Catch:{ SQLiteException -> 0x0049 }
        r1 = r6.zznT();	 Catch:{ SQLiteException -> 0x0049 }
        r1 = r1.m9946k();	 Catch:{ SQLiteException -> 0x0049 }
        r2 = (long) r1;	 Catch:{ SQLiteException -> 0x0049 }
        r1 = r0.m9861b(r2);	 Catch:{ SQLiteException -> 0x0049 }
        r0 = r1.isEmpty();	 Catch:{ SQLiteException -> 0x0049 }
        if (r0 == 0) goto L_0x005f;	 Catch:{ SQLiteException -> 0x0049 }
    L_0x0045:
        r6.m9910k();	 Catch:{ SQLiteException -> 0x0049 }
        goto L_0x0022;
    L_0x0049:
        r0 = move-exception;
        r1 = "Failed to read hits from store";
        r6.zze(r1, r0);
        r6.m9888t();
        goto L_0x0022;
    L_0x0053:
        r1.remove(r0);
        r2 = r6.f7078b;	 Catch:{ SQLiteException -> 0x0078 }
        r4 = r0.m10010c();	 Catch:{ SQLiteException -> 0x0078 }
        r2.m9865c(r4);	 Catch:{ SQLiteException -> 0x0078 }
    L_0x005f:
        r0 = r1.isEmpty();
        if (r0 != 0) goto L_0x0030;
    L_0x0065:
        r0 = 0;
        r0 = r1.get(r0);
        r0 = (p000.bns) r0;
        r2 = r6.f7081e;
        r2 = r2.m9833a(r0);
        if (r2 != 0) goto L_0x0053;
    L_0x0074:
        r6.m9910k();
        goto L_0x0022;
    L_0x0078:
        r0 = move-exception;
        r1 = "Failed to remove hit that was send for delivery";
        r6.zze(r1, r0);
        r6.m9888t();
        goto L_0x0022;
        */
        throw new UnsupportedOperationException("Method not decompiled: bnc.g():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: h */
    protected boolean m9907h() {
        /*
        r12 = this;
        r1 = 1;
        r2 = 0;
        p000.alq.m2511d();
        r12.zzob();
        r0 = "Dispatching a batch of local hits";
        r12.zzbP(r0);
        r0 = r12.f7081e;
        r0 = r0.m9832a();
        if (r0 != 0) goto L_0x0028;
    L_0x0015:
        r0 = r1;
    L_0x0016:
        r3 = r12.f7079c;
        r3 = r3.m10074a();
        if (r3 != 0) goto L_0x002a;
    L_0x001e:
        if (r0 == 0) goto L_0x002c;
    L_0x0020:
        if (r1 == 0) goto L_0x002c;
    L_0x0022:
        r0 = "No network or service available. Will retry later";
        r12.zzbP(r0);
    L_0x0027:
        return r2;
    L_0x0028:
        r0 = r2;
        goto L_0x0016;
    L_0x002a:
        r1 = r2;
        goto L_0x001e;
    L_0x002c:
        r0 = r12.zznT();
        r0 = r0.m9946k();
        r1 = r12.zznT();
        r1 = r1.m9947l();
        r0 = java.lang.Math.max(r0, r1);
        r6 = (long) r0;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = 0;
    L_0x0048:
        r0 = r12.f7078b;	 Catch:{ all -> 0x01d7 }
        r0.m9856a();	 Catch:{ all -> 0x01d7 }
        r3.clear();	 Catch:{ all -> 0x01d7 }
        r0 = r12.f7078b;	 Catch:{ SQLiteException -> 0x00c9 }
        r8 = r0.m9861b(r6);	 Catch:{ SQLiteException -> 0x00c9 }
        r0 = r8.isEmpty();	 Catch:{ SQLiteException -> 0x00c9 }
        if (r0 == 0) goto L_0x0079;
    L_0x005c:
        r0 = "Store is empty, nothing to dispatch";
        r12.zzbP(r0);	 Catch:{ SQLiteException -> 0x00c9 }
        r12.m9888t();	 Catch:{ SQLiteException -> 0x00c9 }
        r0 = r12.f7078b;	 Catch:{ SQLiteException -> 0x006f }
        r0.m9863b();	 Catch:{ SQLiteException -> 0x006f }
        r0 = r12.f7078b;	 Catch:{ SQLiteException -> 0x006f }
        r0.m9864c();	 Catch:{ SQLiteException -> 0x006f }
        goto L_0x0027;
    L_0x006f:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.zze(r1, r0);
        r12.m9888t();
        goto L_0x0027;
    L_0x0079:
        r0 = "Hits loaded from store. count";
        r1 = r8.size();	 Catch:{ SQLiteException -> 0x00c9 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ SQLiteException -> 0x00c9 }
        r12.zza(r0, r1);	 Catch:{ SQLiteException -> 0x00c9 }
        r1 = r8.iterator();	 Catch:{ all -> 0x01d7 }
    L_0x008a:
        r0 = r1.hasNext();	 Catch:{ all -> 0x01d7 }
        if (r0 == 0) goto L_0x00e9;
    L_0x0090:
        r0 = r1.next();	 Catch:{ all -> 0x01d7 }
        r0 = (p000.bns) r0;	 Catch:{ all -> 0x01d7 }
        r10 = r0.m10010c();	 Catch:{ all -> 0x01d7 }
        r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x008a;
    L_0x009e:
        r0 = "Database contains successfully uploaded hit";
        r1 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x01d7 }
        r3 = r8.size();	 Catch:{ all -> 0x01d7 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x01d7 }
        r12.zzd(r0, r1, r3);	 Catch:{ all -> 0x01d7 }
        r12.m9888t();	 Catch:{ all -> 0x01d7 }
        r0 = r12.f7078b;	 Catch:{ SQLiteException -> 0x00be }
        r0.m9863b();	 Catch:{ SQLiteException -> 0x00be }
        r0 = r12.f7078b;	 Catch:{ SQLiteException -> 0x00be }
        r0.m9864c();	 Catch:{ SQLiteException -> 0x00be }
        goto L_0x0027;
    L_0x00be:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.zze(r1, r0);
        r12.m9888t();
        goto L_0x0027;
    L_0x00c9:
        r0 = move-exception;
        r1 = "Failed to read hits from persisted store";
        r12.zzd(r1, r0);	 Catch:{ all -> 0x01d7 }
        r12.m9888t();	 Catch:{ all -> 0x01d7 }
        r0 = r12.f7078b;	 Catch:{ SQLiteException -> 0x00de }
        r0.m9863b();	 Catch:{ SQLiteException -> 0x00de }
        r0 = r12.f7078b;	 Catch:{ SQLiteException -> 0x00de }
        r0.m9864c();	 Catch:{ SQLiteException -> 0x00de }
        goto L_0x0027;
    L_0x00de:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.zze(r1, r0);
        r12.m9888t();
        goto L_0x0027;
    L_0x00e9:
        r0 = r12.f7081e;	 Catch:{ all -> 0x01d7 }
        r0 = r0.m9832a();	 Catch:{ all -> 0x01d7 }
        if (r0 == 0) goto L_0x01ee;
    L_0x00f1:
        r0 = "Service connected, sending hits to the service";
        r12.zzbP(r0);	 Catch:{ all -> 0x01d7 }
    L_0x00f6:
        r0 = r8.isEmpty();	 Catch:{ all -> 0x01d7 }
        if (r0 != 0) goto L_0x01ee;
    L_0x00fc:
        r0 = 0;
        r0 = r8.get(r0);	 Catch:{ all -> 0x01d7 }
        r0 = (p000.bns) r0;	 Catch:{ all -> 0x01d7 }
        r1 = r12.f7081e;	 Catch:{ all -> 0x01d7 }
        r1 = r1.m9833a(r0);	 Catch:{ all -> 0x01d7 }
        if (r1 != 0) goto L_0x0134;
    L_0x010b:
        r0 = r4;
    L_0x010c:
        r4 = r12.f7079c;	 Catch:{ all -> 0x01d7 }
        r4 = r4.m10074a();	 Catch:{ all -> 0x01d7 }
        if (r4 == 0) goto L_0x0182;
    L_0x0114:
        r4 = r12.f7079c;	 Catch:{ all -> 0x01d7 }
        r8 = r4.m10072a(r8);	 Catch:{ all -> 0x01d7 }
        r9 = r8.iterator();	 Catch:{ all -> 0x01d7 }
        r4 = r0;
    L_0x011f:
        r0 = r9.hasNext();	 Catch:{ all -> 0x01d7 }
        if (r0 == 0) goto L_0x0179;
    L_0x0125:
        r0 = r9.next();	 Catch:{ all -> 0x01d7 }
        r0 = (java.lang.Long) r0;	 Catch:{ all -> 0x01d7 }
        r0 = r0.longValue();	 Catch:{ all -> 0x01d7 }
        r4 = java.lang.Math.max(r4, r0);	 Catch:{ all -> 0x01d7 }
        goto L_0x011f;
    L_0x0134:
        r10 = r0.m10010c();	 Catch:{ all -> 0x01d7 }
        r4 = java.lang.Math.max(r4, r10);	 Catch:{ all -> 0x01d7 }
        r8.remove(r0);	 Catch:{ all -> 0x01d7 }
        r1 = "Hit sent do device AnalyticsService for delivery";
        r12.zzb(r1, r0);	 Catch:{ all -> 0x01d7 }
        r1 = r12.f7078b;	 Catch:{ SQLiteException -> 0x0159 }
        r10 = r0.m10010c();	 Catch:{ SQLiteException -> 0x0159 }
        r1.m9865c(r10);	 Catch:{ SQLiteException -> 0x0159 }
        r0 = r0.m10010c();	 Catch:{ SQLiteException -> 0x0159 }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ SQLiteException -> 0x0159 }
        r3.add(r0);	 Catch:{ SQLiteException -> 0x0159 }
        goto L_0x00f6;
    L_0x0159:
        r0 = move-exception;
        r1 = "Failed to remove hit that was send for delivery";
        r12.zze(r1, r0);	 Catch:{ all -> 0x01d7 }
        r12.m9888t();	 Catch:{ all -> 0x01d7 }
        r0 = r12.f7078b;	 Catch:{ SQLiteException -> 0x016e }
        r0.m9863b();	 Catch:{ SQLiteException -> 0x016e }
        r0 = r12.f7078b;	 Catch:{ SQLiteException -> 0x016e }
        r0.m9864c();	 Catch:{ SQLiteException -> 0x016e }
        goto L_0x0027;
    L_0x016e:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.zze(r1, r0);
        r12.m9888t();
        goto L_0x0027;
    L_0x0179:
        r0 = r12.f7078b;	 Catch:{ SQLiteException -> 0x019f }
        r0.m9860a(r8);	 Catch:{ SQLiteException -> 0x019f }
        r3.addAll(r8);	 Catch:{ SQLiteException -> 0x019f }
        r0 = r4;
    L_0x0182:
        r4 = r3.isEmpty();	 Catch:{ all -> 0x01d7 }
        if (r4 == 0) goto L_0x01bf;
    L_0x0188:
        r0 = r12.f7078b;	 Catch:{ SQLiteException -> 0x0194 }
        r0.m9863b();	 Catch:{ SQLiteException -> 0x0194 }
        r0 = r12.f7078b;	 Catch:{ SQLiteException -> 0x0194 }
        r0.m9864c();	 Catch:{ SQLiteException -> 0x0194 }
        goto L_0x0027;
    L_0x0194:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.zze(r1, r0);
        r12.m9888t();
        goto L_0x0027;
    L_0x019f:
        r0 = move-exception;
        r1 = "Failed to remove successfully uploaded hits";
        r12.zze(r1, r0);	 Catch:{ all -> 0x01d7 }
        r12.m9888t();	 Catch:{ all -> 0x01d7 }
        r0 = r12.f7078b;	 Catch:{ SQLiteException -> 0x01b4 }
        r0.m9863b();	 Catch:{ SQLiteException -> 0x01b4 }
        r0 = r12.f7078b;	 Catch:{ SQLiteException -> 0x01b4 }
        r0.m9864c();	 Catch:{ SQLiteException -> 0x01b4 }
        goto L_0x0027;
    L_0x01b4:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.zze(r1, r0);
        r12.m9888t();
        goto L_0x0027;
    L_0x01bf:
        r4 = r12.f7078b;	 Catch:{ SQLiteException -> 0x01cc }
        r4.m9863b();	 Catch:{ SQLiteException -> 0x01cc }
        r4 = r12.f7078b;	 Catch:{ SQLiteException -> 0x01cc }
        r4.m9864c();	 Catch:{ SQLiteException -> 0x01cc }
        r4 = r0;
        goto L_0x0048;
    L_0x01cc:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.zze(r1, r0);
        r12.m9888t();
        goto L_0x0027;
    L_0x01d7:
        r0 = move-exception;
        r1 = r12.f7078b;	 Catch:{ SQLiteException -> 0x01e3 }
        r1.m9863b();	 Catch:{ SQLiteException -> 0x01e3 }
        r1 = r12.f7078b;	 Catch:{ SQLiteException -> 0x01e3 }
        r1.m9864c();	 Catch:{ SQLiteException -> 0x01e3 }
        throw r0;
    L_0x01e3:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.zze(r1, r0);
        r12.m9888t();
        goto L_0x0027;
    L_0x01ee:
        r0 = r4;
        goto L_0x010c;
        */
        throw new UnsupportedOperationException("Method not decompiled: bnc.h():boolean");
    }

    /* renamed from: i */
    public void m9908i() {
        alq.m2511d();
        zzob();
        zzbQ("Sync dispatching local hits");
        long j = this.f7086j;
        m9905f();
        try {
            m9907h();
            zznW().m10097d();
            m9910k();
            if (this.f7086j != j) {
                this.f7080d.m10050c();
            }
        } catch (Throwable th) {
            zze("Sync local dispatch failed", th);
            m9910k();
        }
    }

    /* renamed from: j */
    public long m9909j() {
        alq.m2511d();
        zzob();
        try {
            return this.f7078b.m9870g();
        } catch (SQLiteException e) {
            zze("Failed to get min/max hit times from local store", e);
            return 0;
        }
    }

    /* renamed from: k */
    public void m9910k() {
        zznQ().m9784s();
        zzob();
        if (!m9885q()) {
            this.f7080d.m10049b();
            m9888t();
        } else if (this.f7078b.m9868e()) {
            this.f7080d.m10049b();
            m9888t();
        } else {
            boolean z;
            if (((Boolean) bnp.f7123J.m9985a()).booleanValue()) {
                z = true;
            } else {
                this.f7080d.m10048a();
                z = this.f7080d.m10052e();
            }
            if (z) {
                m9887s();
                return;
            }
            m9888t();
            m9886r();
        }
    }

    /* renamed from: l */
    public long m9911l() {
        if (this.f7082f != Long.MIN_VALUE) {
            return this.f7082f;
        }
        return zzmB().m10149d() ? ((long) zzmB().m10150e()) * 1000 : zznT().m9943h();
    }

    /* renamed from: m */
    public void m9912m() {
        zzob();
        zzmR();
        this.f7087k = true;
        this.f7081e.m9835c();
        m9910k();
    }

    protected void zzmS() {
        this.f7078b.initialize();
        this.f7079c.initialize();
        this.f7081e.initialize();
    }
}
