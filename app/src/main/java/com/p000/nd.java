package com.p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: DrawerArrowDrawable */
/* renamed from: nd */
public class nd extends Drawable {
    /* renamed from: b */
    private static final float f24693b = ((float) Math.toRadians(45.0d));
    /* renamed from: a */
    private final Paint f24694a;
    /* renamed from: c */
    private float f24695c;
    /* renamed from: d */
    private float f24696d;
    /* renamed from: e */
    private float f24697e;
    /* renamed from: f */
    private float f24698f;
    /* renamed from: g */
    private boolean f24699g;
    /* renamed from: h */
    private final Path f24700h;
    /* renamed from: i */
    private final int f24701i;
    /* renamed from: j */
    private boolean f24702j;
    /* renamed from: k */
    private float f24703k;
    /* renamed from: l */
    private float f24704l;
    /* renamed from: m */
    private int f24705m;

    /* renamed from: a */
    public void m32950a(boolean z) {
        if (this.f24702j != z) {
            this.f24702j = z;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        int i;
        float f;
        float f2;
        Rect bounds = getBounds();
        switch (this.f24705m) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 3:
                if (fp.i(this) != 0) {
                    i = 0;
                    break;
                } else {
                    i = 1;
                    break;
                }
            default:
                if (fp.i(this) != 1) {
                    i = 0;
                    break;
                } else {
                    i = 1;
                    break;
                }
        }
        float a = nd.m32948a(this.f24696d, (float) Math.sqrt((double) ((this.f24695c * this.f24695c) * 2.0f)), this.f24703k);
        float a2 = nd.m32948a(this.f24696d, this.f24697e, this.f24703k);
        float round = (float) Math.round(nd.m32948a(0.0f, this.f24704l, this.f24703k));
        float a3 = nd.m32948a(0.0f, f24693b, this.f24703k);
        if (i != 0) {
            f = 0.0f;
        } else {
            f = -180.0f;
        }
        if (i != 0) {
            f2 = 180.0f;
        } else {
            f2 = 0.0f;
        }
        f2 = nd.m32948a(f, f2, this.f24703k);
        f = (float) Math.round(((double) a) * Math.cos((double) a3));
        a = (float) Math.round(((double) a) * Math.sin((double) a3));
        this.f24700h.rewind();
        a3 = nd.m32948a(this.f24698f + this.f24694a.getStrokeWidth(), -this.f24704l, this.f24703k);
        float f3 = (-a2) / 2.0f;
        this.f24700h.moveTo(f3 + round, 0.0f);
        this.f24700h.rLineTo(a2 - (round * 2.0f), 0.0f);
        this.f24700h.moveTo(f3, a3);
        this.f24700h.rLineTo(f, a);
        this.f24700h.moveTo(f3, -a3);
        this.f24700h.rLineTo(f, -a);
        this.f24700h.close();
        canvas.save();
        f = this.f24694a.getStrokeWidth();
        canvas.translate((float) bounds.centerX(), (float) (((double) ((float) ((((int) ((((float) bounds.height()) - (3.0f * f)) - (this.f24698f * 2.0f))) / 4) * 2))) + ((((double) f) * 1.5d) + ((double) this.f24698f))));
        if (this.f24699g) {
            canvas.rotate(((float) ((i ^ this.f24702j) != 0 ? -1 : 1)) * f2);
        } else if (i != 0) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f24700h, this.f24694a);
        canvas.restore();
    }

    public void setAlpha(int i) {
        if (i != this.f24694a.getAlpha()) {
            this.f24694a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f24694a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getIntrinsicHeight() {
        return this.f24701i;
    }

    public int getIntrinsicWidth() {
        return this.f24701i;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: a */
    public void m32949a(float f) {
        if (this.f24703k != f) {
            this.f24703k = f;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    private static float m32948a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }
}
