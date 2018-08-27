package com.p000;

import android.app.Activity;
import android.os.IBinder;
import p000.bfw.C0205a;
import p000.bfy.C1158a;

@bhd
/* renamed from: bfv */
public final class bfv extends aqs<bfy> {
    public bfv() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* renamed from: a */
    public bfw m8206a(Activity activity) {
        try {
            return C0205a.m1745a(((bfy) m4701a(activity)).mo1157a(aqr.m4967a((Object) activity)));
        } catch (Throwable e) {
            bky.m9009c("Could not create remote AdOverlay.", e);
            return null;
        } catch (Throwable e2) {
            bky.m9009c("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    /* renamed from: a */
    protected bfy m8207a(IBinder iBinder) {
        return C1158a.m8224a(iBinder);
    }

    /* renamed from: b */
    protected /* synthetic */ Object mo589b(IBinder iBinder) {
        return m8207a(iBinder);
    }
}
