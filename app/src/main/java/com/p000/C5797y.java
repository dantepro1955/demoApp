package com.p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* compiled from: CircularBorderDrawable */
/* renamed from: y */
class C5797y extends Drawable {
    /* renamed from: a */
    final Paint f26014a = new Paint(1);
    /* renamed from: b */
    final Rect f26015b = new Rect();
    /* renamed from: c */
    final RectF f26016c = new RectF();
    /* renamed from: d */
    float f26017d;
    /* renamed from: e */
    private int f26018e;
    /* renamed from: f */
    private int f26019f;
    /* renamed from: g */
    private int f26020g;
    /* renamed from: h */
    private int f26021h;
    /* renamed from: i */
    private ColorStateList f26022i;
    /* renamed from: j */
    private int f26023j;
    /* renamed from: k */
    private boolean f26024k = true;
    /* renamed from: l */
    private float f26025l;

    public C5797y() {
        this.f26014a.setStyle(Style.STROKE);
    }

    /* renamed from: a */
    void m34859a(int i, int i2, int i3, int i4) {
        this.f26018e = i;
        this.f26019f = i2;
        this.f26020g = i3;
        this.f26021h = i4;
    }

    /* renamed from: a */
    void m34858a(float f) {
        if (this.f26017d != f) {
            this.f26017d = f;
            this.f26014a.setStrokeWidth(1.3333f * f);
            this.f26024k = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.f26024k) {
            this.f26014a.setShader(m34857a());
            this.f26024k = false;
        }
        float strokeWidth = this.f26014a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f26016c;
        copyBounds(this.f26015b);
        rectF.set(this.f26015b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f26025l, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f26014a);
        canvas.restore();
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.f26017d);
        rect.set(round, round, round, round);
        return true;
    }

    public void setAlpha(int i) {
        this.f26014a.setAlpha(i);
        invalidateSelf();
    }

    /* renamed from: a */
    void m34860a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f26023j = colorStateList.getColorForState(getState(), this.f26023j);
        }
        this.f26022i = colorStateList;
        this.f26024k = true;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f26014a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return this.f26017d > 0.0f ? -3 : -2;
    }

    /* renamed from: b */
    final void m34861b(float f) {
        if (f != this.f26025l) {
            this.f26025l = f;
            invalidateSelf();
        }
    }

    protected void onBoundsChange(Rect rect) {
        this.f26024k = true;
    }

    public boolean isStateful() {
        return (this.f26022i != null && this.f26022i.isStateful()) || super.isStateful();
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.f26022i != null) {
            int colorForState = this.f26022i.getColorForState(iArr, this.f26023j);
            if (colorForState != this.f26023j) {
                this.f26024k = true;
                this.f26023j = colorForState;
            }
        }
        if (this.f26024k) {
            invalidateSelf();
        }
        return this.f26024k;
    }

    /* renamed from: a */
    private Shader m34857a() {
        Rect rect = this.f26015b;
        copyBounds(rect);
        float height = this.f26017d / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{fo.m30183a(this.f26018e, this.f26023j), fo.m30183a(this.f26019f, this.f26023j), fo.m30183a(fo.m30185b(this.f26019f, 0), this.f26023j), fo.m30183a(fo.m30185b(this.f26021h, 0), this.f26023j), fo.m30183a(this.f26021h, this.f26023j), fo.m30183a(this.f26020g, this.f26023j)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, TileMode.CLAMP);
    }
}
