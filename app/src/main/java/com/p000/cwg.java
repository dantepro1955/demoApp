package com.p000;

import android.content.Context;
import android.content.Intent;

/* compiled from: TaskController */
/* renamed from: cwg */
public class cwg {
    /* renamed from: a */
    private Context f20368a;

    public cwg(Context context) {
        this.f20368a = context;
    }

    /* renamed from: a */
    protected void m25202a(Intent intent) {
        this.f20368a.startService(intent);
    }

    /* renamed from: a */
    protected Intent m25201a(Class<?> cls, int i) {
        Intent intent = new Intent(this.f20368a, cls);
        intent.putExtra("command", i);
        return intent;
    }
}
