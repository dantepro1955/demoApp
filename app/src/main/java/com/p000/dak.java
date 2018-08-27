package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Process;

/* compiled from: AndroidSupportV4Compat */
/* renamed from: dak */
public class dak {

    /* compiled from: AndroidSupportV4Compat */
    /* renamed from: dak$a */
    public static class C4738a {
        /* renamed from: a */
        public static void m26042a(Activity activity, String[] strArr, int i) {
            C4739b.m26043a(activity, strArr, i);
        }
    }

    @TargetApi(23)
    /* compiled from: AndroidSupportV4Compat */
    /* renamed from: dak$b */
    static class C4739b {
        /* renamed from: a */
        static void m26043a(Activity activity, String[] strArr, int i) {
            if (activity instanceof C4741d) {
                ((C4741d) activity).m26045a(i);
            }
            activity.requestPermissions(strArr, i);
        }
    }

    /* compiled from: AndroidSupportV4Compat */
    /* renamed from: dak$c */
    static class C4740c {
        /* renamed from: a */
        static int m26044a(Context context, String str) {
            if (str != null) {
                return context.checkPermission(str, Process.myPid(), Process.myUid());
            }
            throw new IllegalArgumentException("permission is null");
        }
    }

    /* compiled from: AndroidSupportV4Compat */
    /* renamed from: dak$d */
    interface C4741d {
        /* renamed from: a */
        void m26045a(int i);
    }
}
