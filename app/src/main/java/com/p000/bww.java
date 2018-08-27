package com.p000;

import android.app.Activity;
import android.content.Context;
import java.util.Collection;

/* compiled from: Dexter */
/* renamed from: bww */
public final class bww {
    /* renamed from: a */
    private static bwx f8039a;

    /* renamed from: a */
    public static void m11576a(Context context) {
        if (f8039a == null) {
            f8039a = new bwx(context, new bwv(), new bwy());
        }
    }

    /* renamed from: a */
    public static void m11577a(bxo bxo, String str) {
        bww.m11580b();
        f8039a.m11602a(bxo, str, bxg.m11630a());
    }

    /* renamed from: a */
    public static boolean m11579a() {
        bww.m11580b();
        return f8039a.m11607c();
    }

    /* renamed from: b */
    private static void m11580b() {
        if (f8039a == null) {
            throw new NullPointerException("context == null \n Must call \"initialize\" on Dexter");
        }
    }

    /* renamed from: a */
    public static void m11575a(Activity activity) {
        f8039a.m11601a(activity);
    }

    /* renamed from: a */
    public static void m11578a(Collection<String> collection, Collection<String> collection2) {
        f8039a.m11603a((Collection) collection);
        f8039a.m11605b(collection2);
    }
}
