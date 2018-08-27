package com.p000;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

@TargetApi(18)
/* compiled from: TextViewCompatJbMr2 */
/* renamed from: md */
class md {
    /* renamed from: a */
    public static void m32557a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: a */
    public static Drawable[] m32558a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }
}
