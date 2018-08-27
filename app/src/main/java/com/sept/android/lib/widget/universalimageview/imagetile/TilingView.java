package com.sept.android.lib.widget.universalimageview.imagetile;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import p000.dmc;

public class TilingView extends AbstractTilingView {
    /* renamed from: e */
    private boolean f19859e;
    /* renamed from: f */
    private Rect f19860f;
    /* renamed from: g */
    private float f19861g;
    /* renamed from: h */
    private float f19862h;
    /* renamed from: i */
    private int f19863i = 0;
    /* renamed from: j */
    private int f19864j;
    /* renamed from: k */
    private int f19865k;
    /* renamed from: l */
    private Paint f19866l;
    /* renamed from: m */
    private boolean f19867m;
    /* renamed from: n */
    private boolean f19868n;
    /* renamed from: o */
    private int f19869o = 0;
    /* renamed from: p */
    private int f19870p = 0;
    /* renamed from: q */
    private boolean f19871q = false;
    /* renamed from: r */
    private Rect f19872r;
    /* renamed from: s */
    private boolean f19873s;
    /* renamed from: t */
    private boolean f19874t;

    public TilingView(Context context) {
        super(context);
        m24202b();
    }

    public TilingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m24202b();
    }

    public TilingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24202b();
    }

    /* renamed from: b */
    private void m24202b() {
        this.f19859e = false;
        this.f19866l = new Paint();
        this.f19866l.setAntiAlias(true);
        this.f19866l.setFilterBitmap(true);
        this.f19866l.setDither(true);
        this.f19872r = new Rect();
        this.f19860f = new Rect();
        this.f19873s = true;
        this.f19874t = true;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a != null && this.f19863i != 2) {
            boolean z;
            System.currentTimeMillis();
            int a = this.a.mo4446a();
            int b = this.a.mo4447b();
            boolean localVisibleRect = getLocalVisibleRect(this.f19860f);
            boolean z2 = this.f19873s && a <= 2;
            if (this.f19874t && this.f19863i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z2 || localVisibleRect) {
                this.f19867m = true;
                this.f19868n = true;
                this.f19861g = -1.0f;
                for (int i = 0; i < a; i++) {
                    RectF rectF = this.d[i][0];
                    if (!z2) {
                        if (rectF.top > ((float) (this.f19860f.bottom + 100))) {
                            localVisibleRect = false;
                        } else {
                            localVisibleRect = true;
                        }
                        if (rectF.bottom < ((float) (this.f19860f.top - 100))) {
                            localVisibleRect = false;
                        }
                        if (!localVisibleRect) {
                            this.f19867m = false;
                            if (z && rectF.top > ((float) this.f19860f.bottom) && rectF.top < ((float) ((this.f19860f.bottom + (this.f19865k * 2)) + 100))) {
                                for (int i2 = 0; i2 < b; i2++) {
                                    this.a.mo4443a(i, i2);
                                }
                            }
                        }
                    }
                    if (this.f19861g < 0.0f) {
                        this.f19861g = rectF.top;
                    }
                    this.f19862h = rectF.bottom;
                    for (int i3 = 0; i3 < b; i3++) {
                        Bitmap bitmap = null;
                        if (this.f19863i == 0) {
                            bitmap = this.a.mo4443a(i, i3);
                        } else if (this.f19863i == 3) {
                            bitmap = this.a.mo4445b(i, i3);
                        } else if (this.f19863i == 1) {
                            bitmap = this.a.mo4444a(i, i3, 1);
                        }
                        if (bitmap != null) {
                            this.f19872r.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            canvas.drawBitmap(bitmap, this.f19872r, this.d[i][i3], this.f19866l);
                        } else {
                            this.f19867m = false;
                            this.f19868n = false;
                        }
                    }
                }
            }
        }
    }

    public void setDisplayMode(int i) {
        if (i != this.f19863i) {
            mo4096a();
        }
        this.f19863i = i;
    }

    public void setTileAdapter(dmc dmc) {
        super.setTileAdapter(dmc);
        this.f19859e = false;
        mo4096a();
        requestLayout();
    }

    /* renamed from: a */
    public void mo4096a() {
        this.f19867m = false;
        this.f19868n = false;
        this.f19861g = -1.0f;
        this.f19862h = -1.0f;
    }

    public void setSquareMode(boolean z) {
        this.f19871q = z;
        this.f19859e = false;
    }

    public int getContentWidth() {
        return this.f19869o;
    }

    public int getContentHeight() {
        return this.f19870p;
    }

    protected void onMeasure(int i, int i2) {
        if (this.a == null) {
            super.onMeasure(i, i2);
        } else if (this.a.m27919e() == 0 || this.a.m27918d() == 0) {
            setMeasuredDimension(0, 0);
        } else {
            int i3;
            int i4;
            float e = (((float) this.a.m27919e()) * 1.0f) / ((float) this.a.m27918d());
            int size = MeasureSpec.getSize(i);
            int i5 = (int) (((float) size) * e);
            if (!this.f19871q || i5 <= size) {
                i3 = size;
                i4 = i5;
            } else {
                i3 = (int) (((float) size) / e);
                i4 = size;
                i5 = size;
            }
            this.f19869o = i3;
            this.f19870p = i5;
            float e2 = (((float) i5) * 1.0f) / ((float) this.a.m27919e());
            this.f19864j = (int) (((((float) i3) * 1.0f) / ((float) this.a.m27918d())) * ((float) this.a.m27920f()));
            this.f19865k = (int) (((float) this.a.m27921g()) * e2);
            if (!this.f19859e) {
                m24201a(size, i4, i3, i5);
                this.f19859e = true;
            }
            setMeasuredDimension(size, i4);
        }
    }

    /* renamed from: a */
    private void m24201a(int i, int i2, int i3, int i4) {
        int i5 = (i - i3) / 2;
        int i6 = (i2 - i4) / 2;
        int i7 = i6;
        for (int i8 = 0; i8 < this.b; i8++) {
            int i9 = i5;
            for (int i10 = 0; i10 < this.c; i10++) {
                int min = Math.min(this.f19864j + i9, i5 + i3);
                int min2 = Math.min(this.f19865k + i7, i6 + i4);
                RectF rectF = this.d[i8][i10];
                rectF.left = (float) i9;
                rectF.right = (float) min;
                rectF.top = (float) i7;
                rectF.bottom = (float) min2;
                i9 += this.f19864j;
            }
            i7 += this.f19865k;
        }
    }

    public void setEnableSmartDraw(boolean z) {
        this.f19873s = z;
    }
}
