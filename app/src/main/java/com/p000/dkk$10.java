package com.p000;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: ComposerModule */
/* renamed from: dkk$10 */
class dkk$10 implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ dkk f21871a;

    dkk$10(dkk dkk) {
        this.f21871a = dkk;
    }

    public void onClick(View view) {
        if (this.f21871a.g()) {
            Log.d("ComposerModule", "mediaCaptureBtn::onClick()");
        }
        dkk.c(this.f21871a);
    }
}
