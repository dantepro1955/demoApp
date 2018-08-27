package com.p000;

import android.content.Context;
import android.os.Handler;

/* compiled from: TaskController */
/* renamed from: dde */
public abstract class dde {
    /* renamed from: a */
    private Handler f21189a;
    /* renamed from: b */
    private boolean f21190b = false;
    /* renamed from: c */
    private Context f21191c;

    /* renamed from: b */
    public abstract boolean mo4324b();

    /* renamed from: a */
    public void m26449a(Context context) {
        if (!this.f21190b) {
            this.f21190b = true;
            m26451b(context);
        }
    }

    /* renamed from: d */
    public Context m26453d() {
        return this.f21191c;
    }

    /* renamed from: b */
    public void m26451b(Context context) {
        this.f21191c = context;
    }

    /* renamed from: a */
    public void m26450a(Handler handler) {
        this.f21189a = handler;
    }

    /* renamed from: e */
    protected void m26454e() {
        try {
            if (this.f21189a != null && mo4324b()) {
                this.f21189a.sendEmptyMessageDelayed(0, 20000);
            }
        } catch (Exception e) {
        }
    }
}
