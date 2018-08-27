package com.p000;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.zzeg;
import p000.aqs.C0702a;
import p000.azx.C0217a;
import p000.azy.C0949a;

@bhd
/* renamed from: azi */
public class azi extends aqs<azy> {
    public azi() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* renamed from: a */
    public azx m6722a(Context context, zzeg zzeg, String str, bex bex, int i) {
        Throwable e;
        try {
            return C0217a.m1945a(((azy) m4701a(context)).mo878a(aqr.m4967a((Object) context), zzeg, str, bex, 10260000, i));
        } catch (RemoteException e2) {
            e = e2;
            bky.m9004a("Could not create remote AdManager.", e);
            return null;
        } catch (C0702a e3) {
            e = e3;
            bky.m9004a("Could not create remote AdManager.", e);
            return null;
        }
    }

    /* renamed from: a */
    protected azy m6723a(IBinder iBinder) {
        return C0949a.m6846a(iBinder);
    }

    /* renamed from: b */
    protected /* synthetic */ Object mo589b(IBinder iBinder) {
        return m6723a(iBinder);
    }
}
