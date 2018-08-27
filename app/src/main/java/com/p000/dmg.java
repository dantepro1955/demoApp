package com.p000;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import android.widget.Scroller;

/* compiled from: ZoomController */
/* renamed from: dmg */
public class dmg {
    /* renamed from: a */
    C4982b f22188a;
    /* renamed from: b */
    int f22189b;
    /* renamed from: c */
    int f22190c;
    /* renamed from: d */
    boolean f22191d;
    /* renamed from: e */
    private dmf f22192e = new dmf();
    /* renamed from: f */
    private dmh f22193f;
    /* renamed from: g */
    private ScaleGestureDetector f22194g;
    /* renamed from: h */
    private hy f22195h;
    /* renamed from: i */
    private VelocityTracker f22196i;
    /* renamed from: j */
    private RectF f22197j;
    /* renamed from: k */
    private RectF f22198k;
    /* renamed from: l */
    private Matrix f22199l;
    /* renamed from: m */
    private final float[] f22200m = new float[9];
    /* renamed from: n */
    private View f22201n;
    /* renamed from: o */
    private boolean f22202o = false;
    /* renamed from: p */
    private int f22203p = 0;
    /* renamed from: q */
    private int f22204q = 0;
    /* renamed from: r */
    private boolean f22205r;
    /* renamed from: s */
    private boolean f22206s;
    /* renamed from: t */
    private boolean f22207t;
    /* renamed from: u */
    private int f22208u;
    /* renamed from: v */
    private C4984d f22209v;
    /* renamed from: w */
    private boolean f22210w = false;
    /* renamed from: x */
    private OnTouchListener f22211x = new C49801(this);

    /* compiled from: ZoomController */
    /* renamed from: dmg$1 */
    class C49801 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ dmg f22172a;

        C49801(dmg dmg) {
            this.f22172a = dmg;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z = true;
            if (!this.f22172a.f22202o) {
                return false;
            }
            ViewParent parent = view.getParent();
            this.f22172a.f22205r = false;
            this.f22172a.f22206s = false;
            this.f22172a.f22207t = false;
            int actionIndex = motionEvent.getActionIndex();
            int actionMasked = motionEvent.getActionMasked();
            actionIndex = motionEvent.getPointerId(actionIndex);
            switch (actionMasked) {
                case 0:
                    this.f22172a.f22196i = VelocityTracker.obtain();
                    this.f22172a.f22208u = 0;
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    this.f22172a.m27982g();
                    break;
                case 1:
                case 3:
                    if (this.f22172a.m27995a(actionIndex)) {
                        this.f22172a.f22205r = true;
                    }
                    if (this.f22172a.f22196i != null) {
                        this.f22172a.f22196i.recycle();
                        this.f22172a.f22196i = null;
                    }
                    float a = this.f22172a.m27990a();
                    if (a < this.f22172a.f22192e.f22168d) {
                        if (this.f22172a.f22210w) {
                            this.f22172a.f22201n.post(new C4981a(this.f22172a, a, this.f22172a.f22192e.f22168d, (float) (this.f22172a.f22189b / 2), (float) (this.f22172a.f22190c / 2)));
                            break;
                        }
                        return true;
                    }
                    break;
                case 2:
                    if (this.f22172a.f22196i == null) {
                        this.f22172a.f22196i = VelocityTracker.obtain();
                    }
                    this.f22172a.f22196i.addMovement(motionEvent);
                    this.f22172a.f22196i.computeCurrentVelocity(10);
                    if (this.f22172a.m27995a(actionIndex)) {
                        this.f22172a.f22205r = true;
                        break;
                    }
                    break;
                case 5:
                    this.f22172a.f22207t = true;
                    break;
            }
            this.f22172a.f22194g.onTouchEvent(motionEvent);
            boolean h = this.f22172a.f22207t;
            boolean a2 = this.f22172a.f22195h.m30725a(motionEvent);
            boolean z2 = motionEvent.getPointerCount() > 1;
            boolean j = this.f22172a.f22205r;
            if (!(this.f22172a.m27980f() || h || a2 || z2 || j)) {
                z = false;
            }
            if (!(z || parent == null)) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            this.f22172a.f22208u = this.f22172a.f22208u + 1;
            return z;
        }
    }

    /* compiled from: ZoomController */
    /* renamed from: dmg$a */
    class C4981a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ dmg f22173a;
        /* renamed from: b */
        private final float f22174b;
        /* renamed from: c */
        private final float f22175c;
        /* renamed from: d */
        private final float f22176d;
        /* renamed from: e */
        private final float f22177e;

        public C4981a(dmg dmg, float f, float f2, float f3, float f4) {
            this.f22173a = dmg;
            this.f22176d = f2;
            this.f22174b = f3;
            this.f22175c = f4;
            if (f < f2) {
                this.f22177e = 1.07f;
            } else {
                this.f22177e = 0.93f;
            }
        }

        public void run() {
            if (this.f22173a.f22210w) {
                synchronized (this.f22173a.f22199l) {
                    this.f22173a.f22199l.postScale(this.f22177e, this.f22177e, this.f22174b, this.f22175c);
                }
                this.f22173a.f22201n.invalidate();
                float a = this.f22173a.m27990a();
                if ((this.f22177e <= 1.0f || a >= this.f22176d) && (this.f22177e >= 1.0f || this.f22176d >= a)) {
                    a = this.f22176d / a;
                    synchronized (this.f22173a.f22199l) {
                        this.f22173a.f22199l.postScale(a, a, this.f22174b, this.f22175c);
                    }
                    this.f22173a.f22201n.invalidate();
                    return;
                }
                dmd.m27962a(this.f22173a.f22201n, this);
            }
        }
    }

    /* compiled from: ZoomController */
    /* renamed from: dmg$b */
    class C4982b implements Runnable {
        /* renamed from: a */
        final int f22178a = 1200;
        /* renamed from: b */
        final /* synthetic */ dmg f22179b;
        /* renamed from: c */
        private final Scroller f22180c;
        /* renamed from: d */
        private int f22181d;
        /* renamed from: e */
        private int f22182e;

        public C4982b(dmg dmg) {
            this.f22179b = dmg;
            this.f22180c = new Scroller(dmg.f22201n.getContext());
        }

        /* renamed from: a */
        public void m27966a(int i, int i2) {
            int i3 = (int) (((float) i) * 0.28f);
            int i4 = (int) (((float) i2) * 0.28f);
            this.f22181d = 0;
            this.f22182e = 0;
            this.f22180c.startScroll(0, 0, i3, i4, 1200);
        }

        public void run() {
            this.f22179b.f22201n.invalidate();
            if (this.f22180c.computeScrollOffset()) {
                this.f22179b.f22191d = true;
                int currX = this.f22180c.getCurrX();
                int currY = this.f22180c.getCurrY();
                int i = currX - this.f22181d;
                int i2 = currY - this.f22182e;
                this.f22181d = currX;
                this.f22182e = currY;
                synchronized (this.f22179b.f22199l) {
                    this.f22179b.f22199l.postTranslate((float) i, (float) i2);
                }
                dmd.m27962a(this.f22179b.f22201n, this);
                return;
            }
            this.f22179b.f22191d = false;
        }

        /* renamed from: a */
        public void m27965a() {
            this.f22180c.forceFinished(true);
            this.f22179b.f22191d = false;
        }
    }

    /* compiled from: ZoomController */
    /* renamed from: dmg$c */
    class C4983c implements OnDoubleTapListener, OnGestureListener, OnScaleGestureListener {
        /* renamed from: a */
        final /* synthetic */ dmg f22183a;

        private C4983c(dmg dmg) {
            this.f22183a = dmg;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            this.f22183a.f22206s = true;
            if (!this.f22183a.f22205r) {
                return false;
            }
            this.f22183a.f22188a = new C4982b(this.f22183a);
            this.f22183a.f22188a.m27966a((int) f, (int) f2);
            this.f22183a.f22201n.post(this.f22183a.f22188a);
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            this.f22183a.f22201n.performLongClick();
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            synchronized (this.f22183a.f22199l) {
                this.f22183a.f22199l.postTranslate(-f, -f2);
            }
            this.f22183a.f22201n.invalidate();
            return this.f22183a.f22205r;
        }

        public void onShowPress(MotionEvent motionEvent) {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            if (this.f22183a.f22193f != null) {
                this.f22183a.f22193f.m28003a();
            }
            return true;
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            boolean z = false;
            if (this.f22183a.f22210w) {
                boolean z2;
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                float a = this.f22183a.m27990a();
                if (scaleFactor >= 1.0f || a >= this.f22183a.f22192e.f22169e) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (scaleFactor <= 1.0f || a <= this.f22183a.f22192e.f22165a) {
                    z = z2;
                }
                if (scaleFactor != 0.0f) {
                    this.f22183a.f22207t = true;
                }
                if (z) {
                    this.f22183a.f22199l.postScale(scaleFactor, scaleFactor, focusX, focusY);
                }
                this.f22183a.f22201n.invalidate();
            }
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            if (this.f22183a.f22193f != null) {
                this.f22183a.f22193f.m28004b();
            }
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (this.f22183a.m28002e()) {
                this.f22183a.f22201n.performClick();
            } else {
                this.f22183a.f22201n.performClick();
            }
            return true;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            float a = this.f22183a.m27990a();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (a < this.f22183a.f22192e.f22170f) {
                a = this.f22183a.f22192e.f22166b;
            } else {
                a = this.f22183a.f22192e.f22167c;
            }
            this.f22183a.m27991a(a, x, y, true);
            this.f22183a.f22201n.invalidate();
            return true;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }
    }

    /* compiled from: ZoomController */
    /* renamed from: dmg$d */
    public static class C4984d {
        /* renamed from: a */
        public boolean f22184a = false;
        /* renamed from: b */
        public boolean f22185b = false;
        /* renamed from: c */
        public boolean f22186c;
        /* renamed from: d */
        public boolean f22187d;
    }

    public dmg(View view) {
        this.f22201n = view;
        Context context = view.getContext();
        OnDoubleTapListener c4983c = new C4983c();
        this.f22194g = new ScaleGestureDetector(context, c4983c);
        this.f22195h = new hy(context, c4983c);
        this.f22195h.m30724a(c4983c);
        view.setOnTouchListener(this.f22211x);
        this.f22197j = new RectF();
        this.f22198k = new RectF();
        this.f22199l = new Matrix();
        this.f22209v = new C4984d();
    }

    /* renamed from: a */
    public void m27994a(boolean z) {
        this.f22202o = z;
    }

    /* renamed from: b */
    public void m27998b(boolean z) {
        this.f22210w = z;
    }

    /* renamed from: a */
    public void m27991a(float f, float f2, float f3, boolean z) {
        if (this.f22210w) {
            this.f22201n.post(new C4981a(this, m27990a(), f, f2, f3));
        }
    }

    /* renamed from: a */
    public final float m27990a() {
        return m27967a(this.f22199l, 0);
    }

    /* renamed from: a */
    public final boolean m27995a(int i) {
        if (this.f22196i == null) {
            return false;
        }
        this.f22199l.mapRect(this.f22197j, this.f22198k);
        float f = this.f22197j.top;
        float f2 = this.f22197j.left;
        float f3 = this.f22197j.right;
        float f4 = this.f22197j.bottom;
        float a = jb.a(this.f22196i, i);
        float b = jb.b(this.f22196i, i);
        float abs = Math.abs(a);
        float abs2 = Math.abs(b);
        if (abs < 5.0f && abs2 < 5.0f) {
            return true;
        }
        if (Math.abs(a) > Math.abs(b)) {
            if (a > 0.0f && (this.f22209v.f22186c || f2 < -0.01f)) {
                return true;
            }
            if (a < 0.0f && (this.f22209v.f22187d || f3 > ((float) this.f22189b) + 0.01f)) {
                return true;
            }
        } else if (b > 0.0f && (this.f22209v.f22184a || f < -0.01f)) {
            return true;
        } else {
            if (b < 0.0f) {
                if (this.f22209v.f22185b) {
                    return true;
                }
                if (f4 > ((float) this.f22190c) + 0.01f) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    private boolean m27980f() {
        if (this.f22206s) {
            return false;
        }
        if (this.f22196i == null) {
            return true;
        }
        float abs = Math.abs(this.f22196i.getXVelocity());
        float abs2 = Math.abs(this.f22196i.getYVelocity());
        if (abs >= 5.0f || abs2 >= 5.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private float m27967a(Matrix matrix, int i) {
        matrix.getValues(this.f22200m);
        return this.f22200m[i];
    }

    /* renamed from: g */
    private void m27982g() {
        if (this.f22188a != null) {
            this.f22188a.m27965a();
            this.f22188a = null;
        }
    }

    /* renamed from: a */
    public void m27993a(dmh dmh) {
        this.f22193f = dmh;
    }

    /* renamed from: a */
    public void m27992a(int i, int i2, int i3, int i4, int i5) {
        this.f22189b = i;
        this.f22190c = i2;
        this.f22192e.m27964a(i, i2, i3, i4, i5);
        this.f22199l.setScale(this.f22192e.f22167c, this.f22192e.f22167c);
        this.f22199l.postTranslate(0.0f, (float) this.f22204q);
    }

    /* renamed from: b */
    public void m27996b() {
        m27975c(this.f22191d);
    }

    /* renamed from: c */
    private void m27975c(boolean z) {
        float f = 0.0f;
        this.f22199l.mapRect(this.f22197j, this.f22198k);
        float height = this.f22197j.height();
        float width = this.f22197j.width();
        float f2 = this.f22197j.top;
        float f3 = this.f22197j.left;
        float f4 = this.f22197j.right;
        float f5 = this.f22197j.bottom;
        float f6 = (float) this.f22189b;
        float f7 = (float) this.f22190c;
        if (width < f6) {
            width = ((f6 - width) / 2.0f) - f3;
        } else if (f3 > 0.0f && f4 > f6) {
            width = -f3;
        } else if (f3 >= 0.0f || f4 >= f6) {
            width = 0.0f;
        } else {
            width = f6 - f4;
        }
        if (((float) this.f22203p) + height < f7) {
            f = ((((f7 - ((float) this.f22203p)) + ((float) this.f22204q)) - height) / 2.0f) - f2;
        } else if (f2 > ((float) this.f22204q) && f5 > f7 - ((float) this.f22203p)) {
            f = (-f2) + ((float) this.f22204q);
        } else if (f2 < 0.0f && ((float) this.f22203p) + f5 < f7) {
            f = (f7 - f5) - ((float) this.f22203p);
        }
        synchronized (this.f22199l) {
            this.f22199l.postTranslate(width, f);
        }
    }

    /* renamed from: c */
    public Matrix m27999c() {
        return this.f22199l;
    }

    /* renamed from: d */
    public RectF m28001d() {
        return this.f22198k;
    }

    /* renamed from: b */
    public void m27997b(int i) {
        this.f22204q = i;
    }

    /* renamed from: c */
    public void m28000c(int i) {
        this.f22203p = i;
    }

    /* renamed from: e */
    public boolean m28002e() {
        return m27990a() > this.f22192e.f22171g;
    }
}
