package com.p000;

import android.os.Build.VERSION;
import java.util.Locale;

/* compiled from: ICUCompat */
/* renamed from: ha */
public final class ha {
    /* renamed from: a */
    private static final C5350a f23751a;

    /* compiled from: ICUCompat */
    /* renamed from: ha$a */
    interface C5350a {
        /* renamed from: a */
        String mo4805a(Locale locale);
    }

    /* compiled from: ICUCompat */
    /* renamed from: ha$b */
    static class C5351b implements C5350a {
        C5351b() {
        }

        /* renamed from: a */
        public String mo4805a(Locale locale) {
            return null;
        }
    }

    /* compiled from: ICUCompat */
    /* renamed from: ha$c */
    static class C5352c implements C5350a {
        C5352c() {
        }

        /* renamed from: a */
        public String mo4805a(Locale locale) {
            return hc.m30502a(locale);
        }
    }

    /* compiled from: ICUCompat */
    /* renamed from: ha$d */
    static class C5353d implements C5350a {
        C5353d() {
        }

        /* renamed from: a */
        public String mo4805a(Locale locale) {
            return hb.m30500a(locale);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f23751a = new C5353d();
        } else if (i >= 14) {
            f23751a = new C5352c();
        } else {
            f23751a = new C5351b();
        }
    }

    /* renamed from: a */
    public static String m30499a(Locale locale) {
        return f23751a.mo4805a(locale);
    }
}
