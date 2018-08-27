package com.p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: uz */
class uz implements OnTouchListener {
    /* renamed from: a */
    final /* synthetic */ uy f25655a;

    uz(uy uyVar) {
        this.f25655a = uyVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            return true;
        }
        if (!view.hasFocus()) {
            view.requestFocus();
        }
        return false;
    }
}
