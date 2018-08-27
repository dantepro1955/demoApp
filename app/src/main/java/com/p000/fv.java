package com.p000;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@TargetApi(21)
/* compiled from: DrawableCompatLollipop */
/* renamed from: fv */
class fv {
    /* renamed from: a */
    public static void m30260a(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    /* renamed from: a */
    public static void m30262a(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m30261a(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    /* renamed from: a */
    public static void m30263a(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* renamed from: a */
    public static void m30266a(Drawable drawable, Mode mode) {
        drawable.setTintMode(mode);
    }

    /* renamed from: a */
    public static Drawable m30259a(Drawable drawable) {
        if (drawable instanceof gb) {
            return drawable;
        }
        return new ga(drawable);
    }

    /* renamed from: a */
    public static void m30264a(Drawable drawable, Theme theme) {
        drawable.applyTheme(theme);
    }

    /* renamed from: b */
    public static boolean m30267b(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    /* renamed from: c */
    public static ColorFilter m30268c(Drawable drawable) {
        return drawable.getColorFilter();
    }

    /* renamed from: d */
    public static void m30269d(Drawable drawable) {
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            fv.m30269d(((InsetDrawable) drawable).getDrawable());
        } else if (drawable instanceof fw) {
            fv.m30269d(((fw) drawable).mo4736a());
        } else if (drawable instanceof DrawableContainer) {
            DrawableContainerState drawableContainerState = (DrawableContainerState) ((DrawableContainer) drawable).getConstantState();
            if (drawableContainerState != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    Drawable child = drawableContainerState.getChild(i);
                    if (child != null) {
                        fv.m30269d(child);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m30265a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws IOException, XmlPullParserException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }
}
