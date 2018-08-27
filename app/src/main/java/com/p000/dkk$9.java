package com.p000;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: ComposerModule */
/* renamed from: dkk$9 */
class dkk$9 implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ dkk f21895a;

    dkk$9(dkk dkk) {
        this.f21895a = dkk;
    }

    public void onClick(View view) {
        if (this.f21895a.g()) {
            Log.d("ComposerModule", "imageGalleryBtn::onClick()");
        }
        dkk.b(this.f21895a);
    }
}
