package com.p000;

import android.annotation.SuppressLint;
import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.settings.BetaSettingsData;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AbstractCheckForUpdatesController */
/* renamed from: aas */
abstract class aas implements abb {
    /* renamed from: a */
    private final AtomicBoolean f126a;
    /* renamed from: b */
    private final AtomicBoolean f127b;
    /* renamed from: c */
    private Context f128c;
    /* renamed from: d */
    private aau f129d;
    /* renamed from: e */
    private IdManager f130e;
    /* renamed from: f */
    private BetaSettingsData f131f;
    /* renamed from: g */
    private aav f132g;
    /* renamed from: h */
    private PreferenceStore f133h;
    /* renamed from: i */
    private CurrentTimeProvider f134i;
    /* renamed from: j */
    private HttpRequestFactory f135j;
    /* renamed from: k */
    private long f136k;

    public aas() {
        this(false);
    }

    public aas(boolean z) {
        this.f126a = new AtomicBoolean();
        this.f136k = 0;
        this.f127b = new AtomicBoolean(z);
    }

    /* renamed from: a */
    public void mo7a(Context context, aau aau, IdManager idManager, BetaSettingsData betaSettingsData, aav aav, PreferenceStore preferenceStore, CurrentTimeProvider currentTimeProvider, HttpRequestFactory httpRequestFactory) {
        this.f128c = context;
        this.f129d = aau;
        this.f130e = idManager;
        this.f131f = betaSettingsData;
        this.f132g = aav;
        this.f133h = preferenceStore;
        this.f134i = currentTimeProvider;
        this.f135j = httpRequestFactory;
        if (m114b()) {
            m115c();
        }
    }

    /* renamed from: a */
    protected boolean m113a() {
        this.f127b.set(true);
        return this.f126a.get();
    }

    /* renamed from: b */
    boolean m114b() {
        this.f126a.set(true);
        return this.f127b.get();
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: c */
    protected void m115c() {
        synchronized (this.f133h) {
            if (this.f133h.a().contains("last_update_check")) {
                this.f133h.a(this.f133h.b().remove("last_update_check"));
            }
        }
        long a = this.f134i.a();
        long j = ((long) this.f131f.f24204b) * 1000;
        Fabric.h().a("Beta", "Check for updates delay: " + j);
        Fabric.h().a("Beta", "Check for updates last check time: " + m116d());
        j += m116d();
        Fabric.h().a("Beta", "Check for updates current time: " + a + ", next check time: " + j);
        if (a >= j) {
            try {
                m110e();
            } finally {
                m111a(a);
            }
        } else {
            Fabric.h().a("Beta", "Check for updates next check time was not passed");
        }
    }

    /* renamed from: e */
    private void m110e() {
        Fabric.h().a("Beta", "Performing update check");
        new aaw(this.f129d, this.f129d.m129g(), this.f131f.f24203a, this.f135j, new aay()).m135a(new ApiKey().a(this.f128c), (String) this.f130e.i().get(DeviceIdentifierType.f23997c), this.f132g);
    }

    /* renamed from: a */
    void m111a(long j) {
        this.f136k = j;
    }

    /* renamed from: d */
    long m116d() {
        return this.f136k;
    }
}
