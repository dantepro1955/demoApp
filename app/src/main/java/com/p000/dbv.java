package com.p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.AbsListView;
import p000.dbt.C4779a;

/* compiled from: Utils */
/* renamed from: dbv */
final class dbv {
    /* renamed from: a */
    static int m26291a(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    static void m26293a(View view, int i, AnimationListener animationListener) {
        Animation dbj = new dbj(view, view.getHeight(), i);
        dbj.setAnimationListener(animationListener);
        dbj.setDuration(200);
        view.startAnimation(dbj);
    }

    /* renamed from: a */
    static boolean m26294a(AbsListView absListView) {
        return absListView.getChildCount() == 0 || absListView.getChildAt(0).getTop() == absListView.getPaddingTop();
    }

    /* renamed from: a */
    static View m26292a(Context context, int i, View view) {
        LayoutInflater from = LayoutInflater.from(context);
        if (view == null && i != -1) {
            return from.inflate(i, null);
        }
        return view;
    }

    /* renamed from: a */
    static int m26290a(int i, boolean z) {
        if ((i & 48) == 48) {
            return z ? C4779a.slide_in_top : C4779a.slide_out_top;
        } else {
            if ((i & 80) == 80) {
                return z ? C4779a.slide_in_bottom : C4779a.slide_out_bottom;
            } else {
                if ((i & 17) == 17) {
                    return z ? C4779a.fade_in_center : C4779a.fade_out_center;
                } else {
                    return -1;
                }
            }
        }
    }
}
