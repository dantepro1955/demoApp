package com.p000;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.util.concurrent.Callable;

/* renamed from: aub */
public class aub {
    /* renamed from: a */
    public static <T> T m5733a(Callable<T> callable) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        T call;
        try {
            StrictMode.setThreadPolicy(ThreadPolicy.LAX);
            call = callable.call();
            return call;
        } catch (Throwable th) {
            call = th;
            return null;
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
