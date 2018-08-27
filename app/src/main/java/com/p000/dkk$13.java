package com.p000;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* compiled from: ComposerModule */
/* renamed from: dkk$13 */
class dkk$13 implements OnTouchListener {
    /* renamed from: a */
    final /* synthetic */ dkk f21876a;

    dkk$13(dkk dkk) {
        this.f21876a = dkk;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f21876a.g()) {
            Log.d("ComposerModule", "onTouch() overlay");
        }
        dkk.e(this.f21876a);
        return false;
    }
}
