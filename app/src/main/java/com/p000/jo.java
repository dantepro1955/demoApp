package com.p000;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

/* compiled from: ViewConfigurationCompat */
/* renamed from: jo */
public final class jo {
    /* renamed from: a */
    static final C5441d f24285a;

    /* compiled from: ViewConfigurationCompat */
    /* renamed from: jo$d */
    interface C5441d {
        /* renamed from: a */
        boolean mo5020a(ViewConfiguration viewConfiguration);
    }

    /* compiled from: ViewConfigurationCompat */
    /* renamed from: jo$a */
    static class C5442a implements C5441d {
        C5442a() {
        }

        /* renamed from: a */
        public boolean mo5020a(ViewConfiguration viewConfiguration) {
            return true;
        }
    }

    /* compiled from: ViewConfigurationCompat */
    /* renamed from: jo$b */
    static class C5443b extends C5442a {
        C5443b() {
        }

        /* renamed from: a */
        public boolean mo5020a(ViewConfiguration viewConfiguration) {
            return false;
        }
    }

    /* compiled from: ViewConfigurationCompat */
    /* renamed from: jo$c */
    static class C5444c extends C5443b {
        C5444c() {
        }

        /* renamed from: a */
        public boolean mo5020a(ViewConfiguration viewConfiguration) {
            return jp.m31764a(viewConfiguration);
        }
    }

    static {
        if (VERSION.SDK_INT >= 14) {
            f24285a = new C5444c();
        } else if (VERSION.SDK_INT >= 11) {
            f24285a = new C5443b();
        } else {
            f24285a = new C5442a();
        }
    }

    /* renamed from: a */
    public static boolean m31763a(ViewConfiguration viewConfiguration) {
        return f24285a.mo5020a(viewConfiguration);
    }
}
