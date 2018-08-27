package com.sept.android.lib.widget.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
// import p000.dnb.C4998a;
import com.Utility.Res.res_id_1;

public class FloatingActionButtonBehavior extends Behavior<FloatingActionButton> {
    /* renamed from: a */
    private Animation animation_1;
    /* renamed from: b */
    private Animation animation_2;

    public FloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.animation_1 = AnimationUtils.loadAnimation(context, res_id_1.show_from_bottom);
        this.animation_2 = AnimationUtils.loadAnimation(context, res_id_1.hide_to_bottom);
    }

    /* renamed from: a */
    public void onNestedScroll /*m23943a*/(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view, int i, int i2, int i3, int i4) {
        super.onNestedScroll(coordinatorLayout, floatingActionButton, view, i, i2, i3, i4);
        if (floatingActionButton.getVisibility() == View.VISIBLE && i2 > 0) {
            changeToAnimation2(floatingActionButton);
            floatingActionButton.setVisibility(View.INVISIBLE);
        } else if (floatingActionButton.getVisibility() == View.INVISIBLE && i2 < 0) {
            changeToAnimation1(floatingActionButton);
            // floatingActionButton.onNestedScroll(); TODO
        }
    }

    /* renamed from: a */
    public boolean onNestedScroll(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view, View view2, int i) {
        return i == 2;
    }

    /* renamed from: a */
    private void changeToAnimation1(FloatingActionButton floatingActionButton) {
        this.animation_2.cancel();
        floatingActionButton.startAnimation(this.animation_1);
    }

    /* renamed from: b */
    private void changeToAnimation2(FloatingActionButton floatingActionButton) {
        this.animation_1.cancel();
        floatingActionButton.startAnimation(this.animation_2);
    }
}
