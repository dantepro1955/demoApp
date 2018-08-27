package com.p000;

import android.util.Log;
import com.ninegag.android.library.rlogger.RLogger;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.HashMap;

/* compiled from: RLogUncaughtExceptionHandler */
/* renamed from: cto */
public class cto implements UncaughtExceptionHandler {
    /* renamed from: a */
    private UncaughtExceptionHandler f20194a = Thread.getDefaultUncaughtExceptionHandler();

    public void uncaughtException(Thread thread, Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("exception", th.getMessage());
        hashMap.put("stacktrace", Log.getStackTraceString(th));
        RLogger.getInstance().logBreadcrumb("RLoggerUncaughtExceptionHandler", hashMap);
        this.f20194a.uncaughtException(thread, th);
    }
}
