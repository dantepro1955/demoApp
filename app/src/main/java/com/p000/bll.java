package com.p000;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

@bhd
/* renamed from: bll */
class bll extends blm implements OnScrollChangedListener {
    /* renamed from: a */
    private final WeakReference<OnScrollChangedListener> f6823a;

    public bll(View view, OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f6823a = new WeakReference(onScrollChangedListener);
    }

    /* renamed from: a */
    protected void mo1286a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    /* renamed from: b */
    protected void mo1287b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    public void onScrollChanged() {
        OnScrollChangedListener onScrollChangedListener = (OnScrollChangedListener) this.f6823a.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            m9334b();
        }
    }
}
