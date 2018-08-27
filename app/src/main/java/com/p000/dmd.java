package com.p000;

import android.os.Build.VERSION;
import android.view.View;

/* compiled from: Compat */
/* renamed from: dmd */
public class dmd {
    /* renamed from: a */
    public static void m27962a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            dme.m27963a(view, runnable);
        } else {
            view.postDelayed(runnable, 16);
        }
    }
}
