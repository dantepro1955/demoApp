package com.p000;

import android.util.Log;
import android.webkit.WebView;
import java.lang.reflect.Method;
import p000.byl.C1593c;

/* compiled from: WebAdTrackerImpl */
/* renamed from: byp */
class byp implements byo {
    /* renamed from: a */
    private final byv<? extends bym> f8232a;
    /* renamed from: b */
    private final byj f8233b;

    /* compiled from: WebAdTrackerImpl */
    /* renamed from: byp$a */
    static class C1608a implements C1593c<byo> {
        /* renamed from: a */
        private static final byv<Method> f8231a;

        C1608a() {
        }

        static {
            byv a = byv.m11830a();
            try {
                a = byv.m11831a(byo.class.getMethod("a", new Class[0]));
            } catch (Exception e) {
                byt.m11829a(e);
            }
            f8231a = a;
        }

        /* renamed from: a */
        public boolean mo1605a(Method method) {
            return f8231a.equals(byv.m11831a(method));
        }

        /* renamed from: a */
        public Class<byo> mo1604a() {
            return byo.class;
        }
    }

    byp(WebView webView, bxr bxr, byj byj) {
        this.f8233b = byj;
        if (byj.mo1615b()) {
            Log.d("MoatWebAdTracker", "In initialization method.");
        }
        if (webView == null) {
            if (byj.mo1615b()) {
                Log.e("MoatWebAdTracker", "WebView is null. Will not track.");
            }
            this.f8232a = byv.m11830a();
            return;
        }
        this.f8232a = byv.m11831a(new byn(webView, webView, false, bxr, byj));
    }

    /* renamed from: a */
    public boolean mo1617a() {
        boolean c;
        boolean b = this.f8233b.mo1615b();
        boolean z = false;
        if (b) {
            try {
                Log.d("MoatWebAdTracker", "In track method.");
            } catch (Exception e) {
                byt.m11829a(e);
            }
        }
        if (this.f8232a.m11834c()) {
            c = ((bym) this.f8232a.m11832b()).mo1625c();
        } else if (b) {
            Log.e("MoatWebAdTracker", "Internal tracker not available. Not tracking.");
            c = false;
        } else {
            c = false;
        }
        z = c;
        if (b) {
            Log.d("MoatWebAdTracker", "Attempt to start tracking ad was " + (z ? "" : "un") + "successful.");
        }
        return z;
    }
}
