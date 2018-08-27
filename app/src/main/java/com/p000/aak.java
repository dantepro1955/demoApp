package com.p000;

import android.content.Context;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.events.EventsFilesManager;
import io.fabric.sdk.android.services.events.EventsStorage;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.io.IOException;
import java.util.UUID;

/* compiled from: SessionAnalyticsFilesManager */
/* renamed from: aak */
class aak extends EventsFilesManager<aao> {
    /* renamed from: g */
    private AnalyticsSettingsData f77g;

    aak(Context context, aaq aaq, CurrentTimeProvider currentTimeProvider, EventsStorage eventsStorage) throws IOException {
        super(context, aaq, currentTimeProvider, eventsStorage, 100);
    }

    /* renamed from: a */
    protected String m84a() {
        return "sa" + "_" + UUID.randomUUID().toString() + "_" + this.c.a() + ".tap";
    }

    /* renamed from: b */
    protected int m86b() {
        return this.f77g == null ? super.b() : this.f77g.f24178e;
    }

    /* renamed from: c */
    protected int m87c() {
        return this.f77g == null ? super.c() : this.f77g.f24176c;
    }

    /* renamed from: a */
    void m85a(AnalyticsSettingsData analyticsSettingsData) {
        this.f77g = analyticsSettingsData;
    }
}
