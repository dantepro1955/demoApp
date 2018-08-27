package com.p000;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.under9.android.remoteconfig.ui.PosterDialogFragment;
import p000.djp.C4938a;

/* compiled from: BannerManager */
/* renamed from: dmt */
public class dmt extends dfx {
    /* renamed from: a */
    private ViewGroup f22262a;
    /* renamed from: b */
    private View f22263b;
    /* renamed from: c */
    private boolean f22264c;

    /* compiled from: BannerManager */
    /* renamed from: dmt$1 */
    class C49901 implements AnimationListener {
        /* renamed from: a */
        final /* synthetic */ dmt f22261a;

        C49901(dmt dmt) {
            this.f22261a = dmt;
        }

        public void onAnimationStart(Animation animation) {
        }

        public void onAnimationEnd(Animation animation) {
            try {
                if (this.f22261a.f22263b != null) {
                    this.f22261a.f22262a.removeView(this.f22261a.f22263b);
                    this.f22261a.f22262a = null;
                    this.f22261a.f22263b = null;
                }
                this.f22261a.f22264c = false;
            } catch (Exception e) {
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* renamed from: a */
    public void m28101a(Activity activity, dmu dmu) {
        m28103a((ViewGroup) activity.findViewById(16908290), dmu);
    }

    /* renamed from: a */
    public void m28103a(ViewGroup viewGroup, dmu dmu) {
        try {
            m28104a(false);
            this.f22262a = viewGroup;
            this.f22263b = dmu.m28111a(viewGroup.getContext());
            this.f22264c = false;
            LayoutParams a = C4938a.m27606a();
            a.gravity = 80;
            viewGroup.addView(this.f22263b, a);
        } catch (Exception e) {
        }
    }

    /* renamed from: f */
    public void m28106f() {
        m28104a(true);
    }

    /* renamed from: a */
    public void m28104a(boolean z) {
        if (this.f22262a != null && this.f22263b != null) {
            if (!z) {
                this.f22262a.removeView(this.f22263b);
                this.f22263b = null;
                this.f22262a = null;
                this.f22264c = false;
            } else if (!this.f22264c) {
                this.f22264c = true;
                Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setInterpolator(new AccelerateInterpolator());
                alphaAnimation.setDuration(500);
                alphaAnimation.setAnimationListener(new C49901(this));
                this.f22263b.startAnimation(alphaAnimation);
            }
        }
    }

    /* renamed from: a */
    public void m28102a(FragmentActivity fragmentActivity, dmw dmw) {
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        PosterDialogFragment posterDialogFragment = new PosterDialogFragment();
        posterDialogFragment.m24207a(dmw);
        posterDialogFragment.show(supportFragmentManager, "rc_poster");
    }

    public void t_() {
        super.t_();
        m28104a(false);
    }

    /* renamed from: d */
    public void mo4395d() {
        super.mo4395d();
        m28104a(false);
    }
}
