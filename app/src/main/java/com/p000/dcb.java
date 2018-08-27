package com.p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;

/* compiled from: MiscUtils */
/* renamed from: dcb */
public class dcb {
    /* renamed from: a */
    protected static TypedValue m26353a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue;
    }

    /* renamed from: b */
    public static int m26355b(Context context, int i) {
        return dcb.m26353a(context, i).data;
    }

    /* renamed from: c */
    public static int m26356c(Context context, int i) {
        return dcb.m26353a(context, i).resourceId;
    }

    /* renamed from: a */
    public static int m26352a(Context context, float f) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        try {
            return (int) (displayMetrics.density * f);
        } catch (NoSuchFieldError e) {
            return (int) TypedValue.applyDimension(1, f, displayMetrics);
        }
    }

    /* renamed from: d */
    public static int m26357d(Context context, int i) {
        return Math.round(((float) i) / context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: a */
    public static int m26351a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
    }

    /* renamed from: a */
    protected static void m26354a(TextView textView, int i) {
        if (VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }
}
