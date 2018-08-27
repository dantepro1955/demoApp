package com.p000;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p000.fx.C5324a;

@TargetApi(19)
/* compiled from: DrawableWrapperKitKat */
/* renamed from: fz */
class fz extends fy {

    /* compiled from: DrawableWrapperKitKat */
    /* renamed from: fz$a */
    static class C5327a extends C5324a {
        C5327a(C5324a c5324a, Resources resources) {
            super(c5324a, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new fz(this, resources);
        }
    }

    fz(Drawable drawable) {
        super(drawable);
    }

    fz(C5324a c5324a, Resources resources) {
        super(c5324a, resources);
    }

    public void setAutoMirrored(boolean z) {
        this.c.setAutoMirrored(z);
    }

    public boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }

    /* renamed from: b */
    C5324a mo4741b() {
        return new C5327a(this.b, null);
    }
}
