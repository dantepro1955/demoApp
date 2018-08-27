package com.p000;

import android.os.Looper;

/* compiled from: ANRError */
/* renamed from: crh */
public class crh extends Error {
    private static final long serialVersionUID = 1;

    public crh() {
        super("Application Not Responding");
    }

    public Throwable fillInStackTrace() {
        setStackTrace(Looper.getMainLooper().getThread().getStackTrace());
        return this;
    }
}
