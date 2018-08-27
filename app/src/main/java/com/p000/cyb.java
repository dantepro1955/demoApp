package com.p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;

/* compiled from: NonViewAware */
/* renamed from: cyb */
public class cyb implements cxz {
    /* renamed from: a */
    protected final String f20666a;
    /* renamed from: b */
    protected final cxm f20667b;
    /* renamed from: c */
    protected final cxp f20668c;

    public cyb(String str, cxm cxm, cxp cxp) {
        if (cxm == null) {
            throw new IllegalArgumentException("imageSize must not be null");
        } else if (cxp == null) {
            throw new IllegalArgumentException("scaleType must not be null");
        } else {
            this.f20666a = str;
            this.f20667b = cxm;
            this.f20668c = cxp;
        }
    }

    /* renamed from: a */
    public int mo4223a() {
        return this.f20667b.m25538a();
    }

    /* renamed from: b */
    public int mo4226b() {
        return this.f20667b.m25539b();
    }

    /* renamed from: c */
    public cxp mo4227c() {
        return this.f20668c;
    }

    /* renamed from: d */
    public View mo4228d() {
        return null;
    }

    /* renamed from: e */
    public boolean mo4229e() {
        return false;
    }

    /* renamed from: f */
    public int mo4230f() {
        return TextUtils.isEmpty(this.f20666a) ? super.hashCode() : this.f20666a.hashCode();
    }

    /* renamed from: a */
    public boolean mo4225a(Drawable drawable) {
        return true;
    }

    /* renamed from: a */
    public boolean mo4224a(Bitmap bitmap) {
        return true;
    }
}
