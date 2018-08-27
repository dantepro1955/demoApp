package com.p000;

import android.util.Log;

/* renamed from: yf */
class yf implements zi {
    /* renamed from: a */
    private ws f26039a;
    /* renamed from: b */
    private yg f26040b;

    yf() {
    }

    /* renamed from: a */
    public void mo5606a(String str, String str2) {
        if (m34878a()) {
            Log.d("AppLovinSdk", "[" + str + "] " + str2);
        }
        if (this.f26040b != null) {
            this.f26040b.m34885a("DEBUG  [" + str + "] " + str2);
        }
    }

    /* renamed from: a */
    public void mo5607a(String str, String str2, Throwable th) {
        if (m34878a()) {
            Log.w("AppLovinSdk", "[" + str + "] " + str2, th);
        }
        if (this.f26040b != null) {
            this.f26040b.m34885a("WARN  [" + str + "] " + str2);
        }
    }

    /* renamed from: a */
    void m34876a(ws wsVar) {
        this.f26039a = wsVar;
    }

    /* renamed from: a */
    void m34877a(yg ygVar) {
        this.f26040b = ygVar;
    }

    /* renamed from: a */
    boolean m34878a() {
        return this.f26039a != null ? ((Boolean) this.f26039a.m34655a(wp.f25905i)).booleanValue() : false;
    }

    /* renamed from: b */
    public void mo5608b(String str, String str2) {
        if (m34878a()) {
            Log.i("AppLovinSdk", "[" + str + "] " + str2);
        }
        if (this.f26040b != null) {
            this.f26040b.m34885a("INFO  [" + str + "] " + str2);
        }
    }

    /* renamed from: b */
    public void mo5609b(String str, String str2, Throwable th) {
        if (m34878a()) {
            Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
        }
        if (this.f26040b != null) {
            this.f26040b.m34885a("ERROR  [" + str + "] " + str2 + (th != null ? ": " + th.getMessage() : ""));
        }
    }

    /* renamed from: c */
    public void mo5610c(String str, String str2) {
        mo5607a(str, str2, null);
    }

    /* renamed from: c */
    public void mo5611c(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
        if (this.f26040b != null) {
            this.f26040b.m34885a("USER  [" + str + "] " + str2 + (th != null ? ": " + th.getMessage() : ""));
        }
    }

    /* renamed from: d */
    public void mo5612d(String str, String str2) {
        mo5609b(str, str2, null);
    }

    /* renamed from: e */
    public void mo5613e(String str, String str2) {
        mo5611c(str, str2, null);
    }
}
