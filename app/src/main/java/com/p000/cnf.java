package com.p000;

import android.content.Context;
import android.content.Intent;

/* compiled from: Task */
/* renamed from: cnf */
public abstract class cnf {
    /* renamed from: a */
    private long f9729a;
    /* renamed from: b */
    private int f9730b;

    /* renamed from: e */
    abstract int mo1797e();

    /* renamed from: m */
    public abstract String mo1806m();

    /* renamed from: b */
    public void m14461b(int i) {
        this.f9730b = i;
    }

    /* renamed from: a */
    public void m14460a(Intent intent) {
        if (intent != null) {
            this.f9729a = intent.getLongExtra("callback_key", -1);
        }
    }

    /* renamed from: o */
    public long m14465o() {
        return this.f9729a;
    }

    /* renamed from: a */
    public void mo1796a(Context context) {
    }

    /* renamed from: g */
    public Intent mo1798g() {
        Intent intent = new Intent();
        intent.putExtra("callback_key", m14465o());
        return intent;
    }

    /* renamed from: p */
    public boolean m14466p() {
        return mo1797e() == 0;
    }

    /* renamed from: q */
    public boolean m14467q() {
        return mo1797e() == 3;
    }
}
