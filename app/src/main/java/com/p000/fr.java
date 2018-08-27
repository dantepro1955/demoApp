package com.p000;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@TargetApi(9)
/* compiled from: DrawableCompatBase */
/* renamed from: fr */
class fr {
    /* renamed from: a */
    public static void m30247a(Drawable drawable, int i) {
        if (drawable instanceof gb) {
            ((gb) drawable).setTint(i);
        }
    }

    /* renamed from: a */
    public static void m30248a(Drawable drawable, ColorStateList colorStateList) {
        if (drawable instanceof gb) {
            ((gb) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m30250a(Drawable drawable, Mode mode) {
        if (drawable instanceof gb) {
            ((gb) drawable).setTintMode(mode);
        }
    }

    /* renamed from: a */
    public static Drawable m30246a(Drawable drawable) {
        if (drawable instanceof gb) {
            return drawable;
        }
        return new fx(drawable);
    }

    /* renamed from: a */
    public static void m30249a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws IOException, XmlPullParserException {
        drawable.inflate(resources, xmlPullParser, attributeSet);
    }
}
