package com.p000;

import android.util.Log;

/* compiled from: Exceptions */
/* renamed from: byt */
public final class byt {
    /* renamed from: a */
    public static void m11829a(Exception exception) {
        if (bxu.f8112a.booleanValue()) {
            Log.e("[Moat Exception]", Log.getStackTraceString(exception));
            if (exception instanceof RuntimeException) {
                throw ((RuntimeException) exception);
            } else if (exception.getCause() == null || !(exception.getCause() instanceof RuntimeException)) {
                throw new RuntimeException(exception);
            } else {
                throw ((RuntimeException) exception.getCause());
            }
        }
    }
}
