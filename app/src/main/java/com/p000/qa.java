package com.p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;

/* compiled from: ThemeUtils */
/* renamed from: qa */
class qa {
    /* renamed from: a */
    static final int[] f25182a = new int[]{-16842910};
    /* renamed from: b */
    static final int[] f25183b = new int[]{16842908};
    /* renamed from: c */
    static final int[] f25184c = new int[]{16843518};
    /* renamed from: d */
    static final int[] f25185d = new int[]{16842919};
    /* renamed from: e */
    static final int[] f25186e = new int[]{16842912};
    /* renamed from: f */
    static final int[] f25187f = new int[]{16842913};
    /* renamed from: g */
    static final int[] f25188g = new int[]{-16842919, -16842908};
    /* renamed from: h */
    static final int[] f25189h = new int[0];
    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f25190i = new ThreadLocal();
    /* renamed from: j */
    private static final int[] f25191j = new int[1];

    /* renamed from: a */
    public static int m33765a(Context context, int i) {
        f25191j[0] = i;
        qf a = qf.m33776a(context, null, f25191j);
        try {
            int b = a.m33783b(0, 0);
            return b;
        } finally {
            a.m33781a();
        }
    }

    /* renamed from: b */
    public static ColorStateList m33768b(Context context, int i) {
        f25191j[0] = i;
        qf a = qf.m33776a(context, null, f25191j);
        try {
            ColorStateList e = a.m33790e(0);
            return e;
        } finally {
            a.m33781a();
        }
    }

    /* renamed from: c */
    public static int m33769c(Context context, int i) {
        ColorStateList b = qa.m33768b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f25182a, b.getDefaultColor());
        }
        TypedValue a = qa.m33767a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return qa.m33766a(context, i, a.getFloat());
    }

    /* renamed from: a */
    private static TypedValue m33767a() {
        TypedValue typedValue = (TypedValue) f25190i.get();
        if (typedValue != null) {
            return typedValue;
        }
        typedValue = new TypedValue();
        f25190i.set(typedValue);
        return typedValue;
    }

    /* renamed from: a */
    static int m33766a(Context context, int i, float f) {
        int a = qa.m33765a(context, i);
        return fo.m30185b(a, Math.round(((float) Color.alpha(a)) * f));
    }
}
