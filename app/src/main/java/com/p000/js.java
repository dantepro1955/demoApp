package com.p000;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

/* compiled from: ViewParentCompat */
/* renamed from: js */
public final class js {
    /* renamed from: a */
    static final C5451b f24287a;

    /* compiled from: ViewParentCompat */
    /* renamed from: js$b */
    interface C5451b {
        /* renamed from: a */
        void mo5022a(ViewParent viewParent, View view);

        /* renamed from: a */
        void mo5023a(ViewParent viewParent, View view, int i, int i2, int i3, int i4);

        /* renamed from: a */
        void mo5024a(ViewParent viewParent, View view, int i, int i2, int[] iArr);

        /* renamed from: a */
        boolean mo5025a(ViewParent viewParent, View view, float f, float f2);

        /* renamed from: a */
        boolean mo5026a(ViewParent viewParent, View view, float f, float f2, boolean z);

        /* renamed from: a */
        boolean mo5027a(ViewParent viewParent, View view, View view2, int i);

        /* renamed from: b */
        void mo5028b(ViewParent viewParent, View view, View view2, int i);
    }

    /* compiled from: ViewParentCompat */
    /* renamed from: js$e */
    static class C5452e implements C5451b {
        C5452e() {
        }

        /* renamed from: a */
        public boolean mo5027a(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof is) {
                return ((is) viewParent).onStartNestedScroll(view, view2, i);
            }
            return false;
        }

        /* renamed from: b */
        public void mo5028b(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof is) {
                ((is) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }

        /* renamed from: a */
        public void mo5022a(ViewParent viewParent, View view) {
            if (viewParent instanceof is) {
                ((is) viewParent).onStopNestedScroll(view);
            }
        }

        /* renamed from: a */
        public void mo5023a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof is) {
                ((is) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo5024a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof is) {
                ((is) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        /* renamed from: a */
        public boolean mo5026a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            if (viewParent instanceof is) {
                return ((is) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo5025a(ViewParent viewParent, View view, float f, float f2) {
            if (viewParent instanceof is) {
                return ((is) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }
    }

    /* compiled from: ViewParentCompat */
    /* renamed from: js$a */
    static class C5453a extends C5452e {
        C5453a() {
        }
    }

    /* compiled from: ViewParentCompat */
    /* renamed from: js$c */
    static class C5454c extends C5453a {
        C5454c() {
        }
    }

    /* compiled from: ViewParentCompat */
    /* renamed from: js$d */
    static class C5455d extends C5454c {
        C5455d() {
        }

        /* renamed from: a */
        public boolean mo5027a(ViewParent viewParent, View view, View view2, int i) {
            return jt.m31803a(viewParent, view, view2, i);
        }

        /* renamed from: b */
        public void mo5028b(ViewParent viewParent, View view, View view2, int i) {
            jt.m31804b(viewParent, view, view2, i);
        }

        /* renamed from: a */
        public void mo5022a(ViewParent viewParent, View view) {
            jt.m31798a(viewParent, view);
        }

        /* renamed from: a */
        public void mo5023a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            jt.m31799a(viewParent, view, i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo5024a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            jt.m31800a(viewParent, view, i, i2, iArr);
        }

        /* renamed from: a */
        public boolean mo5026a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return jt.m31802a(viewParent, view, f, f2, z);
        }

        /* renamed from: a */
        public boolean mo5025a(ViewParent viewParent, View view, float f, float f2) {
            return jt.m31801a(viewParent, view, f, f2);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f24287a = new C5455d();
        } else if (i >= 19) {
            f24287a = new C5454c();
        } else if (i >= 14) {
            f24287a = new C5453a();
        } else {
            f24287a = new C5452e();
        }
    }

    /* renamed from: a */
    public static boolean m31796a(ViewParent viewParent, View view, View view2, int i) {
        return f24287a.mo5027a(viewParent, view, view2, i);
    }

    /* renamed from: b */
    public static void m31797b(ViewParent viewParent, View view, View view2, int i) {
        f24287a.mo5028b(viewParent, view, view2, i);
    }

    /* renamed from: a */
    public static void m31791a(ViewParent viewParent, View view) {
        f24287a.mo5022a(viewParent, view);
    }

    /* renamed from: a */
    public static void m31792a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        f24287a.mo5023a(viewParent, view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m31793a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        f24287a.mo5024a(viewParent, view, i, i2, iArr);
    }

    /* renamed from: a */
    public static boolean m31795a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return f24287a.mo5026a(viewParent, view, f, f2, z);
    }

    /* renamed from: a */
    public static boolean m31794a(ViewParent viewParent, View view, float f, float f2) {
        return f24287a.mo5025a(viewParent, view, f, f2);
    }
}
