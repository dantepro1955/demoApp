package com.p000;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p000.atr.C0800a;

/* renamed from: awk */
public class awk extends axp {
    public awk(avx avx, String str, String str2, C0800a c0800a, int i, int i2) {
        super(avx, str, str2, c0800a, i, i2);
    }

    /* renamed from: c */
    private void m6158c() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.e) {
            this.e.aa = (String) this.f.invoke(null, new Object[]{this.b.m6096b()});
        }
    }

    /* renamed from: d */
    private void m6159d() {
        AdvertisingIdClient o = this.b.m6109o();
        if (o != null) {
            try {
                Info info = o.getInfo();
                String a = avz.m6116a(info.getId());
                if (a != null) {
                    synchronized (this.e) {
                        this.e.aa = a;
                        this.e.ac = Boolean.valueOf(info.isLimitAdTrackingEnabled());
                        this.e.ab = Integer.valueOf(5);
                    }
                }
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    protected void mo801a() throws IllegalAccessException, InvocationTargetException {
        if (this.b.m6102h()) {
            m6159d();
        } else {
            m6158c();
        }
    }
}
