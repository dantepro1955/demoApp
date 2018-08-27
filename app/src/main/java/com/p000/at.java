package com.p000;

import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import p000.an.C0316d;

/* compiled from: ViewUtils */
/* renamed from: at */
public class at {
    /* renamed from: a */
    public static final C0316d f4316a = new C07861();

    /* compiled from: ViewUtils */
    /* renamed from: at$1 */
    static class C07861 implements C0316d {
        C07861() {
        }

        /* renamed from: a */
        public an mo715a() {
            return new an(VERSION.SDK_INT >= 12 ? new ap() : new ao());
        }
    }

    /* renamed from: a */
    public static an m5574a() {
        return f4316a.mo715a();
    }

    /* renamed from: a */
    public static boolean m5576a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static Mode m5575a(int i, Mode mode) {
        switch (i) {
            case 3:
                return Mode.SRC_OVER;
            case 5:
                return Mode.SRC_IN;
            case 9:
                return Mode.SRC_ATOP;
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            default:
                return mode;
        }
    }
}
