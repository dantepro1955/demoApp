package com.p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: ViewAware */
/* renamed from: cyc */
public abstract class cyc implements cxz {
    /* renamed from: a */
    protected Reference<View> f20664a;
    /* renamed from: b */
    protected boolean f20665b;

    /* renamed from: a */
    protected abstract void mo4231a(Bitmap bitmap, View view);

    /* renamed from: a */
    protected abstract void mo4232a(Drawable drawable, View view);

    public cyc(View view) {
        this(view, true);
    }

    public cyc(View view, boolean z) {
        if (view == null) {
            throw new IllegalArgumentException("view must not be null");
        }
        this.f20664a = new WeakReference(view);
        this.f20665b = z;
    }

    /* renamed from: a */
    public int mo4223a() {
        View view = (View) this.f20664a.get();
        if (view == null) {
            return 0;
        }
        int i;
        LayoutParams layoutParams = view.getLayoutParams();
        if (!this.f20665b || layoutParams == null || layoutParams.width == -2) {
            i = 0;
        } else {
            i = view.getWidth();
        }
        if (i > 0 || layoutParams == null) {
            return i;
        }
        return layoutParams.width;
    }

    /* renamed from: b */
    public int mo4226b() {
        View view = (View) this.f20664a.get();
        if (view == null) {
            return 0;
        }
        int i;
        LayoutParams layoutParams = view.getLayoutParams();
        if (!this.f20665b || layoutParams == null || layoutParams.height == -2) {
            i = 0;
        } else {
            i = view.getHeight();
        }
        if (i > 0 || layoutParams == null) {
            return i;
        }
        return layoutParams.height;
    }

    /* renamed from: c */
    public cxp mo4227c() {
        return cxp.CROP;
    }

    /* renamed from: d */
    public View mo4228d() {
        return (View) this.f20664a.get();
    }

    /* renamed from: e */
    public boolean mo4229e() {
        return this.f20664a.get() == null;
    }

    /* renamed from: f */
    public int mo4230f() {
        View view = (View) this.f20664a.get();
        return view == null ? super.hashCode() : view.hashCode();
    }

    /* renamed from: a */
    public boolean mo4225a(Drawable drawable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            View view = (View) this.f20664a.get();
            if (view != null) {
                mo4232a(drawable, view);
                return true;
            }
        }
        cyj.m25646b("Can't set a drawable into view. You should call ImageLoader on UI thread for it.", new Object[0]);
        return false;
    }

    /* renamed from: a */
    public boolean mo4224a(Bitmap bitmap) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            View view = (View) this.f20664a.get();
            if (view != null) {
                mo4231a(bitmap, view);
                return true;
            }
        }
        cyj.m25646b("Can't set a bitmap into view. You should call ImageLoader on UI thread for it.", new Object[0]);
        return false;
    }
}
