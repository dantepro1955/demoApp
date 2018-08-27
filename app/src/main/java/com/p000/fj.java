package com.p000;

import android.content.res.Resources;
import android.os.Build.VERSION;

/* compiled from: ConfigurationHelper */
/* renamed from: fj */
public final class fj {
    /* renamed from: a */
    private static final C5320a f23710a;

    /* compiled from: ConfigurationHelper */
    /* renamed from: fj$a */
    interface C5320a {
        /* renamed from: a */
        int mo4715a(Resources resources);

        /* renamed from: b */
        int mo4716b(Resources resources);

        /* renamed from: c */
        int mo4717c(Resources resources);
    }

    /* compiled from: ConfigurationHelper */
    /* renamed from: fj$b */
    static class C5321b implements C5320a {
        C5321b() {
        }

        /* renamed from: a */
        public int mo4715a(Resources resources) {
            return fk.m30175a(resources);
        }

        /* renamed from: b */
        public int mo4716b(Resources resources) {
            return fk.m30176b(resources);
        }

        /* renamed from: c */
        public int mo4717c(Resources resources) {
            return fk.m30177c(resources);
        }
    }

    /* compiled from: ConfigurationHelper */
    /* renamed from: fj$c */
    static class C5322c extends C5321b {
        C5322c() {
        }

        /* renamed from: a */
        public int mo4715a(Resources resources) {
            return fl.m30178a(resources);
        }

        /* renamed from: b */
        public int mo4716b(Resources resources) {
            return fl.m30179b(resources);
        }

        /* renamed from: c */
        public int mo4717c(Resources resources) {
            return fl.m30180c(resources);
        }
    }

    /* compiled from: ConfigurationHelper */
    /* renamed from: fj$d */
    static class C5323d extends C5322c {
        C5323d() {
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 17) {
            f23710a = new C5323d();
        } else if (i >= 13) {
            f23710a = new C5322c();
        } else {
            f23710a = new C5321b();
        }
    }

    /* renamed from: a */
    public static int m30172a(Resources resources) {
        return f23710a.mo4715a(resources);
    }

    /* renamed from: b */
    public static int m30173b(Resources resources) {
        return f23710a.mo4716b(resources);
    }

    /* renamed from: c */
    public static int m30174c(Resources resources) {
        return f23710a.mo4717c(resources);
    }
}
