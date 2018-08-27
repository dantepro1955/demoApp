package com.p000;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import p000.bcc.C0995a;

@bhd
/* renamed from: bbr */
public class bbr extends C0995a {
    /* renamed from: a */
    private final Drawable f5474a;
    /* renamed from: b */
    private final Uri f5475b;
    /* renamed from: c */
    private final double f5476c;

    public bbr(Drawable drawable, Uri uri, double d) {
        this.f5474a = drawable;
        this.f5475b = uri;
        this.f5476c = d;
    }

    /* renamed from: a */
    public aqq mo921a() throws RemoteException {
        return aqr.m4967a(this.f5474a);
    }

    /* renamed from: b */
    public Uri mo922b() throws RemoteException {
        return this.f5475b;
    }

    /* renamed from: c */
    public double mo923c() {
        return this.f5476c;
    }
}
