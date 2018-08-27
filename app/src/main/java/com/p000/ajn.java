package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import p000.bgf.C0212a;

@bhd
/* renamed from: ajn */
public final class ajn extends C0212a implements ServiceConnection {
    /* renamed from: a */
    aji f1704a;
    /* renamed from: b */
    private boolean f1705b = false;
    /* renamed from: c */
    private Context f1706c;
    /* renamed from: d */
    private int f1707d;
    /* renamed from: e */
    private Intent f1708e;
    /* renamed from: f */
    private ajm f1709f;
    /* renamed from: g */
    private String f1710g;

    public ajn(Context context, String str, boolean z, int i, Intent intent, ajm ajm) {
        this.f1710g = str;
        this.f1707d = i;
        this.f1708e = intent;
        this.f1705b = z;
        this.f1706c = context;
        this.f1709f = ajm;
    }

    /* renamed from: a */
    public boolean mo221a() {
        return this.f1705b;
    }

    /* renamed from: b */
    public String mo222b() {
        return this.f1710g;
    }

    /* renamed from: c */
    public Intent mo223c() {
        return this.f1708e;
    }

    /* renamed from: d */
    public int mo224d() {
        return this.f1707d;
    }

    /* renamed from: e */
    public void mo225e() {
        int a = ako.m2357s().m1905a(this.f1708e);
        if (this.f1707d == -1 && a == 0) {
            this.f1704a = new aji(this.f1706c);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            apm.m4855a().m4859a(this.f1706c, intent, (ServiceConnection) this, 1);
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        bky.m9010d("In-app billing service connected.");
        this.f1704a.m1857a(iBinder);
        String b = ako.m2357s().m1911b(ako.m2357s().m1910b(this.f1708e));
        if (b != null) {
            if (this.f1704a.m1854a(this.f1706c.getPackageName(), b) == 0) {
                ajo.m1896a(this.f1706c).m1901a(this.f1709f);
            }
            apm.m4855a().m4857a(this.f1706c, (ServiceConnection) this);
            this.f1704a.m1856a();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        bky.m9010d("In-app billing service disconnected.");
        this.f1704a.m1856a();
    }
}
