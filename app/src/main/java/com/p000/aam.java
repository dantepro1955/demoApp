package com.p000;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import io.fabric.sdk.android.ActivityLifecycleManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.common.ExecutorUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.util.concurrent.ScheduledExecutorService;
import p000.aac.C0002a;
import p000.aao.C0006b;

/* compiled from: SessionAnalyticsManager */
/* renamed from: aam */
class aam implements C0002a {
    /* renamed from: a */
    final zx f79a;
    /* renamed from: b */
    final ActivityLifecycleManager f80b;
    /* renamed from: c */
    final aac f81c;
    /* renamed from: d */
    final aaa f82d;
    /* renamed from: e */
    private final long f83e;

    /* renamed from: a */
    public static aam m89a(Kit kit, Context context, IdManager idManager, String str, String str2, long j) {
        aar aar = new aar(context, idManager, str, str2);
        zy zyVar = new zy(context, new FileStoreImpl(kit));
        HttpRequestFactory defaultHttpRequestFactory = new DefaultHttpRequestFactory(Fabric.h());
        ActivityLifecycleManager activityLifecycleManager = new ActivityLifecycleManager(context);
        ScheduledExecutorService b = ExecutorUtils.b("Answers Events Handler");
        aac aac = new aac(b);
        return new aam(new zx(kit, context, zyVar, aar, defaultHttpRequestFactory, b), activityLifecycleManager, aac, aaa.m46a(context), j);
    }

    aam(zx zxVar, ActivityLifecycleManager activityLifecycleManager, aac aac, aaa aaa, long j) {
        this.f79a = zxVar;
        this.f80b = activityLifecycleManager;
        this.f81c = aac;
        this.f82d = aaa;
        this.f83e = j;
    }

    /* renamed from: b */
    public void m95b() {
        this.f79a.b();
        this.f80b.a(new zz(this, this.f81c));
        this.f81c.m55a((C0002a) this);
        if (m97d()) {
            m91a(this.f83e);
            this.f82d.m47a();
        }
    }

    /* renamed from: c */
    public void m96c() {
        this.f80b.a();
        this.f79a.a();
    }

    /* renamed from: a */
    public void m94a(String str, String str2) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("onCrash called from main thread!!!");
        }
        Fabric.h().a("Answers", "Logged crash");
        this.f79a.c(aao.m104a(str, str2));
    }

    /* renamed from: a */
    public void m91a(long j) {
        Fabric.h().a("Answers", "Logged install");
        this.f79a.b(aao.m101a(j));
    }

    /* renamed from: a */
    public void m92a(Activity activity, C0006b c0006b) {
        Fabric.h().a("Answers", "Logged lifecycle event: " + c0006b.name());
        this.f79a.a(aao.m102a(c0006b, activity));
    }

    /* renamed from: a */
    public void mo6a() {
        Fabric.h().a("Answers", "Flush events when app is backgrounded");
        this.f79a.c();
    }

    /* renamed from: a */
    public void m93a(AnalyticsSettingsData analyticsSettingsData, String str) {
        this.f81c.m56a(analyticsSettingsData.f24181h);
        this.f79a.a(analyticsSettingsData, str);
    }

    /* renamed from: d */
    boolean m97d() {
        return !this.f82d.m48b();
    }
}
