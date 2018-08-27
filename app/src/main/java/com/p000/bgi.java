package com.p000;

import android.app.Activity;
import android.os.IBinder;
import p000.bgd.C0211a;
import p000.bge.C1163a;

@bhd
/* renamed from: bgi */
public final class bgi extends aqs<bge> {
    public bgi() {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    /* renamed from: a */
    public bgd m8296a(Activity activity) {
        try {
            return C0211a.m1880a(((bge) m4701a(activity)).mo1173a(aqr.m4967a((Object) activity)));
        } catch (Throwable e) {
            bky.m9009c("Could not create remote InAppPurchaseManager.", e);
            return null;
        } catch (Throwable e2) {
            bky.m9009c("Could not create remote InAppPurchaseManager.", e2);
            return null;
        }
    }

    /* renamed from: a */
    protected bge m8297a(IBinder iBinder) {
        return C1163a.m8284a(iBinder);
    }

    /* renamed from: b */
    protected /* synthetic */ Object mo589b(IBinder iBinder) {
        return m8297a(iBinder);
    }
}
