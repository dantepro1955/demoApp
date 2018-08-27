package com.p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: DrawableCompat */
/* renamed from: fp */
public final class fp {
    /* renamed from: a */
    static final fp$b f16861a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            f16861a = new fp$g();
        } else if (i >= 21) {
            f16861a = new fp$f();
        } else if (i >= 19) {
            f16861a = new fp$e();
        } else if (i >= 17) {
            f16861a = new fp$d();
        } else if (i >= 11) {
            f16861a = new fp$c();
        } else {
            f16861a = new fp$a();
        }
    }

    /* renamed from: a */
    public static void m21144a(Drawable drawable) {
        f16861a.a(drawable);
    }

    /* renamed from: a */
    public static void m21152a(Drawable drawable, boolean z) {
        f16861a.a(drawable, z);
    }

    /* renamed from: b */
    public static boolean m21153b(Drawable drawable) {
        return f16861a.b(drawable);
    }

    /* renamed from: a */
    public static void m21145a(Drawable drawable, float f, float f2) {
        f16861a.a(drawable, f, f2);
    }

    /* renamed from: a */
    public static void m21147a(Drawable drawable, int i, int i2, int i3, int i4) {
        f16861a.a(drawable, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m21146a(Drawable drawable, int i) {
        f16861a.a(drawable, i);
    }

    /* renamed from: a */
    public static void m21148a(Drawable drawable, ColorStateList colorStateList) {
        f16861a.a(drawable, colorStateList);
    }

    /* renamed from: a */
    public static void m21151a(Drawable drawable, Mode mode) {
        f16861a.a(drawable, mode);
    }

    /* renamed from: c */
    public static int m21155c(Drawable drawable) {
        return f16861a.e(drawable);
    }

    /* renamed from: a */
    public static void m21149a(Drawable drawable, Theme theme) {
        f16861a.a(drawable, theme);
    }

    /* renamed from: d */
    public static boolean m21156d(Drawable drawable) {
        return f16861a.f(drawable);
    }

    /* renamed from: e */
    public static ColorFilter m21157e(Drawable drawable) {
        return f16861a.g(drawable);
    }

    /* renamed from: f */
    public static void m21158f(Drawable drawable) {
        f16861a.h(drawable);
    }

    /* renamed from: a */
    public static void m21150a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        f16861a.a(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: g */
    public static Drawable m21159g(Drawable drawable) {
        return f16861a.c(drawable);
    }

    /* renamed from: h */
    public static <T extends Drawable> T m21160h(Drawable drawable) {
        if (drawable instanceof fw) {
            return ((fw) drawable).a();
        }
        return drawable;
    }

    /* renamed from: b */
    public static boolean m21154b(Drawable drawable, int i) {
        return f16861a.b(drawable, i);
    }

    /* renamed from: i */
    public static int m21161i(Drawable drawable) {
        return f16861a.d(drawable);
    }
}
