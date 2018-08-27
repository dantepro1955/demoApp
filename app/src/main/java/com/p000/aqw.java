package com.p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: aqw */
public class aqw {
    /* renamed from: a */
    private static SharedPreferences f3978a = null;

    /* renamed from: aqw$1 */
    class C07151 implements Callable<SharedPreferences> {
        /* renamed from: a */
        final /* synthetic */ Context f3977a;

        C07151(Context context) {
            this.f3977a = context;
        }

        /* renamed from: a */
        public SharedPreferences m4987a() {
            return this.f3977a.getSharedPreferences("google_sdk_flags", 1);
        }

        public /* synthetic */ Object call() throws Exception {
            return m4987a();
        }
    }

    /* renamed from: a */
    public static SharedPreferences m4988a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f3978a == null) {
                f3978a = (SharedPreferences) aub.m5733a(new C07151(context));
            }
            sharedPreferences = f3978a;
        }
        return sharedPreferences;
    }
}
