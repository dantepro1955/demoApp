package com.p000;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import p000.bby.C0998b;
import p000.bci.C0999a;

@bhd
/* renamed from: bbt */
public class bbt extends C0999a implements C0998b {
    /* renamed from: a */
    private String f5491a;
    /* renamed from: b */
    private List<bbr> f5492b;
    /* renamed from: c */
    private String f5493c;
    /* renamed from: d */
    private bcc f5494d;
    /* renamed from: e */
    private String f5495e;
    /* renamed from: f */
    private String f5496f;
    /* renamed from: g */
    private bbq f5497g;
    /* renamed from: h */
    private Bundle f5498h;
    /* renamed from: i */
    private baf f5499i;
    /* renamed from: j */
    private View f5500j;
    /* renamed from: k */
    private Object f5501k = new Object();
    /* renamed from: l */
    private bby f5502l;

    public bbt(String str, List list, String str2, bcc bcc, String str3, String str4, bbq bbq, Bundle bundle, baf baf, View view) {
        this.f5491a = str;
        this.f5492b = list;
        this.f5493c = str2;
        this.f5494d = bcc;
        this.f5495e = str3;
        this.f5496f = str4;
        this.f5497g = bbq;
        this.f5498h = bundle;
        this.f5499i = baf;
        this.f5500j = view;
    }

    /* renamed from: a */
    public String mo941a() {
        return this.f5491a;
    }

    /* renamed from: a */
    public void mo925a(bby bby) {
        synchronized (this.f5501k) {
            this.f5502l = bby;
        }
    }

    /* renamed from: b */
    public List mo926b() {
        return this.f5492b;
    }

    /* renamed from: c */
    public String mo942c() {
        return this.f5493c;
    }

    /* renamed from: d */
    public bcc mo943d() {
        return this.f5494d;
    }

    /* renamed from: e */
    public String mo944e() {
        return this.f5495e;
    }

    /* renamed from: f */
    public String mo945f() {
        return this.f5496f;
    }

    /* renamed from: g */
    public baf mo946g() {
        return this.f5499i;
    }

    /* renamed from: h */
    public aqq mo947h() {
        return aqr.m4967a(this.f5502l);
    }

    /* renamed from: i */
    public Bundle mo948i() {
        return this.f5498h;
    }

    /* renamed from: j */
    public void mo949j() {
        this.f5491a = null;
        this.f5492b = null;
        this.f5493c = null;
        this.f5494d = null;
        this.f5495e = null;
        this.f5496f = null;
        this.f5497g = null;
        this.f5498h = null;
        this.f5501k = null;
        this.f5502l = null;
        this.f5499i = null;
        this.f5500j = null;
    }

    /* renamed from: k */
    public String mo935k() {
        return "1";
    }

    /* renamed from: l */
    public String mo936l() {
        return "";
    }

    /* renamed from: m */
    public bbq mo937m() {
        return this.f5497g;
    }

    /* renamed from: o */
    public View mo939o() {
        return this.f5500j;
    }
}
