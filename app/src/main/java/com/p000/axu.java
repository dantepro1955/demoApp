package com.p000;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import p000.aqs.C0702a;
import p000.axv.C0875a;
import p000.axw.C0878a;

/* renamed from: axu */
public final class axu extends aqs<axw> {
    /* renamed from: a */
    private static final axu f4913a = new axu();

    private axu() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    /* renamed from: a */
    public static axv m6412a(String str, Context context, boolean z) {
        if (aqm.m4517b().mo565a(context) == 0) {
            axv b = f4913a.m6413b(str, context, z);
            if (b != null) {
                return b;
            }
        }
        return new axt(str, context, z);
    }

    /* renamed from: b */
    private axv m6413b(String str, Context context, boolean z) {
        IBinder a;
        aqq a2 = aqr.m4967a((Object) context);
        if (z) {
            try {
                a = ((axw) m4701a(context)).mo839a(str, a2);
            } catch (RemoteException e) {
                return null;
            } catch (C0702a e2) {
                return null;
            }
        }
        a = ((axw) m4701a(context)).mo840b(str, a2);
        return C0875a.m6398a(a);
    }

    /* renamed from: a */
    protected axw m6414a(IBinder iBinder) {
        return C0878a.m6432a(iBinder);
    }

    /* renamed from: b */
    protected /* synthetic */ Object mo589b(IBinder iBinder) {
        return m6414a(iBinder);
    }
}
