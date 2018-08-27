package com.p000;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;

/* compiled from: IntentCompat */
/* renamed from: fd */
public final class fd {
    /* renamed from: a */
    private static final C5305a f23685a;

    /* compiled from: IntentCompat */
    /* renamed from: fd$a */
    interface C5305a {
        /* renamed from: a */
        Intent mo4714a(ComponentName componentName);
    }

    /* compiled from: IntentCompat */
    /* renamed from: fd$b */
    static class C5306b implements C5305a {
        C5306b() {
        }

        /* renamed from: a */
        public Intent mo4714a(ComponentName componentName) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setComponent(componentName);
            intent.addCategory("android.intent.category.LAUNCHER");
            return intent;
        }
    }

    /* compiled from: IntentCompat */
    /* renamed from: fd$c */
    static class C5307c extends C5306b {
        C5307c() {
        }

        /* renamed from: a */
        public Intent mo4714a(ComponentName componentName) {
            return fe.m30154a(componentName);
        }
    }

    /* compiled from: IntentCompat */
    /* renamed from: fd$d */
    static class C5308d extends C5307c {
        C5308d() {
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 15) {
            f23685a = new C5308d();
        } else if (i >= 11) {
            f23685a = new C5307c();
        } else {
            f23685a = new C5306b();
        }
    }

    /* renamed from: a */
    public static Intent m30153a(ComponentName componentName) {
        return f23685a.mo4714a(componentName);
    }
}
