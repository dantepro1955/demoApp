package com.p000;

import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: ViewCompat */
/* renamed from: jd$b */
class jd$b implements jd$l {
    /* renamed from: b */
    private static Method f24273b;
    /* renamed from: a */
    WeakHashMap<View, ju> f24274a = null;

    jd$b() {
    }

    /* renamed from: a */
    public boolean mo4975a(View view, int i) {
        return (view instanceof iz) && m31506a((iz) view, i);
    }

    /* renamed from: b */
    public boolean mo4981b(View view, int i) {
        return (view instanceof iz) && m31507b((iz) view, i);
    }

    /* renamed from: a */
    public void mo4966a(View view, hu huVar) {
    }

    /* renamed from: a */
    public boolean mo4974a(View view) {
        return false;
    }

    /* renamed from: a */
    public void mo4971a(View view, kg kgVar) {
    }

    /* renamed from: b */
    public boolean mo4980b(View view) {
        return false;
    }

    /* renamed from: c */
    public void mo4982c(View view) {
        view.invalidate();
    }

    /* renamed from: a */
    public void mo4960a(View view, int i, int i2, int i3, int i4) {
        view.invalidate(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo4969a(View view, Runnable runnable) {
        view.postDelayed(runnable, mo5017a());
    }

    /* renamed from: a */
    public void mo4970a(View view, Runnable runnable, long j) {
        view.postDelayed(runnable, mo5017a() + j);
    }

    /* renamed from: a */
    long mo5017a() {
        return 10;
    }

    /* renamed from: d */
    public int mo4986d(View view) {
        return 0;
    }

    /* renamed from: c */
    public void mo4984c(View view, int i) {
    }

    /* renamed from: e */
    public float mo4989e(View view) {
        return 1.0f;
    }

    /* renamed from: a */
    public void mo4961a(View view, int i, Paint paint) {
    }

    /* renamed from: f */
    public int mo4992f(View view) {
        return 0;
    }

    /* renamed from: a */
    public void mo4963a(View view, Paint paint) {
    }

    /* renamed from: g */
    public int mo4995g(View view) {
        return 0;
    }

    /* renamed from: h */
    public ViewParent mo4997h(View view) {
        return view.getParent();
    }

    /* renamed from: a */
    public int mo4956a(int i, int i2, int i3) {
        return View.resolveSize(i, i2);
    }

    /* renamed from: i */
    public int mo4999i(View view) {
        return view.getMeasuredWidth();
    }

    /* renamed from: j */
    public int mo5000j(View view) {
        return 0;
    }

    /* renamed from: d */
    public void mo4988d(View view, int i) {
    }

    /* renamed from: k */
    public int mo5001k(View view) {
        return view.getPaddingLeft();
    }

    /* renamed from: l */
    public int mo5002l(View view) {
        return view.getPaddingRight();
    }

    /* renamed from: b */
    public void mo4978b(View view, int i, int i2, int i3, int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    /* renamed from: m */
    public boolean mo5003m(View view) {
        return true;
    }

    /* renamed from: n */
    public float mo5004n(View view) {
        return 0.0f;
    }

    /* renamed from: o */
    public float mo5005o(View view) {
        return 0.0f;
    }

    /* renamed from: p */
    public float mo5006p(View view) {
        return (float) view.getLeft();
    }

    /* renamed from: q */
    public float mo5007q(View view) {
        return (float) view.getTop();
    }

    /* renamed from: r */
    public float mo5008r(View view) {
        return 0.0f;
    }

    /* renamed from: s */
    public Matrix mo5009s(View view) {
        return null;
    }

    /* renamed from: t */
    public int mo5010t(View view) {
        return jf.m31676d(view);
    }

    /* renamed from: u */
    public int mo5011u(View view) {
        return jf.m31677e(view);
    }

    /* renamed from: v */
    public ju mo5012v(View view) {
        return new ju(view);
    }

    /* renamed from: a */
    public void mo4958a(View view, float f) {
    }

    /* renamed from: b */
    public void mo4977b(View view, float f) {
    }

    /* renamed from: c */
    public void mo4983c(View view, float f) {
    }

    /* renamed from: d */
    public void mo4987d(View view, float f) {
    }

    /* renamed from: e */
    public void mo4990e(View view, float f) {
    }

    /* renamed from: f */
    public void mo4993f(View view, float f) {
    }

    /* renamed from: g */
    public void mo4996g(View view, float f) {
    }

    /* renamed from: w */
    public String mo5013w(View view) {
        return null;
    }

    /* renamed from: x */
    public int mo5014x(View view) {
        return 0;
    }

    /* renamed from: y */
    public void mo5015y(View view) {
    }

    /* renamed from: h */
    public void mo4998h(View view, float f) {
    }

    /* renamed from: z */
    public float mo5016z(View view) {
        return 0.0f;
    }

    /* renamed from: A */
    public float mo5018A(View view) {
        return 0.0f;
    }

    /* renamed from: a */
    public void mo4973a(ViewGroup viewGroup, boolean z) {
        if (f24273b == null) {
            try {
                f24273b = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
            } catch (Throwable e) {
                Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", e);
            }
            f24273b.setAccessible(true);
        }
        try {
            f24273b.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
        } catch (Throwable e2) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e2);
        } catch (Throwable e22) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e22);
        } catch (Throwable e222) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e222);
        }
    }

    /* renamed from: B */
    public boolean mo4943B(View view) {
        return false;
    }

    /* renamed from: a */
    public void mo4972a(View view, boolean z) {
    }

    /* renamed from: C */
    public void mo4944C(View view) {
    }

    /* renamed from: a */
    public void mo4967a(View view, iu iuVar) {
    }

    /* renamed from: a */
    public kb mo4957a(View view, kb kbVar) {
        return kbVar;
    }

    /* renamed from: b */
    public kb mo4976b(View view, kb kbVar) {
        return kbVar;
    }

    /* renamed from: b */
    public void mo4979b(View view, boolean z) {
    }

    /* renamed from: c */
    public void mo4985c(View view, boolean z) {
    }

    /* renamed from: D */
    public boolean mo4945D(View view) {
        return false;
    }

    /* renamed from: E */
    public boolean mo4946E(View view) {
        if (view instanceof iq) {
            return ((iq) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: a */
    public void mo4965a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    /* renamed from: F */
    public ColorStateList mo4947F(View view) {
        return jf.m31669a(view);
    }

    /* renamed from: a */
    public void mo4962a(View view, ColorStateList colorStateList) {
        jf.m31671a(view, colorStateList);
    }

    /* renamed from: a */
    public void mo4964a(View view, Mode mode) {
        jf.m31672a(view, mode);
    }

    /* renamed from: G */
    public Mode mo4948G(View view) {
        return jf.m31673b(view);
    }

    /* renamed from: a */
    private boolean m31506a(iz izVar, int i) {
        int computeHorizontalScrollOffset = izVar.computeHorizontalScrollOffset();
        int computeHorizontalScrollRange = izVar.computeHorizontalScrollRange() - izVar.computeHorizontalScrollExtent();
        if (computeHorizontalScrollRange == 0) {
            return false;
        }
        if (i < 0) {
            if (computeHorizontalScrollOffset <= 0) {
                return false;
            }
            return true;
        } else if (computeHorizontalScrollOffset >= computeHorizontalScrollRange - 1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    private boolean m31507b(iz izVar, int i) {
        int computeVerticalScrollOffset = izVar.computeVerticalScrollOffset();
        int computeVerticalScrollRange = izVar.computeVerticalScrollRange() - izVar.computeVerticalScrollExtent();
        if (computeVerticalScrollRange == 0) {
            return false;
        }
        if (i < 0) {
            if (computeVerticalScrollOffset <= 0) {
                return false;
            }
            return true;
        } else if (computeVerticalScrollOffset >= computeVerticalScrollRange - 1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: H */
    public void mo4949H(View view) {
        if (view instanceof iq) {
            ((iq) view).stopNestedScroll();
        }
    }

    /* renamed from: I */
    public boolean mo4950I(View view) {
        return jf.m31675c(view);
    }

    /* renamed from: a */
    public int mo4955a(int i, int i2) {
        return i | i2;
    }

    /* renamed from: J */
    public float mo4951J(View view) {
        return mo5018A(view) + mo5016z(view);
    }

    /* renamed from: K */
    public boolean mo4952K(View view) {
        return jf.m31678f(view);
    }

    /* renamed from: L */
    public boolean mo4953L(View view) {
        return false;
    }

    /* renamed from: a */
    public void mo4959a(View view, int i, int i2) {
    }

    /* renamed from: e */
    public void mo4991e(View view, int i) {
        jf.m31674b(view, i);
    }

    /* renamed from: f */
    public void mo4994f(View view, int i) {
        jf.m31670a(view, i);
    }

    /* renamed from: a */
    public void mo4968a(View view, ix ixVar) {
    }

    /* renamed from: M */
    public Display mo4954M(View view) {
        return jf.m31679g(view);
    }
}
