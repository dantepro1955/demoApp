package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bmr */
public class bmr extends bmu {
    /* renamed from: a */
    private final bnc f7022a;

    /* renamed from: bmr$6 */
    class C13426 implements Callable<Void> {
        /* renamed from: a */
        final /* synthetic */ bmr f7021a;

        C13426(bmr bmr) {
            this.f7021a = bmr;
        }

        /* renamed from: a */
        public Void m9749a() throws Exception {
            this.f7021a.f7022a.m9908i();
            return null;
        }

        public /* synthetic */ Object call() throws Exception {
            return m9749a();
        }
    }

    public bmr(bmw bmw, bmx bmx) {
        super(bmw);
        aoi.m4679a((Object) bmx);
        this.f7022a = bmx.m9797j(bmw);
    }

    /* renamed from: a */
    public long m9751a(bmy bmy) {
        zzob();
        aoi.m4679a((Object) bmy);
        zzmR();
        long a = this.f7022a.m9891a(bmy, true);
        if (a == 0) {
            this.f7022a.m9894a(bmy);
        }
        return a;
    }

    /* renamed from: a */
    public void m9752a() {
        this.f7022a.m9892a();
    }

    /* renamed from: a */
    public void m9753a(final int i) {
        zzob();
        zzb("setLocalDispatchPeriod (sec)", Integer.valueOf(i));
        zznU().m2515a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bmr f7011b;

            public void run() {
                this.f7011b.f7022a.m9893a(((long) i) * 1000);
            }
        });
    }

    /* renamed from: a */
    public void m9754a(final bnn bnn) {
        zzob();
        zznU().m2515a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bmr f7020b;

            public void run() {
                this.f7020b.f7022a.m9895a(bnn);
            }
        });
    }

    /* renamed from: a */
    public void m9755a(final bns bns) {
        aoi.m4679a((Object) bns);
        zzob();
        zzb("Hit delivery requested", bns);
        zznU().m2515a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bmr f7018b;

            public void run() {
                this.f7018b.f7022a.m9897a(bns);
            }
        });
    }

    /* renamed from: a */
    public void m9756a(final String str, final Runnable runnable) {
        aoi.m4682a(str, (Object) "campaign param can't be empty");
        zznU().m2515a(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ bmr f7016c;

            public void run() {
                this.f7016c.f7022a.m9898a(str);
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    /* renamed from: a */
    public void m9757a(final boolean z) {
        zza("Network connectivity status changed", Boolean.valueOf(z));
        zznU().m2515a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bmr f7013b;

            public void run() {
                this.f7013b.f7022a.m9899a(z);
            }
        });
    }

    /* renamed from: b */
    public void m9758b() {
        zzob();
        Context context = getContext();
        if (bob.m10100a(context) && boc.m10106a(context)) {
            Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            context.startService(intent);
            return;
        }
        m9754a(null);
    }

    /* renamed from: c */
    public boolean m9759c() {
        zzob();
        try {
            zznU().m2513a(new C13426(this)).get(4, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e) {
            zzd("syncDispatchLocalHits interrupted", e);
            return false;
        } catch (ExecutionException e2) {
            zze("syncDispatchLocalHits failed", e2);
            return false;
        } catch (TimeoutException e3) {
            zzd("syncDispatchLocalHits timed out", e3);
            return false;
        }
    }

    /* renamed from: d */
    public void m9760d() {
        zzob();
        alq.m2511d();
        this.f7022a.m9904e();
    }

    /* renamed from: e */
    public void m9761e() {
        zzbP("Radio powered up");
        m9758b();
    }

    /* renamed from: f */
    void m9762f() {
        zzmR();
        this.f7022a.m9903d();
    }

    /* renamed from: g */
    void m9763g() {
        zzmR();
        this.f7022a.m9902c();
    }

    protected void zzmS() {
        this.f7022a.initialize();
    }
}
