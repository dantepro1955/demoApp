package com.p000;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: ForwardingListener */
/* renamed from: pl */
public abstract class pl implements OnTouchListener {
    /* renamed from: a */
    private final float f25083a;
    /* renamed from: b */
    private final int f25084b;
    /* renamed from: c */
    final View f25085c;
    /* renamed from: d */
    private final int f25086d;
    /* renamed from: e */
    private Runnable f25087e;
    /* renamed from: f */
    private Runnable f25088f;
    /* renamed from: g */
    private boolean f25089g;
    /* renamed from: h */
    private int f25090h;
    /* renamed from: i */
    private final int[] f25091i = new int[2];

    /* compiled from: ForwardingListener */
    /* renamed from: pl$1 */
    class C56721 implements OnAttachStateChangeListener {
        /* renamed from: a */
        final /* synthetic */ pl f25078a;

        C56721(pl plVar) {
            this.f25078a = plVar;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.f25078a.m33617e();
        }
    }

    /* compiled from: ForwardingListener */
    /* renamed from: pl$2 */
    class C56732 implements OnGlobalLayoutListener {
        /* renamed from: a */
        boolean f25079a = jd.J(this.f25080b.f25085c);
        /* renamed from: b */
        final /* synthetic */ pl f25080b;

        C56732(pl plVar) {
            this.f25080b = plVar;
        }

        public void onGlobalLayout() {
            boolean z = this.f25079a;
            this.f25079a = jd.J(this.f25080b.f25085c);
            if (z && !this.f25079a) {
                this.f25080b.m33617e();
            }
        }
    }

    /* compiled from: ForwardingListener */
    /* renamed from: pl$a */
    class C5674a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ pl f25081a;

        C5674a(pl plVar) {
            this.f25081a = plVar;
        }

        public void run() {
            ViewParent parent = this.f25081a.f25085c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener */
    /* renamed from: pl$b */
    class C5675b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ pl f25082a;

        C5675b(pl plVar) {
            this.f25082a = plVar;
        }

        public void run() {
            this.f25082a.m33622d();
        }
    }

    /* renamed from: a */
    public abstract oi m33619a();

    public pl(View view) {
        this.f25085c = view;
        view.setLongClickable(true);
        if (VERSION.SDK_INT >= 12) {
            m33609a(view);
        } else {
            m33614b(view);
        }
        this.f25083a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f25084b = ViewConfiguration.getTapTimeout();
        this.f25086d = (this.f25084b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    @TargetApi(12)
    /* renamed from: a */
    private void m33609a(View view) {
        view.addOnAttachStateChangeListener(new C56721(this));
    }

    /* renamed from: b */
    private void m33614b(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new C56732(this));
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f25089g;
        if (!z2) {
            boolean z3 = m33611a(motionEvent) && m33620b();
            if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f25085c.onTouchEvent(obtain);
                obtain.recycle();
            }
            z = z3;
        } else if (m33615b(motionEvent) || !m33621c()) {
            z = true;
        } else {
            z = false;
        }
        this.f25089g = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m33617e() {
        this.f25089g = false;
        this.f25090h = -1;
        if (this.f25087e != null) {
            this.f25085c.removeCallbacks(this.f25087e);
        }
    }

    /* renamed from: b */
    public boolean m33620b() {
        oi a = m33619a();
        if (!(a == null || a.mo5277f())) {
            a.mo5275d();
        }
        return true;
    }

    /* renamed from: c */
    public boolean m33621c() {
        oi a = m33619a();
        if (a != null && a.mo5277f()) {
            a.mo5276e();
        }
        return true;
    }

    /* renamed from: a */
    private boolean m33611a(MotionEvent motionEvent) {
        View view = this.f25085c;
        if (!view.isEnabled()) {
            return false;
        }
        switch (io.a(motionEvent)) {
            case 0:
                this.f25090h = motionEvent.getPointerId(0);
                if (this.f25087e == null) {
                    this.f25087e = new C5674a(this);
                }
                view.postDelayed(this.f25087e, (long) this.f25084b);
                if (this.f25088f == null) {
                    this.f25088f = new C5675b(this);
                }
                view.postDelayed(this.f25088f, (long) this.f25086d);
                return false;
            case 1:
            case 3:
                m33618f();
                return false;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f25090h);
                if (findPointerIndex < 0 || pl.m33612a(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f25083a)) {
                    return false;
                }
                m33618f();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: f */
    private void m33618f() {
        if (this.f25088f != null) {
            this.f25085c.removeCallbacks(this.f25088f);
        }
        if (this.f25087e != null) {
            this.f25085c.removeCallbacks(this.f25087e);
        }
    }

    /* renamed from: d */
    void m33622d() {
        m33618f();
        View view = this.f25085c;
        if (view.isEnabled() && !view.isLongClickable() && m33620b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f25089g = true;
        }
    }

    /* renamed from: b */
    private boolean m33615b(MotionEvent motionEvent) {
        View view = this.f25085c;
        oi a = m33619a();
        if (a == null || !a.mo5277f()) {
            return false;
        }
        pj pjVar = (pj) a.mo5278g();
        if (pjVar == null || !pjVar.isShown()) {
            return false;
        }
        boolean z;
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m33616b(view, obtainNoHistory);
        m33613a(pjVar, obtainNoHistory);
        boolean a2 = pjVar.m33608a(obtainNoHistory, this.f25090h);
        obtainNoHistory.recycle();
        int a3 = io.a(motionEvent);
        if (a3 == 1 || a3 == 3) {
            z = false;
        } else {
            z = true;
        }
        if (a2 && r0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m33612a(View view, float f, float f2, float f3) {
        return f >= (-f3) && f2 >= (-f3) && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m33613a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f25091i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    private boolean m33616b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f25091i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }
}
