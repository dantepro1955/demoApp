package com.p000;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.SparseArray;

@Deprecated
/* compiled from: PermissionManager */
/* renamed from: dhk */
public class dhk {
    /* renamed from: b */
    private static dhk f16742b;
    /* renamed from: a */
    private Activity f16743a;
    /* renamed from: c */
    private SparseArray<dhl> f16744c;

    /* renamed from: a */
    public static void m20966a(Activity activity, Activity activity2) {
        if (!dhk.m20967a()) {
            return;
        }
        if (activity2 != null) {
            dhk.m20969b().f16743a = activity2;
        } else if (dhk.m20969b().f16743a == activity) {
            dhk.m20969b().f16743a = null;
        }
    }

    /* renamed from: b */
    private static dhk m20969b() {
        if (f16742b == null) {
            f16742b = new dhk();
            dhk.m20969b().f16744c = new SparseArray();
        }
        return f16742b;
    }

    /* renamed from: c */
    private static Activity m20970c() {
        Activity activity = dhk.m20969b().f16743a;
        if (activity != null) {
            return activity;
        }
        throw new IllegalArgumentException("Must set an Activity");
    }

    /* renamed from: a */
    public static boolean m20968a(String str) {
        if (!dhk.m20967a()) {
            return true;
        }
        try {
            if (ew.m21140b(dhk.m20970c(), str) != 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m20964a(int i, String[] strArr, dhl dhl) {
        if (dhk.m20967a()) {
            Activity c = dhk.m20970c();
            if (dhl != null) {
                dhk.m20969b().f16744c.put(i, dhl);
            }
            cy.a(c, strArr, i);
        }
    }

    /* renamed from: a */
    public static void m20965a(int i, String[] strArr, int[] iArr) {
        if (dhk.m20967a()) {
            try {
                Context c = dhk.m20970c();
                SparseArray sparseArray = dhk.m20969b().f16744c;
                dhl dhl = (dhl) sparseArray.get(i);
                if (strArr.length == iArr.length) {
                    for (int i2 = 0; i2 < iArr.length; i2++) {
                        boolean a = cy.a(c, strArr[i2]);
                        if (iArr[i2] == -1 && !a) {
                            new djt(c).a(strArr[i2], false);
                        }
                    }
                    if (dhl != null) {
                        dhl.a(strArr, iArr);
                    }
                    try {
                        sparseArray.remove(i);
                    } catch (Exception e) {
                    }
                }
            } catch (Exception e2) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m20967a() {
        if (VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }
}
