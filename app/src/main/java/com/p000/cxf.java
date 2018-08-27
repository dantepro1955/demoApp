package com.p000;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* compiled from: ImageLoaderConfiguration */
/* renamed from: cxf */
public final class cxf {
    /* renamed from: a */
    final Resources f20530a;
    /* renamed from: b */
    final int f20531b;
    /* renamed from: c */
    final int f20532c;
    /* renamed from: d */
    final int f20533d;
    /* renamed from: e */
    final int f20534e;
    /* renamed from: f */
    final cyg f20535f;
    /* renamed from: g */
    final boolean f20536g;
    /* renamed from: h */
    final boolean f20537h;
    /* renamed from: i */
    final int f20538i;
    /* renamed from: j */
    final int f20539j;
    /* renamed from: k */
    final cxo f20540k;
    /* renamed from: l */
    final cxa f20541l;
    /* renamed from: m */
    final cwz f20542m;
    /* renamed from: n */
    final cxy f20543n;
    /* renamed from: o */
    final cxu f20544o;
    /* renamed from: p */
    final cxd f20545p;
    /* renamed from: q */
    final cxy f20546q;
    /* renamed from: r */
    final cxy f20547r;

    /* renamed from: a */
    cxm m25499a() {
        DisplayMetrics displayMetrics = this.f20530a.getDisplayMetrics();
        int i = this.f20531b;
        if (i <= 0) {
            i = displayMetrics.widthPixels;
        }
        int i2 = this.f20532c;
        if (i2 <= 0) {
            i2 = displayMetrics.heightPixels;
        }
        return new cxm(i, i2);
    }
}
