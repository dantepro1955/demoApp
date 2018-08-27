package com.p000;

import android.app.Activity;
import android.content.Context;
import p000.btn.C1479a;
import p000.btn.C1480b;
import p000.btq.C1483a;

/* renamed from: bsu */
public abstract class bsu {
    /* renamed from: a */
    private static final bsu f7574a = bsu.m10703b();

    /* renamed from: a */
    public static bsu m10702a() {
        return f7574a;
    }

    /* renamed from: b */
    private static bsu m10703b() {
        try {
            return (bsu) Class.forName("com.google.android.youtube.api.locallylinked.LocallyLinkedFactory").asSubclass(bsu.class).newInstance();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        } catch (Throwable e2) {
            throw new IllegalStateException(e2);
        } catch (ClassNotFoundException e3) {
            return new bsw();
        }
    }

    /* renamed from: a */
    public abstract bsx mo1434a(Context context, String str, C1479a c1479a, C1480b c1480b);

    /* renamed from: a */
    public abstract bsz mo1435a(Activity activity, bsx bsx, boolean z) throws C1483a;
}
