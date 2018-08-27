package com.p000;

import android.os.Build.VERSION;
import android.widget.ListView;

/* compiled from: ListViewCompat */
/* renamed from: ln */
public final class ln {
    /* renamed from: a */
    public static void m32443a(ListView listView, int i) {
        if (VERSION.SDK_INT >= 19) {
            lp.m32445a(listView, i);
        } else {
            lo.m32444a(listView, i);
        }
    }
}
