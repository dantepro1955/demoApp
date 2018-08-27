package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import java.util.Collections;

/* renamed from: bmz */
public class bmz extends bmu {
    /* renamed from: a */
    private final C1347a f7062a = new C1347a(this);
    /* renamed from: b */
    private bnu f7063b;
    /* renamed from: c */
    private final bnk f7064c;
    /* renamed from: d */
    private bod f7065d;

    /* renamed from: bmz$a */
    public class C1347a implements ServiceConnection {
        /* renamed from: a */
        final /* synthetic */ bmz f7059a;
        /* renamed from: b */
        private volatile bnu f7060b;
        /* renamed from: c */
        private volatile boolean f7061c;

        protected C1347a(bmz bmz) {
            this.f7059a = bmz;
        }

        /* renamed from: a */
        public bnu m9822a() {
            bnu bnu = null;
            this.f7059a.zzmR();
            Intent intent = new Intent("com.google.android.gms.analytics.service.START");
            intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
            Context context = this.f7059a.getContext();
            intent.putExtra("app_package_name", context.getPackageName());
            apm a = apm.m4855a();
            synchronized (this) {
                this.f7060b = null;
                this.f7061c = true;
                boolean a2 = a.m4859a(context, intent, this.f7059a.f7062a, 129);
                this.f7059a.zza("Bind to service requested", Boolean.valueOf(a2));
                if (a2) {
                    try {
                        wait(this.f7059a.zznT().m9957v());
                    } catch (InterruptedException e) {
                        this.f7059a.zzbS("Wait for service connect was interrupted");
                    }
                    this.f7061c = false;
                    bnu = this.f7060b;
                    this.f7060b = null;
                    if (bnu == null) {
                        this.f7059a.zzbT("Successfully bound to service but never got onServiceConnected callback");
                    }
                } else {
                    this.f7061c = false;
                }
            }
            return bnu;
        }

        public void onServiceConnected(ComponentName r5, android.os.IBinder r6) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:bmz.a.onServiceConnected(android.content.ComponentName, android.os.IBinder):void. bs: [B:3:0x0008, B:9:0x0015]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1976752685.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = "AnalyticsServiceConnection.onServiceConnected";
            p000.aoi.m4687b(r0);
            monitor-enter(r4);
            if (r6 != 0) goto L_0x0014;
        L_0x0008:
            r0 = r4.f7059a;	 Catch:{ all -> 0x005a }
            r1 = "Service connected with null binder";	 Catch:{ all -> 0x005a }
            r0.zzbT(r1);	 Catch:{ all -> 0x005a }
            r4.notifyAll();	 Catch:{ all -> 0x0046 }
            monitor-exit(r4);	 Catch:{ all -> 0x0046 }
        L_0x0013:
            return;
        L_0x0014:
            r0 = 0;
            r1 = r6.getInterfaceDescriptor();	 Catch:{ RemoteException -> 0x0051 }
            r2 = "com.google.android.gms.analytics.internal.IAnalyticsService";	 Catch:{ RemoteException -> 0x0051 }
            r2 = r2.equals(r1);	 Catch:{ RemoteException -> 0x0051 }
            if (r2 == 0) goto L_0x0049;	 Catch:{ RemoteException -> 0x0051 }
        L_0x0021:
            r0 = p000.bnu.C1362a.m10030a(r6);	 Catch:{ RemoteException -> 0x0051 }
            r1 = r4.f7059a;	 Catch:{ RemoteException -> 0x0051 }
            r2 = "Bound to IAnalyticsService interface";	 Catch:{ RemoteException -> 0x0051 }
            r1.zzbP(r2);	 Catch:{ RemoteException -> 0x0051 }
        L_0x002c:
            if (r0 != 0) goto L_0x005f;
        L_0x002e:
            r0 = p000.apm.m4855a();	 Catch:{ IllegalArgumentException -> 0x007c }
            r1 = r4.f7059a;	 Catch:{ IllegalArgumentException -> 0x007c }
            r1 = r1.getContext();	 Catch:{ IllegalArgumentException -> 0x007c }
            r2 = r4.f7059a;	 Catch:{ IllegalArgumentException -> 0x007c }
            r2 = r2.f7062a;	 Catch:{ IllegalArgumentException -> 0x007c }
            r0.m4857a(r1, r2);	 Catch:{ IllegalArgumentException -> 0x007c }
        L_0x0041:
            r4.notifyAll();	 Catch:{ all -> 0x0046 }
            monitor-exit(r4);	 Catch:{ all -> 0x0046 }
            goto L_0x0013;	 Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception;	 Catch:{ all -> 0x0046 }
            monitor-exit(r4);	 Catch:{ all -> 0x0046 }
            throw r0;
        L_0x0049:
            r2 = r4.f7059a;	 Catch:{ RemoteException -> 0x0051 }
            r3 = "Got binder with a wrong descriptor";	 Catch:{ RemoteException -> 0x0051 }
            r2.zze(r3, r1);	 Catch:{ RemoteException -> 0x0051 }
            goto L_0x002c;
        L_0x0051:
            r1 = move-exception;
            r1 = r4.f7059a;	 Catch:{ all -> 0x005a }
            r2 = "Service connect failed to get IAnalyticsService";	 Catch:{ all -> 0x005a }
            r1.zzbT(r2);	 Catch:{ all -> 0x005a }
            goto L_0x002c;
        L_0x005a:
            r0 = move-exception;
            r4.notifyAll();	 Catch:{ all -> 0x0046 }
            throw r0;	 Catch:{ all -> 0x0046 }
        L_0x005f:
            r1 = r4.f7061c;	 Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0079;	 Catch:{ all -> 0x005a }
        L_0x0063:
            r1 = r4.f7059a;	 Catch:{ all -> 0x005a }
            r2 = "onServiceConnected received after the timeout limit";	 Catch:{ all -> 0x005a }
            r1.zzbS(r2);	 Catch:{ all -> 0x005a }
            r1 = r4.f7059a;	 Catch:{ all -> 0x005a }
            r1 = r1.zznU();	 Catch:{ all -> 0x005a }
            r2 = new bmz$a$1;	 Catch:{ all -> 0x005a }
            r2.<init>(r4, r0);	 Catch:{ all -> 0x005a }
            r1.m2515a(r2);	 Catch:{ all -> 0x005a }
            goto L_0x0041;	 Catch:{ all -> 0x005a }
        L_0x0079:
            r4.f7060b = r0;	 Catch:{ all -> 0x005a }
            goto L_0x0041;
        L_0x007c:
            r0 = move-exception;
            goto L_0x0041;
            */
            throw new UnsupportedOperationException("Method not decompiled: bmz.a.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        public void onServiceDisconnected(final ComponentName componentName) {
            aoi.m4687b("AnalyticsServiceConnection.onServiceDisconnected");
            this.f7059a.zznU().m2515a(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C1347a f7058b;

                public void run() {
                    this.f7058b.f7059a.m9824a(componentName);
                }
            });
        }
    }

    protected bmz(bmw bmw) {
        super(bmw);
        this.f7065d = new bod(bmw.m9769d());
        this.f7064c = new bnk(this, bmw) {
            /* renamed from: a */
            final /* synthetic */ bmz f7054a;

            /* renamed from: a */
            public void mo1350a() {
                this.f7054a.m9830e();
            }
        };
    }

    /* renamed from: a */
    private void m9824a(ComponentName componentName) {
        zzmR();
        if (this.f7063b != null) {
            this.f7063b = null;
            zza("Disconnected from device AnalyticsService", componentName);
            m9831f();
        }
    }

    /* renamed from: a */
    private void m9827a(bnu bnu) {
        zzmR();
        this.f7063b = bnu;
        m9829d();
        zzmA().m9762f();
    }

    /* renamed from: d */
    private void m9829d() {
        this.f7065d.m10112a();
        this.f7064c.m9816a(zznT().m9956u());
    }

    /* renamed from: e */
    private void m9830e() {
        zzmR();
        if (m9832a()) {
            zzbP("Inactivity, disconnecting from device AnalyticsService");
            m9835c();
        }
    }

    /* renamed from: f */
    private void m9831f() {
        zzmA().m9760d();
    }

    /* renamed from: a */
    public boolean m9832a() {
        zzmR();
        zzob();
        return this.f7063b != null;
    }

    /* renamed from: a */
    public boolean m9833a(bns bns) {
        aoi.m4679a((Object) bns);
        zzmR();
        zzob();
        bnu bnu = this.f7063b;
        if (bnu == null) {
            return false;
        }
        try {
            bnu.mo1362a(bns.m10009b(), bns.m10011d(), bns.m10013f() ? zznT().m9949n() : zznT().m9950o(), Collections.emptyList());
            m9829d();
            return true;
        } catch (RemoteException e) {
            zzbP("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    /* renamed from: b */
    public boolean m9834b() {
        zzmR();
        zzob();
        if (this.f7063b != null) {
            return true;
        }
        bnu a = this.f7062a.m9822a();
        if (a == null) {
            return false;
        }
        this.f7063b = a;
        m9829d();
        return true;
    }

    /* renamed from: c */
    public void m9835c() {
        zzmR();
        zzob();
        try {
            apm.m4855a().m4857a(getContext(), this.f7062a);
        } catch (IllegalStateException e) {
        } catch (IllegalArgumentException e2) {
        }
        if (this.f7063b != null) {
            this.f7063b = null;
            m9831f();
        }
    }

    protected void zzmS() {
    }
}
