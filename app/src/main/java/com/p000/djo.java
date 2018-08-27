package com.p000;

import android.content.Context;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

/* compiled from: L10nUtil */
/* renamed from: djo */
public class djo {
    /* renamed from: a */
    private static Locale f21808a = Locale.US;
    /* renamed from: b */
    private static final ThreadLocal<NumberFormat> f21809b = new C49371();

    /* compiled from: L10nUtil */
    /* renamed from: djo$1 */
    static class C49371 extends ThreadLocal<NumberFormat> {
        C49371() {
        }

        protected /* synthetic */ Object initialValue() {
            return m27597a();
        }

        /* renamed from: a */
        protected NumberFormat m27597a() {
            return NumberFormat.getNumberInstance(Locale.getDefault());
        }
    }

    /* renamed from: a */
    public static String m27599a(Context context, int i) {
        return context.getResources().getString(i);
    }

    /* renamed from: b */
    public static String[] m27604b(Context context, int i) {
        return context.getResources().getStringArray(i);
    }

    /* renamed from: a */
    public static String m27600a(Context context, int i, int i2) {
        return context.getResources().getQuantityString(i, i2);
    }

    /* renamed from: b */
    public static String m27603b(Context context, int i, int i2) {
        return String.format(djo.m27600a(context, i, i2), new Object[]{Integer.valueOf(i2)});
    }

    /* renamed from: c */
    public static String m27605c(Context context, int i) {
        String[] b = djo.m27604b(context, i);
        return b[new Random().nextInt(b.length)];
    }

    /* renamed from: a */
    public static String m27598a(int i) {
        return ((NumberFormat) f21809b.get()).format((long) i);
    }

    /* renamed from: a */
    public static void m27602a(Locale locale) {
        if (locale != null) {
            f21808a = locale;
        }
    }

    /* renamed from: a */
    public static Locale m27601a() {
        return f21808a;
    }
}
