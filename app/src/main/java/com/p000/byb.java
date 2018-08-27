package com.p000;

import android.app.Activity;
import android.webkit.WebView;
import p000.byi.C1595a;

/* compiled from: MoatFactory */
/* renamed from: byb */
public abstract class byb {
    /* renamed from: a */
    public abstract byg mo1601a(String str);

    /* renamed from: a */
    public abstract byo mo1602a(WebView webView);

    /* renamed from: a */
    public static byb m11721a(Activity activity) {
        try {
            return new byc(activity);
        } catch (Exception e) {
            byt.m11829a(e);
            return new C1595a();
        }
    }
}
