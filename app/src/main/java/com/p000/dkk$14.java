package com.p000;

import android.util.Log;
import android.view.View;
import android.view.View.OnFocusChangeListener;

/* compiled from: ComposerModule */
/* renamed from: dkk$14 */
class dkk$14 implements OnFocusChangeListener {
    /* renamed from: a */
    final /* synthetic */ dkk f21877a;

    dkk$14(dkk dkk) {
        this.f21877a = dkk;
    }

    public void onFocusChange(View view, boolean z) {
        if (this.f21877a.g()) {
            Log.d("ComposerModule", "onFocusChange=" + z);
        }
        if (!z || this.f21877a.f()) {
            if (dkk.f(this.f21877a) != null) {
                dkk.f(this.f21877a).onTextFocusChange(view, z);
            }
            dkk.a(this.f21877a, z);
        }
    }
}
