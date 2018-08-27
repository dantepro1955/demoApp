package com.p000;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

@TargetApi(21)
/* compiled from: RoundRectDrawable */
/* renamed from: pu */
class pu extends Drawable {
    /* renamed from: a */
    private float f25124a;
    /* renamed from: b */
    private final Paint f25125b;
    /* renamed from: c */
    private final RectF f25126c;
    /* renamed from: d */
    private final Rect f25127d;
    /* renamed from: e */
    private float f25128e;
    /* renamed from: f */
    private boolean f25129f = false;
    /* renamed from: g */
    private boolean f25130g = true;
    /* renamed from: h */
    private ColorStateList f25131h;
    /* renamed from: i */
    private PorterDuffColorFilter f25132i;
    /* renamed from: j */
    private ColorStateList f25133j;
    /* renamed from: k */
    private Mode f25134k = Mode.SRC_IN;

    public pu(ColorStateList colorStateList, float f) {
        this.f25124a = f;
        this.f25125b = new Paint(5);
        m33704b(colorStateList);
        this.f25126c = new RectF();
        this.f25127d = new Rect();
    }

    /* renamed from: b */
    private void m33704b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f25131h = colorStateList;
        this.f25125b.setColor(this.f25131h.getColorForState(getState(), this.f25131h.getDefaultColor()));
    }

    /* renamed from: a */
    void m33707a(float f, boolean z, boolean z2) {
        if (f != this.f25128e || this.f25129f != z || this.f25130g != z2) {
            this.f25128e = f;
            this.f25129f = z;
            this.f25130g = z2;
            m33703a(null);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    float m33705a() {
        return this.f25128e;
    }

    public void draw(Canvas canvas) {
        Object obj;
        Paint paint = this.f25125b;
        if (this.f25132i == null || paint.getColorFilter() != null) {
            obj = null;
        } else {
            paint.setColorFilter(this.f25132i);
            obj = 1;
        }
        canvas.drawRoundRect(this.f25126c, this.f25124a, this.f25124a, paint);
        if (obj != null) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: a */
    private void m33703a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f25126c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f25127d.set(rect);
        if (this.f25129f) {
            float a = pv.m33711a(this.f25128e, this.f25124a, this.f25130g);
            this.f25127d.inset((int) Math.ceil((double) pv.m33713b(this.f25128e, this.f25124a, this.f25130g)), (int) Math.ceil((double) a));
            this.f25126c.set(this.f25127d);
        }
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m33703a(rect);
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f25127d, this.f25124a);
    }

    /* renamed from: a */
    void m33706a(float f) {
        if (f != this.f25124a) {
            this.f25124a = f;
            m33703a(null);
            invalidateSelf();
        }
    }

    public void setAlpha(int i) {
        this.f25125b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f25125b.setColorFilter(colorFilter);
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: b */
    public float m33709b() {
        return this.f25124a;
    }

    /* renamed from: a */
    public void m33708a(ColorStateList colorStateList) {
        m33704b(colorStateList);
        invalidateSelf();
    }

    /* renamed from: c */
    public ColorStateList m33710c() {
        return this.f25131h;
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f25133j = colorStateList;
        this.f25132i = m33702a(this.f25133j, this.f25134k);
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.f25134k = mode;
        this.f25132i = m33702a(this.f25133j, this.f25134k);
        invalidateSelf();
    }

    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.f25131h.getColorForState(iArr, this.f25131h.getDefaultColor());
        boolean z = colorForState != this.f25125b.getColor();
        if (z) {
            this.f25125b.setColor(colorForState);
        }
        if (this.f25133j == null || this.f25134k == null) {
            return z;
        }
        this.f25132i = m33702a(this.f25133j, this.f25134k);
        return true;
    }

    public boolean isStateful() {
        return (this.f25133j != null && this.f25133j.isStateful()) || ((this.f25131h != null && this.f25131h.isStateful()) || super.isStateful());
    }

    /* renamed from: a */
    private PorterDuffColorFilter m33702a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
