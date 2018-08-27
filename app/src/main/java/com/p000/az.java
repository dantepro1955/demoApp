package com.p000;

import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TypedArrayUtils */
/* renamed from: az */
class az {
    /* renamed from: a */
    public static boolean m6691a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: a */
    public static float m6688a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !az.m6691a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static boolean m6690a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !az.m6691a(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static int m6689a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !az.m6691a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: b */
    public static int m6692b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !az.m6691a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }
}
