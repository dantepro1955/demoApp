package com.p000;

import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.FrameLayout.LayoutParams;

/* compiled from: ExpandTouchListener */
/* renamed from: dbi */
class dbi implements OnTouchListener {
    /* renamed from: a */
    private final AbsListView f21089a;
    /* renamed from: b */
    private final View f21090b;
    /* renamed from: c */
    private final int f21091c;
    /* renamed from: d */
    private final int f21092d;
    /* renamed from: e */
    private final GestureDetector f21093e;
    /* renamed from: f */
    private final int f21094f;
    /* renamed from: g */
    private float f21095g;
    /* renamed from: h */
    private boolean f21096h;
    /* renamed from: i */
    private boolean f21097i;
    /* renamed from: j */
    private boolean f21098j;
    /* renamed from: k */
    private LayoutParams f21099k;

    /* compiled from: ExpandTouchListener */
    /* renamed from: dbi$1 */
    class C47751 extends SimpleOnGestureListener {
        /* renamed from: a */
        final /* synthetic */ dbi f21086a;

        C47751(dbi dbi) {
            this.f21086a = dbi;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z;
            dbi dbi = this.f21086a;
            if (f2 > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            dbi.f21098j = z;
            return false;
        }
    }

    /* compiled from: ExpandTouchListener */
    /* renamed from: dbi$2 */
    class C47762 extends dbu {
        /* renamed from: a */
        final /* synthetic */ dbi f21087a;

        C47762(dbi dbi) {
            this.f21087a = dbi;
        }

        public void onAnimationEnd(Animation animation) {
            this.f21087a.f21096h = true;
        }
    }

    /* compiled from: ExpandTouchListener */
    /* renamed from: dbi$3 */
    class C47773 extends dbu {
        /* renamed from: a */
        final /* synthetic */ dbi f21088a;

        C47773(dbi dbi) {
            this.f21088a = dbi;
        }

        public void onAnimationEnd(Animation animation) {
            this.f21088a.f21096h = true;
        }
    }

    /* renamed from: a */
    public static dbi m26266a(Context context, AbsListView absListView, View view, int i, int i2, int i3) {
        return new dbi(context, absListView, view, i, i2, i3);
    }

    private dbi(Context context, AbsListView absListView, View view, int i, int i2, int i3) {
        this.f21089a = absListView;
        this.f21090b = view;
        this.f21094f = i;
        this.f21091c = i2;
        this.f21092d = i3;
        this.f21099k = (LayoutParams) view.getLayoutParams();
        this.f21093e = new GestureDetector(context, new C47751(this));
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f21093e.onTouchEvent(motionEvent)) {
            return false;
        }
        if ((this.f21098j || !dbv.m26294a(this.f21089a)) && this.f21096h) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f21095g = motionEvent.getRawY();
                return true;
            case 1:
                m26269b(view, motionEvent);
                break;
            case 2:
                if (this.f21099k.height != this.f21091c) {
                    m26267a(view, motionEvent);
                    break;
                }
                LayoutParams layoutParams = this.f21099k;
                layoutParams.height--;
                this.f21090b.setLayoutParams(this.f21099k);
                return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m26267a(View view, MotionEvent motionEvent) {
        float f;
        boolean z = true;
        if (this.f21095g == -1.0f) {
            this.f21095g = motionEvent.getRawY();
        }
        float rawY = this.f21095g - motionEvent.getRawY();
        this.f21097i = rawY > 0.0f;
        if (this.f21094f == 48) {
            f = -rawY;
        } else {
            f = rawY;
        }
        this.f21095g = motionEvent.getRawY();
        int i = ((int) f) + this.f21099k.height;
        if (i > this.f21091c) {
            i = this.f21091c;
        }
        if (i < this.f21092d) {
            i = this.f21092d;
        }
        this.f21099k.height = i;
        this.f21090b.setLayoutParams(this.f21099k);
        if (this.f21099k.height != this.f21091c) {
            z = false;
        }
        this.f21096h = z;
    }

    /* renamed from: b */
    private void m26269b(View view, MotionEvent motionEvent) {
        this.f21095g = -1.0f;
        if (!this.f21097i && this.f21099k.height < this.f21091c && this.f21099k.height > (this.f21091c * 4) / 5) {
            dbv.m26293a(this.f21090b, this.f21091c, new C47762(this));
        } else if (this.f21097i && this.f21099k.height > this.f21092d + 50) {
            dbv.m26293a(this.f21090b, this.f21091c, new C47773(this));
        } else if (this.f21097i && this.f21099k.height <= this.f21092d + 50) {
            dbv.m26293a(this.f21090b, this.f21092d, new dbu());
        } else if (!this.f21097i && this.f21099k.height > this.f21092d) {
            dbv.m26293a(this.f21090b, this.f21092d, new dbu());
        }
    }
}
