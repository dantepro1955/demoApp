package com.p000;

import android.annotation.TargetApi;
import android.view.VelocityTracker;

@TargetApi(11)
/* compiled from: VelocityTrackerCompatHoneycomb */
/* renamed from: jc */
class jc {
    /* renamed from: a */
    public static float m31430a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }

    /* renamed from: b */
    public static float m31431b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }
}
