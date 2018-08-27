package com.p000;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import p000.aqs.C0702a;
import p000.bce.C0970a;
import p000.bcf.C1020a;

@bhd
/* renamed from: bcp */
public class bcp extends aqs<bcf> {
    public bcp() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* renamed from: a */
    public bce m7501a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        Throwable e;
        try {
            return C0970a.m7028a(((bcf) m4701a(context)).mo979a(aqr.m4967a((Object) context), aqr.m4967a((Object) frameLayout), aqr.m4967a((Object) frameLayout2), 10260000));
        } catch (RemoteException e2) {
            e = e2;
            bky.m9009c("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (C0702a e3) {
            e = e3;
            bky.m9009c("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    /* renamed from: a */
    protected bcf m7502a(IBinder iBinder) {
        return C1020a.m7432a(iBinder);
    }

    /* renamed from: b */
    protected /* synthetic */ Object mo589b(IBinder iBinder) {
        return m7502a(iBinder);
    }
}
