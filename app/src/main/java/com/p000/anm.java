package com.p000;

import android.content.Intent;

/* renamed from: anm */
public class anm extends Exception {
    /* renamed from: a */
    private final Intent f3778a;

    public anm(String str, Intent intent) {
        super(str);
        this.f3778a = intent;
    }

    /* renamed from: b */
    public Intent m4553b() {
        return new Intent(this.f3778a);
    }
}
