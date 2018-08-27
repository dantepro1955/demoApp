package com.p000;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.zzdp;
import com.google.android.gms.internal.zzds;
import p000.aot.C0662b;
import p000.aot.C0663c;
import p000.ayl.C0914b;

@bhd
/* renamed from: ayw */
public class ayw {
    /* renamed from: a */
    private final Runnable f5116a = new C09231(this);
    /* renamed from: b */
    private final Object f5117b = new Object();
    /* renamed from: c */
    private ayy f5118c;
    /* renamed from: d */
    private Context f5119d;
    /* renamed from: e */
    private azb f5120e;

    /* renamed from: ayw$1 */
    class C09231 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ayw f5112a;

        C09231(ayw ayw) {
            this.f5112a = ayw;
        }

        public void run() {
            this.f5112a.m6670c();
        }
    }

    /* renamed from: ayw$2 */
    class C09242 implements C0914b {
        /* renamed from: a */
        final /* synthetic */ ayw f5113a;

        C09242(ayw ayw) {
            this.f5113a = ayw;
        }

        /* renamed from: a */
        public void mo855a(boolean z) {
            if (z) {
                this.f5113a.m6667b();
            } else {
                this.f5113a.m6670c();
            }
        }
    }

    /* renamed from: ayw$3 */
    class C09253 implements C0662b {
        /* renamed from: a */
        final /* synthetic */ ayw f5114a;

        C09253(ayw ayw) {
            this.f5114a = ayw;
        }

        /* renamed from: a */
        public void mo597a(int i) {
            synchronized (this.f5114a.f5117b) {
                this.f5114a.f5120e = null;
                this.f5114a.f5117b.notifyAll();
            }
        }

        /* renamed from: a */
        public void mo598a(Bundle bundle) {
            synchronized (this.f5114a.f5117b) {
                try {
                    this.f5114a.f5120e = this.f5114a.f5118c.mo344e();
                } catch (Throwable e) {
                    bky.m9007b("Unable to obtain a cache service instance.", e);
                    this.f5114a.m6670c();
                }
                this.f5114a.f5117b.notifyAll();
            }
        }
    }

    /* renamed from: ayw$4 */
    class C09264 implements C0663c {
        /* renamed from: a */
        final /* synthetic */ ayw f5115a;

        C09264(ayw ayw) {
            this.f5115a = ayw;
        }

        /* renamed from: a */
        public void mo599a(ConnectionResult connectionResult) {
            synchronized (this.f5115a.f5117b) {
                this.f5115a.f5120e = null;
                if (this.f5115a.f5118c != null) {
                    this.f5115a.f5118c = null;
                    ako.m2359u().m9259b();
                }
                this.f5115a.f5117b.notifyAll();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private void m6667b() {
        /*
        r3 = this;
        r1 = r3.f5117b;
        monitor-enter(r1);
        r0 = r3.f5119d;	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r3.f5118c;	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
    L_0x000c:
        return;
    L_0x000d:
        r0 = new ayw$3;	 Catch:{ all -> 0x0024 }
        r0.<init>(r3);	 Catch:{ all -> 0x0024 }
        r2 = new ayw$4;	 Catch:{ all -> 0x0024 }
        r2.<init>(r3);	 Catch:{ all -> 0x0024 }
        r0 = r3.m6672a(r0, r2);	 Catch:{ all -> 0x0024 }
        r3.f5118c = r0;	 Catch:{ all -> 0x0024 }
        r0 = r3.f5118c;	 Catch:{ all -> 0x0024 }
        r0.m2630n();	 Catch:{ all -> 0x0024 }
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        goto L_0x000c;
    L_0x0024:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ayw.b():void");
    }

    /* renamed from: c */
    private void m6670c() {
        synchronized (this.f5117b) {
            if (this.f5118c == null) {
                return;
            }
            if (this.f5118c.m2624g() || this.f5118c.m2625h()) {
                this.f5118c.mo779f();
            }
            this.f5118c = null;
            this.f5120e = null;
            Binder.flushPendingCommands();
            ako.m2359u().m9259b();
        }
    }

    /* renamed from: a */
    protected ayy m6672a(C0662b c0662b, C0663c c0663c) {
        return new ayy(this.f5119d, ako.m2359u().m9258a(), c0662b, c0663c);
    }

    /* renamed from: a */
    public zzdp m6673a(zzds zzds) {
        zzdp zzdp;
        synchronized (this.f5117b) {
            if (this.f5120e == null) {
                zzdp = new zzdp();
            } else {
                try {
                    zzdp = this.f5120e.mo856a(zzds);
                } catch (Throwable e) {
                    bky.m9007b("Unable to call into cache service.", e);
                    zzdp = new zzdp();
                }
            }
        }
        return zzdp;
    }

    /* renamed from: a */
    public void m6674a() {
        if (((Boolean) bbb.da.m7064c()).booleanValue()) {
            synchronized (this.f5117b) {
                m6667b();
                ako.m2343e();
                bkg.f6710a.removeCallbacks(this.f5116a);
                ako.m2343e();
                bkg.f6710a.postDelayed(this.f5116a, ((Long) bbb.db.m7064c()).longValue());
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m6675a(Context r3) {
        /*
        r2 = this;
        if (r3 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r1 = r2.f5117b;
        monitor-enter(r1);
        r0 = r2.f5119d;	 Catch:{ all -> 0x000c }
        if (r0 == 0) goto L_0x000f;
    L_0x000a:
        monitor-exit(r1);	 Catch:{ all -> 0x000c }
        goto L_0x0002;
    L_0x000c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x000c }
        throw r0;
    L_0x000f:
        r0 = r3.getApplicationContext();	 Catch:{ all -> 0x000c }
        r2.f5119d = r0;	 Catch:{ all -> 0x000c }
        r0 = p000.bbb.cZ;	 Catch:{ all -> 0x000c }
        r0 = r0.m7064c();	 Catch:{ all -> 0x000c }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x000c }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x000c }
        if (r0 == 0) goto L_0x0028;
    L_0x0023:
        r2.m6667b();	 Catch:{ all -> 0x000c }
    L_0x0026:
        monitor-exit(r1);	 Catch:{ all -> 0x000c }
        goto L_0x0002;
    L_0x0028:
        r0 = p000.bbb.cY;	 Catch:{ all -> 0x000c }
        r0 = r0.m7064c();	 Catch:{ all -> 0x000c }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x000c }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x000c }
        if (r0 == 0) goto L_0x0026;
    L_0x0036:
        r0 = new ayw$2;	 Catch:{ all -> 0x000c }
        r0.<init>(r2);	 Catch:{ all -> 0x000c }
        r2.m6676a(r0);	 Catch:{ all -> 0x000c }
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: ayw.a(android.content.Context):void");
    }

    /* renamed from: a */
    protected void m6676a(C0914b c0914b) {
        ako.m2346h().m6609a(c0914b);
    }
}
