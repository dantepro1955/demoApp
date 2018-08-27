package com.p000;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: AnimatorProxy */
/* renamed from: cwy */
public final class cwy extends Animation {
    /* renamed from: a */
    public static final boolean f20454a = (Integer.valueOf(VERSION.SDK).intValue() < 11);
    /* renamed from: b */
    private static final WeakHashMap<View, cwy> f20455b = new WeakHashMap();
    /* renamed from: c */
    private final WeakReference<View> f20456c;
    /* renamed from: d */
    private final Camera f20457d = new Camera();
    /* renamed from: e */
    private boolean f20458e;
    /* renamed from: f */
    private float f20459f = 1.0f;
    /* renamed from: g */
    private float f20460g;
    /* renamed from: h */
    private float f20461h;
    /* renamed from: i */
    private float f20462i;
    /* renamed from: j */
    private float f20463j;
    /* renamed from: k */
    private float f20464k;
    /* renamed from: l */
    private float f20465l = 1.0f;
    /* renamed from: m */
    private float f20466m = 1.0f;
    /* renamed from: n */
    private float f20467n;
    /* renamed from: o */
    private float f20468o;
    /* renamed from: p */
    private final RectF f20469p = new RectF();
    /* renamed from: q */
    private final RectF f20470q = new RectF();
    /* renamed from: r */
    private final Matrix f20471r = new Matrix();

    /* renamed from: a */
    public static cwy m25374a(View view) {
        Animation animation = (cwy) f20455b.get(view);
        if (animation != null && animation == view.getAnimation()) {
            return animation;
        }
        cwy cwy = new cwy(view);
        f20455b.put(view, cwy);
        return cwy;
    }

    private cwy(View view) {
        setDuration(0);
        setFillAfter(true);
        view.setAnimation(this);
        this.f20456c = new WeakReference(view);
    }

    /* renamed from: a */
    public float m25379a() {
        return this.f20459f;
    }

    /* renamed from: a */
    public void m25380a(float f) {
        if (this.f20459f != f) {
            this.f20459f = f;
            View view = (View) this.f20456c.get();
            if (view != null) {
                view.invalidate();
            }
        }
    }

    /* renamed from: b */
    public float m25381b() {
        return this.f20460g;
    }

    /* renamed from: b */
    public void m25382b(float f) {
        if (!this.f20458e || this.f20460g != f) {
            m25377o();
            this.f20458e = true;
            this.f20460g = f;
            m25378p();
        }
    }

    /* renamed from: c */
    public float m25383c() {
        return this.f20461h;
    }

    /* renamed from: c */
    public void m25384c(float f) {
        if (!this.f20458e || this.f20461h != f) {
            m25377o();
            this.f20458e = true;
            this.f20461h = f;
            m25378p();
        }
    }

    /* renamed from: d */
    public float m25385d() {
        return this.f20464k;
    }

    /* renamed from: d */
    public void m25386d(float f) {
        if (this.f20464k != f) {
            m25377o();
            this.f20464k = f;
            m25378p();
        }
    }

    /* renamed from: e */
    public float m25387e() {
        return this.f20462i;
    }

    /* renamed from: e */
    public void m25388e(float f) {
        if (this.f20462i != f) {
            m25377o();
            this.f20462i = f;
            m25378p();
        }
    }

    /* renamed from: f */
    public float m25389f() {
        return this.f20463j;
    }

    /* renamed from: f */
    public void m25390f(float f) {
        if (this.f20463j != f) {
            m25377o();
            this.f20463j = f;
            m25378p();
        }
    }

    /* renamed from: g */
    public float m25391g() {
        return this.f20465l;
    }

    /* renamed from: g */
    public void m25392g(float f) {
        if (this.f20465l != f) {
            m25377o();
            this.f20465l = f;
            m25378p();
        }
    }

    /* renamed from: h */
    public float m25393h() {
        return this.f20466m;
    }

    /* renamed from: h */
    public void m25394h(float f) {
        if (this.f20466m != f) {
            m25377o();
            this.f20466m = f;
            m25378p();
        }
    }

    /* renamed from: i */
    public int m25395i() {
        View view = (View) this.f20456c.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollX();
    }

    /* renamed from: j */
    public int m25397j() {
        View view = (View) this.f20456c.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollY();
    }

    /* renamed from: k */
    public float m25399k() {
        return this.f20467n;
    }

    /* renamed from: i */
    public void m25396i(float f) {
        if (this.f20467n != f) {
            m25377o();
            this.f20467n = f;
            m25378p();
        }
    }

    /* renamed from: l */
    public float m25401l() {
        return this.f20468o;
    }

    /* renamed from: j */
    public void m25398j(float f) {
        if (this.f20468o != f) {
            m25377o();
            this.f20468o = f;
            m25378p();
        }
    }

    /* renamed from: m */
    public float m25403m() {
        View view = (View) this.f20456c.get();
        if (view == null) {
            return 0.0f;
        }
        return ((float) view.getLeft()) + this.f20467n;
    }

    /* renamed from: k */
    public void m25400k(float f) {
        View view = (View) this.f20456c.get();
        if (view != null) {
            m25396i(f - ((float) view.getLeft()));
        }
    }

    /* renamed from: n */
    public float m25404n() {
        View view = (View) this.f20456c.get();
        if (view == null) {
            return 0.0f;
        }
        return ((float) view.getTop()) + this.f20468o;
    }

    /* renamed from: l */
    public void m25402l(float f) {
        View view = (View) this.f20456c.get();
        if (view != null) {
            m25398j(f - ((float) view.getTop()));
        }
    }

    /* renamed from: o */
    private void m25377o() {
        View view = (View) this.f20456c.get();
        if (view != null) {
            m25376a(this.f20469p, view);
        }
    }

    /* renamed from: p */
    private void m25378p() {
        View view = (View) this.f20456c.get();
        if (view != null && view.getParent() != null) {
            RectF rectF = this.f20470q;
            m25376a(rectF, view);
            rectF.union(this.f20469p);
            ((View) view.getParent()).invalidate((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
    }

    /* renamed from: a */
    private void m25376a(RectF rectF, View view) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        Matrix matrix = this.f20471r;
        matrix.reset();
        m25375a(matrix, view);
        this.f20471r.mapRect(rectF);
        rectF.offset((float) view.getLeft(), (float) view.getTop());
        if (rectF.right < rectF.left) {
            float f = rectF.right;
            rectF.right = rectF.left;
            rectF.left = f;
        }
        if (rectF.bottom < rectF.top) {
            f = rectF.top;
            rectF.top = rectF.bottom;
            rectF.bottom = f;
        }
    }

    /* renamed from: a */
    private void m25375a(Matrix matrix, View view) {
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        boolean z = this.f20458e;
        float f = z ? this.f20460g : width / 2.0f;
        float f2 = z ? this.f20461h : height / 2.0f;
        float f3 = this.f20462i;
        float f4 = this.f20463j;
        float f5 = this.f20464k;
        if (!(f3 == 0.0f && f4 == 0.0f && f5 == 0.0f)) {
            Camera camera = this.f20457d;
            camera.save();
            camera.rotateX(f3);
            camera.rotateY(f4);
            camera.rotateZ(-f5);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f, -f2);
            matrix.postTranslate(f, f2);
        }
        f3 = this.f20465l;
        f4 = this.f20466m;
        if (!(f3 == 1.0f && f4 == 1.0f)) {
            matrix.postScale(f3, f4);
            matrix.postTranslate((-(f / width)) * ((f3 * width) - width), (-(f2 / height)) * ((f4 * height) - height));
        }
        matrix.postTranslate(this.f20467n, this.f20468o);
    }

    protected void applyTransformation(float f, Transformation transformation) {
        View view = (View) this.f20456c.get();
        if (view != null) {
            transformation.setAlpha(this.f20459f);
            m25375a(transformation.getMatrix(), view);
        }
    }
}
