package com.p000;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.CompoundButton;

@TargetApi(21)
/* compiled from: CompoundButtonCompatLollipop */
/* renamed from: le */
class le {
    /* renamed from: a */
    static void m32382a(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    /* renamed from: a */
    static void m32383a(CompoundButton compoundButton, Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
