package com.p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* compiled from: DrawableWrapper */
/* renamed from: nc */
public class nc extends Drawable implements Callback {
    /* renamed from: a */
    private Drawable f24692a;

    public nc(Drawable drawable) {
        m32946a(drawable);
    }

    public void draw(Canvas canvas) {
        this.f24692a.draw(canvas);
    }

    protected void onBoundsChange(Rect rect) {
        this.f24692a.setBounds(rect);
    }

    public void setChangingConfigurations(int i) {
        this.f24692a.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return this.f24692a.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.f24692a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f24692a.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.f24692a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f24692a.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        return this.f24692a.isStateful();
    }

    public boolean setState(int[] iArr) {
        return this.f24692a.setState(iArr);
    }

    public int[] getState() {
        return this.f24692a.getState();
    }

    public void jumpToCurrentState() {
        fp.a(this.f24692a);
    }

    public Drawable getCurrent() {
        return this.f24692a.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f24692a.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.f24692a.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f24692a.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f24692a.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f24692a.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f24692a.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f24692a.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.f24692a.getPadding(rect);
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
        return this.f24692a.setLevel(i);
    }

    public void setAutoMirrored(boolean z) {
        fp.a(this.f24692a, z);
    }

    public boolean isAutoMirrored() {
        return fp.b(this.f24692a);
    }

    public void setTint(int i) {
        fp.a(this.f24692a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        fp.a(this.f24692a, colorStateList);
    }

    public void setTintMode(Mode mode) {
        fp.a(this.f24692a, mode);
    }

    public void setHotspot(float f, float f2) {
        fp.a(this.f24692a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        fp.a(this.f24692a, i, i2, i3, i4);
    }

    /* renamed from: b */
    public Drawable m32947b() {
        return this.f24692a;
    }

    /* renamed from: a */
    public void m32946a(Drawable drawable) {
        if (this.f24692a != null) {
            this.f24692a.setCallback(null);
        }
        this.f24692a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }
}
