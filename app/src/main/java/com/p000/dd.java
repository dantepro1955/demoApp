package com.p000;

import android.content.Context;
import android.os.Build.VERSION;

/* compiled from: AppOpsManagerCompat */
/* renamed from: dd */
public final class dd {
    /* renamed from: a */
    private static final C4807b f21205a;

    /* compiled from: AppOpsManagerCompat */
    /* renamed from: dd$b */
    static class C4807b {
        C4807b() {
        }

        /* renamed from: a */
        public String mo4326a(String str) {
            return null;
        }

        /* renamed from: a */
        public int mo4325a(Context context, String str, String str2) {
            return 1;
        }
    }

    /* compiled from: AppOpsManagerCompat */
    /* renamed from: dd$a */
    static class C4808a extends C4807b {
        C4808a() {
        }

        /* renamed from: a */
        public String mo4326a(String str) {
            return de.m26738a(str);
        }

        /* renamed from: a */
        public int mo4325a(Context context, String str, String str2) {
            return de.m26737a(context, str, str2);
        }
    }

    static {
        if (VERSION.SDK_INT >= 23) {
            f21205a = new C4808a();
        } else {
            f21205a = new C4807b();
        }
    }

    /* renamed from: a */
    public static String m26490a(String str) {
        return f21205a.mo4326a(str);
    }

    /* renamed from: a */
    public static int m26489a(Context context, String str, String str2) {
        return f21205a.mo4325a(context, str, str2);
    }
}
