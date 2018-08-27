package com.p000;

import android.os.Build.VERSION;
import java.util.Locale;

/* compiled from: TextUtilsCompat */
/* renamed from: hf */
public final class hf {
    /* renamed from: a */
    public static final Locale f23768a = new Locale("", "");
    /* renamed from: b */
    static String f23769b = "Arab";
    /* renamed from: c */
    static String f23770c = "Hebr";
    /* renamed from: d */
    private static final C5360a f23771d;

    /* compiled from: TextUtilsCompat */
    /* renamed from: hf$a */
    static class C5360a {
        C5360a() {
        }

        /* renamed from: a */
        public int mo4809a(Locale locale) {
            if (!(locale == null || locale.equals(hf.f23768a))) {
                String a = ha.m30499a(locale);
                if (a == null) {
                    return C5360a.m30515b(locale);
                }
                if (a.equalsIgnoreCase(hf.f23769b) || a.equalsIgnoreCase(hf.f23770c)) {
                    return 1;
                }
            }
            return 0;
        }

        /* renamed from: b */
        private static int m30515b(Locale locale) {
            switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
                case (byte) 1:
                case (byte) 2:
                    return 1;
                default:
                    return 0;
            }
        }
    }

    /* compiled from: TextUtilsCompat */
    /* renamed from: hf$b */
    static class C5361b extends C5360a {
        C5361b() {
        }

        /* renamed from: a */
        public int mo4809a(Locale locale) {
            return hg.m30519a(locale);
        }
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            f23771d = new C5361b();
        } else {
            f23771d = new C5360a();
        }
    }

    /* renamed from: a */
    public static int m30518a(Locale locale) {
        return f23771d.mo4809a(locale);
    }
}
