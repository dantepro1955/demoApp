package com.p000;

import android.os.Build.VERSION;
import android.view.KeyEvent;

/* compiled from: KeyEventCompat */
/* renamed from: ib */
public final class ib {
    /* renamed from: a */
    static final ib$c f16866a;

    static {
        if (VERSION.SDK_INT >= 11) {
            f16866a = new ib$b();
        } else {
            f16866a = new ib$a();
        }
    }

    /* renamed from: a */
    public static boolean m21172a(KeyEvent keyEvent, int i) {
        return f16866a.a(keyEvent.getMetaState(), i);
    }

    /* renamed from: a */
    public static boolean m21171a(KeyEvent keyEvent) {
        return f16866a.b(keyEvent.getMetaState());
    }

    /* renamed from: b */
    public static boolean m21173b(KeyEvent keyEvent) {
        return f16866a.a(keyEvent);
    }
}
