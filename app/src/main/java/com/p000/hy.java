package com.p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: GestureDetectorCompat */
/* renamed from: hy */
public final class hy {
    /* renamed from: a */
    private final C5377a f23862a;

    /* compiled from: GestureDetectorCompat */
    /* renamed from: hy$a */
    interface C5377a {
        /* renamed from: a */
        void mo4846a(OnDoubleTapListener onDoubleTapListener);

        /* renamed from: a */
        boolean mo4847a(MotionEvent motionEvent);
    }

    /* compiled from: GestureDetectorCompat */
    /* renamed from: hy$b */
    static class C5379b implements C5377a {
        /* renamed from: j */
        private static final int f23837j = ViewConfiguration.getLongPressTimeout();
        /* renamed from: k */
        private static final int f23838k = ViewConfiguration.getTapTimeout();
        /* renamed from: l */
        private static final int f23839l = ViewConfiguration.getDoubleTapTimeout();
        /* renamed from: a */
        final OnGestureListener f23840a;
        /* renamed from: b */
        OnDoubleTapListener f23841b;
        /* renamed from: c */
        boolean f23842c;
        /* renamed from: d */
        boolean f23843d;
        /* renamed from: e */
        MotionEvent f23844e;
        /* renamed from: f */
        private int f23845f;
        /* renamed from: g */
        private int f23846g;
        /* renamed from: h */
        private int f23847h;
        /* renamed from: i */
        private int f23848i;
        /* renamed from: m */
        private final Handler f23849m;
        /* renamed from: n */
        private boolean f23850n;
        /* renamed from: o */
        private boolean f23851o;
        /* renamed from: p */
        private boolean f23852p;
        /* renamed from: q */
        private MotionEvent f23853q;
        /* renamed from: r */
        private boolean f23854r;
        /* renamed from: s */
        private float f23855s;
        /* renamed from: t */
        private float f23856t;
        /* renamed from: u */
        private float f23857u;
        /* renamed from: v */
        private float f23858v;
        /* renamed from: w */
        private boolean f23859w;
        /* renamed from: x */
        private VelocityTracker f23860x;

        /* compiled from: GestureDetectorCompat */
        /* renamed from: hy$b$a */
        class C5378a extends Handler {
            /* renamed from: a */
            final /* synthetic */ C5379b f23836a;

            C5378a(C5379b c5379b) {
                this.f23836a = c5379b;
            }

            C5378a(C5379b c5379b, Handler handler) {
                this.f23836a = c5379b;
                super(handler.getLooper());
            }

            public void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        this.f23836a.f23840a.onShowPress(this.f23836a.f23844e);
                        return;
                    case 2:
                        this.f23836a.m30719a();
                        return;
                    case 3:
                        if (this.f23836a.f23841b == null) {
                            return;
                        }
                        if (this.f23836a.f23842c) {
                            this.f23836a.f23843d = true;
                            return;
                        } else {
                            this.f23836a.f23841b.onSingleTapConfirmed(this.f23836a.f23844e);
                            return;
                        }
                    default:
                        throw new RuntimeException("Unknown message " + message);
                }
            }
        }

        public C5379b(Context context, OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f23849m = new C5378a(this, handler);
            } else {
                this.f23849m = new C5378a(this);
            }
            this.f23840a = onGestureListener;
            if (onGestureListener instanceof OnDoubleTapListener) {
                mo4846a((OnDoubleTapListener) onGestureListener);
            }
            m30715a(context);
        }

        /* renamed from: a */
        private void m30715a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f23840a == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            } else {
                this.f23859w = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f23847h = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f23848i = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f23845f = scaledTouchSlop * scaledTouchSlop;
                this.f23846g = scaledDoubleTapSlop * scaledDoubleTapSlop;
            }
        }

        /* renamed from: a */
        public void mo4846a(OnDoubleTapListener onDoubleTapListener) {
            this.f23841b = onDoubleTapListener;
        }

        /* renamed from: a */
        public boolean mo4847a(MotionEvent motionEvent) {
            int i;
            int action = motionEvent.getAction();
            if (this.f23860x == null) {
                this.f23860x = VelocityTracker.obtain();
            }
            this.f23860x.addMovement(motionEvent);
            boolean z = (action & 255) == 6;
            int b = z ? io.b(motionEvent) : -1;
            int pointerCount = motionEvent.getPointerCount();
            float f = 0.0f;
            float f2 = 0.0f;
            for (i = 0; i < pointerCount; i++) {
                if (b != i) {
                    f2 += motionEvent.getX(i);
                    f += motionEvent.getY(i);
                }
            }
            b = z ? pointerCount - 1 : pointerCount;
            f2 /= (float) b;
            f /= (float) b;
            boolean hasMessages;
            float b2;
            float a;
            switch (action & 255) {
                case 0:
                    if (this.f23841b != null) {
                        hasMessages = this.f23849m.hasMessages(3);
                        if (hasMessages) {
                            this.f23849m.removeMessages(3);
                        }
                        if (this.f23844e == null || this.f23853q == null || !hasMessages || !m30716a(this.f23844e, this.f23853q, motionEvent)) {
                            this.f23849m.sendEmptyMessageDelayed(3, (long) f23839l);
                        } else {
                            this.f23854r = true;
                            b = (this.f23841b.onDoubleTap(this.f23844e) | 0) | this.f23841b.onDoubleTapEvent(motionEvent);
                            this.f23855s = f2;
                            this.f23857u = f2;
                            this.f23856t = f;
                            this.f23858v = f;
                            if (this.f23844e != null) {
                                this.f23844e.recycle();
                            }
                            this.f23844e = MotionEvent.obtain(motionEvent);
                            this.f23851o = true;
                            this.f23852p = true;
                            this.f23842c = true;
                            this.f23850n = false;
                            this.f23843d = false;
                            if (this.f23859w) {
                                this.f23849m.removeMessages(2);
                                this.f23849m.sendEmptyMessageAtTime(2, (this.f23844e.getDownTime() + ((long) f23838k)) + ((long) f23837j));
                            }
                            this.f23849m.sendEmptyMessageAtTime(1, this.f23844e.getDownTime() + ((long) f23838k));
                            return b | this.f23840a.onDown(motionEvent);
                        }
                    }
                    b = 0;
                    this.f23855s = f2;
                    this.f23857u = f2;
                    this.f23856t = f;
                    this.f23858v = f;
                    if (this.f23844e != null) {
                        this.f23844e.recycle();
                    }
                    this.f23844e = MotionEvent.obtain(motionEvent);
                    this.f23851o = true;
                    this.f23852p = true;
                    this.f23842c = true;
                    this.f23850n = false;
                    this.f23843d = false;
                    if (this.f23859w) {
                        this.f23849m.removeMessages(2);
                        this.f23849m.sendEmptyMessageAtTime(2, (this.f23844e.getDownTime() + ((long) f23838k)) + ((long) f23837j));
                    }
                    this.f23849m.sendEmptyMessageAtTime(1, this.f23844e.getDownTime() + ((long) f23838k));
                    return b | this.f23840a.onDown(motionEvent);
                case 1:
                    this.f23842c = false;
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    if (this.f23854r) {
                        hasMessages = this.f23841b.onDoubleTapEvent(motionEvent) | 0;
                    } else if (this.f23850n) {
                        this.f23849m.removeMessages(3);
                        this.f23850n = false;
                        hasMessages = false;
                    } else if (this.f23851o) {
                        hasMessages = this.f23840a.onSingleTapUp(motionEvent);
                        if (this.f23843d && this.f23841b != null) {
                            this.f23841b.onSingleTapConfirmed(motionEvent);
                        }
                    } else {
                        VelocityTracker velocityTracker = this.f23860x;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, (float) this.f23848i);
                        b2 = jb.b(velocityTracker, pointerId);
                        a = jb.a(velocityTracker, pointerId);
                        hasMessages = (Math.abs(b2) > ((float) this.f23847h) || Math.abs(a) > ((float) this.f23847h)) ? this.f23840a.onFling(this.f23844e, motionEvent, a, b2) : false;
                    }
                    if (this.f23853q != null) {
                        this.f23853q.recycle();
                    }
                    this.f23853q = obtain;
                    if (this.f23860x != null) {
                        this.f23860x.recycle();
                        this.f23860x = null;
                    }
                    this.f23854r = false;
                    this.f23843d = false;
                    this.f23849m.removeMessages(1);
                    this.f23849m.removeMessages(2);
                    return hasMessages;
                case 2:
                    if (this.f23850n) {
                        return false;
                    }
                    a = this.f23855s - f2;
                    b2 = this.f23856t - f;
                    if (this.f23854r) {
                        return false | this.f23841b.onDoubleTapEvent(motionEvent);
                    }
                    if (this.f23851o) {
                        i = (int) (f2 - this.f23857u);
                        int i2 = (int) (f - this.f23858v);
                        i = (i * i) + (i2 * i2);
                        if (i > this.f23845f) {
                            hasMessages = this.f23840a.onScroll(this.f23844e, motionEvent, a, b2);
                            this.f23855s = f2;
                            this.f23856t = f;
                            this.f23851o = false;
                            this.f23849m.removeMessages(3);
                            this.f23849m.removeMessages(1);
                            this.f23849m.removeMessages(2);
                        } else {
                            hasMessages = false;
                        }
                        if (i > this.f23845f) {
                            this.f23852p = false;
                        }
                        return hasMessages;
                    } else if (Math.abs(a) < 1.0f && Math.abs(b2) < 1.0f) {
                        return false;
                    } else {
                        boolean onScroll = this.f23840a.onScroll(this.f23844e, motionEvent, a, b2);
                        this.f23855s = f2;
                        this.f23856t = f;
                        return onScroll;
                    }
                case 3:
                    m30717b();
                    return false;
                case 5:
                    this.f23855s = f2;
                    this.f23857u = f2;
                    this.f23856t = f;
                    this.f23858v = f;
                    m30718c();
                    return false;
                case 6:
                    this.f23855s = f2;
                    this.f23857u = f2;
                    this.f23856t = f;
                    this.f23858v = f;
                    this.f23860x.computeCurrentVelocity(1000, (float) this.f23848i);
                    int b3 = io.b(motionEvent);
                    b = motionEvent.getPointerId(b3);
                    f2 = jb.a(this.f23860x, b);
                    float b4 = jb.b(this.f23860x, b);
                    for (b = 0; b < pointerCount; b++) {
                        if (b != b3) {
                            int pointerId2 = motionEvent.getPointerId(b);
                            if ((jb.b(this.f23860x, pointerId2) * b4) + (jb.a(this.f23860x, pointerId2) * f2) < 0.0f) {
                                this.f23860x.clear();
                                return false;
                            }
                        }
                    }
                    return false;
                default:
                    return false;
            }
        }

        /* renamed from: b */
        private void m30717b() {
            this.f23849m.removeMessages(1);
            this.f23849m.removeMessages(2);
            this.f23849m.removeMessages(3);
            this.f23860x.recycle();
            this.f23860x = null;
            this.f23854r = false;
            this.f23842c = false;
            this.f23851o = false;
            this.f23852p = false;
            this.f23843d = false;
            if (this.f23850n) {
                this.f23850n = false;
            }
        }

        /* renamed from: c */
        private void m30718c() {
            this.f23849m.removeMessages(1);
            this.f23849m.removeMessages(2);
            this.f23849m.removeMessages(3);
            this.f23854r = false;
            this.f23851o = false;
            this.f23852p = false;
            this.f23843d = false;
            if (this.f23850n) {
                this.f23850n = false;
            }
        }

        /* renamed from: a */
        private boolean m30716a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f23852p || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) f23839l)) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x * x) + (y * y) < this.f23846g) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        void m30719a() {
            this.f23849m.removeMessages(3);
            this.f23843d = false;
            this.f23850n = true;
            this.f23840a.onLongPress(this.f23844e);
        }
    }

    /* compiled from: GestureDetectorCompat */
    /* renamed from: hy$c */
    static class C5380c implements C5377a {
        /* renamed from: a */
        private final GestureDetector f23861a;

        public C5380c(Context context, OnGestureListener onGestureListener, Handler handler) {
            this.f23861a = new GestureDetector(context, onGestureListener, handler);
        }

        /* renamed from: a */
        public boolean mo4847a(MotionEvent motionEvent) {
            return this.f23861a.onTouchEvent(motionEvent);
        }

        /* renamed from: a */
        public void mo4846a(OnDoubleTapListener onDoubleTapListener) {
            this.f23861a.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    public hy(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public hy(Context context, OnGestureListener onGestureListener, Handler handler) {
        if (VERSION.SDK_INT > 17) {
            this.f23862a = new C5380c(context, onGestureListener, handler);
        } else {
            this.f23862a = new C5379b(context, onGestureListener, handler);
        }
    }

    /* renamed from: a */
    public boolean m30725a(MotionEvent motionEvent) {
        return this.f23862a.mo4847a(motionEvent);
    }

    /* renamed from: a */
    public void m30724a(OnDoubleTapListener onDoubleTapListener) {
        this.f23862a.mo4846a(onDoubleTapListener);
    }
}
