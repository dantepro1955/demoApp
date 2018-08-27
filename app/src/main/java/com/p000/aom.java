package com.p000;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.common.internal.zzah;
import p000.apk.C0690a;
import p000.aqs.C0702a;

/* renamed from: aom */
public final class aom extends aqs<apk> {
    /* renamed from: a */
    private static final aom f3822a = new aom();

    private aom() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: a */
    public static View m4703a(Context context, int i, int i2) throws C0702a {
        return f3822a.m4704b(context, i, i2);
    }

    /* renamed from: b */
    private View m4704b(Context context, int i, int i2) throws C0702a {
        try {
            zzah zzah = new zzah(i, i2, null);
            return (View) aqr.m4968a(((apk) m4701a(context)).mo605a(aqr.m4967a((Object) context), zzah));
        } catch (Throwable e) {
            throw new C0702a("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    /* renamed from: a */
    public apk m4705a(IBinder iBinder) {
        return C0690a.m4852a(iBinder);
    }

    /* renamed from: b */
    public /* synthetic */ Object mo589b(IBinder iBinder) {
        return m4705a(iBinder);
    }
}
