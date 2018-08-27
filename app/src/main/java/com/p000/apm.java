package com.p000;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: apm */
public class apm {
    /* renamed from: a */
    private static final Object f3911a = new Object();
    /* renamed from: b */
    private static apm f3912b;
    /* renamed from: c */
    private final List<String> f3913c = Collections.EMPTY_LIST;
    /* renamed from: d */
    private final List<String> f3914d = Collections.EMPTY_LIST;
    /* renamed from: e */
    private final List<String> f3915e = Collections.EMPTY_LIST;
    /* renamed from: f */
    private final List<String> f3916f = Collections.EMPTY_LIST;

    private apm() {
    }

    /* renamed from: a */
    public static apm m4855a() {
        synchronized (f3911a) {
            if (f3912b == null) {
                f3912b = new apm();
            }
        }
        return f3912b;
    }

    /* renamed from: a */
    private boolean m4856a(Context context, Intent intent) {
        ComponentName component = intent.getComponent();
        return component == null ? false : aps.m4873a(context, component.getPackageName());
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: a */
    public void m4857a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    /* renamed from: a */
    public void m4858a(Context context, ServiceConnection serviceConnection, String str, Intent intent) {
    }

    /* renamed from: a */
    public boolean m4859a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m4860a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: a */
    public boolean m4860a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        if (!m4856a(context, intent)) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }

    /* renamed from: b */
    public void m4861b(Context context, ServiceConnection serviceConnection) {
    }
}
