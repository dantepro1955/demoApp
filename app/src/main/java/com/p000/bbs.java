package com.p000;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import p000.bby.C0998b;
import p000.bcg.C0996a;

@bhd
/* renamed from: bbs */
public class bbs extends C0996a implements C0998b {
    /* renamed from: a */
    private String f5477a;
    /* renamed from: b */
    private List<bbr> f5478b;
    /* renamed from: c */
    private String f5479c;
    /* renamed from: d */
    private bcc f5480d;
    /* renamed from: e */
    private String f5481e;
    /* renamed from: f */
    private double f5482f;
    /* renamed from: g */
    private String f5483g;
    /* renamed from: h */
    private String f5484h;
    /* renamed from: i */
    private bbq f5485i;
    /* renamed from: j */
    private Bundle f5486j;
    /* renamed from: k */
    private baf f5487k;
    /* renamed from: l */
    private View f5488l;
    /* renamed from: m */
    private Object f5489m = new Object();
    /* renamed from: n */
    private bby f5490n;

    public bbs(String str, List list, String str2, bcc bcc, String str3, double d, String str4, String str5, bbq bbq, Bundle bundle, baf baf, View view) {
        this.f5477a = str;
        this.f5478b = list;
        this.f5479c = str2;
        this.f5480d = bcc;
        this.f5481e = str3;
        this.f5482f = d;
        this.f5483g = str4;
        this.f5484h = str5;
        this.f5485i = bbq;
        this.f5486j = bundle;
        this.f5487k = baf;
        this.f5488l = view;
    }

    /* renamed from: a */
    public String mo924a() {
        return this.f5477a;
    }

    /* renamed from: a */
    public void mo925a(bby bby) {
        synchronized (this.f5489m) {
            this.f5490n = bby;
        }
    }

    /* renamed from: b */
    public List mo926b() {
        return this.f5478b;
    }

    /* renamed from: c */
    public String mo927c() {
        return this.f5479c;
    }

    /* renamed from: d */
    public bcc mo928d() {
        return this.f5480d;
    }

    /* renamed from: e */
    public String mo929e() {
        return this.f5481e;
    }

    /* renamed from: f */
    public double mo930f() {
        return this.f5482f;
    }

    /* renamed from: g */
    public String mo931g() {
        return this.f5483g;
    }

    /* renamed from: h */
    public String mo932h() {
        return this.f5484h;
    }

    /* renamed from: i */
    public baf mo933i() {
        return this.f5487k;
    }

    /* renamed from: j */
    public aqq mo934j() {
        return aqr.m4967a(this.f5490n);
    }

    /* renamed from: k */
    public String mo935k() {
        return "2";
    }

    /* renamed from: l */
    public String mo936l() {
        return "";
    }

    /* renamed from: m */
    public bbq mo937m() {
        return this.f5485i;
    }

    /* renamed from: n */
    public Bundle mo938n() {
        return this.f5486j;
    }

    /* renamed from: o */
    public View mo939o() {
        return this.f5488l;
    }

    /* renamed from: p */
    public void mo940p() {
        this.f5477a = null;
        this.f5478b = null;
        this.f5479c = null;
        this.f5480d = null;
        this.f5481e = null;
        this.f5482f = 0.0d;
        this.f5483g = null;
        this.f5484h = null;
        this.f5485i = null;
        this.f5486j = null;
        this.f5489m = null;
        this.f5490n = null;
        this.f5487k = null;
        this.f5488l = null;
    }
}
