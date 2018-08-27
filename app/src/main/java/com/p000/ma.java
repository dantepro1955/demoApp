package com.p000;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.TextView;
import java.lang.reflect.Field;

@TargetApi(9)
/* compiled from: TextViewCompatGingerbread */
/* renamed from: ma */
class ma {
    /* renamed from: a */
    private static Field f24460a;
    /* renamed from: b */
    private static boolean f24461b;
    /* renamed from: c */
    private static Field f24462c;
    /* renamed from: d */
    private static boolean f24463d;

    /* renamed from: a */
    static int m32549a(TextView textView) {
        if (!f24463d) {
            f24462c = ma.m32551a("mMaxMode");
            f24463d = true;
        }
        if (f24462c != null && ma.m32550a(f24462c, textView) == 1) {
            if (!f24461b) {
                f24460a = ma.m32551a("mMaximum");
                f24461b = true;
            }
            if (f24460a != null) {
                return ma.m32550a(f24460a, textView);
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static Field m32551a(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e) {
            Log.e("TextViewCompatGingerbread", "Could not retrieve " + str + " field.");
            return field;
        }
    }

    /* renamed from: a */
    private static int m32550a(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException e) {
            Log.d("TextViewCompatGingerbread", "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    /* renamed from: a */
    static void m32552a(TextView textView, int i) {
        textView.setTextAppearance(textView.getContext(), i);
    }

    /* renamed from: b */
    static Drawable[] m32553b(TextView textView) {
        return textView.getCompoundDrawables();
    }
}
