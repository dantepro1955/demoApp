package com.p000;

import android.database.SQLException;

/* compiled from: DaoException */
/* renamed from: dnw */
public class dnw extends SQLException {
    private static final long serialVersionUID = -5877937327907457779L;

    public dnw(String str) {
        super(str);
    }

    public dnw(String str, Throwable th) {
        super(str);
        m28321a(th);
    }

    /* renamed from: a */
    protected void m28321a(Throwable th) {
        try {
            initCause(th);
        } catch (Throwable th2) {
            dnx.m28325b("Could not set initial cause", th2);
            dnx.m28325b("Initial cause is:", th);
        }
    }
}
