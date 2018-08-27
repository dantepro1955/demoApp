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
/* renamed from: fp$b */
interface fp$b {
    /* renamed from: a */
    void mo4718a(Drawable drawable);

    /* renamed from: a */
    void mo4719a(Drawable drawable, float f, float f2);

    /* renamed from: a */
    void mo4720a(Drawable drawable, int i);

    /* renamed from: a */
    void mo4721a(Drawable drawable, int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo4722a(Drawable drawable, ColorStateList colorStateList);

    /* renamed from: a */
    void mo4723a(Drawable drawable, Theme theme);

    /* renamed from: a */
    void mo4724a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws IOException, XmlPullParserException;

    /* renamed from: a */
    void mo4725a(Drawable drawable, Mode mode);

    /* renamed from: a */
    void mo4726a(Drawable drawable, boolean z);

    /* renamed from: b */
    boolean mo4727b(Drawable drawable);

    /* renamed from: b */
    boolean mo4728b(Drawable drawable, int i);

    /* renamed from: c */
    Drawable mo4729c(Drawable drawable);

    /* renamed from: d */
    int mo4730d(Drawable drawable);

    /* renamed from: e */
    int mo4731e(Drawable drawable);

    /* renamed from: f */
    boolean mo4732f(Drawable drawable);

    /* renamed from: g */
    ColorFilter mo4733g(Drawable drawable);

    /* renamed from: h */
    void mo4734h(Drawable drawable);
}
