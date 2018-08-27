package com.p000;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;

@TargetApi(21)
/* compiled from: ViewUtilsLollipop */
/* renamed from: au */
public class au {
    /* renamed from: a */
    private static final int[] f4591a = new int[]{16843848};

    /* renamed from: a */
    public static void m5730a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: a */
    public static void m5732a(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4591a, i, i2);
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, obtainStyledAttributes.getResourceId(0, 0)));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public static void m5731a(View view, float f) {
        int integer = view.getResources().getInteger(n$g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{16842766, n$b.state_collapsible, -n$b.state_collapsed}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration((long) integer));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration((long) integer));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
