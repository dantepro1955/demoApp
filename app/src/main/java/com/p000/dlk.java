package com.p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* compiled from: SwipeProgressBarCore */
/* renamed from: dlk */
public class dlk {
    /* renamed from: a */
    private static final Interpolator f21997a = dlj.m27835a();
    /* renamed from: b */
    private final Paint f21998b = new Paint();
    /* renamed from: c */
    private final RectF f21999c = new RectF();
    /* renamed from: d */
    private float f22000d;
    /* renamed from: e */
    private long f22001e;
    /* renamed from: f */
    private long f22002f;
    /* renamed from: g */
    private boolean f22003g;
    /* renamed from: h */
    private int f22004h;
    /* renamed from: i */
    private int f22005i;
    /* renamed from: j */
    private int f22006j;
    /* renamed from: k */
    private int f22007k;
    /* renamed from: l */
    private View f22008l;
    /* renamed from: m */
    private Rect f22009m = new Rect();

    public dlk(View view) {
        this.f22008l = view;
        this.f22004h = -1291845632;
        this.f22005i = LinearLayoutManager.INVALID_OFFSET;
        this.f22006j = 1291845632;
        this.f22007k = 436207616;
    }

    /* renamed from: a */
    public void m27839a(int i, int i2, int i3, int i4) {
        this.f22004h = i;
        this.f22005i = i2;
        this.f22006j = i3;
        this.f22007k = i4;
    }

    /* renamed from: a */
    public void m27838a() {
        if (!this.f22003g) {
            this.f22000d = 0.0f;
            this.f22001e = AnimationUtils.currentAnimationTimeMillis();
            this.f22003g = true;
            this.f22008l.postInvalidate();
        }
    }

    /* renamed from: b */
    public void m27841b() {
        if (this.f22003g) {
            this.f22000d = 0.0f;
            this.f22002f = AnimationUtils.currentAnimationTimeMillis();
            this.f22003g = false;
            this.f22008l.postInvalidate();
        }
    }

    /* renamed from: a */
    public void m27840a(Canvas canvas) {
        int width = this.f22009m.width();
        int height = this.f22009m.height();
        int i = width / 2;
        int i2 = height / 2;
        int save = canvas.save();
        canvas.clipRect(this.f22009m);
        if (this.f22003g || this.f22002f > 0) {
            Canvas canvas2;
            int i3;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = (currentAnimationTimeMillis - this.f22001e) / 2000;
            float f = ((float) ((currentAnimationTimeMillis - this.f22001e) % 2000)) / 20.0f;
            Object obj;
            if (this.f22003g) {
                obj = null;
            } else if (currentAnimationTimeMillis - this.f22002f >= 1000) {
                this.f22002f = 0;
                return;
            } else {
                float f2 = (float) (width / 2);
                float interpolation = f21997a.getInterpolation((((float) ((currentAnimationTimeMillis - this.f22002f) % 1000)) / 10.0f) / 100.0f) * f2;
                this.f21999c.set(((float) i) - interpolation, 0.0f, interpolation + ((float) i), (float) height);
                canvas.saveLayerAlpha(this.f21999c, 0, 0);
                obj = 1;
            }
            if (j == 0) {
                canvas.drawColor(this.f22004h);
            } else if (f >= 0.0f && f < 25.0f) {
                canvas.drawColor(this.f22007k);
            } else if (f >= 25.0f && f < 50.0f) {
                canvas.drawColor(this.f22004h);
            } else if (f < 50.0f || f >= 75.0f) {
                canvas.drawColor(this.f22006j);
            } else {
                canvas.drawColor(this.f22005i);
            }
            if (f >= 0.0f && f <= 25.0f) {
                canvas2 = canvas;
                m27836a(canvas2, (float) i, (float) i2, this.f22004h, ((25.0f + f) * 2.0f) / 100.0f);
            }
            if (f >= 0.0f && f <= 50.0f) {
                canvas2 = canvas;
                m27836a(canvas2, (float) i, (float) i2, this.f22005i, (2.0f * f) / 100.0f);
            }
            if (f >= 25.0f && f <= 75.0f) {
                canvas2 = canvas;
                m27836a(canvas2, (float) i, (float) i2, this.f22006j, ((f - 25.0f) * 2.0f) / 100.0f);
            }
            if (f >= 50.0f && f <= 100.0f) {
                canvas2 = canvas;
                m27836a(canvas2, (float) i, (float) i2, this.f22007k, ((f - 50.0f) * 2.0f) / 100.0f);
            }
            if (f >= 75.0f && f <= 100.0f) {
                canvas2 = canvas;
                m27836a(canvas2, (float) i, (float) i2, this.f22004h, ((f - 75.0f) * 2.0f) / 100.0f);
            }
            if (this.f22000d <= 0.0f || r9 == null) {
                i3 = save;
            } else {
                canvas.restoreToCount(save);
                i3 = canvas.save();
                canvas.clipRect(this.f22009m);
                m27837a(canvas, i, i2);
            }
            jd.c(this.f22008l);
            save = i3;
        } else if (this.f22000d > 0.0f && ((double) this.f22000d) <= 1.0d) {
            m27837a(canvas, i, i2);
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    private void m27837a(Canvas canvas, int i, int i2) {
        this.f21998b.setColor(this.f22004h);
        canvas.drawCircle((float) i, (float) i2, ((float) i) * this.f22000d, this.f21998b);
    }

    /* renamed from: a */
    private void m27836a(Canvas canvas, float f, float f2, int i, float f3) {
        this.f21998b.setColor(i);
        canvas.save();
        canvas.translate(f, f2);
        float interpolation = f21997a.getInterpolation(f3);
        canvas.scale(interpolation, interpolation);
        canvas.drawCircle(0.0f, 0.0f, f, this.f21998b);
        canvas.restore();
    }

    /* renamed from: b */
    public void m27842b(int i, int i2, int i3, int i4) {
        this.f22009m.left = i;
        this.f22009m.top = i2;
        this.f22009m.right = i3;
        this.f22009m.bottom = i4;
    }
}
