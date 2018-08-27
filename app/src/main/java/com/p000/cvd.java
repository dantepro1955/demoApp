package com.p000;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;

/* compiled from: RobotoTypefaceManager */
/* renamed from: cvd */
public class cvd {
    /* renamed from: a */
    private static final SparseArray<Typeface> f20281a = new SparseArray(20);

    /* renamed from: a */
    public static Typeface m25037a(Context context, int i) throws IllegalArgumentException {
        Typeface typeface = (Typeface) f20281a.get(i);
        if (typeface != null) {
            return typeface;
        }
        typeface = cvd.m25038b(context, i);
        f20281a.put(i, typeface);
        return typeface;
    }

    /* renamed from: b */
    private static Typeface m25038b(Context context, int i) throws IllegalArgumentException {
        switch (i) {
            case 0:
                return Typeface.createFromAsset(context.getAssets(), "roboto/Roboto-Regular.ttf");
            case 1:
                return Typeface.createFromAsset(context.getAssets(), "roboto/Roboto-Light.ttf");
            case 2:
                return Typeface.createFromAsset(context.getAssets(), "roboto/Roboto-Bold.ttf");
            default:
                throw new IllegalArgumentException("Unknown typeface attribute value " + i);
        }
    }
}
