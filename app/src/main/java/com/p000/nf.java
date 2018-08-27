package com.p000;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* compiled from: AllCapsTransformationMethod */
/* renamed from: nf */
public class nf implements TransformationMethod {
    /* renamed from: a */
    private Locale f24706a;

    public nf(Context context) {
        this.f24706a = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        return charSequence != null ? charSequence.toString().toUpperCase(this.f24706a) : null;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
