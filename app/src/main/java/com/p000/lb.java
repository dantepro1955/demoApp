package com.p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;

/* compiled from: CompoundButtonCompat */
/* renamed from: lb */
public final class lb {
    /* renamed from: a */
    private static final C5502c f24391a;

    /* compiled from: CompoundButtonCompat */
    /* renamed from: lb$c */
    interface C5502c {
        /* renamed from: a */
        Drawable mo5137a(CompoundButton compoundButton);

        /* renamed from: a */
        void mo5138a(CompoundButton compoundButton, ColorStateList colorStateList);

        /* renamed from: a */
        void mo5139a(CompoundButton compoundButton, Mode mode);
    }

    /* compiled from: CompoundButtonCompat */
    /* renamed from: lb$b */
    static class C5503b implements C5502c {
        C5503b() {
        }

        /* renamed from: a */
        public void mo5138a(CompoundButton compoundButton, ColorStateList colorStateList) {
            ld.m32380a(compoundButton, colorStateList);
        }

        /* renamed from: a */
        public void mo5139a(CompoundButton compoundButton, Mode mode) {
            ld.m32381a(compoundButton, mode);
        }

        /* renamed from: a */
        public Drawable mo5137a(CompoundButton compoundButton) {
            return ld.m32379a(compoundButton);
        }
    }

    /* compiled from: CompoundButtonCompat */
    /* renamed from: lb$d */
    static class C5504d extends C5503b {
        C5504d() {
        }

        /* renamed from: a */
        public void mo5138a(CompoundButton compoundButton, ColorStateList colorStateList) {
            le.m32382a(compoundButton, colorStateList);
        }

        /* renamed from: a */
        public void mo5139a(CompoundButton compoundButton, Mode mode) {
            le.m32383a(compoundButton, mode);
        }
    }

    /* compiled from: CompoundButtonCompat */
    /* renamed from: lb$a */
    static class C5505a extends C5504d {
        C5505a() {
        }

        /* renamed from: a */
        public Drawable mo5137a(CompoundButton compoundButton) {
            return lc.m32378a(compoundButton);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            f24391a = new C5505a();
        } else if (i >= 21) {
            f24391a = new C5504d();
        } else {
            f24391a = new C5503b();
        }
    }

    /* renamed from: a */
    public static void m32376a(CompoundButton compoundButton, ColorStateList colorStateList) {
        f24391a.mo5138a(compoundButton, colorStateList);
    }

    /* renamed from: a */
    public static void m32377a(CompoundButton compoundButton, Mode mode) {
        f24391a.mo5139a(compoundButton, mode);
    }

    /* renamed from: a */
    public static Drawable m32375a(CompoundButton compoundButton) {
        return f24391a.mo5137a(compoundButton);
    }
}
