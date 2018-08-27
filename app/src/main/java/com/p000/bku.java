package com.p000;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import java.util.concurrent.Callable;

@bhd
/* renamed from: bku */
public class bku {
    /* renamed from: a */
    public static <T> T m9268a(Callable<T> callable) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        T call;
        try {
            StrictMode.setThreadPolicy(new Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            call = callable.call();
            return call;
        } catch (Throwable th) {
            call = th;
            bky.m9007b("Unexpected exception.", call);
            ako.m2347i().m8934a((Throwable) call, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
