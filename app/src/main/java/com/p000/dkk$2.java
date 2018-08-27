package com.p000;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: ComposerModule */
/* renamed from: dkk$2 */
class dkk$2 implements TextWatcher {
    /* renamed from: a */
    final /* synthetic */ dkk f21884a;

    dkk$2(dkk dkk) {
        this.f21884a = dkk;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        this.f21884a.d(editable.toString());
        dkk.h(this.f21884a);
    }
}
