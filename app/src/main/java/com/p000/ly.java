package com.p000;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.TextView;

/* compiled from: TextViewCompat */
/* renamed from: ly */
public final class ly {
    /* renamed from: a */
    static final C5519f f24457a;

    /* compiled from: TextViewCompat */
    /* renamed from: ly$f */
    interface C5519f {
        /* renamed from: a */
        int mo5159a(TextView textView);

        /* renamed from: a */
        void mo5160a(TextView textView, int i);

        /* renamed from: a */
        void mo5161a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4);

        /* renamed from: b */
        Drawable[] mo5162b(TextView textView);
    }

    /* compiled from: TextViewCompat */
    /* renamed from: ly$b */
    static class C5520b implements C5519f {
        C5520b() {
        }

        /* renamed from: a */
        public void mo5161a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: a */
        public int mo5159a(TextView textView) {
            return ma.m32549a(textView);
        }

        /* renamed from: a */
        public void mo5160a(TextView textView, int i) {
            ma.m32552a(textView, i);
        }

        /* renamed from: b */
        public Drawable[] mo5162b(TextView textView) {
            return ma.m32553b(textView);
        }
    }

    /* compiled from: TextViewCompat */
    /* renamed from: ly$e */
    static class C5521e extends C5520b {
        C5521e() {
        }

        /* renamed from: a */
        public int mo5159a(TextView textView) {
            return mb.m32554a(textView);
        }
    }

    /* compiled from: TextViewCompat */
    /* renamed from: ly$c */
    static class C5522c extends C5521e {
        C5522c() {
        }

        /* renamed from: a */
        public void mo5161a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            mc.m32555a(textView, drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: b */
        public Drawable[] mo5162b(TextView textView) {
            return mc.m32556a(textView);
        }
    }

    /* compiled from: TextViewCompat */
    /* renamed from: ly$d */
    static class C5523d extends C5522c {
        C5523d() {
        }

        /* renamed from: a */
        public void mo5161a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            md.m32557a(textView, drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: b */
        public Drawable[] mo5162b(TextView textView) {
            return md.m32558a(textView);
        }
    }

    /* compiled from: TextViewCompat */
    /* renamed from: ly$a */
    static class C5524a extends C5523d {
        C5524a() {
        }

        /* renamed from: a */
        public void mo5160a(TextView textView, int i) {
            lz.m32543a(textView, i);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            f24457a = new C5524a();
        } else if (i >= 18) {
            f24457a = new C5523d();
        } else if (i >= 17) {
            f24457a = new C5522c();
        } else if (i >= 16) {
            f24457a = new C5521e();
        } else {
            f24457a = new C5520b();
        }
    }

    /* renamed from: a */
    public static void m32541a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        f24457a.mo5161a(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: a */
    public static int m32539a(TextView textView) {
        return f24457a.mo5159a(textView);
    }

    /* renamed from: a */
    public static void m32540a(TextView textView, int i) {
        f24457a.mo5160a(textView, i);
    }

    /* renamed from: b */
    public static Drawable[] m32542b(TextView textView) {
        return f24457a.mo5162b(textView);
    }
}
