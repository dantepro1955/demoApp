package com.p000;

import android.annotation.TargetApi;
import android.view.KeyEvent;

@TargetApi(11)
/* compiled from: KeyEventCompatHoneycomb */
/* renamed from: ic */
class ic {
    /* renamed from: a */
    public static int m30752a(int i) {
        return KeyEvent.normalizeMetaState(i);
    }

    /* renamed from: a */
    public static boolean m30753a(int i, int i2) {
        return KeyEvent.metaStateHasModifiers(i, i2);
    }

    /* renamed from: b */
    public static boolean m30755b(int i) {
        return KeyEvent.metaStateHasNoModifiers(i);
    }

    /* renamed from: a */
    public static boolean m30754a(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }
}
