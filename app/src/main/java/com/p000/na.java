package com.p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* compiled from: AppCompatResources */
/* renamed from: na */
public final class na {
    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f24688a = new ThreadLocal();
    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C5582a>> f24689b = new WeakHashMap(0);
    /* renamed from: c */
    private static final Object f24690c = new Object();

    /* compiled from: AppCompatResources */
    /* renamed from: na$a */
    static class C5582a {
        /* renamed from: a */
        final ColorStateList f24686a;
        /* renamed from: b */
        final Configuration f24687b;

        C5582a(ColorStateList colorStateList, Configuration configuration) {
            this.f24686a = colorStateList;
            this.f24687b = configuration;
        }
    }

    /* renamed from: a */
    public static ColorStateList m32936a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = na.m32941d(context, i);
        if (d != null) {
            return d;
        }
        d = na.m32940c(context, i);
        if (d == null) {
            return ew.b(context, i);
        }
        na.m32938a(context, i, d);
        return d;
    }

    /* renamed from: b */
    public static Drawable m32939b(Context context, int i) {
        return ot.m33355a().m33373a(context, i);
    }

    /* renamed from: c */
    private static ColorStateList m32940c(Context context, int i) {
        ColorStateList colorStateList = null;
        if (!na.m32942e(context, i)) {
            Resources resources = context.getResources();
            try {
                colorStateList = mz.m32932a(resources, resources.getXml(i), context.getTheme());
            } catch (Throwable e) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        return colorStateList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    private static ColorStateList m32941d(Context r5, int r6) {
        /*
        r2 = f24690c;
        monitor-enter(r2);
        r0 = f24689b;	 Catch:{ all -> 0x0035 }
        r0 = r0.get(r5);	 Catch:{ all -> 0x0035 }
        r0 = (android.util.SparseArray) r0;	 Catch:{ all -> 0x0035 }
        if (r0 == 0) goto L_0x0032;
    L_0x000d:
        r1 = r0.size();	 Catch:{ all -> 0x0035 }
        if (r1 <= 0) goto L_0x0032;
    L_0x0013:
        r1 = r0.get(r6);	 Catch:{ all -> 0x0035 }
        r1 = (p000.na.C5582a) r1;	 Catch:{ all -> 0x0035 }
        if (r1 == 0) goto L_0x0032;
    L_0x001b:
        r3 = r1.f24687b;	 Catch:{ all -> 0x0035 }
        r4 = r5.getResources();	 Catch:{ all -> 0x0035 }
        r4 = r4.getConfiguration();	 Catch:{ all -> 0x0035 }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x0035 }
        if (r3 == 0) goto L_0x002f;
    L_0x002b:
        r0 = r1.f24686a;	 Catch:{ all -> 0x0035 }
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
    L_0x002e:
        return r0;
    L_0x002f:
        r0.remove(r6);	 Catch:{ all -> 0x0035 }
    L_0x0032:
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
        r0 = 0;
        goto L_0x002e;
    L_0x0035:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: na.d(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: a */
    private static void m32938a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f24690c) {
            SparseArray sparseArray = (SparseArray) f24689b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f24689b.put(context, sparseArray);
            }
            sparseArray.append(i, new C5582a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: e */
    private static boolean m32942e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = na.m32937a();
        resources.getValue(i, a, true);
        if (a.type < 28 || a.type > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static TypedValue m32937a() {
        TypedValue typedValue = (TypedValue) f24688a.get();
        if (typedValue != null) {
            return typedValue;
        }
        typedValue = new TypedValue();
        f24688a.set(typedValue);
        return typedValue;
    }
}
