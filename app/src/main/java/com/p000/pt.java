package com.p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourcesWrapper */
/* renamed from: pt */
class pt extends Resources {
    /* renamed from: a */
    private final Resources f25123a;

    public pt(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f25123a = resources;
    }

    public CharSequence getText(int i) throws NotFoundException {
        return this.f25123a.getText(i);
    }

    public CharSequence getQuantityText(int i, int i2) throws NotFoundException {
        return this.f25123a.getQuantityText(i, i2);
    }

    public String getString(int i) throws NotFoundException {
        return this.f25123a.getString(i);
    }

    public String getString(int i, Object... objArr) throws NotFoundException {
        return this.f25123a.getString(i, objArr);
    }

    public String getQuantityString(int i, int i2, Object... objArr) throws NotFoundException {
        return this.f25123a.getQuantityString(i, i2, objArr);
    }

    public String getQuantityString(int i, int i2) throws NotFoundException {
        return this.f25123a.getQuantityString(i, i2);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.f25123a.getText(i, charSequence);
    }

    public CharSequence[] getTextArray(int i) throws NotFoundException {
        return this.f25123a.getTextArray(i);
    }

    public String[] getStringArray(int i) throws NotFoundException {
        return this.f25123a.getStringArray(i);
    }

    public int[] getIntArray(int i) throws NotFoundException {
        return this.f25123a.getIntArray(i);
    }

    public TypedArray obtainTypedArray(int i) throws NotFoundException {
        return this.f25123a.obtainTypedArray(i);
    }

    public float getDimension(int i) throws NotFoundException {
        return this.f25123a.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) throws NotFoundException {
        return this.f25123a.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) throws NotFoundException {
        return this.f25123a.getDimensionPixelSize(i);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.f25123a.getFraction(i, i2, i3);
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        return this.f25123a.getDrawable(i);
    }

    public Drawable getDrawable(int i, Theme theme) throws NotFoundException {
        return this.f25123a.getDrawable(i, theme);
    }

    public Drawable getDrawableForDensity(int i, int i2) throws NotFoundException {
        return this.f25123a.getDrawableForDensity(i, i2);
    }

    public Drawable getDrawableForDensity(int i, int i2, Theme theme) {
        return this.f25123a.getDrawableForDensity(i, i2, theme);
    }

    public Movie getMovie(int i) throws NotFoundException {
        return this.f25123a.getMovie(i);
    }

    public int getColor(int i) throws NotFoundException {
        return this.f25123a.getColor(i);
    }

    public ColorStateList getColorStateList(int i) throws NotFoundException {
        return this.f25123a.getColorStateList(i);
    }

    public boolean getBoolean(int i) throws NotFoundException {
        return this.f25123a.getBoolean(i);
    }

    public int getInteger(int i) throws NotFoundException {
        return this.f25123a.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) throws NotFoundException {
        return this.f25123a.getLayout(i);
    }

    public XmlResourceParser getAnimation(int i) throws NotFoundException {
        return this.f25123a.getAnimation(i);
    }

    public XmlResourceParser getXml(int i) throws NotFoundException {
        return this.f25123a.getXml(i);
    }

    public InputStream openRawResource(int i) throws NotFoundException {
        return this.f25123a.openRawResource(i);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) throws NotFoundException {
        return this.f25123a.openRawResource(i, typedValue);
    }

    public AssetFileDescriptor openRawResourceFd(int i) throws NotFoundException {
        return this.f25123a.openRawResourceFd(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) throws NotFoundException {
        this.f25123a.getValue(i, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws NotFoundException {
        this.f25123a.getValueForDensity(i, i2, typedValue, z);
    }

    public void getValue(String str, TypedValue typedValue, boolean z) throws NotFoundException {
        this.f25123a.getValue(str, typedValue, z);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f25123a.obtainAttributes(attributeSet, iArr);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        if (this.f25123a != null) {
            this.f25123a.updateConfiguration(configuration, displayMetrics);
        }
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f25123a.getDisplayMetrics();
    }

    public Configuration getConfiguration() {
        return this.f25123a.getConfiguration();
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.f25123a.getIdentifier(str, str2, str3);
    }

    public String getResourceName(int i) throws NotFoundException {
        return this.f25123a.getResourceName(i);
    }

    public String getResourcePackageName(int i) throws NotFoundException {
        return this.f25123a.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) throws NotFoundException {
        return this.f25123a.getResourceTypeName(i);
    }

    public String getResourceEntryName(int i) throws NotFoundException {
        return this.f25123a.getResourceEntryName(i);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f25123a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f25123a.parseBundleExtra(str, attributeSet, bundle);
    }
}
