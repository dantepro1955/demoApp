package com.p000;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;

@bhd
/* renamed from: axr */
public final class axr {
    /* renamed from: a */
    private final axv f4908a;

    public axr(String str, Context context, boolean z) {
        this.f4908a = axu.m6412a(str, context, z);
    }

    /* renamed from: a */
    public Uri m6383a(Uri uri, Context context) throws axs, RemoteException {
        aqq a = this.f4908a.mo827a(aqr.m4967a((Object) uri), aqr.m4967a((Object) context));
        if (a != null) {
            return (Uri) aqr.m4968a(a);
        }
        throw new axs();
    }

    /* renamed from: a */
    public void m6384a(MotionEvent motionEvent) throws RemoteException {
        this.f4908a.mo838d(aqr.m4967a((Object) motionEvent));
    }

    /* renamed from: b */
    public Uri m6385b(Uri uri, Context context) throws axs, RemoteException {
        aqq b = this.f4908a.mo835b(aqr.m4967a((Object) uri), aqr.m4967a((Object) context));
        if (b != null) {
            return (Uri) aqr.m4968a(b);
        }
        throw new axs();
    }
}
