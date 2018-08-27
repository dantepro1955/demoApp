package com.p000;

import android.content.Context;
import android.os.IBinder;
import p000.azv.C0247a;
import p000.azw.C0946a;

@bhd
/* renamed from: azh */
public final class azh extends aqs<azw> {
    public azh() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* renamed from: a */
    public azv m6719a(Context context, String str, bex bex) {
        try {
            return C0247a.m2155a(((azw) m4701a(context)).mo876a(aqr.m4967a((Object) context), str, bex, 10260000));
        } catch (Throwable e) {
            bky.m9009c("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (Throwable e2) {
            bky.m9009c("Could not create remote builder for AdLoader.", e2);
            return null;
        }
    }

    /* renamed from: a */
    protected azw m6720a(IBinder iBinder) {
        return C0946a.m6815a(iBinder);
    }

    /* renamed from: b */
    protected /* synthetic */ Object mo589b(IBinder iBinder) {
        return m6720a(iBinder);
    }
}
