package com.p000;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;

@bhd
/* renamed from: bkw */
public final class bkw {
    /* renamed from: a */
    private final View f6790a;
    /* renamed from: b */
    private Activity f6791b;
    /* renamed from: c */
    private boolean f6792c;
    /* renamed from: d */
    private boolean f6793d;
    /* renamed from: e */
    private boolean f6794e;
    /* renamed from: f */
    private OnGlobalLayoutListener f6795f;
    /* renamed from: g */
    private OnScrollChangedListener f6796g;

    public bkw(Activity activity, View view, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        this.f6791b = activity;
        this.f6790a = view;
        this.f6795f = onGlobalLayoutListener;
        this.f6796g = onScrollChangedListener;
    }

    /* renamed from: e */
    private void m9274e() {
        if (!this.f6792c) {
            if (this.f6795f != null) {
                if (this.f6791b != null) {
                    ako.m2343e().m9096a(this.f6791b, this.f6795f);
                }
                ako.m2335C().m9330a(this.f6790a, this.f6795f);
            }
            if (this.f6796g != null) {
                if (this.f6791b != null) {
                    ako.m2343e().m9097a(this.f6791b, this.f6796g);
                }
                ako.m2335C().m9331a(this.f6790a, this.f6796g);
            }
            this.f6792c = true;
        }
    }

    /* renamed from: f */
    private void m9275f() {
        if (this.f6791b != null && this.f6792c) {
            if (!(this.f6795f == null || this.f6791b == null)) {
                ako.m2345g().mo1272a(this.f6791b, this.f6795f);
            }
            if (!(this.f6796g == null || this.f6791b == null)) {
                ako.m2343e().m9121b(this.f6791b, this.f6796g);
            }
            this.f6792c = false;
        }
    }

    /* renamed from: a */
    public void m9276a() {
        this.f6794e = true;
        if (this.f6793d) {
            m9274e();
        }
    }

    /* renamed from: a */
    public void m9277a(Activity activity) {
        this.f6791b = activity;
    }

    /* renamed from: b */
    public void m9278b() {
        this.f6794e = false;
        m9275f();
    }

    /* renamed from: c */
    public void m9279c() {
        this.f6793d = true;
        if (this.f6794e) {
            m9274e();
        }
    }

    /* renamed from: d */
    public void m9280d() {
        this.f6793d = false;
        m9275f();
    }
}
