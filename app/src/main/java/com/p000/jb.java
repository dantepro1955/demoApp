package com.p000;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

/* compiled from: VelocityTrackerCompat */
/* renamed from: jb */
public final class jb {
    /* renamed from: a */
    static final jb$c f16873a;

    static {
        if (VERSION.SDK_INT >= 11) {
            f16873a = new jb$b();
        } else {
            f16873a = new jb$a();
        }
    }

    /* renamed from: a */
    public static float m21187a(VelocityTracker velocityTracker, int i) {
        return f16873a.a(velocityTracker, i);
    }

    /* renamed from: b */
    public static float m21188b(VelocityTracker velocityTracker, int i) {
        return f16873a.b(velocityTracker, i);
    }
}
