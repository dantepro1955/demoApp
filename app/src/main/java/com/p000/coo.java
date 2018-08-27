package com.p000;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import com.ninegag.android.app.R;

/* compiled from: AppBarUtil */
/* renamed from: coo */
public class coo {
    /* renamed from: a */
    public static void m24208a(View view) {
        if (view != null) {
            final View findViewById = view.findViewById(R.id.appBar);
            if (findViewById != null && findViewById.getVisibility() != 0) {
                Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.abc_slide_in_top);
                loadAnimation.setDuration(300);
                loadAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                loadAnimation.setAnimationListener(new AnimationListener() {
                    public void onAnimationStart(Animation animation) {
                    }

                    public void onAnimationEnd(Animation animation) {
                        findViewById.setVisibility(0);
                        findViewById.clearAnimation();
                    }

                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                loadAnimation.setFillAfter(true);
                findViewById.startAnimation(loadAnimation);
            }
        }
    }
}
