package com.p000;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.events.EventsStorageListener;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.util.concurrent.ScheduledExecutorService;
import p000.aao.C0005a;

/* compiled from: AnswersEventsHandler */
/* renamed from: zx */
class zx implements EventsStorageListener {
    /* renamed from: a */
    final ScheduledExecutorService f26192a;
    /* renamed from: b */
    aan f26193b = new aad();
    /* renamed from: c */
    private final Kit f26194c;
    /* renamed from: d */
    private final Context f26195d;
    /* renamed from: e */
    private final zy f26196e;
    /* renamed from: f */
    private final aar f26197f;
    /* renamed from: g */
    private final HttpRequestFactory f26198g;

    /* compiled from: AnswersEventsHandler */
    /* renamed from: zx$2 */
    class C58182 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ zx f26185a;

        C58182(zx zxVar) {
            this.f26185a = zxVar;
        }

        public void run() {
            try {
                aan aan = this.f26185a.f26193b;
                this.f26185a.f26193b = new aad();
                aan.b();
            } catch (Throwable e) {
                Fabric.m30879h().mo4877e("Answers", "Failed to disable events", e);
            }
        }
    }

    /* compiled from: AnswersEventsHandler */
    /* renamed from: zx$3 */
    class C58193 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ zx f26186a;

        C58193(zx zxVar) {
            this.f26186a = zxVar;
        }

        public void run() {
            try {
                this.f26186a.f26193b.a();
            } catch (Throwable e) {
                Fabric.m30879h().mo4877e("Answers", "Failed to send events files", e);
            }
        }
    }

    /* compiled from: AnswersEventsHandler */
    /* renamed from: zx$4 */
    class C58204 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ zx f26187a;

        C58204(zx zxVar) {
            this.f26187a = zxVar;
        }

        public void run() {
            try {
                aap a = this.f26187a.f26197f.a();
                aak a2 = this.f26187a.f26196e.m35063a();
                a2.a(this.f26187a);
                this.f26187a.f26193b = new aae(this.f26187a.f26194c, this.f26187a.f26195d, this.f26187a.f26192a, a2, this.f26187a.f26198g, a);
            } catch (Throwable e) {
                Fabric.m30879h().mo4877e("Answers", "Failed to enable events", e);
            }
        }
    }

    /* compiled from: AnswersEventsHandler */
    /* renamed from: zx$5 */
    class C58215 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ zx f26188a;

        C58215(zx zxVar) {
            this.f26188a = zxVar;
        }

        public void run() {
            try {
                this.f26188a.f26193b.c();
            } catch (Throwable e) {
                Fabric.m30879h().mo4877e("Answers", "Failed to flush events", e);
            }
        }
    }

    public zx(Kit kit, Context context, zy zyVar, aar aar, HttpRequestFactory httpRequestFactory, ScheduledExecutorService scheduledExecutorService) {
        this.f26194c = kit;
        this.f26195d = context;
        this.f26196e = zyVar;
        this.f26197f = aar;
        this.f26198g = httpRequestFactory;
        this.f26192a = scheduledExecutorService;
    }

    /* renamed from: a */
    public void m35055a(C0005a c0005a) {
        m35056a(c0005a, false, false);
    }

    /* renamed from: b */
    public void m35060b(C0005a c0005a) {
        m35056a(c0005a, false, true);
    }

    /* renamed from: c */
    public void m35062c(C0005a c0005a) {
        m35056a(c0005a, true, false);
    }

    /* renamed from: a */
    public void m35057a(final AnalyticsSettingsData analyticsSettingsData, final String str) {
        m35050b(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ zx f26184c;

            public void run() {
                try {
                    this.f26184c.f26193b.a(analyticsSettingsData, str);
                } catch (Throwable e) {
                    Fabric.m30879h().mo4877e("Answers", "Failed to set analytics settings data", e);
                }
            }
        });
    }

    /* renamed from: a */
    public void m35054a() {
        m35050b(new C58182(this));
    }

    /* renamed from: a */
    public void mo5618a(String str) {
        m35050b(new C58193(this));
    }

    /* renamed from: b */
    public void m35059b() {
        m35050b(new C58204(this));
    }

    /* renamed from: c */
    public void m35061c() {
        m35050b(new C58215(this));
    }

    /* renamed from: a */
    void m35056a(final C0005a c0005a, boolean z, final boolean z2) {
        Runnable c58226 = new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ zx f26191c;

            public void run() {
                try {
                    this.f26191c.f26193b.a(c0005a);
                    if (z2) {
                        this.f26191c.f26193b.c();
                    }
                } catch (Throwable e) {
                    Fabric.m30879h().mo4877e("Answers", "Failed to process event", e);
                }
            }
        };
        if (z) {
            m35048a(c58226);
        } else {
            m35050b(c58226);
        }
    }

    /* renamed from: a */
    private void m35048a(Runnable runnable) {
        try {
            this.f26192a.submit(runnable).get();
        } catch (Throwable e) {
            Fabric.m30879h().mo4877e("Answers", "Failed to run events task", e);
        }
    }

    /* renamed from: b */
    private void m35050b(Runnable runnable) {
        try {
            this.f26192a.submit(runnable);
        } catch (Throwable e) {
            Fabric.m30879h().mo4877e("Answers", "Failed to submit events task", e);
        }
    }
}
