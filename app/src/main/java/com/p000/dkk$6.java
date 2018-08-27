package com.p000;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* compiled from: ComposerModule */
/* renamed from: dkk$6 */
class dkk$6 implements Runnable {
    /* renamed from: a */
    final /* synthetic */ EditText f21888a;
    /* renamed from: b */
    final /* synthetic */ dkk f21889b;

    dkk$6(dkk dkk, EditText editText) {
        this.f21889b = dkk;
        this.f21888a = editText;
    }

    public void run() {
        try {
            ((InputMethodManager) this.f21889b.f16760i.getSystemService("input_method")).showSoftInput(this.f21888a, 2);
            this.f21888a.setSelection(this.f21888a.getText().length());
        } catch (Exception e) {
        }
    }
}
