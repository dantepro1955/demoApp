package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

@TargetApi(14)
/* compiled from: PagerTitleStripIcs */
/* renamed from: iw */
public class iw {

    /* compiled from: PagerTitleStripIcs */
    /* renamed from: iw$a */
    static class C5433a extends SingleLineTransformationMethod {
        /* renamed from: a */
        private Locale f24270a;

        public C5433a(Context context) {
            this.f24270a = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            return transformation != null ? transformation.toString().toUpperCase(this.f24270a) : null;
        }
    }

    /* renamed from: a */
    public static void m31411a(TextView textView) {
        textView.setTransformationMethod(new C5433a(textView.getContext()));
    }
}
