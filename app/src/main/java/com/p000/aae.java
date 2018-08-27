package com.p000;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.events.FilesSender;
import io.fabric.sdk.android.services.events.TimeBasedFileRollOverRunnable;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.aao.C0005a;
import p000.aao.C0006b;

/* compiled from: EnabledSessionAnalyticsManagerStrategy */
/* renamed from: aae */
class aae implements aan {
    /* renamed from: a */
    final aap f57a;
    /* renamed from: b */
    FilesSender f58b;
    /* renamed from: c */
    ApiKey f59c = new ApiKey();
    /* renamed from: d */
    aaf f60d = new aag();
    /* renamed from: e */
    boolean f61e = true;
    /* renamed from: f */
    boolean f62f = true;
    /* renamed from: g */
    volatile int f63g = -1;
    /* renamed from: h */
    private final Kit f64h;
    /* renamed from: i */
    private final HttpRequestFactory f65i;
    /* renamed from: j */
    private final Context f66j;
    /* renamed from: k */
    private final aak f67k;
    /* renamed from: l */
    private final ScheduledExecutorService f68l;
    /* renamed from: m */
    private final AtomicReference<ScheduledFuture<?>> f69m = new AtomicReference();

    public aae(Kit kit, Context context, ScheduledExecutorService scheduledExecutorService, aak aak, HttpRequestFactory httpRequestFactory, aap aap) {
        this.f64h = kit;
        this.f66j = context;
        this.f68l = scheduledExecutorService;
        this.f67k = aak;
        this.f65i = httpRequestFactory;
        this.f57a = aap;
    }

    /* renamed from: a */
    public void mo3a(AnalyticsSettingsData analyticsSettingsData, String str) {
        this.f58b = aab.m49a(new aal(this.f64h, str, analyticsSettingsData.f24174a, this.f65i, this.f59c.a(this.f66j)));
        this.f67k.m85a(analyticsSettingsData);
        this.f61e = analyticsSettingsData.f24179f;
        Fabric.h().a("Answers", "Custom event tracking " + (this.f61e ? "enabled" : "disabled"));
        this.f62f = analyticsSettingsData.f24180g;
        Fabric.h().a("Answers", "Predefined event tracking " + (this.f62f ? "enabled" : "disabled"));
        if (analyticsSettingsData.f24182i > 1) {
            Fabric.h().a("Answers", "Event sampling enabled");
            this.f60d = new aaj(analyticsSettingsData.f24182i);
        }
        this.f63g = analyticsSettingsData.f24175b;
        m69a(0, (long) this.f63g);
    }

    /* renamed from: a */
    public void mo2a(C0005a c0005a) {
        aao a = c0005a.m99a(this.f57a);
        if (!this.f61e && C0006b.CUSTOM.equals(a.f102c)) {
            Fabric.h().a("Answers", "Custom events tracking disabled - skipping event: " + a);
        } else if (!this.f62f && C0006b.PREDEFINED.equals(a.f102c)) {
            Fabric.h().a("Answers", "Predefined events tracking disabled - skipping event: " + a);
        } else if (this.f60d.mo5a(a)) {
            Fabric.h().a("Answers", "Skipping filtered event: " + a);
        } else {
            try {
                this.f67k.a(a);
            } catch (Throwable e) {
                Fabric.h().e("Answers", "Failed to write event: " + a, e);
            }
            m75e();
        }
    }

    /* renamed from: e */
    public void m75e() {
        if ((this.f63g != -1 ? 1 : null) != null) {
            m69a((long) this.f63g, (long) this.f63g);
        }
    }

    /* renamed from: a */
    public void mo1a() {
        if (this.f58b == null) {
            CommonUtils.a(this.f66j, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        CommonUtils.a(this.f66j, "Sending all files");
        List e = this.f67k.e();
        int i = 0;
        while (e.size() > 0) {
            int size;
            CommonUtils.a(this.f66j, String.format(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(e.size())}));
            boolean a = this.f58b.a(e);
            if (a) {
                size = e.size() + i;
                try {
                    this.f67k.a(e);
                    i = size;
                } catch (Exception e2) {
                    Throwable e3 = e2;
                }
            }
            if (!a) {
                break;
            }
            try {
                e = this.f67k.e();
            } catch (Throwable e4) {
                Throwable th = e4;
                size = i;
                e3 = th;
            }
        }
        if (i == 0) {
            this.f67k.g();
        }
        CommonUtils.a(this.f66j, "Failed to send batch of analytics files to server: " + e3.getMessage(), e3);
        i = size;
        if (i == 0) {
            this.f67k.g();
        }
    }

    /* renamed from: d */
    public void m74d() {
        if (this.f69m.get() != null) {
            CommonUtils.a(this.f66j, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture) this.f69m.get()).cancel(false);
            this.f69m.set(null);
        }
    }

    /* renamed from: b */
    public void mo4b() {
        this.f67k.f();
    }

    /* renamed from: c */
    public boolean m73c() {
        try {
            return this.f67k.d();
        } catch (Throwable e) {
            CommonUtils.a(this.f66j, "Failed to roll file over.", e);
            return false;
        }
    }

    /* renamed from: a */
    void m69a(long j, long j2) {
        if ((this.f69m.get() == null ? 1 : null) != null) {
            Runnable timeBasedFileRollOverRunnable = new TimeBasedFileRollOverRunnable(this.f66j, this);
            CommonUtils.a(this.f66j, "Scheduling time based file roll over every " + j2 + " seconds");
            try {
                this.f69m.set(this.f68l.scheduleAtFixedRate(timeBasedFileRollOverRunnable, j, j2, TimeUnit.SECONDS));
            } catch (Throwable e) {
                CommonUtils.a(this.f66j, "Failed to schedule time based file roll over", e);
            }
        }
    }
}
