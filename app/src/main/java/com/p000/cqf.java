package com.p000;

import android.content.Context;
import android.os.Debug;
import java.io.File;
import java.lang.Thread.UncaughtExceptionHandler;

/* compiled from: OomExceptionHandler */
/* renamed from: cqf */
public class cqf implements UncaughtExceptionHandler {
    /* renamed from: a */
    private final UncaughtExceptionHandler f19960a;
    /* renamed from: b */
    private final Context f19961b;

    /* renamed from: a */
    public static cqf m24434a(Context context) {
        UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof cqf) {
            return (cqf) defaultUncaughtExceptionHandler;
        }
        UncaughtExceptionHandler cqf = new cqf(defaultUncaughtExceptionHandler, context);
        Thread.setDefaultUncaughtExceptionHandler(cqf);
        return cqf;
    }

    public cqf(UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        this.f19960a = uncaughtExceptionHandler;
        this.f19961b = context.getApplicationContext();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (m24435a(th)) {
            File file = new File(this.f19961b.getExternalCacheDir(), "9gag-oom.hprof");
            try {
                file.delete();
                Debug.dumpHprofData(file.getAbsolutePath());
            } catch (Throwable th2) {
            }
        }
        this.f19960a.uncaughtException(thread, th);
    }

    /* renamed from: b */
    public static File m24436b(Context context) {
        return new File(context.getExternalCacheDir(), "9gag-oom.hprof");
    }

    /* renamed from: a */
    private boolean m24435a(Throwable th) {
        if (th instanceof OutOfMemoryError) {
            return true;
        }
        do {
            th = th.getCause();
            if (th == null) {
                return false;
            }
        } while (!(th instanceof OutOfMemoryError));
        return true;
    }
}
