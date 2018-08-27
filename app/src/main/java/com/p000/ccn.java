package com.p000;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.ninegag.android.app.R;

/* compiled from: GagPostListFragmentUiController */
/* renamed from: ccn */
public class ccn extends ccg {
    public ccn(String str, ccl ccl) {
        super(str, ccl);
    }

    /* renamed from: a */
    public void m12545a(boolean z) {
        if (a.m12077h().aM() && m12469a() != null && m12469a().F() != null) {
            boolean z2 = z && m12544b();
            View findViewById = m12469a().F().findViewById(R.id.new_posts_button_container);
            if (findViewById != null) {
                findViewById = (View) findViewById.getParent();
                if (findViewById == null) {
                    return;
                }
                Animation loadAnimation;
                if (z2) {
                    if (findViewById.getVisibility() != 0) {
                        loadAnimation = AnimationUtils.loadAnimation(findViewById.getContext(), R.anim.new_posts_button_in);
                        loadAnimation.setFillAfter(false);
                        findViewById.setVisibility(0);
                        findViewById.startAnimation(loadAnimation);
                        findViewById.setClickable(false);
                    }
                } else if (findViewById.getVisibility() != 8) {
                    loadAnimation = AnimationUtils.loadAnimation(findViewById.getContext(), R.anim.new_posts_button_out);
                    loadAnimation.setFillAfter(false);
                    findViewById.setVisibility(8);
                    findViewById.startAnimation(loadAnimation);
                    findViewById.setClickable(false);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m12544b() {
        if (m12469a() == null) {
            return false;
        }
        cco q = m12469a().m12521q();
        if (a.m12077h().m13977a(q.f8731c, q.f8732d) > 0) {
            return true;
        }
        return false;
    }
}
