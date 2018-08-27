package com.p000;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* compiled from: VectorDrawableCommon */
/* renamed from: ba */
abstract class ba extends Drawable implements gb {
    /* renamed from: b */
    Drawable f4812b;

    ba() {
    }

    /* renamed from: a */
    protected static TypedArray m6259a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public void setColorFilter(int i, Mode mode) {
        if (this.f4812b != null) {
            this.f4812b.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public ColorFilter getColorFilter() {
        if (this.f4812b != null) {
            return fp.m21157e(this.f4812b);
        }
        return null;
    }

    protected boolean onLevelChange(int i) {
        if (this.f4812b != null) {
            return this.f4812b.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f4812b != null) {
            this.f4812b.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f4812b != null) {
            fp.m21145a(this.f4812b, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f4812b != null) {
            fp.m21147a(this.f4812b, i, i2, i3, i4);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f4812b != null) {
            this.f4812b.setFilterBitmap(z);
        }
    }

    public void jumpToCurrentState() {
        if (this.f4812b != null) {
            fp.m21144a(this.f4812b);
        }
    }

    public void applyTheme(Theme theme) {
        if (this.f4812b != null) {
            fp.m21149a(this.f4812b, theme);
        }
    }

    public void clearColorFilter() {
        if (this.f4812b != null) {
            this.f4812b.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        if (this.f4812b != null) {
            return this.f4812b.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumWidth() {
        if (this.f4812b != null) {
            return this.f4812b.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int getMinimumHeight() {
        if (this.f4812b != null) {
            return this.f4812b.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        if (this.f4812b != null) {
            return this.f4812b.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public int[] getState() {
        if (this.f4812b != null) {
            return this.f4812b.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        if (this.f4812b != null) {
            return this.f4812b.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void setChangingConfigurations(int i) {
        if (this.f4812b != null) {
            this.f4812b.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public boolean setState(int[] iArr) {
        if (this.f4812b != null) {
            return this.f4812b.setState(iArr);
        }
        return super.setState(iArr);
    }
}
