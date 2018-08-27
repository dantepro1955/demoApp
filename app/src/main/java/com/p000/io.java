package com.p000;

import android.os.Build.VERSION;
import android.view.MotionEvent;

/* compiled from: MotionEventCompat */
/* renamed from: io */
public final class io {
    /* renamed from: a */
    static final io$d f16870a;

    static {
        if (VERSION.SDK_INT >= 14) {
            f16870a = new io$c();
        } else if (VERSION.SDK_INT >= 12) {
            f16870a = new io$b();
        } else {
            f16870a = new io$a();
        }
    }

    /* renamed from: a */
    public static int m21178a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    /* renamed from: b */
    public static int m21180b(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    @Deprecated
    /* renamed from: a */
    public static int m21179a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    /* renamed from: b */
    public static int m21181b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    /* renamed from: c */
    public static float m21182c(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    /* renamed from: d */
    public static float m21183d(MotionEvent motionEvent, int i) {
        return f16870a.a(motionEvent, i);
    }
}
