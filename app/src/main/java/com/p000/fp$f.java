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
/* renamed from: fp$f */
class fp$f extends fp$e {
    fp$f() {
    }

    /* renamed from: a */
    public void mo4719a(Drawable drawable, float f, float f2) {
        fv.m30260a(drawable, f, f2);
    }

    /* renamed from: a */
    public void mo4721a(Drawable drawable, int i, int i2, int i3, int i4) {
        fv.m30262a(drawable, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo4720a(Drawable drawable, int i) {
        fv.m30261a(drawable, i);
    }

    /* renamed from: a */
    public void mo4722a(Drawable drawable, ColorStateList colorStateList) {
        fv.m30263a(drawable, colorStateList);
    }

    /* renamed from: a */
    public void mo4725a(Drawable drawable, Mode mode) {
        fv.m30266a(drawable, mode);
    }

    /* renamed from: c */
    public Drawable mo4729c(Drawable drawable) {
        return fv.m30259a(drawable);
    }

    /* renamed from: a */
    public void mo4723a(Drawable drawable, Theme theme) {
        fv.m30264a(drawable, theme);
    }

    /* renamed from: f */
    public boolean mo4732f(Drawable drawable) {
        return fv.m30267b(drawable);
    }

    /* renamed from: g */
    public ColorFilter mo4733g(Drawable drawable) {
        return fv.m30268c(drawable);
    }

    /* renamed from: h */
    public void mo4734h(Drawable drawable) {
        fv.m30269d(drawable);
    }

    /* renamed from: a */
    public void mo4724a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws IOException, XmlPullParserException {
        fv.m30265a(drawable, resources, xmlPullParser, attributeSet, theme);
    }
}
