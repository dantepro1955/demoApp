package com.p000;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import p000.fx.C5324a;

@TargetApi(21)
/* compiled from: DrawableWrapperLollipop */
/* renamed from: ga */
class ga extends fz {

    /* compiled from: DrawableWrapperLollipop */
    /* renamed from: ga$a */
    static class C5335a extends C5324a {
        C5335a(C5324a c5324a, Resources resources) {
            super(c5324a, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new ga(this, resources);
        }
    }

    ga(Drawable drawable) {
        super(drawable);
    }

    ga(C5324a c5324a, Resources resources) {
        super(c5324a, resources);
    }

    public void setHotspot(float f, float f2) {
        this.c.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.c.setHotspotBounds(i, i2, i3, i4);
    }

    public void getOutline(Outline outline) {
        this.c.getOutline(outline);
    }

    public Rect getDirtyBounds() {
        return this.c.getDirtyBounds();
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo4748c()) {
            super.setTintList(colorStateList);
        } else {
            this.c.setTintList(colorStateList);
        }
    }

    public void setTint(int i) {
        if (mo4748c()) {
            super.setTint(i);
        } else {
            this.c.setTint(i);
        }
    }

    public void setTintMode(Mode mode) {
        if (mo4748c()) {
            super.setTintMode(mode);
        } else {
            this.c.setTintMode(mode);
        }
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    /* renamed from: c */
    protected boolean mo4748c() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.c;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    C5324a mo4741b() {
        return new C5335a(this.b, null);
    }
}
