package com.p000;

import android.util.Log;
import android.view.inputmethod.InputMethodManager;

/* compiled from: ComposerModule */
/* renamed from: dkk$4 */
class dkk$4 implements Runnable {
    /* renamed from: a */
    final /* synthetic */ dkk f21886a;

    dkk$4(dkk dkk) {
        this.f21886a = dkk;
    }

    public void run() {
        try {
            if (this.f21886a.g()) {
                Log.d("ComposerModule", "requestInputFocus() showSoftInput()");
            }
            ((InputMethodManager) this.f21886a.f16760i.getSystemService("input_method")).showSoftInput(this.f21886a.M(), 2);
        } catch (Exception e) {
        }
    }
}
