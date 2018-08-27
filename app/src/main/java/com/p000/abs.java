package com.p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.internal.AnalyticsEvents;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DevicePowerStateListener */
/* renamed from: abs */
class abs {
    /* renamed from: a */
    private static final IntentFilter f280a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    /* renamed from: b */
    private static final IntentFilter f281b = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
    /* renamed from: c */
    private static final IntentFilter f282c = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
    /* renamed from: d */
    private final AtomicBoolean f283d;
    /* renamed from: e */
    private final Context f284e;
    /* renamed from: f */
    private final BroadcastReceiver f285f;
    /* renamed from: g */
    private final BroadcastReceiver f286g;
    /* renamed from: h */
    private boolean f287h;

    /* compiled from: DevicePowerStateListener */
    /* renamed from: abs$1 */
    class C00501 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ abs f278a;

        C00501(abs abs) {
            this.f278a = abs;
        }

        public void onReceive(Context context, Intent intent) {
            this.f278a.f287h = true;
        }
    }

    /* compiled from: DevicePowerStateListener */
    /* renamed from: abs$2 */
    class C00512 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ abs f279a;

        C00512(abs abs) {
            this.f279a = abs;
        }

        public void onReceive(Context context, Intent intent) {
            this.f279a.f287h = false;
        }
    }

    public abs(Context context) {
        int i = -1;
        this.f284e = context;
        Intent registerReceiver = context.registerReceiver(null, f280a);
        if (registerReceiver != null) {
            i = registerReceiver.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1);
        }
        boolean z = i == 2 || i == 5;
        this.f287h = z;
        this.f286g = new C00501(this);
        this.f285f = new C00512(this);
        context.registerReceiver(this.f286g, f281b);
        context.registerReceiver(this.f285f, f282c);
        this.f283d = new AtomicBoolean(true);
    }

    /* renamed from: a */
    public boolean m357a() {
        return this.f287h;
    }

    /* renamed from: b */
    public void m358b() {
        if (this.f283d.getAndSet(false)) {
            this.f284e.unregisterReceiver(this.f286g);
            this.f284e.unregisterReceiver(this.f285f);
        }
    }
}
