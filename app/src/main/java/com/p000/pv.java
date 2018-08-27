package com.p000;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import p000.my.C5578a;
import p000.my.C5579b;

@TargetApi(9)
/* compiled from: RoundRectDrawableWithShadow */
/* renamed from: pv */
class pv extends Drawable {
    /* renamed from: a */
    static final double f25135a = Math.cos(Math.toRadians(45.0d));
    /* renamed from: c */
    static C5656a f25136c;
    /* renamed from: b */
    final int f25137b;
    /* renamed from: d */
    Paint f25138d;
    /* renamed from: e */
    Paint f25139e;
    /* renamed from: f */
    Paint f25140f;
    /* renamed from: g */
    final RectF f25141g;
    /* renamed from: h */
    float f25142h;
    /* renamed from: i */
    Path f25143i;
    /* renamed from: j */
    float f25144j;
    /* renamed from: k */
    float f25145k;
    /* renamed from: l */
    float f25146l;
    /* renamed from: m */
    float f25147m;
    /* renamed from: n */
    private ColorStateList f25148n;
    /* renamed from: o */
    private boolean f25149o = true;
    /* renamed from: p */
    private final int f25150p;
    /* renamed from: q */
    private final int f25151q;
    /* renamed from: r */
    private boolean f25152r = true;
    /* renamed from: s */
    private boolean f25153s = false;

    /* compiled from: RoundRectDrawableWithShadow */
    /* renamed from: pv$a */
    interface C5656a {
        /* renamed from: a */
        void mo5430a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    pv(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f25150p = resources.getColor(C5578a.cardview_shadow_start_color);
        this.f25151q = resources.getColor(C5578a.cardview_shadow_end_color);
        this.f25137b = resources.getDimensionPixelSize(C5579b.cardview_compat_inset_shadow);
        this.f25138d = new Paint(5);
        m33714b(colorStateList);
        this.f25139e = new Paint(5);
        this.f25139e.setStyle(Style.FILL);
        this.f25142h = (float) ((int) (0.5f + f));
        this.f25141g = new RectF();
        this.f25140f = new Paint(this.f25139e);
        this.f25140f.setAntiAlias(false);
        m33720a(f2, f3);
    }

    /* renamed from: b */
    private void m33714b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f25148n = colorStateList;
        this.f25138d.setColor(this.f25148n.getColorForState(getState(), this.f25148n.getDefaultColor()));
    }

    /* renamed from: d */
    private int m33716d(float f) {
        int i = (int) (0.5f + f);
        if (i % 2 == 1) {
            return i - 1;
        }
        return i;
    }

    /* renamed from: a */
    public void m33723a(boolean z) {
        this.f25152r = z;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.f25138d.setAlpha(i);
        this.f25139e.setAlpha(i);
        this.f25140f.setAlpha(i);
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f25149o = true;
    }

    /* renamed from: a */
    void m33720a(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        } else {
            float d = (float) m33716d(f);
            float d2 = (float) m33716d(f2);
            if (d > d2) {
                if (!this.f25153s) {
                    this.f25153s = true;
                }
                d = d2;
            }
            if (this.f25147m != d || this.f25145k != d2) {
                this.f25147m = d;
                this.f25145k = d2;
                this.f25146l = (float) ((int) (((d * 1.5f) + ((float) this.f25137b)) + 0.5f));
                this.f25144j = ((float) this.f25137b) + d2;
                this.f25149o = true;
                invalidateSelf();
            }
        }
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) pv.m33711a(this.f25145k, this.f25142h, this.f25152r));
        int ceil2 = (int) Math.ceil((double) pv.m33713b(this.f25145k, this.f25142h, this.f25152r));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* renamed from: a */
    static float m33711a(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) (1.5f * f)) + ((1.0d - f25135a) * ((double) f2)));
        }
        return 1.5f * f;
    }

    /* renamed from: b */
    static float m33713b(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) f) + ((1.0d - f25135a) * ((double) f2)));
        }
        return f;
    }

    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.f25148n.getColorForState(iArr, this.f25148n.getDefaultColor());
        if (this.f25138d.getColor() == colorForState) {
            return false;
        }
        this.f25138d.setColor(colorForState);
        this.f25149o = true;
        invalidateSelf();
        return true;
    }

    public boolean isStateful() {
        return (this.f25148n != null && this.f25148n.isStateful()) || super.isStateful();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f25138d.setColorFilter(colorFilter);
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: a */
    void m33719a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (float) ((int) (0.5f + f));
        if (this.f25142h != f2) {
            this.f25142h = f2;
            this.f25149o = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.f25149o) {
            m33715b(getBounds());
            this.f25149o = false;
        }
        canvas.translate(0.0f, this.f25147m / 2.0f);
        m33712a(canvas);
        canvas.translate(0.0f, (-this.f25147m) / 2.0f);
        f25136c.mo5430a(canvas, this.f25141g, this.f25142h, this.f25138d);
    }

    /* renamed from: a */
    private void m33712a(Canvas canvas) {
        Object obj;
        float f = (-this.f25142h) - this.f25146l;
        float f2 = (this.f25142h + ((float) this.f25137b)) + (this.f25147m / 2.0f);
        Object obj2 = this.f25141g.width() - (2.0f * f2) > 0.0f ? 1 : null;
        if (this.f25141g.height() - (2.0f * f2) > 0.0f) {
            obj = 1;
        } else {
            obj = null;
        }
        int save = canvas.save();
        canvas.translate(this.f25141g.left + f2, this.f25141g.top + f2);
        canvas.drawPath(this.f25143i, this.f25139e);
        if (obj2 != null) {
            canvas.drawRect(0.0f, f, this.f25141g.width() - (2.0f * f2), -this.f25142h, this.f25140f);
        }
        canvas.restoreToCount(save);
        save = canvas.save();
        canvas.translate(this.f25141g.right - f2, this.f25141g.bottom - f2);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f25143i, this.f25139e);
        if (obj2 != null) {
            canvas.drawRect(0.0f, f, this.f25141g.width() - (2.0f * f2), this.f25146l + (-this.f25142h), this.f25140f);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        canvas.translate(this.f25141g.left + f2, this.f25141g.bottom - f2);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f25143i, this.f25139e);
        if (obj != null) {
            canvas.drawRect(0.0f, f, this.f25141g.height() - (2.0f * f2), -this.f25142h, this.f25140f);
        }
        canvas.restoreToCount(save2);
        save2 = canvas.save();
        canvas.translate(this.f25141g.right - f2, this.f25141g.top + f2);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f25143i, this.f25139e);
        if (obj != null) {
            canvas.drawRect(0.0f, f, this.f25141g.height() - (2.0f * f2), -this.f25142h, this.f25140f);
        }
        canvas.restoreToCount(save2);
    }

    /* renamed from: g */
    private void m33717g() {
        RectF rectF = new RectF(-this.f25142h, -this.f25142h, this.f25142h, this.f25142h);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-this.f25146l, -this.f25146l);
        if (this.f25143i == null) {
            this.f25143i = new Path();
        } else {
            this.f25143i.reset();
        }
        this.f25143i.setFillType(FillType.EVEN_ODD);
        this.f25143i.moveTo(-this.f25142h, 0.0f);
        this.f25143i.rLineTo(-this.f25146l, 0.0f);
        this.f25143i.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f25143i.arcTo(rectF, 270.0f, -90.0f, false);
        this.f25143i.close();
        float f = this.f25142h / (this.f25142h + this.f25146l);
        float[] fArr = new float[]{0.0f, f, 1.0f};
        f = 0.0f;
        this.f25139e.setShader(new RadialGradient(0.0f, f, this.f25142h + this.f25146l, new int[]{this.f25150p, this.f25150p, this.f25151q}, fArr, TileMode.CLAMP));
        float f2 = 0.0f;
        this.f25140f.setShader(new LinearGradient(0.0f, (-this.f25142h) + this.f25146l, f2, (-this.f25142h) - this.f25146l, new int[]{this.f25150p, this.f25150p, this.f25151q}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
        this.f25140f.setAntiAlias(false);
    }

    /* renamed from: b */
    private void m33715b(Rect rect) {
        float f = this.f25145k * 1.5f;
        this.f25141g.set(((float) rect.left) + this.f25145k, ((float) rect.top) + f, ((float) rect.right) - this.f25145k, ((float) rect.bottom) - f);
        m33717g();
    }

    /* renamed from: a */
    float m33718a() {
        return this.f25142h;
    }

    /* renamed from: a */
    void m33722a(Rect rect) {
        getPadding(rect);
    }

    /* renamed from: b */
    void m33725b(float f) {
        m33720a(f, this.f25145k);
    }

    /* renamed from: c */
    void m33727c(float f) {
        m33720a(this.f25147m, f);
    }

    /* renamed from: b */
    float m33724b() {
        return this.f25147m;
    }

    /* renamed from: c */
    float m33726c() {
        return this.f25145k;
    }

    /* renamed from: d */
    float m33728d() {
        return (Math.max(this.f25145k, (this.f25142h + ((float) this.f25137b)) + (this.f25145k / 2.0f)) * 2.0f) + ((this.f25145k + ((float) this.f25137b)) * 2.0f);
    }

    /* renamed from: e */
    float m33729e() {
        return (Math.max(this.f25145k, (this.f25142h + ((float) this.f25137b)) + ((this.f25145k * 1.5f) / 2.0f)) * 2.0f) + (((this.f25145k * 1.5f) + ((float) this.f25137b)) * 2.0f);
    }

    /* renamed from: a */
    void m33721a(ColorStateList colorStateList) {
        m33714b(colorStateList);
        invalidateSelf();
    }

    /* renamed from: f */
    ColorStateList m33730f() {
        return this.f25148n;
    }
}
