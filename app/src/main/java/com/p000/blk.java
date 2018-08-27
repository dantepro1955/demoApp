package com.p000;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

@bhd
/* renamed from: blk */
class blk extends blm implements OnGlobalLayoutListener {
    /* renamed from: a */
    private final WeakReference<OnGlobalLayoutListener> f6822a;

    public blk(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f6822a = new WeakReference(onGlobalLayoutListener);
    }

    /* renamed from: a */
    protected void mo1286a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    /* renamed from: b */
    protected void mo1287b(ViewTreeObserver viewTreeObserver) {
        ako.m2345g().mo1274a(viewTreeObserver, (OnGlobalLayoutListener) this);
    }

    public void onGlobalLayout() {
        OnGlobalLayoutListener onGlobalLayoutListener = (OnGlobalLayoutListener) this.f6822a.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            m9334b();
        }
    }
}
