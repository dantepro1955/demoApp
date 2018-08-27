package com.p000;

import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: ViewCompat */
/* renamed from: jd */
public class jd {
    /* renamed from: a */
    static final jd$l f16874a;

    static {
        int i = VERSION.SDK_INT;
        if (gr.a()) {
            f16874a = new jd$a();
        } else if (i >= 23) {
            f16874a = new jd$k();
        } else if (i >= 21) {
            f16874a = new jd$j();
        } else if (i >= 19) {
            f16874a = new jd$i();
        } else if (i >= 18) {
            f16874a = new jd$h();
        } else if (i >= 17) {
            f16874a = new jd$g();
        } else if (i >= 16) {
            f16874a = new jd$f();
        } else if (i >= 15) {
            f16874a = new jd$d();
        } else if (i >= 14) {
            f16874a = new jd$e();
        } else if (i >= 11) {
            f16874a = new jd$c();
        } else {
            f16874a = new jd$b();
        }
    }

    /* renamed from: a */
    public static boolean m21221a(View view, int i) {
        return f16874a.a(view, i);
    }

    /* renamed from: b */
    public static boolean m21227b(View view, int i) {
        return f16874a.b(view, i);
    }

    /* renamed from: a */
    public static void m21217a(View view, kg kgVar) {
        f16874a.a(view, kgVar);
    }

    /* renamed from: a */
    public static void m21212a(View view, hu huVar) {
        f16874a.a(view, huVar);
    }

    /* renamed from: a */
    public static boolean m21220a(View view) {
        return f16874a.a(view);
    }

    /* renamed from: b */
    public static boolean m21226b(View view) {
        return f16874a.b(view);
    }

    /* renamed from: c */
    public static void m21228c(View view) {
        f16874a.c(view);
    }

    /* renamed from: a */
    public static void m21206a(View view, int i, int i2, int i3, int i4) {
        f16874a.a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m21215a(View view, Runnable runnable) {
        f16874a.a(view, runnable);
    }

    /* renamed from: a */
    public static void m21216a(View view, Runnable runnable, long j) {
        f16874a.a(view, runnable, j);
    }

    /* renamed from: d */
    public static int m21232d(View view) {
        return f16874a.d(view);
    }

    /* renamed from: c */
    public static void m21230c(View view, int i) {
        f16874a.c(view, i);
    }

    /* renamed from: e */
    public static float m21235e(View view) {
        return f16874a.e(view);
    }

    /* renamed from: a */
    public static void m21207a(View view, int i, Paint paint) {
        f16874a.a(view, i, paint);
    }

    /* renamed from: f */
    public static int m21238f(View view) {
        return f16874a.f(view);
    }

    /* renamed from: a */
    public static void m21209a(View view, Paint paint) {
        f16874a.a(view, paint);
    }

    /* renamed from: g */
    public static int m21241g(View view) {
        return f16874a.g(view);
    }

    /* renamed from: h */
    public static ViewParent m21243h(View view) {
        return f16874a.h(view);
    }

    /* renamed from: a */
    public static int m21202a(int i, int i2, int i3) {
        return f16874a.a(i, i2, i3);
    }

    /* renamed from: i */
    public static int m21245i(View view) {
        return f16874a.i(view);
    }

    /* renamed from: j */
    public static int m21246j(View view) {
        return f16874a.j(view);
    }

    /* renamed from: a */
    public static int m21201a(int i, int i2) {
        return f16874a.a(i, i2);
    }

    /* renamed from: d */
    public static void m21234d(View view, int i) {
        f16874a.d(view, i);
    }

    /* renamed from: k */
    public static int m21247k(View view) {
        return f16874a.k(view);
    }

    /* renamed from: l */
    public static int m21248l(View view) {
        return f16874a.l(view);
    }

    /* renamed from: b */
    public static void m21224b(View view, int i, int i2, int i3, int i4) {
        f16874a.b(view, i, i2, i3, i4);
    }

    /* renamed from: m */
    public static float m21249m(View view) {
        return f16874a.n(view);
    }

    /* renamed from: n */
    public static float m21250n(View view) {
        return f16874a.o(view);
    }

    /* renamed from: o */
    public static Matrix m21251o(View view) {
        return f16874a.s(view);
    }

    /* renamed from: p */
    public static int m21252p(View view) {
        return f16874a.t(view);
    }

    /* renamed from: q */
    public static int m21253q(View view) {
        return f16874a.u(view);
    }

    /* renamed from: r */
    public static ju m21254r(View view) {
        return f16874a.v(view);
    }

    /* renamed from: a */
    public static void m21204a(View view, float f) {
        f16874a.a(view, f);
    }

    /* renamed from: b */
    public static void m21223b(View view, float f) {
        f16874a.b(view, f);
    }

    /* renamed from: c */
    public static void m21229c(View view, float f) {
        f16874a.c(view, f);
    }

    /* renamed from: d */
    public static void m21233d(View view, float f) {
        f16874a.d(view, f);
    }

    /* renamed from: e */
    public static void m21236e(View view, float f) {
        f16874a.e(view, f);
    }

    /* renamed from: f */
    public static void m21239f(View view, float f) {
        f16874a.f(view, f);
    }

    /* renamed from: g */
    public static void m21242g(View view, float f) {
        f16874a.g(view, f);
    }

    /* renamed from: s */
    public static float m21255s(View view) {
        return f16874a.r(view);
    }

    /* renamed from: t */
    public static float m21256t(View view) {
        return f16874a.p(view);
    }

    /* renamed from: u */
    public static float m21257u(View view) {
        return f16874a.q(view);
    }

    /* renamed from: h */
    public static void m21244h(View view, float f) {
        f16874a.h(view, f);
    }

    /* renamed from: v */
    public static float m21258v(View view) {
        return f16874a.z(view);
    }

    /* renamed from: w */
    public static String m21259w(View view) {
        return f16874a.w(view);
    }

    /* renamed from: x */
    public static int m21260x(View view) {
        return f16874a.x(view);
    }

    /* renamed from: y */
    public static void m21261y(View view) {
        f16874a.y(view);
    }

    /* renamed from: a */
    public static void m21219a(ViewGroup viewGroup, boolean z) {
        f16874a.a(viewGroup, z);
    }

    /* renamed from: z */
    public static boolean m21262z(View view) {
        return f16874a.B(view);
    }

    /* renamed from: a */
    public static void m21218a(View view, boolean z) {
        f16874a.a(view, z);
    }

    /* renamed from: A */
    public static void m21189A(View view) {
        f16874a.C(view);
    }

    /* renamed from: a */
    public static void m21213a(View view, iu iuVar) {
        f16874a.a(view, iuVar);
    }

    /* renamed from: a */
    public static kb m21203a(View view, kb kbVar) {
        return f16874a.a(view, kbVar);
    }

    /* renamed from: b */
    public static kb m21222b(View view, kb kbVar) {
        return f16874a.b(view, kbVar);
    }

    /* renamed from: b */
    public static void m21225b(View view, boolean z) {
        f16874a.b(view, z);
    }

    /* renamed from: c */
    public static void m21231c(View view, boolean z) {
        f16874a.c(view, z);
    }

    /* renamed from: B */
    public static boolean m21190B(View view) {
        return f16874a.m(view);
    }

    /* renamed from: C */
    public static boolean m21191C(View view) {
        return f16874a.D(view);
    }

    /* renamed from: a */
    public static void m21211a(View view, Drawable drawable) {
        f16874a.a(view, drawable);
    }

    /* renamed from: D */
    public static ColorStateList m21192D(View view) {
        return f16874a.F(view);
    }

    /* renamed from: a */
    public static void m21208a(View view, ColorStateList colorStateList) {
        f16874a.a(view, colorStateList);
    }

    /* renamed from: E */
    public static Mode m21193E(View view) {
        return f16874a.G(view);
    }

    /* renamed from: a */
    public static void m21210a(View view, Mode mode) {
        f16874a.a(view, mode);
    }

    /* renamed from: F */
    public static boolean m21194F(View view) {
        return f16874a.E(view);
    }

    /* renamed from: G */
    public static void m21195G(View view) {
        f16874a.H(view);
    }

    /* renamed from: H */
    public static boolean m21196H(View view) {
        return f16874a.I(view);
    }

    /* renamed from: I */
    public static float m21197I(View view) {
        return f16874a.J(view);
    }

    /* renamed from: e */
    public static void m21237e(View view, int i) {
        f16874a.f(view, i);
    }

    /* renamed from: f */
    public static void m21240f(View view, int i) {
        f16874a.e(view, i);
    }

    /* renamed from: J */
    public static boolean m21198J(View view) {
        return f16874a.K(view);
    }

    /* renamed from: K */
    public static boolean m21199K(View view) {
        return f16874a.L(view);
    }

    /* renamed from: a */
    public static void m21205a(View view, int i, int i2) {
        f16874a.a(view, i, i2);
    }

    /* renamed from: a */
    public static void m21214a(View view, ix ixVar) {
        f16874a.a(view, ixVar);
    }

    /* renamed from: L */
    public static Display m21200L(View view) {
        return f16874a.M(view);
    }
}
