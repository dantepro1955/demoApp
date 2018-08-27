package com.p000;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import p000.aig.C0191a;

@bhd
/* renamed from: bcd */
public class bcd extends C0191a {
    /* renamed from: a */
    private final bcc f5569a;
    /* renamed from: b */
    private final Drawable f5570b;
    /* renamed from: c */
    private final Uri f5571c;
    /* renamed from: d */
    private final double f5572d;

    public bcd(bcc bcc) {
        Drawable drawable;
        double d;
        Uri uri = null;
        this.f5569a = bcc;
        try {
            aqq a = this.f5569a.mo921a();
            if (a != null) {
                drawable = (Drawable) aqr.m4968a(a);
                this.f5570b = drawable;
                uri = this.f5569a.mo922b();
                this.f5571c = uri;
                d = 1.0d;
                d = this.f5569a.mo923c();
                this.f5572d = d;
            }
        } catch (Throwable e) {
            bky.m9007b("Failed to get drawable.", e);
        }
        Object obj = uri;
        this.f5570b = drawable;
        try {
            uri = this.f5569a.mo922b();
        } catch (Throwable e2) {
            bky.m9007b("Failed to get uri.", e2);
        }
        this.f5571c = uri;
        d = 1.0d;
        try {
            d = this.f5569a.mo923c();
        } catch (Throwable e3) {
            bky.m9007b("Failed to get scale.", e3);
        }
        this.f5572d = d;
    }

    public Drawable getDrawable() {
        return this.f5570b;
    }

    public double getScale() {
        return this.f5572d;
    }

    public Uri getUri() {
        return this.f5571c;
    }
}
