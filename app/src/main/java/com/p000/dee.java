package com.p000;

import android.content.Context;

/* compiled from: TaskRunnable */
/* renamed from: dee */
public class dee implements Runnable {
    /* renamed from: a */
    private deb f21182a;
    /* renamed from: b */
    private Context f21183b;

    public dee(Context context, deb deb) {
        this.f21183b = context;
        this.f21182a = deb;
    }

    public void run() {
        this.f21182a.mo4336f(this.f21183b);
    }

    /* renamed from: a */
    protected deb m26447a() {
        return this.f21182a;
    }
}
