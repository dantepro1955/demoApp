package com.p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;

/* renamed from: bny */
class bny extends BroadcastReceiver {
    /* renamed from: a */
    static final String f7191a = bny.class.getName();
    /* renamed from: b */
    private final bmw f7192b;
    /* renamed from: c */
    private boolean f7193c;
    /* renamed from: d */
    private boolean f7194d;

    bny(bmw bmw) {
        aoi.m4679a((Object) bmw);
        this.f7192b = bmw;
    }

    /* renamed from: g */
    private void m10044g() {
        m10046i();
        m10047j();
    }

    /* renamed from: h */
    private Context m10045h() {
        return this.f7192b.m9767b();
    }

    /* renamed from: i */
    private bnx m10046i() {
        return this.f7192b.m9771f();
    }

    /* renamed from: j */
    private bmr m10047j() {
        return this.f7192b.m9774i();
    }

    /* renamed from: a */
    public void m10048a() {
        m10044g();
        if (!this.f7193c) {
            Context h = m10045h();
            h.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
            intentFilter.addCategory(h.getPackageName());
            h.registerReceiver(this, intentFilter);
            this.f7194d = m10053f();
            this.f7192b.m9771f().zza("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f7194d));
            this.f7193c = true;
        }
    }

    /* renamed from: b */
    public void m10049b() {
        if (m10051d()) {
            this.f7192b.m9771f().zzbP("Unregistering connectivity change receiver");
            this.f7193c = false;
            this.f7194d = false;
            try {
                m10045h().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                m10046i().zze("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    /* renamed from: c */
    public void m10050c() {
        int i = VERSION.SDK_INT;
        Context h = m10045h();
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(h.getPackageName());
        intent.putExtra(f7191a, true);
        h.sendOrderedBroadcast(intent, null);
    }

    /* renamed from: d */
    public boolean m10051d() {
        return this.f7193c;
    }

    /* renamed from: e */
    public boolean m10052e() {
        if (!this.f7193c) {
            this.f7192b.m9771f().zzbS("Connectivity unknown. Receiver not registered");
        }
        return this.f7194d;
    }

    /* renamed from: f */
    protected boolean m10053f() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) m10045h().getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (SecurityException e) {
            return false;
        }
    }

    public void onReceive(Context context, Intent intent) {
        m10044g();
        String action = intent.getAction();
        this.f7192b.m9771f().zza("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean f = m10053f();
            if (this.f7194d != f) {
                this.f7194d = f;
                m10047j().m9757a(f);
            }
        } else if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.f7192b.m9771f().zzd("NetworkBroadcastReceiver received unknown action", action);
        } else if (!intent.hasExtra(f7191a)) {
            m10047j().m9761e();
        }
    }
}
