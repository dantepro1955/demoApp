package com.p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.mopub.mobileads.resource.DrawableConstants.CtaButton;
import com.under9.android.lib.widget.TouchEventRelativeLayout.C4443a;

@SuppressLint({"NewApi"})
/* compiled from: SlideDismissAttacher */
/* renamed from: dkd */
public class dkd implements C4443a {
    /* renamed from: a */
    protected boolean f21817a;
    /* renamed from: b */
    protected boolean f21818b;
    /* renamed from: c */
    protected boolean f21819c;
    /* renamed from: d */
    protected int f21820d;
    /* renamed from: e */
    protected int f21821e;
    /* renamed from: f */
    protected float f21822f;
    /* renamed from: g */
    protected float f21823g;
    /* renamed from: h */
    protected float f21824h;
    /* renamed from: i */
    protected float f21825i;
    /* renamed from: j */
    protected float f21826j;
    /* renamed from: k */
    protected float f21827k;
    /* renamed from: l */
    protected int f21828l;
    /* renamed from: m */
    int f21829m;
    /* renamed from: n */
    ColorDrawable[] f21830n;
    /* renamed from: o */
    TransitionDrawable f21831o;
    /* renamed from: p */
    private ViewGroup f21832p;
    /* renamed from: q */
    private int f21833q;
    /* renamed from: r */
    private AccelerateInterpolator f21834r;
    /* renamed from: s */
    private C4946a f21835s;

    /* compiled from: SlideDismissAttacher */
    /* renamed from: dkd$a */
    public interface C4946a {
        /* renamed from: a */
        void mo4425a(int i);

        /* renamed from: a */
        boolean mo4426a();

        /* renamed from: b */
        void mo4427b();

        /* renamed from: b */
        void mo4428b(int i);

        /* renamed from: c */
        void mo4429c();

        /* renamed from: d */
        void mo4430d();

        /* renamed from: e */
        void mo4431e();
    }

    public dkd(Context context, int i) {
        this.f21817a = false;
        this.f21818b = false;
        this.f21826j = 0.0f;
        this.f21827k = 0.0f;
        this.f21828l = 0;
        this.f21826j = (float) (djy.m27644c(context).y / 4);
        this.f21827k = this.f21826j * 2.0f;
        this.f21834r = new AccelerateInterpolator();
        this.f21833q = i;
        this.f21830n = new ColorDrawable[]{new ColorDrawable(), new ColorDrawable()};
        this.f21831o = new TransitionDrawable(this.f21830n);
        this.f21821e = 0;
        this.f21820d = 0;
    }

    public dkd(Context context, int i, int i2) {
        this(context, i);
        this.f21826j = ((float) i2) > this.f21826j * 4.0f ? this.f21826j : (float) (i2 / 4);
    }

    /* renamed from: a */
    public void m27676a(C4946a c4946a) {
        this.f21835s = c4946a;
    }

    /* renamed from: a */
    protected boolean m27677a() {
        if (this.f21835s != null) {
            return this.f21835s.mo4426a();
        }
        return true;
    }

    /* renamed from: b */
    protected void m27679b() {
        if (this.f21835s != null) {
            this.f21835s.mo4427b();
        }
    }

    /* renamed from: c */
    protected void m27681c() {
        if (this.f21835s != null) {
            this.f21835s.mo4429c();
        }
    }

    /* renamed from: d */
    protected void m27683d() {
        if (this.f21835s != null) {
            this.f21835s.mo4430d();
        }
    }

    /* renamed from: e */
    protected void m27684e() {
        if (!this.f21818b) {
            this.f21818b = true;
            if (this.f21835s != null) {
                this.f21835s.mo4425a(m27687h());
            }
        }
    }

    /* renamed from: f */
    protected void m27685f() {
        if (this.f21835s != null) {
            this.f21835s.mo4428b(m27687h());
        }
    }

    /* renamed from: g */
    protected void m27686g() {
        if (this.f21835s != null) {
            this.f21835s.mo4431e();
        }
    }

    /* renamed from: a */
    public void mo4421a(ViewGroup viewGroup) {
        this.f21832p = viewGroup;
    }

    /* renamed from: a */
    public boolean mo4422a(MotionEvent motionEvent) {
        boolean c = m27682c(motionEvent);
        this.f21823g = motionEvent.getY();
        this.f21821e = this.f21820d;
        return c;
    }

    /* renamed from: b */
    public boolean mo4423b(MotionEvent motionEvent) {
        int a = io.a(motionEvent);
        if (a == 3 || a == 1) {
            m27673i();
            return false;
        } else if (motionEvent.getPointerCount() > 1) {
            m27673i();
            return false;
        } else {
            switch (a) {
                case 0:
                    return false;
                case 2:
                    if (!this.f21817a) {
                        this.f21817a = true;
                        this.f21822f = motionEvent.getY();
                    }
                    this.f21824h = motionEvent.getY() - this.f21822f;
                    this.f21820d = m27671a(motionEvent.getY(), this.f21823g);
                    if (!this.f21819c && Math.abs(this.f21824h) > 5.0f) {
                        this.f21822f = motionEvent.getY();
                        this.f21819c = true;
                    }
                    if (this.f21819c) {
                        return true;
                    }
                    return false;
                default:
                    return false;
            }
        }
    }

    /* renamed from: c */
    public boolean m27682c(MotionEvent motionEvent) {
        View findViewById;
        Animation translateAnimation;
        switch (motionEvent.getAction()) {
            case 0:
                if (!m27677a()) {
                    return true;
                }
                this.f21817a = true;
                this.f21822f = motionEvent.getY();
                this.f21824h = 0.0f;
                this.f21825i = 0.0f;
                m27679b();
                return true;
            case 1:
                m27673i();
                if (m27677a()) {
                    if (Math.abs(this.f21824h) <= this.f21826j) {
                        m27683d();
                        m27686g();
                        findViewById = this.f21832p.findViewById(this.f21833q);
                        if (VERSION.SDK_INT >= 11) {
                            findViewById.setTranslationY(0.0f);
                        }
                        translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.f21824h, 0.0f);
                        translateAnimation.setDuration(400);
                        translateAnimation.setFillAfter(true);
                        translateAnimation.setFillEnabled(true);
                        findViewById.startAnimation(translateAnimation);
                        m27674j();
                        if (VERSION.SDK_INT >= 16) {
                            this.f21831o.resetTransition();
                        } else {
                            this.f21831o = new TransitionDrawable(this.f21830n);
                        }
                        djy.m27640a(this.f21832p, this.f21831o);
                        this.f21831o.startTransition(400);
                        break;
                    }
                    m27685f();
                    break;
                }
                break;
            case 2:
                if (!m27677a()) {
                    m27673i();
                }
                if (!this.f21817a) {
                    return true;
                }
                this.f21824h = motionEvent.getY() - this.f21822f;
                findViewById = this.f21832p.findViewById(this.f21833q);
                if (VERSION.SDK_INT >= 11) {
                    findViewById.setTranslationY(this.f21824h);
                } else {
                    translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.f21825i, this.f21824h);
                    translateAnimation.setFillAfter(true);
                    translateAnimation.setDuration(0);
                    findViewById.startAnimation(translateAnimation);
                    this.f21825i = this.f21824h;
                }
                float abs = Math.abs(this.f21824h / this.f21827k);
                this.f21828l = m27672b(abs) | this.f21829m;
                this.f21832p.setBackgroundColor(this.f21828l);
                if (((double) abs) > 0.05d) {
                    m27684e();
                }
                m27681c();
                return true;
        }
        return false;
    }

    /* renamed from: i */
    private void m27673i() {
        this.f21817a = false;
        this.f21819c = false;
        this.f21818b = false;
    }

    /* renamed from: a */
    private int m27670a(float f) {
        if (f > 0.6f) {
            f = 0.6f;
        }
        return (int) ((1.0f - this.f21834r.getInterpolation(f)) * 255.0f);
    }

    /* renamed from: b */
    private int m27672b(float f) {
        return m27670a(f) << 24;
    }

    /* renamed from: j */
    private void m27674j() {
        if (VERSION.SDK_INT >= 16) {
            this.f21830n[0].setColor(this.f21828l);
            this.f21830n[1].setColor(this.f21829m | CtaButton.BACKGROUND_COLOR);
            return;
        }
        this.f21830n[0] = new ColorDrawable(this.f21828l);
        this.f21830n[1] = new ColorDrawable(this.f21829m | CtaButton.BACKGROUND_COLOR);
    }

    /* renamed from: a */
    private int m27671a(float f, float f2) {
        float f3 = f - f2;
        if (f3 > 0.0f) {
            return 1;
        }
        if (f3 < 0.0f) {
            return 2;
        }
        return 0;
    }

    /* renamed from: h */
    public int m27687h() {
        return this.f21820d;
    }
}
