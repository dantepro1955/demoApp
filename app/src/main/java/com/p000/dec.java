package com.p000;

import android.content.Intent;

/* compiled from: TaskCallback */
/* renamed from: dec */
public abstract class dec {
    /* renamed from: a */
    private static int f18475a = 0;
    /* renamed from: b */
    private int f18476b;

    /* renamed from: a */
    public abstract void mo3773a(Intent intent);

    public dec() {
        int i = f18475a;
        f18475a = i + 1;
        this.f18476b = i;
    }

    /* renamed from: a */
    public int m22588a() {
        return this.f18476b;
    }
}
