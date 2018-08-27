package com.p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: aml */
public class aml extends ev<Void> implements asr {
    /* renamed from: o */
    private Semaphore f2028o = new Semaphore(0);
    /* renamed from: p */
    private Set<GoogleApiClient> f2029p;

    public aml(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.f2029p = set;
    }

    /* renamed from: d */
    public /* synthetic */ Object m2587d() {
        return m2589t();
    }

    /* renamed from: j */
    protected void m2588j() {
        this.f2028o.drainPermits();
        l();
    }

    /* renamed from: t */
    public Void m2589t() {
        int i = 0;
        for (GoogleApiClient zza : this.f2029p) {
            i = zza.zza((asr) this) ? i + 1 : i;
        }
        try {
            this.f2028o.tryAcquire(i, 5, TimeUnit.SECONDS);
        } catch (Throwable e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
        return null;
    }

    /* renamed from: u */
    public void mo329u() {
        this.f2028o.release();
    }
}
