package com.sept.android.lib.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.OverScroller;
import android.widget.Scroller;

public class TouchImageView extends ImageView {
    /* renamed from: A */
    private OnTouchListener f19560A = null;
    /* renamed from: B */
    private C4449e f19561B = null;
    /* renamed from: C */
    private boolean f19562C = false;
    /* renamed from: D */
    private boolean f19563D = true;
    /* renamed from: a */
    private float f19564a;
    /* renamed from: b */
    private Matrix f19565b;
    /* renamed from: c */
    private Matrix f19566c;
    /* renamed from: d */
    private C4452h f19567d;
    /* renamed from: e */
    private float f19568e;
    /* renamed from: f */
    private float f19569f;
    /* renamed from: g */
    private float f19570g;
    /* renamed from: h */
    private float f19571h;
    /* renamed from: i */
    private float[] f19572i;
    /* renamed from: j */
    private Context f19573j;
    /* renamed from: k */
    private C4447c f19574k;
    /* renamed from: l */
    private ScaleType f19575l;
    /* renamed from: m */
    private boolean f19576m;
    /* renamed from: n */
    private boolean f19577n;
    /* renamed from: o */
    private C4453i f19578o;
    /* renamed from: p */
    private int f19579p;
    /* renamed from: q */
    private int f19580q;
    /* renamed from: r */
    private int f19581r;
    /* renamed from: s */
    private int f19582s;
    /* renamed from: t */
    private float f19583t;
    /* renamed from: u */
    private float f19584u;
    /* renamed from: v */
    private float f19585v;
    /* renamed from: w */
    private float f19586w;
    /* renamed from: x */
    private ScaleGestureDetector f19587x;
    /* renamed from: y */
    private GestureDetector f19588y;
    /* renamed from: z */
    private OnDoubleTapListener f19589z = null;

    /* renamed from: com.sept.android.lib.widget.TouchImageView$1 */
    static /* synthetic */ class C44441 {
        /* renamed from: a */
        static final /* synthetic */ int[] f19526a = new int[ScaleType.values().length];

        static {
            try {
                f19526a[ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f19526a[ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f19526a[ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f19526a[ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f19526a[ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    @TargetApi(9)
    /* renamed from: com.sept.android.lib.widget.TouchImageView$a */
    class C4445a {
        /* renamed from: a */
        Scroller f19527a;
        /* renamed from: b */
        OverScroller f19528b;
        /* renamed from: c */
        boolean f19529c;
        /* renamed from: d */
        final /* synthetic */ TouchImageView f19530d;

        public C4445a(TouchImageView touchImageView, Context context) {
            this.f19530d = touchImageView;
            if (VERSION.SDK_INT < 9) {
                this.f19529c = true;
                this.f19527a = new Scroller(context);
                return;
            }
            this.f19529c = false;
            this.f19528b = new OverScroller(context);
        }

        /* renamed from: a */
        public void m23884a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f19529c) {
                this.f19527a.fling(i, i2, i3, i4, i5, i6, i7, i8);
            } else {
                this.f19528b.fling(i, i2, i3, i4, i5, i6, i7, i8);
            }
        }

        /* renamed from: a */
        public void m23885a(boolean z) {
            if (this.f19529c) {
                this.f19527a.forceFinished(z);
            } else {
                this.f19528b.forceFinished(z);
            }
        }

        /* renamed from: a */
        public boolean m23886a() {
            if (this.f19529c) {
                return this.f19527a.isFinished();
            }
            return this.f19528b.isFinished();
        }

        /* renamed from: b */
        public boolean m23887b() {
            if (this.f19529c) {
                return this.f19527a.computeScrollOffset();
            }
            this.f19528b.computeScrollOffset();
            return this.f19528b.computeScrollOffset();
        }

        /* renamed from: c */
        public int m23888c() {
            if (this.f19529c) {
                return this.f19527a.getCurrX();
            }
            return this.f19528b.getCurrX();
        }

        /* renamed from: d */
        public int m23889d() {
            if (this.f19529c) {
                return this.f19527a.getCurrY();
            }
            return this.f19528b.getCurrY();
        }
    }

    /* renamed from: com.sept.android.lib.widget.TouchImageView$b */
    class C4446b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ TouchImageView f19531a;
        /* renamed from: b */
        private long f19532b;
        /* renamed from: c */
        private float f19533c;
        /* renamed from: d */
        private float f19534d;
        /* renamed from: e */
        private float f19535e;
        /* renamed from: f */
        private float f19536f;
        /* renamed from: g */
        private boolean f19537g;
        /* renamed from: h */
        private AccelerateDecelerateInterpolator f19538h = new AccelerateDecelerateInterpolator();
        /* renamed from: i */
        private PointF f19539i;
        /* renamed from: j */
        private PointF f19540j;

        C4446b(TouchImageView touchImageView, float f, float f2, float f3, boolean z) {
            this.f19531a = touchImageView;
            touchImageView.setState(C4452h.ANIMATE_ZOOM);
            this.f19532b = System.currentTimeMillis();
            this.f19533c = touchImageView.f19564a;
            this.f19534d = f;
            this.f19537g = z;
            PointF a = touchImageView.m23901a(f2, f3, false);
            this.f19535e = a.x;
            this.f19536f = a.y;
            this.f19539i = touchImageView.m23900a(this.f19535e, this.f19536f);
            this.f19540j = new PointF((float) (touchImageView.f19579p / 2), (float) (touchImageView.f19580q / 2));
        }

        public void run() {
            float a = m23890a();
            this.f19531a.m23906a(m23892b(a), this.f19535e, this.f19536f, this.f19537g);
            m23891a(a);
            this.f19531a.m23920e();
            this.f19531a.setImageMatrix(this.f19531a.f19565b);
            if (this.f19531a.f19561B != null) {
                this.f19531a.f19561B.m23894a();
            }
            if (a < 1.0f) {
                this.f19531a.m23912a((Runnable) this);
            } else {
                this.f19531a.setState(C4452h.NONE);
            }
        }

        /* renamed from: a */
        private void m23891a(float f) {
            float f2 = this.f19539i.x + ((this.f19540j.x - this.f19539i.x) * f);
            float f3 = this.f19539i.y + ((this.f19540j.y - this.f19539i.y) * f);
            PointF a = this.f19531a.m23900a(this.f19535e, this.f19536f);
            this.f19531a.f19565b.postTranslate(f2 - a.x, f3 - a.y);
        }

        /* renamed from: a */
        private float m23890a() {
            return this.f19538h.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.f19532b)) / 500.0f));
        }

        /* renamed from: b */
        private double m23892b(float f) {
            return ((double) (this.f19533c + ((this.f19534d - this.f19533c) * f))) / ((double) this.f19531a.f19564a);
        }
    }

    /* renamed from: com.sept.android.lib.widget.TouchImageView$c */
    class C4447c implements Runnable {
        /* renamed from: a */
        C4445a f19541a;
        /* renamed from: b */
        int f19542b;
        /* renamed from: c */
        int f19543c;
        /* renamed from: d */
        final /* synthetic */ TouchImageView f19544d;

        C4447c(TouchImageView touchImageView, int i, int i2) {
            int k;
            int i3;
            int m;
            int i4;
            this.f19544d = touchImageView;
            touchImageView.setState(C4452h.FLING);
            this.f19541a = new C4445a(touchImageView, touchImageView.f19573j);
            touchImageView.f19565b.getValues(touchImageView.f19572i);
            int i5 = (int) touchImageView.f19572i[2];
            int i6 = (int) touchImageView.f19572i[5];
            if (touchImageView.getImageWidth() > ((float) touchImageView.f19579p)) {
                k = touchImageView.f19579p - ((int) touchImageView.getImageWidth());
                i3 = 0;
            } else {
                i3 = i5;
                k = i5;
            }
            if (touchImageView.getImageHeight() > ((float) touchImageView.f19580q)) {
                m = touchImageView.f19580q - ((int) touchImageView.getImageHeight());
                i4 = 0;
            } else {
                i4 = i6;
                m = i6;
            }
            this.f19541a.m23884a(i5, i6, i, i2, k, i3, m, i4);
            this.f19542b = i5;
            this.f19543c = i6;
        }

        /* renamed from: a */
        public void m23893a() {
            if (this.f19541a != null) {
                this.f19544d.setState(C4452h.NONE);
                this.f19541a.m23885a(true);
            }
        }

        public void run() {
            if (this.f19544d.f19561B != null) {
                this.f19544d.f19561B.m23894a();
            }
            if (this.f19541a.m23886a()) {
                this.f19541a = null;
            } else if (this.f19541a.m23887b()) {
                int c = this.f19541a.m23888c();
                int d = this.f19541a.m23889d();
                int i = c - this.f19542b;
                int i2 = d - this.f19543c;
                this.f19542b = c;
                this.f19543c = d;
                this.f19544d.f19565b.postTranslate((float) i, (float) i2);
                this.f19544d.m23918d();
                this.f19544d.setImageMatrix(this.f19544d.f19565b);
                this.f19544d.m23912a((Runnable) this);
            }
        }
    }

    /* renamed from: com.sept.android.lib.widget.TouchImageView$d */
    class C4448d extends SimpleOnGestureListener {
        /* renamed from: a */
        final /* synthetic */ TouchImageView f19545a;

        private C4448d(TouchImageView touchImageView) {
            this.f19545a = touchImageView;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (this.f19545a.f19589z != null) {
                return this.f19545a.f19589z.onSingleTapConfirmed(motionEvent);
            }
            return this.f19545a.performClick();
        }

        public void onLongPress(MotionEvent motionEvent) {
            this.f19545a.performLongClick();
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (this.f19545a.f19574k != null) {
                this.f19545a.f19574k.m23893a();
            }
            this.f19545a.f19574k = new C4447c(this.f19545a, (int) f, (int) f2);
            this.f19545a.m23912a(this.f19545a.f19574k);
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (!this.f19545a.f19563D) {
                return false;
            }
            boolean onDoubleTap;
            if (this.f19545a.f19589z != null) {
                onDoubleTap = this.f19545a.f19589z.onDoubleTap(motionEvent);
            } else {
                onDoubleTap = false;
            }
            if (this.f19545a.f19567d == C4452h.NONE) {
                this.f19545a.m23912a(new C4446b(this.f19545a, this.f19545a.f19564a == this.f19545a.f19568e ? this.f19545a.f19569f : this.f19545a.f19568e, motionEvent.getX(), motionEvent.getY(), false));
                onDoubleTap = true;
            }
            return onDoubleTap;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (this.f19545a.f19589z != null) {
                return this.f19545a.f19589z.onDoubleTapEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.sept.android.lib.widget.TouchImageView$e */
    public interface C4449e {
        /* renamed from: a */
        void m23894a();

        /* renamed from: b */
        void m23895b();

        /* renamed from: c */
        void m23896c();
    }

    /* renamed from: com.sept.android.lib.widget.TouchImageView$f */
    class C4450f implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ TouchImageView f19546a;
        /* renamed from: b */
        private PointF f19547b;

        private C4450f(TouchImageView touchImageView) {
            this.f19546a = touchImageView;
            this.f19547b = new PointF();
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.f19546a.f19587x.onTouchEvent(motionEvent);
            this.f19546a.f19588y.onTouchEvent(motionEvent);
            PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            if (this.f19546a.f19567d == C4452h.NONE || this.f19546a.f19567d == C4452h.DRAG || this.f19546a.f19567d == C4452h.FLING) {
                switch (motionEvent.getAction()) {
                    case 0:
                        this.f19547b.set(pointF);
                        if (this.f19546a.f19574k != null) {
                            this.f19546a.f19574k.m23893a();
                        }
                        this.f19546a.setState(C4452h.DRAG);
                        if (this.f19546a.f19561B != null) {
                            this.f19546a.f19561B.m23895b();
                            break;
                        }
                        break;
                    case 1:
                    case 6:
                        this.f19546a.setState(C4452h.NONE);
                        if (this.f19546a.f19561B != null) {
                            this.f19546a.f19561B.m23896c();
                            break;
                        }
                        break;
                    case 2:
                        if (this.f19546a.f19567d == C4452h.DRAG) {
                            float f = pointF.y - this.f19547b.y;
                            this.f19546a.f19565b.postTranslate(this.f19546a.m23913b(pointF.x - this.f19547b.x, (float) this.f19546a.f19579p, this.f19546a.getImageWidth()), this.f19546a.m23913b(f, (float) this.f19546a.f19580q, this.f19546a.getImageHeight()));
                            this.f19546a.m23918d();
                            this.f19547b.set(pointF.x, pointF.y);
                            break;
                        }
                        break;
                }
            }
            this.f19546a.setImageMatrix(this.f19546a.f19565b);
            if (this.f19546a.f19560A != null) {
                this.f19546a.f19560A.onTouch(view, motionEvent);
            }
            if (this.f19546a.f19561B != null) {
                this.f19546a.f19561B.m23894a();
            }
            return true;
        }
    }

    /* renamed from: com.sept.android.lib.widget.TouchImageView$g */
    class C4451g extends SimpleOnScaleGestureListener {
        /* renamed from: a */
        final /* synthetic */ TouchImageView f19548a;

        private C4451g(TouchImageView touchImageView) {
            this.f19548a = touchImageView;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            this.f19548a.setState(C4452h.ZOOM);
            return true;
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            this.f19548a.m23906a((double) scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), true);
            if (this.f19548a.f19561B != null) {
                this.f19548a.f19561B.m23894a();
            }
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            super.onScaleEnd(scaleGestureDetector);
            this.f19548a.setState(C4452h.NONE);
            boolean z = false;
            float e = this.f19548a.f19564a;
            if (this.f19548a.f19564a > this.f19548a.f19569f) {
                e = this.f19548a.f19569f;
                z = true;
            } else if (this.f19548a.f19564a < this.f19548a.f19568e) {
                e = this.f19548a.f19568e;
                z = true;
            }
            if (z) {
                this.f19548a.m23912a(new C4446b(this.f19548a, e, (float) (this.f19548a.f19579p / 2), (float) (this.f19548a.f19580q / 2), true));
            }
        }
    }

    /* renamed from: com.sept.android.lib.widget.TouchImageView$h */
    enum C4452h {
        NONE,
        DRAG,
        ZOOM,
        FLING,
        ANIMATE_ZOOM
    }

    /* renamed from: com.sept.android.lib.widget.TouchImageView$i */
    class C4453i {
        /* renamed from: a */
        public float f19555a;
        /* renamed from: b */
        public float f19556b;
        /* renamed from: c */
        public float f19557c;
        /* renamed from: d */
        public ScaleType f19558d;
        /* renamed from: e */
        final /* synthetic */ TouchImageView f19559e;

        public C4453i(TouchImageView touchImageView, float f, float f2, float f3, ScaleType scaleType) {
            this.f19559e = touchImageView;
            this.f19555a = f;
            this.f19556b = f2;
            this.f19557c = f3;
            this.f19558d = scaleType;
        }
    }

    public TouchImageView(Context context) {
        super(context);
        m23908a(context);
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23908a(context);
    }

    public TouchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23908a(context);
    }

    public void setFollowWidth(boolean z) {
        this.f19562C = z;
    }

    public void setDoubleTapEnabled(boolean z) {
        this.f19563D = z;
    }

    /* renamed from: a */
    private void m23908a(Context context) {
        super.setClickable(true);
        this.f19573j = context;
        this.f19587x = new ScaleGestureDetector(context, new C4451g());
        this.f19588y = new GestureDetector(context, new C4448d());
        this.f19565b = new Matrix();
        this.f19566c = new Matrix();
        this.f19572i = new float[9];
        this.f19564a = 1.0f;
        if (this.f19575l == null) {
            this.f19575l = ScaleType.FIT_CENTER;
        }
        this.f19568e = 1.0f;
        this.f19569f = 3.0f;
        this.f19570g = 0.75f * this.f19568e;
        this.f19571h = 1.25f * this.f19569f;
        setImageMatrix(this.f19565b);
        setScaleType(ScaleType.MATRIX);
        setState(C4452h.NONE);
        this.f19577n = false;
        super.setOnTouchListener(new C4450f());
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f19560A = onTouchListener;
    }

    public void setOnTouchImageViewListener(C4449e c4449e) {
        this.f19561B = c4449e;
    }

    public void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) {
        this.f19589z = onDoubleTapListener;
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        m23915c();
        m23922f();
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m23915c();
        m23922f();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m23915c();
        m23922f();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m23915c();
        m23922f();
    }

    public void setScaleType(ScaleType scaleType) {
        if (scaleType == ScaleType.FIT_START || scaleType == ScaleType.FIT_END) {
            throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
        } else if (scaleType == ScaleType.MATRIX) {
            super.setScaleType(ScaleType.MATRIX);
        } else {
            this.f19575l = scaleType;
            if (this.f19577n) {
                setZoom(this);
            }
        }
    }

    public ScaleType getScaleType() {
        return this.f19575l;
    }

    /* renamed from: a */
    public boolean m23937a() {
        return this.f19564a != 1.0f;
    }

    public RectF getZoomedRect() {
        if (this.f19575l == ScaleType.FIT_XY) {
            throw new UnsupportedOperationException("getZoomedRect() not supported with FIT_XY");
        }
        PointF a = m23901a(0.0f, 0.0f, true);
        PointF a2 = m23901a((float) this.f19579p, (float) this.f19580q, true);
        float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
        float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
        return new RectF(a.x / intrinsicWidth, a.y / intrinsicHeight, a2.x / intrinsicWidth, a2.y / intrinsicHeight);
    }

    /* renamed from: c */
    private void m23915c() {
        if (this.f19565b != null && this.f19580q != 0 && this.f19579p != 0) {
            this.f19565b.getValues(this.f19572i);
            this.f19566c.setValues(this.f19572i);
            this.f19586w = this.f19584u;
            this.f19585v = this.f19583t;
            this.f19582s = this.f19580q;
            this.f19581r = this.f19579p;
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putFloat("saveScale", this.f19564a);
        bundle.putFloat("matchViewHeight", this.f19584u);
        bundle.putFloat("matchViewWidth", this.f19583t);
        bundle.putInt("viewWidth", this.f19579p);
        bundle.putInt("viewHeight", this.f19580q);
        this.f19565b.getValues(this.f19572i);
        bundle.putFloatArray("matrix", this.f19572i);
        bundle.putBoolean("imageRendered", this.f19576m);
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f19564a = bundle.getFloat("saveScale");
            this.f19572i = bundle.getFloatArray("matrix");
            this.f19566c.setValues(this.f19572i);
            this.f19586w = bundle.getFloat("matchViewHeight");
            this.f19585v = bundle.getFloat("matchViewWidth");
            this.f19582s = bundle.getInt("viewHeight");
            this.f19581r = bundle.getInt("viewWidth");
            this.f19576m = bundle.getBoolean("imageRendered");
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void onDraw(Canvas canvas) {
        this.f19577n = true;
        this.f19576m = true;
        if (this.f19578o != null) {
            setZoom(this.f19578o.f19555a, this.f19578o.f19556b, this.f19578o.f19557c, this.f19578o.f19558d);
            this.f19578o = null;
        }
        super.onDraw(canvas);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m23915c();
    }

    public float getMaxZoom() {
        return this.f19569f;
    }

    public void setMaxZoom(float f) {
        this.f19569f = f;
        this.f19571h = 1.25f * this.f19569f;
    }

    public float getMinZoom() {
        return this.f19568e;
    }

    public float getCurrentZoom() {
        return this.f19564a;
    }

    public void setMinZoom(float f) {
        this.f19568e = f;
        this.f19570g = 0.75f * this.f19568e;
    }

    /* renamed from: b */
    public void m23938b() {
        this.f19564a = 1.0f;
        m23922f();
    }

    public void setZoom(float f) {
        setZoom(f, 0.5f, 0.5f);
    }

    public void setZoom(float f, float f2, float f3) {
        setZoom(f, f2, f3, this.f19575l);
    }

    public void setZoom(float f, float f2, float f3, ScaleType scaleType) {
        if (this.f19577n) {
            if (scaleType != this.f19575l) {
                setScaleType(scaleType);
            }
            m23938b();
            m23906a((double) f, (float) (this.f19579p / 2), (float) (this.f19580q / 2), true);
            this.f19565b.getValues(this.f19572i);
            this.f19572i[2] = -((getImageWidth() * f2) - (((float) this.f19579p) * 0.5f));
            this.f19572i[5] = -((getImageHeight() * f3) - (((float) this.f19580q) * 0.5f));
            this.f19565b.setValues(this.f19572i);
            m23918d();
            setImageMatrix(this.f19565b);
            return;
        }
        this.f19578o = new C4453i(this, f, f2, f3, scaleType);
    }

    public void setZoom(TouchImageView touchImageView) {
        PointF scrollPosition = touchImageView.getScrollPosition();
        setZoom(touchImageView.getCurrentZoom(), scrollPosition.x, scrollPosition.y, touchImageView.getScaleType());
    }

    public PointF getScrollPosition() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        PointF a = m23901a((float) (this.f19579p / 2), (float) (this.f19580q / 2), true);
        a.x /= (float) intrinsicWidth;
        a.y /= (float) intrinsicHeight;
        return a;
    }

    public void setScrollPosition(float f, float f2) {
        setZoom(this.f19564a, f, f2);
    }

    /* renamed from: d */
    private void m23918d() {
        this.f19565b.getValues(this.f19572i);
        float f = this.f19572i[2];
        float f2 = this.f19572i[5];
        f = m23897a(f, (float) this.f19579p, getImageWidth());
        f2 = m23897a(f2, (float) this.f19580q, getImageHeight());
        if (f != 0.0f || f2 != 0.0f) {
            this.f19565b.postTranslate(f, f2);
        }
    }

    /* renamed from: e */
    private void m23920e() {
        m23918d();
        this.f19565b.getValues(this.f19572i);
        if (getImageWidth() < ((float) this.f19579p)) {
            this.f19572i[2] = (((float) this.f19579p) - getImageWidth()) / 2.0f;
        }
        if (getImageHeight() < ((float) this.f19580q)) {
            this.f19572i[5] = (((float) this.f19580q) - getImageHeight()) / 2.0f;
        }
        this.f19565b.setValues(this.f19572i);
    }

    /* renamed from: a */
    private float m23897a(float f, float f2, float f3) {
        float f4;
        float f5;
        if (f3 <= f2) {
            f4 = f2 - f3;
            f5 = 0.0f;
        } else {
            f5 = f2 - f3;
            f4 = 0.0f;
        }
        if (f < f5) {
            return (-f) + f5;
        }
        if (f > f4) {
            return (-f) + f4;
        }
        return 0.0f;
    }

    /* renamed from: b */
    private float m23913b(float f, float f2, float f3) {
        if (f3 <= f2) {
            return 0.0f;
        }
        return f;
    }

    private float getImageWidth() {
        return this.f19583t * this.f19564a;
    }

    private float getImageHeight() {
        return this.f19584u * this.f19564a;
    }

    protected void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        this.f19579p = m23899a(mode, size, intrinsicWidth);
        this.f19580q = m23899a(mode2, size2, intrinsicHeight);
        if (this.f19562C) {
            this.f19580q = this.f19579p;
            setMeasuredDimension(size, size);
        } else {
            setMeasuredDimension(this.f19579p, this.f19580q);
        }
        m23922f();
    }

    /* renamed from: f */
    private void m23922f() {
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0 && this.f19565b != null && this.f19566c != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float f = ((float) this.f19579p) / ((float) intrinsicWidth);
            float f2 = ((float) this.f19580q) / ((float) intrinsicHeight);
            switch (C44441.f19526a[this.f19575l.ordinal()]) {
                case 1:
                    f2 = 1.0f;
                    f = 1.0f;
                    break;
                case 2:
                    f2 = Math.max(f, f2);
                    f = f2;
                    break;
                case 3:
                    f2 = Math.min(1.0f, Math.min(f, f2));
                    f = f2;
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
            }
            f2 = Math.min(f, f2);
            f = f2;
            float f3 = ((float) this.f19579p) - (((float) intrinsicWidth) * f);
            float f4 = ((float) this.f19580q) - (((float) intrinsicHeight) * f2);
            this.f19583t = ((float) this.f19579p) - f3;
            this.f19584u = ((float) this.f19580q) - f4;
            if (m23937a() || this.f19576m) {
                if (this.f19585v == 0.0f || this.f19586w == 0.0f) {
                    m23915c();
                }
                this.f19566c.getValues(this.f19572i);
                this.f19572i[0] = (this.f19583t / ((float) intrinsicWidth)) * this.f19564a;
                this.f19572i[4] = (this.f19584u / ((float) intrinsicHeight)) * this.f19564a;
                f = this.f19572i[2];
                float f5 = this.f19572i[5];
                m23907a(2, f, this.f19564a * this.f19585v, getImageWidth(), this.f19581r, this.f19579p, intrinsicWidth);
                m23907a(5, f5, this.f19586w * this.f19564a, getImageHeight(), this.f19582s, this.f19580q, intrinsicHeight);
                this.f19565b.setValues(this.f19572i);
            } else {
                this.f19565b.setScale(f, f2);
                this.f19565b.postTranslate(f3 / 2.0f, f4 / 2.0f);
                this.f19564a = 1.0f;
            }
            m23918d();
            setImageMatrix(this.f19565b);
        }
    }

    /* renamed from: a */
    private int m23899a(int i, int i2, int i3) {
        switch (i) {
            case LinearLayoutManager.INVALID_OFFSET /*-2147483648*/:
                return Math.min(i3, i2);
            case 0:
                return i3;
            default:
                return i2;
        }
    }

    /* renamed from: a */
    private void m23907a(int i, float f, float f2, float f3, int i2, int i3, int i4) {
        if (f3 < ((float) i3)) {
            this.f19572i[i] = (((float) i3) - (((float) i4) * this.f19572i[0])) * 0.5f;
        } else if (f > 0.0f) {
            this.f19572i[i] = -((f3 - ((float) i3)) * 0.5f);
        } else {
            this.f19572i[i] = -((((Math.abs(f) + (((float) i2) * 0.5f)) / f2) * f3) - (((float) i3) * 0.5f));
        }
    }

    private void setState(C4452h c4452h) {
        this.f19567d = c4452h;
    }

    public boolean canScrollHorizontally(int i) {
        this.f19565b.getValues(this.f19572i);
        float f = this.f19572i[2];
        if (getImageWidth() < ((float) this.f19579p)) {
            return false;
        }
        if (f >= -1.0f && i < 0) {
            return false;
        }
        if ((Math.abs(f) + ((float) this.f19579p)) + 1.0f < getImageWidth() || i <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m23906a(double d, float f, float f2, boolean z) {
        float f3;
        float f4;
        if (z) {
            f3 = this.f19570g;
            f4 = this.f19571h;
        } else {
            f3 = this.f19568e;
            f4 = this.f19569f;
        }
        float f5 = this.f19564a;
        this.f19564a = (float) (((double) this.f19564a) * d);
        if (this.f19564a > f4) {
            this.f19564a = f4;
            d = (double) (f4 / f5);
        } else if (this.f19564a < f3) {
            this.f19564a = f3;
            d = (double) (f3 / f5);
        }
        this.f19565b.postScale((float) d, (float) d, f, f2);
        m23920e();
    }

    /* renamed from: a */
    private PointF m23901a(float f, float f2, boolean z) {
        this.f19565b.getValues(this.f19572i);
        float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
        float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
        float f3 = this.f19572i[2];
        float imageWidth = ((f - f3) * intrinsicWidth) / getImageWidth();
        f3 = ((f2 - this.f19572i[5]) * intrinsicHeight) / getImageHeight();
        if (z) {
            imageWidth = Math.min(Math.max(imageWidth, 0.0f), intrinsicWidth);
            f3 = Math.min(Math.max(f3, 0.0f), intrinsicHeight);
        }
        return new PointF(imageWidth, f3);
    }

    /* renamed from: a */
    private PointF m23900a(float f, float f2) {
        this.f19565b.getValues(this.f19572i);
        float intrinsicWidth = f / ((float) getDrawable().getIntrinsicWidth());
        float intrinsicHeight = f2 / ((float) getDrawable().getIntrinsicHeight());
        return new PointF((intrinsicWidth * getImageWidth()) + this.f19572i[2], (intrinsicHeight * getImageHeight()) + this.f19572i[5]);
    }

    @TargetApi(16)
    /* renamed from: a */
    private void m23912a(Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            postOnAnimation(runnable);
        } else {
            postDelayed(runnable, 16);
        }
    }
}
