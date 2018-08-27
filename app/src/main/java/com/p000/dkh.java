package com.p000;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import p000.dnb.C5002e;

/* compiled from: Hint */
/* renamed from: dkh */
public class dkh {
    /* renamed from: a */
    protected Activity f21842a;
    /* renamed from: b */
    protected View f21843b;
    /* renamed from: c */
    protected Animation f21844c;
    /* renamed from: d */
    private boolean f21845d;

    /* compiled from: Hint */
    /* renamed from: dkh$2 */
    class C49492 implements AnimationListener {
        /* renamed from: a */
        final /* synthetic */ dkh f21848a;

        C49492(dkh dkh) {
            this.f21848a = dkh;
        }

        public void onAnimationStart(Animation animation) {
        }

        public void onAnimationEnd(Animation animation) {
            this.f21848a.m27694b();
        }

        public void onAnimationRepeat(Animation animation) {
        }
    }

    dkh(Activity activity, View view, Animation animation, final Runnable runnable, long j) {
        this.f21842a = activity;
        this.f21843b = view;
        this.f21844c = animation;
        Runnable c49481 = new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ dkh f21847b;

            public void run() {
                this.f21847b.m27693a(runnable);
            }
        };
        if (j > 0) {
            this.f21843b.postDelayed(c49481, j);
        } else {
            c49481.run();
        }
    }

    /* renamed from: a */
    public void m27695a() {
        this.f21845d = true;
        if (this.f21844c == null) {
            m27694b();
            return;
        }
        this.f21844c.setAnimationListener(new C49492(this));
        View findViewById = this.f21843b.findViewById(C5002e.container);
        if (findViewById == null) {
            this.f21843b.startAnimation(this.f21844c);
        } else {
            findViewById.startAnimation(this.f21844c);
        }
    }

    /* renamed from: b */
    private void m27694b() {
        ((ViewGroup) this.f21842a.findViewById(16908290)).removeView(this.f21843b);
    }

    /* renamed from: a */
    private void m27693a(Runnable runnable) {
        if (!this.f21845d) {
            runnable.run();
        }
    }
}
