package com.p000;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* compiled from: OneShotPreDrawListener */
/* renamed from: en */
class en implements OnAttachStateChangeListener, OnPreDrawListener {
    /* renamed from: a */
    private final View f23644a;
    /* renamed from: b */
    private ViewTreeObserver f23645b;
    /* renamed from: c */
    private final Runnable f23646c;

    private en(View view, Runnable runnable) {
        this.f23644a = view;
        this.f23645b = view.getViewTreeObserver();
        this.f23646c = runnable;
    }

    /* renamed from: a */
    public static en m30063a(View view, Runnable runnable) {
        en enVar = new en(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(enVar);
        view.addOnAttachStateChangeListener(enVar);
        return enVar;
    }

    public boolean onPreDraw() {
        m30064a();
        this.f23646c.run();
        return true;
    }

    /* renamed from: a */
    public void m30064a() {
        if (this.f23645b.isAlive()) {
            this.f23645b.removeOnPreDrawListener(this);
        } else {
            this.f23644a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f23644a.removeOnAttachStateChangeListener(this);
    }

    public void onViewAttachedToWindow(View view) {
        this.f23645b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        m30064a();
    }
}
