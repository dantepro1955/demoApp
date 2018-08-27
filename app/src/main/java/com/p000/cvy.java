package com.p000;

import android.content.Context;
import android.content.Intent;

/* compiled from: Task */
/* renamed from: cvy */
public abstract class cvy implements Runnable {
    /* renamed from: a */
    protected Context f20347a;
    /* renamed from: b */
    private int f20348b = -1;
    /* renamed from: c */
    private int f20349c = -1;

    /* renamed from: b */
    protected abstract void mo4174b(Context context);

    /* renamed from: a */
    public void m25163a(Context context) {
        this.f20347a = context;
    }

    /* renamed from: a */
    public void m25162a(int i) {
        this.f20348b = i;
    }

    /* renamed from: b */
    public void m25165b(int i) {
        this.f20349c = i;
    }

    public void run() {
        mo4174b(this.f20347a);
    }

    /* renamed from: a */
    protected Intent m25161a() {
        Intent intent = new Intent();
        intent.setAction("com.ninegag.android.tv");
        intent.putExtra("callback", this.f20348b);
        intent.putExtra("command", this.f20349c);
        return intent;
    }

    /* renamed from: a */
    protected void m25164a(Intent intent) {
        try {
            this.f20347a.sendBroadcast(intent);
        } catch (Exception e) {
        }
    }
}
