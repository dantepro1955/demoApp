package com.p000;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

@TargetApi(9)
/* compiled from: DrawableWrapperGingerbread */
/* renamed from: fx */
class fx extends Drawable implements Callback, fw, gb {
    /* renamed from: a */
    static final Mode f23720a = Mode.SRC_IN;
    /* renamed from: b */
    C5324a f23721b;
    /* renamed from: c */
    Drawable f23722c;
    /* renamed from: d */
    private int f23723d;
    /* renamed from: e */
    private Mode f23724e;
    /* renamed from: f */
    private boolean f23725f;
    /* renamed from: g */
    private boolean f23726g;

    /* compiled from: DrawableWrapperGingerbread */
    /* renamed from: fx$a */
    public static abstract class C5324a extends ConstantState {
        /* renamed from: a */
        int f23716a;
        /* renamed from: b */
        ConstantState f23717b;
        /* renamed from: c */
        ColorStateList f23718c = null;
        /* renamed from: d */
        Mode f23719d = fx.f23720a;

        public abstract Drawable newDrawable(Resources resources);

        C5324a(C5324a c5324a, Resources resources) {
            if (c5324a != null) {
                this.f23716a = c5324a.f23716a;
                this.f23717b = c5324a.f23717b;
                this.f23718c = c5324a.f23718c;
                this.f23719d = c5324a.f23719d;
            }
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public int getChangingConfigurations() {
            return (this.f23717b != null ? this.f23717b.getChangingConfigurations() : 0) | this.f23716a;
        }

        /* renamed from: a */
        boolean m30272a() {
            return this.f23717b != null;
        }
    }

    /* compiled from: DrawableWrapperGingerbread */
    /* renamed from: fx$b */
    static class C5325b extends C5324a {
        C5325b(C5324a c5324a, Resources resources) {
            super(c5324a, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new fx(this, resources);
        }
    }

    fx(C5324a c5324a, Resources resources) {
        this.f23721b = c5324a;
        m30273a(resources);
    }

    fx(Drawable drawable) {
        this.f23721b = mo4741b();
        mo4737a(drawable);
    }

    /* renamed from: a */
    private void m30273a(Resources resources) {
        if (this.f23721b != null && this.f23721b.f23717b != null) {
            mo4737a(m30276a(this.f23721b.f23717b, resources));
        }
    }

    /* renamed from: a */
    protected Drawable m30276a(ConstantState constantState, Resources resources) {
        return constantState.newDrawable(resources);
    }

    public void draw(Canvas canvas) {
        this.f23722c.draw(canvas);
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f23722c != null) {
            this.f23722c.setBounds(rect);
        }
    }

    public void setChangingConfigurations(int i) {
        this.f23722c.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return ((this.f23721b != null ? this.f23721b.getChangingConfigurations() : 0) | super.getChangingConfigurations()) | this.f23722c.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.f23722c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f23722c.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.f23722c.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f23722c.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        ColorStateList colorStateList = (!mo4748c() || this.f23721b == null) ? null : this.f23721b.f23718c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f23722c.isStateful();
    }

    public boolean setState(int[] iArr) {
        return m30274a(iArr) || this.f23722c.setState(iArr);
    }

    public int[] getState() {
        return this.f23722c.getState();
    }

    public Drawable getCurrent() {
        return this.f23722c.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f23722c.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.f23722c.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f23722c.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f23722c.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f23722c.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f23722c.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f23722c.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.f23722c.getPadding(rect);
    }

    public ConstantState getConstantState() {
        if (this.f23721b == null || !this.f23721b.m30272a()) {
            return null;
        }
        this.f23721b.f23716a = getChangingConfigurations();
        return this.f23721b;
    }

    public Drawable mutate() {
        if (!this.f23726g && super.mutate() == this) {
            this.f23721b = mo4741b();
            if (this.f23722c != null) {
                this.f23722c.mutate();
            }
            if (this.f23721b != null) {
                this.f23721b.f23717b = this.f23722c != null ? this.f23722c.getConstantState() : null;
            }
            this.f23726g = true;
        }
        return this;
    }

    /* renamed from: b */
    C5324a mo4741b() {
        return new C5325b(this.f23721b, null);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    protected boolean onLevelChange(int i) {
        return this.f23722c.setLevel(i);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f23721b.f23718c = colorStateList;
        m30274a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f23721b.f23719d = mode;
        m30274a(getState());
    }

    /* renamed from: a */
    private boolean m30274a(int[] iArr) {
        if (!mo4748c()) {
            return false;
        }
        ColorStateList colorStateList = this.f23721b.f23718c;
        Mode mode = this.f23721b.f23719d;
        if (colorStateList == null || mode == null) {
            this.f23725f = false;
            clearColorFilter();
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f23725f && colorForState == this.f23723d && mode == this.f23724e) {
            return false;
        }
        setColorFilter(colorForState, mode);
        this.f23723d = colorForState;
        this.f23724e = mode;
        this.f23725f = true;
        return true;
    }

    /* renamed from: a */
    public final Drawable mo4736a() {
        return this.f23722c;
    }

    /* renamed from: a */
    public final void mo4737a(Drawable drawable) {
        if (this.f23722c != null) {
            this.f23722c.setCallback(null);
        }
        this.f23722c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f23721b != null) {
                this.f23721b.f23717b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: c */
    protected boolean mo4748c() {
        return true;
    }
}
