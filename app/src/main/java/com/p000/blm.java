package com.p000;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@bhd
/* renamed from: blm */
abstract class blm {
    /* renamed from: a */
    private final WeakReference<View> f6821a;

    public blm(View view) {
        this.f6821a = new WeakReference(view);
    }

    /* renamed from: a */
    public final void m9332a() {
        ViewTreeObserver c = m9336c();
        if (c != null) {
            mo1286a(c);
        }
    }

    /* renamed from: a */
    protected abstract void mo1286a(ViewTreeObserver viewTreeObserver);

    /* renamed from: b */
    public final void m9334b() {
        ViewTreeObserver c = m9336c();
        if (c != null) {
            mo1287b(c);
        }
    }

    /* renamed from: b */
    protected abstract void mo1287b(ViewTreeObserver viewTreeObserver);

    /* renamed from: c */
    protected ViewTreeObserver m9336c() {
        View view = (View) this.f6821a.get();
        if (view == null) {
            return null;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        return (viewTreeObserver == null || !viewTreeObserver.isAlive()) ? null : viewTreeObserver;
    }
}
