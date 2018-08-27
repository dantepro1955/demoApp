package com.p000;

import android.content.Context;
import android.content.Intent;

/* compiled from: Task */
/* renamed from: deb */
public abstract class deb {
    /* renamed from: l */
    public static String f21275l = "callback_key";
    /* renamed from: a */
    private int f21276a;

    /* renamed from: f */
    public abstract void mo4336f(Context context);

    /* renamed from: a */
    public void m26635a(Intent intent) {
        if (intent != null) {
            this.f21276a = intent.getIntExtra(f21275l, -1);
        }
    }

    /* renamed from: e */
    public int m26637e() {
        return this.f21276a;
    }

    /* renamed from: d */
    public Intent mo4335d() {
        Intent intent = new Intent();
        intent.putExtra(f21275l, m26637e());
        return intent;
    }
}
