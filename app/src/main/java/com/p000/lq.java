package com.p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.mopub.mobileads.resource.DrawableConstants.CtaButton;
import java.util.ArrayList;

/* compiled from: MaterialProgressDrawable */
/* renamed from: lq */
public class lq extends Drawable implements Animatable {
    /* renamed from: a */
    static final Interpolator f24437a = new kw();
    /* renamed from: d */
    private static final Interpolator f24438d = new LinearInterpolator();
    /* renamed from: e */
    private static final int[] f24439e = new int[]{CtaButton.BACKGROUND_COLOR};
    /* renamed from: b */
    float f24440b;
    /* renamed from: c */
    boolean f24441c;
    /* renamed from: f */
    private final ArrayList<Animation> f24442f = new ArrayList();
    /* renamed from: g */
    private final C5513a f24443g;
    /* renamed from: h */
    private float f24444h;
    /* renamed from: i */
    private Resources f24445i;
    /* renamed from: j */
    private View f24446j;
    /* renamed from: k */
    private Animation f24447k;
    /* renamed from: l */
    private double f24448l;
    /* renamed from: m */
    private double f24449m;
    /* renamed from: n */
    private final Callback f24450n = new C55123(this);

    /* compiled from: MaterialProgressDrawable */
    /* renamed from: lq$3 */
    class C55123 implements Callback {
        /* renamed from: a */
        final /* synthetic */ lq f24412a;

        C55123(lq lqVar) {
            this.f24412a = lqVar;
        }

        public void invalidateDrawable(Drawable drawable) {
            this.f24412a.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            this.f24412a.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            this.f24412a.unscheduleSelf(runnable);
        }
    }

    /* compiled from: MaterialProgressDrawable */
    /* renamed from: lq$a */
    static class C5513a {
        /* renamed from: a */
        private final RectF f24413a = new RectF();
        /* renamed from: b */
        private final Paint f24414b = new Paint();
        /* renamed from: c */
        private final Paint f24415c = new Paint();
        /* renamed from: d */
        private final Callback f24416d;
        /* renamed from: e */
        private float f24417e = 0.0f;
        /* renamed from: f */
        private float f24418f = 0.0f;
        /* renamed from: g */
        private float f24419g = 0.0f;
        /* renamed from: h */
        private float f24420h = 5.0f;
        /* renamed from: i */
        private float f24421i = 2.5f;
        /* renamed from: j */
        private int[] f24422j;
        /* renamed from: k */
        private int f24423k;
        /* renamed from: l */
        private float f24424l;
        /* renamed from: m */
        private float f24425m;
        /* renamed from: n */
        private float f24426n;
        /* renamed from: o */
        private boolean f24427o;
        /* renamed from: p */
        private Path f24428p;
        /* renamed from: q */
        private float f24429q;
        /* renamed from: r */
        private double f24430r;
        /* renamed from: s */
        private int f24431s;
        /* renamed from: t */
        private int f24432t;
        /* renamed from: u */
        private int f24433u;
        /* renamed from: v */
        private final Paint f24434v = new Paint(1);
        /* renamed from: w */
        private int f24435w;
        /* renamed from: x */
        private int f24436x;

        C5513a(Callback callback) {
            this.f24416d = callback;
            this.f24414b.setStrokeCap(Cap.SQUARE);
            this.f24414b.setAntiAlias(true);
            this.f24414b.setStyle(Style.STROKE);
            this.f24415c.setStyle(Style.FILL);
            this.f24415c.setAntiAlias(true);
        }

        /* renamed from: a */
        public void m32453a(int i) {
            this.f24435w = i;
        }

        /* renamed from: a */
        public void m32452a(float f, float f2) {
            this.f24431s = (int) f;
            this.f24432t = (int) f2;
        }

        /* renamed from: a */
        public void m32455a(Canvas canvas, Rect rect) {
            RectF rectF = this.f24413a;
            rectF.set(rect);
            rectF.inset(this.f24421i, this.f24421i);
            float f = (this.f24417e + this.f24419g) * 360.0f;
            float f2 = ((this.f24418f + this.f24419g) * 360.0f) - f;
            this.f24414b.setColor(this.f24436x);
            canvas.drawArc(rectF, f, f2, false, this.f24414b);
            m32446a(canvas, f, f2, rect);
            if (this.f24433u < 255) {
                this.f24434v.setColor(this.f24435w);
                this.f24434v.setAlpha(255 - this.f24433u);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), (float) (rect.width() / 2), this.f24434v);
            }
        }

        /* renamed from: a */
        private void m32446a(Canvas canvas, float f, float f2, Rect rect) {
            if (this.f24427o) {
                if (this.f24428p == null) {
                    this.f24428p = new Path();
                    this.f24428p.setFillType(FillType.EVEN_ODD);
                } else {
                    this.f24428p.reset();
                }
                float f3 = ((float) (((int) this.f24421i) / 2)) * this.f24429q;
                float cos = (float) ((this.f24430r * Math.cos(0.0d)) + ((double) rect.exactCenterX()));
                float sin = (float) ((this.f24430r * Math.sin(0.0d)) + ((double) rect.exactCenterY()));
                this.f24428p.moveTo(0.0f, 0.0f);
                this.f24428p.lineTo(((float) this.f24431s) * this.f24429q, 0.0f);
                this.f24428p.lineTo((((float) this.f24431s) * this.f24429q) / 2.0f, ((float) this.f24432t) * this.f24429q);
                this.f24428p.offset(cos - f3, sin);
                this.f24428p.close();
                this.f24415c.setColor(this.f24436x);
                canvas.rotate((f + f2) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.f24428p, this.f24415c);
            }
        }

        /* renamed from: a */
        public void m32458a(int[] iArr) {
            this.f24422j = iArr;
            m32464c(0);
        }

        /* renamed from: b */
        public void m32461b(int i) {
            this.f24436x = i;
        }

        /* renamed from: c */
        public void m32464c(int i) {
            this.f24423k = i;
            this.f24436x = this.f24422j[this.f24423k];
        }

        /* renamed from: a */
        public int m32449a() {
            return this.f24422j[m32447n()];
        }

        /* renamed from: n */
        private int m32447n() {
            return (this.f24423k + 1) % this.f24422j.length;
        }

        /* renamed from: b */
        public void m32459b() {
            m32464c(m32447n());
        }

        /* renamed from: a */
        public void m32456a(ColorFilter colorFilter) {
            this.f24414b.setColorFilter(colorFilter);
            m32448o();
        }

        /* renamed from: d */
        public void m32467d(int i) {
            this.f24433u = i;
        }

        /* renamed from: c */
        public int m32462c() {
            return this.f24433u;
        }

        /* renamed from: a */
        public void m32451a(float f) {
            this.f24420h = f;
            this.f24414b.setStrokeWidth(f);
            m32448o();
        }

        /* renamed from: d */
        public float m32465d() {
            return this.f24420h;
        }

        /* renamed from: b */
        public void m32460b(float f) {
            this.f24417e = f;
            m32448o();
        }

        /* renamed from: e */
        public float m32468e() {
            return this.f24417e;
        }

        /* renamed from: f */
        public float m32470f() {
            return this.f24424l;
        }

        /* renamed from: g */
        public float m32471g() {
            return this.f24425m;
        }

        /* renamed from: h */
        public int m32472h() {
            return this.f24422j[this.f24423k];
        }

        /* renamed from: c */
        public void m32463c(float f) {
            this.f24418f = f;
            m32448o();
        }

        /* renamed from: i */
        public float m32473i() {
            return this.f24418f;
        }

        /* renamed from: d */
        public void m32466d(float f) {
            this.f24419g = f;
            m32448o();
        }

        /* renamed from: a */
        public void m32454a(int i, int i2) {
            float min = (float) Math.min(i, i2);
            if (this.f24430r <= 0.0d || min < 0.0f) {
                min = (float) Math.ceil((double) (this.f24420h / 2.0f));
            } else {
                min = (float) (((double) (min / 2.0f)) - this.f24430r);
            }
            this.f24421i = min;
        }

        /* renamed from: a */
        public void m32450a(double d) {
            this.f24430r = d;
        }

        /* renamed from: j */
        public double m32474j() {
            return this.f24430r;
        }

        /* renamed from: a */
        public void m32457a(boolean z) {
            if (this.f24427o != z) {
                this.f24427o = z;
                m32448o();
            }
        }

        /* renamed from: e */
        public void m32469e(float f) {
            if (f != this.f24429q) {
                this.f24429q = f;
                m32448o();
            }
        }

        /* renamed from: k */
        public float m32475k() {
            return this.f24426n;
        }

        /* renamed from: l */
        public void m32476l() {
            this.f24424l = this.f24417e;
            this.f24425m = this.f24418f;
            this.f24426n = this.f24419g;
        }

        /* renamed from: m */
        public void m32477m() {
            this.f24424l = 0.0f;
            this.f24425m = 0.0f;
            this.f24426n = 0.0f;
            m32460b(0.0f);
            m32463c(0.0f);
            m32466d(0.0f);
        }

        /* renamed from: o */
        private void m32448o() {
            this.f24416d.invalidateDrawable(null);
        }
    }

    public lq(Context context, View view) {
        this.f24446j = view;
        this.f24445i = context.getResources();
        this.f24443g = new C5513a(this.f24450n);
        this.f24443g.m32458a(f24439e);
        m32485a(1);
        m32479a();
    }

    /* renamed from: a */
    private void m32480a(double d, double d2, double d3, double d4, float f, float f2) {
        C5513a c5513a = this.f24443g;
        float f3 = this.f24445i.getDisplayMetrics().density;
        this.f24448l = ((double) f3) * d;
        this.f24449m = ((double) f3) * d2;
        c5513a.m32451a(((float) d4) * f3);
        c5513a.m32450a(((double) f3) * d3);
        c5513a.m32464c(0);
        c5513a.m32452a(f * f3, f3 * f2);
        c5513a.m32454a((int) this.f24448l, (int) this.f24449m);
    }

    /* renamed from: a */
    public void m32485a(int i) {
        if (i == 0) {
            m32480a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            m32480a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    /* renamed from: a */
    public void m32486a(boolean z) {
        this.f24443g.m32457a(z);
    }

    /* renamed from: a */
    public void m32482a(float f) {
        this.f24443g.m32469e(f);
    }

    /* renamed from: a */
    public void m32483a(float f, float f2) {
        this.f24443g.m32460b(f);
        this.f24443g.m32463c(f2);
    }

    /* renamed from: b */
    public void m32488b(float f) {
        this.f24443g.m32466d(f);
    }

    /* renamed from: b */
    public void m32490b(int i) {
        this.f24443g.m32453a(i);
    }

    /* renamed from: a */
    public void m32487a(int... iArr) {
        this.f24443g.m32458a(iArr);
        this.f24443g.m32464c(0);
    }

    public int getIntrinsicHeight() {
        return (int) this.f24449m;
    }

    public int getIntrinsicWidth() {
        return (int) this.f24448l;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f24444h, bounds.exactCenterX(), bounds.exactCenterY());
        this.f24443g.m32455a(canvas, bounds);
        canvas.restoreToCount(save);
    }

    public void setAlpha(int i) {
        this.f24443g.m32467d(i);
    }

    public int getAlpha() {
        return this.f24443g.m32462c();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f24443g.m32456a(colorFilter);
    }

    /* renamed from: c */
    void m32491c(float f) {
        this.f24444h = f;
        invalidateSelf();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        ArrayList arrayList = this.f24442f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animation animation = (Animation) arrayList.get(i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    public void start() {
        this.f24447k.reset();
        this.f24443g.m32476l();
        if (this.f24443g.m32473i() != this.f24443g.m32468e()) {
            this.f24441c = true;
            this.f24447k.setDuration(666);
            this.f24446j.startAnimation(this.f24447k);
            return;
        }
        this.f24443g.m32464c(0);
        this.f24443g.m32477m();
        this.f24447k.setDuration(1332);
        this.f24446j.startAnimation(this.f24447k);
    }

    public void stop() {
        this.f24446j.clearAnimation();
        m32491c(0.0f);
        this.f24443g.m32457a(false);
        this.f24443g.m32464c(0);
        this.f24443g.m32477m();
    }

    /* renamed from: a */
    float m32481a(C5513a c5513a) {
        return (float) Math.toRadians(((double) c5513a.m32465d()) / (6.283185307179586d * c5513a.m32474j()));
    }

    /* renamed from: a */
    private int m32478a(float f, int i, int i2) {
        int intValue = Integer.valueOf(i).intValue();
        int i3 = (intValue >> 24) & 255;
        int i4 = (intValue >> 16) & 255;
        int i5 = (intValue >> 8) & 255;
        intValue &= 255;
        int intValue2 = Integer.valueOf(i2).intValue();
        return (intValue + ((int) (((float) ((intValue2 & 255) - intValue)) * f))) | ((((i3 + ((int) (((float) (((intValue2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((intValue2 >> 16) & 255) - i4)) * f))) << 16)) | ((((int) (((float) (((intValue2 >> 8) & 255) - i5)) * f)) + i5) << 8));
    }

    /* renamed from: a */
    void m32484a(float f, C5513a c5513a) {
        if (f > 0.75f) {
            c5513a.m32461b(m32478a((f - 0.75f) / 0.25f, c5513a.m32472h(), c5513a.m32449a()));
        }
    }

    /* renamed from: b */
    void m32489b(float f, C5513a c5513a) {
        m32484a(f, c5513a);
        float floor = (float) (Math.floor((double) (c5513a.m32475k() / 0.8f)) + 1.0d);
        float a = m32481a(c5513a);
        c5513a.m32460b((((c5513a.m32471g() - a) - c5513a.m32470f()) * f) + c5513a.m32470f());
        c5513a.m32463c(c5513a.m32471g());
        c5513a.m32466d(((floor - c5513a.m32475k()) * f) + c5513a.m32475k());
    }

    /* renamed from: a */
    private void m32479a() {
        final C5513a c5513a = this.f24443g;
        Animation c55101 = new Animation(this) {
            /* renamed from: b */
            final /* synthetic */ lq f24409b;

            public void applyTransformation(float f, Transformation transformation) {
                if (this.f24409b.f24441c) {
                    this.f24409b.m32489b(f, c5513a);
                    return;
                }
                float a = this.f24409b.m32481a(c5513a);
                float g = c5513a.m32471g();
                float f2 = c5513a.m32470f();
                float k = c5513a.m32475k();
                this.f24409b.m32484a(f, c5513a);
                if (f <= 0.5f) {
                    float f3 = 0.8f - a;
                    c5513a.m32460b(f2 + (lq.f24437a.getInterpolation(f / 0.5f) * f3));
                }
                if (f > 0.5f) {
                    c5513a.m32463c(((0.8f - a) * lq.f24437a.getInterpolation((f - 0.5f) / 0.5f)) + g);
                }
                c5513a.m32466d((0.25f * f) + k);
                this.f24409b.m32491c((216.0f * f) + (1080.0f * (this.f24409b.f24440b / 5.0f)));
            }
        };
        c55101.setRepeatCount(-1);
        c55101.setRepeatMode(1);
        c55101.setInterpolator(f24438d);
        c55101.setAnimationListener(new AnimationListener(this) {
            /* renamed from: b */
            final /* synthetic */ lq f24411b;

            public void onAnimationStart(Animation animation) {
                this.f24411b.f24440b = 0.0f;
            }

            public void onAnimationEnd(Animation animation) {
            }

            public void onAnimationRepeat(Animation animation) {
                c5513a.m32476l();
                c5513a.m32459b();
                c5513a.m32460b(c5513a.m32473i());
                if (this.f24411b.f24441c) {
                    this.f24411b.f24441c = false;
                    animation.setDuration(1332);
                    c5513a.m32457a(false);
                    return;
                }
                this.f24411b.f24440b = (this.f24411b.f24440b + 1.0f) % 5.0f;
            }
        });
        this.f24447k = c55101;
    }
}
