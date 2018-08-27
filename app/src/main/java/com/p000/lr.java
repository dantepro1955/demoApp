package com.p000;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: PopupWindowCompat */
/* renamed from: lr */
public final class lr {
    /* renamed from: a */
    static final C5514e f24453a;

    /* compiled from: PopupWindowCompat */
    /* renamed from: lr$e */
    interface C5514e {
        /* renamed from: a */
        void mo5156a(PopupWindow popupWindow, int i);

        /* renamed from: a */
        void mo5157a(PopupWindow popupWindow, View view, int i, int i2, int i3);

        /* renamed from: a */
        void mo5158a(PopupWindow popupWindow, boolean z);
    }

    /* compiled from: PopupWindowCompat */
    /* renamed from: lr$c */
    static class C5515c implements C5514e {
        /* renamed from: a */
        private static Method f24451a;
        /* renamed from: b */
        private static boolean f24452b;

        C5515c() {
        }

        /* renamed from: a */
        public void mo5157a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            if ((hz.a(i3, jd.g(view)) & 7) == 5) {
                i -= popupWindow.getWidth() - view.getWidth();
            }
            popupWindow.showAsDropDown(view, i, i2);
        }

        /* renamed from: a */
        public void mo5158a(PopupWindow popupWindow, boolean z) {
        }

        /* renamed from: a */
        public void mo5156a(PopupWindow popupWindow, int i) {
            if (!f24452b) {
                try {
                    f24451a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                    f24451a.setAccessible(true);
                } catch (Exception e) {
                }
                f24452b = true;
            }
            if (f24451a != null) {
                try {
                    f24451a.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                }
            }
        }
    }

    /* compiled from: PopupWindowCompat */
    /* renamed from: lr$d */
    static class C5516d extends C5515c {
        C5516d() {
        }

        /* renamed from: a */
        public void mo5157a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            lu.m32508a(popupWindow, view, i, i2, i3);
        }
    }

    /* compiled from: PopupWindowCompat */
    /* renamed from: lr$a */
    static class C5517a extends C5516d {
        C5517a() {
        }

        /* renamed from: a */
        public void mo5158a(PopupWindow popupWindow, boolean z) {
            ls.m32505a(popupWindow, z);
        }
    }

    /* compiled from: PopupWindowCompat */
    /* renamed from: lr$b */
    static class C5518b extends C5517a {
        C5518b() {
        }

        /* renamed from: a */
        public void mo5158a(PopupWindow popupWindow, boolean z) {
            lt.m32507a(popupWindow, z);
        }

        /* renamed from: a */
        public void mo5156a(PopupWindow popupWindow, int i) {
            lt.m32506a(popupWindow, i);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            f24453a = new C5518b();
        } else if (i >= 21) {
            f24453a = new C5517a();
        } else if (i >= 19) {
            f24453a = new C5516d();
        } else {
            f24453a = new C5515c();
        }
    }

    /* renamed from: a */
    public static void m32503a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        f24453a.mo5157a(popupWindow, view, i, i2, i3);
    }

    /* renamed from: a */
    public static void m32504a(PopupWindow popupWindow, boolean z) {
        f24453a.mo5158a(popupWindow, z);
    }

    /* renamed from: a */
    public static void m32502a(PopupWindow popupWindow, int i) {
        f24453a.mo5156a(popupWindow, i);
    }
}
