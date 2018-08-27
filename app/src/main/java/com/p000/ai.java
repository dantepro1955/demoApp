package com.p000;

import android.content.Context;
import android.graphics.Canvas;
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

/* compiled from: ShadowDrawableWrapper */
/* renamed from: ai */
class ai extends nc {
    /* renamed from: a */
    static final double f1543a = Math.cos(Math.toRadians(45.0d));
    /* renamed from: b */
    final Paint f1544b;
    /* renamed from: c */
    final Paint f1545c;
    /* renamed from: d */
    final RectF f1546d;
    /* renamed from: e */
    float f1547e;
    /* renamed from: f */
    Path f1548f;
    /* renamed from: g */
    float f1549g;
    /* renamed from: h */
    float f1550h;
    /* renamed from: i */
    float f1551i;
    /* renamed from: j */
    float f1552j;
    /* renamed from: k */
    private boolean f1553k = true;
    /* renamed from: l */
    private final int f1554l;
    /* renamed from: m */
    private final int f1555m;
    /* renamed from: n */
    private final int f1556n;
    /* renamed from: o */
    private boolean f1557o = true;
    /* renamed from: p */
    private float f1558p;
    /* renamed from: q */
    private boolean f1559q = false;

    public ai(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f1554l = ew.m21143c(context, n$c.design_fab_shadow_start_color);
        this.f1555m = ew.m21143c(context, n$c.design_fab_shadow_mid_color);
        this.f1556n = ew.m21143c(context, n$c.design_fab_shadow_end_color);
        this.f1544b = new Paint(5);
        this.f1544b.setStyle(Style.FILL);
        this.f1547e = (float) Math.round(f);
        this.f1546d = new RectF();
        this.f1545c = new Paint(this.f1544b);
        this.f1545c.setAntiAlias(false);
        m1652a(f2, f3);
    }

    /* renamed from: c */
    private static int m1648c(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    /* renamed from: a */
    public void m1653a(boolean z) {
        this.f1557o = z;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.f1544b.setAlpha(i);
        this.f1545c.setAlpha(i);
    }

    protected void onBoundsChange(Rect rect) {
        this.f1553k = true;
    }

    /* renamed from: a */
    void m1652a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float c = (float) ai.m1648c(f);
        float c2 = (float) ai.m1648c(f2);
        if (c > c2) {
            if (!this.f1559q) {
                this.f1559q = true;
            }
            c = c2;
        }
        if (this.f1552j != c || this.f1550h != c2) {
            this.f1552j = c;
            this.f1550h = c2;
            this.f1551i = (float) Math.round(c * 1.5f);
            this.f1549g = c2;
            this.f1553k = true;
            invalidateSelf();
        }
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) ai.m1644a(this.f1550h, this.f1547e, this.f1557o));
        int ceil2 = (int) Math.ceil((double) ai.m1647b(this.f1550h, this.f1547e, this.f1557o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* renamed from: a */
    public static float m1644a(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) (1.5f * f)) + ((1.0d - f1543a) * ((double) f2)));
        }
        return 1.5f * f;
    }

    /* renamed from: b */
    public static float m1647b(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) f) + ((1.0d - f1543a) * ((double) f2)));
        }
        return f;
    }

    public int getOpacity() {
        return -3;
    }

    public void draw(Canvas canvas) {
        if (this.f1553k) {
            m1646a(getBounds());
            this.f1553k = false;
        }
        m1645a(canvas);
        super.draw(canvas);
    }

    /* renamed from: a */
    final void m1651a(float f) {
        if (this.f1558p != f) {
            this.f1558p = f;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    private void m1645a(Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(this.f1558p, this.f1546d.centerX(), this.f1546d.centerY());
        float f = (-this.f1547e) - this.f1551i;
        float f2 = this.f1547e;
        Object obj = this.f1546d.width() - (2.0f * f2) > 0.0f ? 1 : null;
        Object obj2 = this.f1546d.height() - (2.0f * f2) > 0.0f ? 1 : null;
        float f3 = f2 / ((this.f1552j - (this.f1552j * 0.5f)) + f2);
        float f4 = f2 / ((this.f1552j - (this.f1552j * 0.25f)) + f2);
        float f5 = f2 / (f2 + (this.f1552j - (this.f1552j * 1.0f)));
        int save2 = canvas.save();
        canvas.translate(this.f1546d.left + f2, this.f1546d.top + f2);
        canvas.scale(f3, f4);
        canvas.drawPath(this.f1548f, this.f1544b);
        if (obj != null) {
            canvas.scale(1.0f / f3, 1.0f);
            canvas.drawRect(0.0f, f, this.f1546d.width() - (2.0f * f2), -this.f1547e, this.f1545c);
        }
        canvas.restoreToCount(save2);
        save2 = canvas.save();
        canvas.translate(this.f1546d.right - f2, this.f1546d.bottom - f2);
        canvas.scale(f3, f5);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1548f, this.f1544b);
        if (obj != null) {
            canvas.scale(1.0f / f3, 1.0f);
            canvas.drawRect(0.0f, f, this.f1546d.width() - (2.0f * f2), this.f1551i + (-this.f1547e), this.f1545c);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.f1546d.left + f2, this.f1546d.bottom - f2);
        canvas.scale(f3, f5);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1548f, this.f1544b);
        if (obj2 != null) {
            canvas.scale(1.0f / f5, 1.0f);
            canvas.drawRect(0.0f, f, this.f1546d.height() - (2.0f * f2), -this.f1547e, this.f1545c);
        }
        canvas.restoreToCount(save3);
        save3 = canvas.save();
        canvas.translate(this.f1546d.right - f2, this.f1546d.top + f2);
        canvas.scale(f3, f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1548f, this.f1544b);
        if (obj2 != null) {
            canvas.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f, this.f1546d.height() - (2.0f * f2), -this.f1547e, this.f1545c);
        }
        canvas.restoreToCount(save3);
        canvas.restoreToCount(save);
    }

    /* renamed from: c */
    private void m1649c() {
        RectF rectF = new RectF(-this.f1547e, -this.f1547e, this.f1547e, this.f1547e);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-this.f1551i, -this.f1551i);
        if (this.f1548f == null) {
            this.f1548f = new Path();
        } else {
            this.f1548f.reset();
        }
        this.f1548f.setFillType(FillType.EVEN_ODD);
        this.f1548f.moveTo(-this.f1547e, 0.0f);
        this.f1548f.rLineTo(-this.f1551i, 0.0f);
        this.f1548f.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1548f.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1548f.close();
        float f = -rectF2.top;
        if (f > 0.0f) {
            float f2 = this.f1547e / f;
            float f3 = f2 + ((1.0f - f2) / 2.0f);
            float[] fArr = new float[]{0.0f, f2, f3, 1.0f};
            f2 = 0.0f;
            this.f1544b.setShader(new RadialGradient(0.0f, f2, f, new int[]{0, this.f1554l, this.f1555m, this.f1556n}, fArr, TileMode.CLAMP));
        }
        f = 0.0f;
        this.f1545c.setShader(new LinearGradient(0.0f, rectF.top, f, rectF2.top, new int[]{this.f1554l, this.f1555m, this.f1556n}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
        this.f1545c.setAntiAlias(false);
    }

    /* renamed from: a */
    private void m1646a(Rect rect) {
        float f = this.f1550h * 1.5f;
        this.f1546d.set(((float) rect.left) + this.f1550h, ((float) rect.top) + f, ((float) rect.right) - this.f1550h, ((float) rect.bottom) - f);
        b().setBounds((int) this.f1546d.left, (int) this.f1546d.top, (int) this.f1546d.right, (int) this.f1546d.bottom);
        m1649c();
    }

    /* renamed from: b */
    public void m1654b(float f) {
        m1652a(f, this.f1550h);
    }

    /* renamed from: a */
    public float m1650a() {
        return this.f1552j;
    }
}
