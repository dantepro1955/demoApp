package com.p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: DrawableCompat */
/* renamed from: fp$a */
class fp$a implements fp$b {
    fp$a() {
    }

    /* renamed from: a */
    public void mo4718a(Drawable drawable) {
    }

    /* renamed from: a */
    public void mo4726a(Drawable drawable, boolean z) {
    }

    /* renamed from: b */
    public boolean mo4727b(Drawable drawable) {
        return false;
    }

    /* renamed from: a */
    public void mo4719a(Drawable drawable, float f, float f2) {
    }

    /* renamed from: a */
    public void mo4721a(Drawable drawable, int i, int i2, int i3, int i4) {
    }

    /* renamed from: a */
    public void mo4720a(Drawable drawable, int i) {
        fr.m30247a(drawable, i);
    }

    /* renamed from: a */
    public void mo4722a(Drawable drawable, ColorStateList colorStateList) {
        fr.m30248a(drawable, colorStateList);
    }

    /* renamed from: a */
    public void mo4725a(Drawable drawable, Mode mode) {
        fr.m30250a(drawable, mode);
    }

    /* renamed from: c */
    public Drawable mo4729c(Drawable drawable) {
        return fr.m30246a(drawable);
    }

    /* renamed from: b */
    public boolean mo4728b(Drawable drawable, int i) {
        return false;
    }

    /* renamed from: d */
    public int mo4730d(Drawable drawable) {
        return 0;
    }

    /* renamed from: e */
    public int mo4731e(Drawable drawable) {
        return 0;
    }

    /* renamed from: a */
    public void mo4723a(Drawable drawable, Theme theme) {
    }

    /* renamed from: f */
    public boolean mo4732f(Drawable drawable) {
        return false;
    }

    /* renamed from: g */
    public ColorFilter mo4733g(Drawable drawable) {
        return null;
    }

    /* renamed from: h */
    public void mo4734h(Drawable drawable) {
        drawable.clearColorFilter();
    }

    /* renamed from: a */
    public void mo4724a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws IOException, XmlPullParserException {
        fr.m30249a(drawable, resources, xmlPullParser, attributeSet, theme);
    }
}
