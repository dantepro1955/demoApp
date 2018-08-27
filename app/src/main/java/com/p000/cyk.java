package com.p000;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MemoryCacheUtils */
/* renamed from: cyk */
public final class cyk {
    /* renamed from: a */
    public static String m25648a(String str, cxm cxm) {
        return "_" + cxm.m25538a() + "x" + cxm.m25539b();
    }

    /* renamed from: a */
    public static List<Bitmap> m25649a(String str, cxa cxa) {
        List<Bitmap> arrayList = new ArrayList();
        for (String str2 : cxa.m25410a()) {
            if (str2.startsWith(str)) {
                arrayList.add(cxa.m25409a(str2));
            }
        }
        return arrayList;
    }
}
