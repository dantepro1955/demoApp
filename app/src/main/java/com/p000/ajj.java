package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@bhd
/* renamed from: ajj */
public class ajj extends bkb implements ServiceConnection {
    /* renamed from: a */
    private final Object f1680a;
    /* renamed from: b */
    private boolean f1681b;
    /* renamed from: c */
    private Context f1682c;
    /* renamed from: d */
    private bgg f1683d;
    /* renamed from: e */
    private aji f1684e;
    /* renamed from: f */
    private ajo f1685f;
    /* renamed from: g */
    private List<ajm> f1686g;
    /* renamed from: h */
    private ajr f1687h;

    public ajj(Context context, bgg bgg, ajr ajr) {
        this(context, bgg, ajr, new aji(context), ajo.m1896a(context.getApplicationContext()));
    }

    ajj(Context context, bgg bgg, ajr ajr, aji aji, ajo ajo) {
        this.f1680a = new Object();
        this.f1681b = false;
        this.f1686g = null;
        this.f1682c = context;
        this.f1683d = bgg;
        this.f1687h = ajr;
        this.f1684e = aji;
        this.f1685f = ajo;
        this.f1686g = this.f1685f.m1900a(10);
    }

    /* renamed from: a */
    private void m1860a(long j) {
        do {
            if (!m1862b(j)) {
                bkc.m9012a("Timeout waiting for pending transaction to be processed.");
            }
        } while (!this.f1681b);
    }

    /* renamed from: b */
    private boolean m1862b(long j) {
        long elapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.f1680a.wait(elapsedRealtime);
        } catch (InterruptedException e) {
            bky.m9011e("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    /* renamed from: a */
    public void mo196a() {
        synchronized (this.f1680a) {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            apm.m4855a().m4859a(this.f1682c, intent, (ServiceConnection) this, 1);
            m1860a(SystemClock.elapsedRealtime());
            apm.m4855a().m4857a(this.f1682c, (ServiceConnection) this);
            this.f1684e.m1856a();
        }
    }

    /* renamed from: a */
    protected void m1865a(final ajm ajm, String str, String str2) {
        final Intent intent = new Intent();
        ako.m2357s();
        intent.putExtra("RESPONSE_CODE", 0);
        ako.m2357s();
        intent.putExtra("INAPP_PURCHASE_DATA", str);
        ako.m2357s();
        intent.putExtra("INAPP_DATA_SIGNATURE", str2);
        bkg.f6710a.post(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ ajj f1679c;

            public void run() {
                try {
                    if (this.f1679c.f1687h.m1915a(ajm.f1702b, -1, intent)) {
                        this.f1679c.f1683d.mo1174a(new ajn(this.f1679c.f1682c, ajm.f1703c, true, -1, intent, ajm));
                    } else {
                        this.f1679c.f1683d.mo1174a(new ajn(this.f1679c.f1682c, ajm.f1703c, false, -1, intent, ajm));
                    }
                } catch (RemoteException e) {
                    bky.m9011e("Fail to verify and dispatch pending transaction");
                }
            }
        });
    }

    /* renamed from: b */
    public void mo197b() {
        synchronized (this.f1680a) {
            apm.m4855a().m4857a(this.f1682c, (ServiceConnection) this);
            this.f1684e.m1856a();
        }
    }

    protected void h_() {
        if (!this.f1686g.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (ajm ajm : this.f1686g) {
                hashMap.put(ajm.f1703c, ajm);
            }
            String str = null;
            while (true) {
                Bundle b = this.f1684e.m1858b(this.f1682c.getPackageName(), str);
                if (b == null || ako.m2357s().m1906a(b) != 0) {
                    break;
                }
                ArrayList stringArrayList = b.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList stringArrayList2 = b.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList stringArrayList3 = b.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                String string = b.getString("INAPP_CONTINUATION_TOKEN");
                for (int i = 0; i < stringArrayList.size(); i++) {
                    if (hashMap.containsKey(stringArrayList.get(i))) {
                        str = (String) stringArrayList.get(i);
                        String str2 = (String) stringArrayList2.get(i);
                        String str3 = (String) stringArrayList3.get(i);
                        ajm ajm2 = (ajm) hashMap.get(str);
                        if (ajm2.f1702b.equals(ako.m2357s().m1907a(str2))) {
                            m1865a(ajm2, str2, str3);
                            hashMap.remove(str);
                        }
                    }
                }
                if (string == null || hashMap.isEmpty()) {
                    break;
                }
                str = string;
            }
            for (String str4 : hashMap.keySet()) {
                this.f1685f.m1901a((ajm) hashMap.get(str4));
            }
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f1680a) {
            this.f1684e.m1857a(iBinder);
            h_();
            this.f1681b = true;
            this.f1680a.notify();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        bky.m9010d("In-app billing service disconnected.");
        this.f1684e.m1856a();
    }
}
