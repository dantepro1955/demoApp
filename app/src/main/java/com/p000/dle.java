package com.p000;

import android.view.View;
import p000.dkc.C4943c;

/* compiled from: Mp4Helper */
/* renamed from: dle */
public class dle {
    /* renamed from: a */
    private static View f21980a;

    /* compiled from: Mp4Helper */
    /* renamed from: dle$a */
    public interface C4500a {
        /* renamed from: a */
        void mo4087a();
    }

    /* renamed from: a */
    public static void m27813a(View view, Runnable runnable) {
        if (!(f21980a == null || f21980a == view)) {
            Object tag = f21980a.getTag(C4943c.mp4_view_on_stop_listener);
            if (tag instanceof C4500a) {
                ((C4500a) tag).mo4087a();
            }
            dlf.m27825c(f21980a);
        }
        f21980a = view;
        dlf.m27818a(view, runnable);
    }

    /* renamed from: b */
    public static void m27816b(View view, Runnable runnable) {
        if (!(f21980a == null || f21980a == view)) {
            Object tag = f21980a.getTag(C4943c.mp4_view_on_stop_listener);
            if (tag instanceof C4500a) {
                ((C4500a) tag).mo4087a();
            }
            dlf.m27825c(f21980a);
        }
        f21980a = view;
        dlf.m27822b(view, runnable);
    }

    /* renamed from: a */
    public static void m27812a(View view) {
        Object tag = view.getTag(C4943c.mp4_view_on_stop_listener);
        if (tag instanceof C4500a) {
            ((C4500a) tag).mo4087a();
        }
        dlf.m27825c(view);
        if (f21980a == view) {
            f21980a = null;
        }
    }

    /* renamed from: b */
    public static void m27815b(View view) {
        f21980a = view;
        dlf.m27827d(view);
    }

    /* renamed from: a */
    public static void m27811a() {
        if (f21980a != null) {
            dle.m27812a(f21980a);
        }
    }

    /* renamed from: b */
    public static View m27814b() {
        return f21980a;
    }
}
