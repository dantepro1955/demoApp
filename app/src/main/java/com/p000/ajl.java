package com.p000;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import p000.bgd.C0211a;

@bhd
/* renamed from: ajl */
public class ajl extends C0211a implements ServiceConnection {
    /* renamed from: a */
    ajo f1692a;
    /* renamed from: b */
    private final Activity f1693b;
    /* renamed from: c */
    private Context f1694c;
    /* renamed from: d */
    private bgb f1695d;
    /* renamed from: e */
    private aji f1696e;
    /* renamed from: f */
    private ajm f1697f;
    /* renamed from: g */
    private ajq f1698g;
    /* renamed from: h */
    private ajr f1699h;
    /* renamed from: i */
    private String f1700i = null;

    public ajl(Activity activity) {
        this.f1693b = activity;
        this.f1692a = ajo.m1896a(this.f1693b.getApplicationContext());
    }

    /* renamed from: a */
    public void mo218a() {
        GInAppPurchaseManagerInfoParcel a = GInAppPurchaseManagerInfoParcel.m19356a(this.f1693b.getIntent());
        this.f1698g = a.f14524d;
        this.f1699h = a.f14521a;
        this.f1695d = a.f14522b;
        this.f1696e = new aji(this.f1693b.getApplicationContext());
        this.f1694c = a.f14523c;
        if (this.f1693b.getResources().getConfiguration().orientation == 2) {
            this.f1693b.setRequestedOrientation(ako.m2345g().mo1261a());
        } else {
            this.f1693b.setRequestedOrientation(ako.m2345g().mo1263b());
        }
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        apm.m4855a().m4859a(this.f1693b, intent, (ServiceConnection) this, 1);
    }

    /* renamed from: a */
    public void mo219a(int i, int i2, Intent intent) {
        if (i == 1001) {
            boolean z = false;
            try {
                int a = ako.m2357s().m1905a(intent);
                if (i2 == -1) {
                    ako.m2357s();
                    if (a == 0) {
                        if (this.f1699h.m1915a(this.f1700i, i2, intent)) {
                            z = true;
                        }
                        this.f1695d.mo217c(a);
                        this.f1693b.finish();
                        m1883a(this.f1695d.mo215a(), z, i2, intent);
                    }
                }
                this.f1692a.m1901a(this.f1697f);
                this.f1695d.mo217c(a);
                this.f1693b.finish();
                m1883a(this.f1695d.mo215a(), z, i2, intent);
            } catch (RemoteException e) {
                bky.m9011e("Fail to process purchase result.");
                this.f1693b.finish();
            } finally {
                this.f1700i = null;
            }
        }
    }

    /* renamed from: a */
    protected void m1883a(String str, boolean z, int i, Intent intent) {
        if (this.f1698g != null) {
            this.f1698g.mo266a(str, z, i, intent, this.f1697f);
        }
    }

    /* renamed from: b */
    public void mo220b() {
        apm.m4855a().m4857a(this.f1693b, (ServiceConnection) this);
        this.f1696e.m1856a();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Throwable e;
        this.f1696e.m1857a(iBinder);
        try {
            this.f1700i = this.f1699h.m1914a();
            Bundle a = this.f1696e.m1855a(this.f1693b.getPackageName(), this.f1695d.mo215a(), this.f1700i);
            PendingIntent pendingIntent = (PendingIntent) a.getParcelable("BUY_INTENT");
            if (pendingIntent == null) {
                int a2 = ako.m2357s().m1906a(a);
                this.f1695d.mo217c(a2);
                m1883a(this.f1695d.mo215a(), false, a2, null);
                this.f1693b.finish();
                return;
            }
            this.f1697f = new ajm(this.f1695d.mo215a(), this.f1700i);
            this.f1692a.m1903b(this.f1697f);
            this.f1693b.startIntentSenderForResult(pendingIntent.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        } catch (RemoteException e2) {
            e = e2;
            bky.m9009c("Error when connecting in-app billing service", e);
            this.f1693b.finish();
        } catch (SendIntentException e3) {
            e = e3;
            bky.m9009c("Error when connecting in-app billing service", e);
            this.f1693b.finish();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        bky.m9010d("In-app billing service disconnected.");
        this.f1696e.m1856a();
    }
}
