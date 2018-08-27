package com.p000;

import android.content.Context;
import com.google.android.gms.analytics.Tracker;
import com.inmobi.commons.analytics.iat.impl.AdTrackerConstants;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import p000.ald.C0278c;

/* renamed from: alb */
public class alb implements UncaughtExceptionHandler {
    /* renamed from: a */
    private final UncaughtExceptionHandler f1943a;
    /* renamed from: b */
    private final Tracker f1944b;
    /* renamed from: c */
    private final Context f1945c;
    /* renamed from: d */
    private ala f1946d;
    /* renamed from: e */
    private alc f1947e;

    public alb(Tracker tracker, UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        if (tracker == null) {
            throw new NullPointerException("tracker cannot be null");
        } else if (context == null) {
            throw new NullPointerException(AdTrackerConstants.MSG_APP_CONTEXT_NULL);
        } else {
            this.f1943a = uncaughtExceptionHandler;
            this.f1944b = tracker;
            this.f1946d = new alf(context, new ArrayList());
            this.f1945c = context.getApplicationContext();
            String str = "ExceptionReporter created, original handler is ";
            String valueOf = String.valueOf(uncaughtExceptionHandler == null ? "null" : uncaughtExceptionHandler.getClass().getName());
            bnw.m10034a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    /* renamed from: a */
    alc m2401a() {
        if (this.f1947e == null) {
            this.f1947e = alc.m2417a(this.f1945c);
        }
        return this.f1947e;
    }

    /* renamed from: b */
    public UncaughtExceptionHandler m2402b() {
        return this.f1943a;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String str = "UncaughtException";
        if (this.f1946d != null) {
            str = this.f1946d.mo320a(thread != null ? thread.getName() : null, th);
        }
        String str2 = "Reporting uncaught exception: ";
        String valueOf = String.valueOf(str);
        bnw.m10034a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.f1944b.send(new C0278c().m2445a(str).m2446a(true).mo319a());
        alc a = m2401a();
        a.m2435h();
        a.m2436i();
        if (this.f1943a != null) {
            bnw.m10034a("Passing exception to the original handler");
            this.f1943a.uncaughtException(thread, th);
        }
    }
}
