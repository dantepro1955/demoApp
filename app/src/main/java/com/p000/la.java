package com.p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

/* compiled from: CircleImageView */
/* renamed from: la */
public class la extends ImageView {
    /* renamed from: a */
    int f24389a;
    /* renamed from: b */
    private AnimationListener f24390b;

    /* compiled from: CircleImageView */
    /* renamed from: la$a */
    class C5501a extends OvalShape {
        /* renamed from: a */
        final /* synthetic */ la f24386a;
        /* renamed from: b */
        private RadialGradient f24387b;
        /* renamed from: c */
        private Paint f24388c = new Paint();

        C5501a(la laVar, int i) {
            this.f24386a = laVar;
            laVar.f24389a = i;
            m32363a((int) rect().width());
        }

        protected void onResize(float f, float f2) {
            super.onResize(f, f2);
            m32363a((int) f);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = this.f24386a.getWidth();
            int height = this.f24386a.getHeight();
            canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) (width / 2), this.f24388c);
            canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) ((width / 2) - this.f24386a.f24389a), paint);
        }

        /* renamed from: a */
        private void m32363a(int i) {
            this.f24387b = new RadialGradient((float) (i / 2), (float) (i / 2), (float) this.f24386a.f24389a, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.f24388c.setShader(this.f24387b);
        }
    }

    public la(Context context, int i) {
        Drawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f24389a = (int) (3.5f * f);
        if (m32364a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            jd.h(this, f * 4.0f);
        } else {
            shapeDrawable = new ShapeDrawable(new C5501a(this, this.f24389a));
            jd.a(this, 1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer((float) this.f24389a, (float) i3, (float) i2, 503316480);
            int i4 = this.f24389a;
            setPadding(i4, i4, i4, i4);
        }
        shapeDrawable.getPaint().setColor(i);
        jd.a(this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m32364a() {
        return VERSION.SDK_INT >= 21;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m32364a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f24389a * 2), getMeasuredHeight() + (this.f24389a * 2));
        }
    }

    /* renamed from: a */
    public void m32365a(AnimationListener animationListener) {
        this.f24390b = animationListener;
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        if (this.f24390b != null) {
            this.f24390b.onAnimationStart(getAnimation());
        }
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f24390b != null) {
            this.f24390b.onAnimationEnd(getAnimation());
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
