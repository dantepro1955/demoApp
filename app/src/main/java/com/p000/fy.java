package com.p000;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p000.fx.C5324a;

@TargetApi(11)
/* compiled from: DrawableWrapperHoneycomb */
/* renamed from: fy */
class fy extends fx {

    /* compiled from: DrawableWrapperHoneycomb */
    /* renamed from: fy$a */
    static class C5326a extends C5324a {
        C5326a(C5324a c5324a, Resources resources) {
            super(c5324a, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new fy(this, resources);
        }
    }

    fy(Drawable drawable) {
        super(drawable);
    }

    fy(C5324a c5324a, Resources resources) {
        super(c5324a, resources);
    }

    public void jumpToCurrentState() {
        this.c.jumpToCurrentState();
    }

    /* renamed from: b */
    C5324a mo4741b() {
        return new C5326a(this.b, null);
    }
}
