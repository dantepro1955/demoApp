package com.p000;

import android.util.Log;

/* renamed from: bsh */
public class bsh implements bre {
    /* renamed from: a */
    private int f7524a = 5;

    /* renamed from: a */
    public void mo1424a(String str) {
        if (this.f7524a <= 6) {
            Log.e("GoogleTagManager", str);
        }
    }

    /* renamed from: a */
    public void mo1425a(String str, Throwable th) {
        if (this.f7524a <= 6) {
            Log.e("GoogleTagManager", str, th);
        }
    }

    /* renamed from: b */
    public void mo1426b(String str) {
        if (this.f7524a <= 5) {
            Log.w("GoogleTagManager", str);
        }
    }

    /* renamed from: b */
    public void mo1427b(String str, Throwable th) {
        if (this.f7524a <= 5) {
            Log.w("GoogleTagManager", str, th);
        }
    }

    /* renamed from: c */
    public void mo1428c(String str) {
        if (this.f7524a <= 4) {
            Log.i("GoogleTagManager", str);
        }
    }

    /* renamed from: d */
    public void mo1429d(String str) {
        if (this.f7524a <= 2) {
            Log.v("GoogleTagManager", str);
        }
    }
}
