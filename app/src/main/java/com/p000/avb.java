package com.p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p000.atp.C0794a;
import p000.atr.C0800a;

/* renamed from: avb */
public class avb extends ava {
    /* renamed from: s */
    private static final String f4647s = avb.class.getSimpleName();

    protected avb(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* renamed from: a */
    public static avb m5922a(String str, Context context, boolean z) {
        ava.m5903a(context, z);
        return new avb(context, str, z);
    }

    /* renamed from: b */
    protected List<Callable<Void>> mo785b(avx avx, C0800a c0800a, C0794a c0794a) {
        if (avx.m6097c() == null || !this.o) {
            return super.mo785b(avx, c0800a, c0794a);
        }
        int r = avx.m6112r();
        List<Callable<Void>> arrayList = new ArrayList();
        arrayList.addAll(super.mo785b(avx, c0800a, c0794a));
        arrayList.add(new awk(avx, avf.m5973p(), avf.m5974q(), c0800a, r, 24));
        return arrayList;
    }
}
