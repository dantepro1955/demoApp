package com.p000;

import android.os.Handler;
import android.os.Looper;

/* compiled from: MainThread */
/* renamed from: bwz */
final class bwz implements bxf {
    bwz() {
    }

    /* renamed from: a */
    public void mo1585a(Runnable runnable) {
        if (bwz.m11611b()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* renamed from: a */
    public void mo1584a() {
    }

    /* renamed from: b */
    private static boolean m11611b() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
