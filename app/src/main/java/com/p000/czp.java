package com.p000;

import p000.czs.C4709b;

/* renamed from: czp */
public class czp {
    /* renamed from: a */
    private String f20809a;
    /* renamed from: b */
    private String f20810b;
    /* renamed from: c */
    private String f20811c;
    /* renamed from: d */
    private String f20812d;
    /* renamed from: e */
    private String f20813e;
    /* renamed from: f */
    private String f20814f;
    /* renamed from: g */
    private String f20815g;
    /* renamed from: h */
    private String f20816h;
    /* renamed from: i */
    private String f20817i;

    /* renamed from: a */
    public int m25850a() {
        int i = 0;
        if (this.f20809a != null) {
            i = this.f20809a.hashCode() + 0;
        }
        if (this.f20810b != null) {
            i += this.f20810b.hashCode();
        }
        if (this.f20811c != null) {
            i += this.f20811c.hashCode();
        }
        if (this.f20812d != null) {
            i += this.f20812d.hashCode();
        }
        if (this.f20813e != null) {
            i += this.f20813e.hashCode();
        }
        if (this.f20814f != null) {
            i += this.f20814f.hashCode();
        }
        if (this.f20815g != null) {
            i += this.f20815g.hashCode();
        }
        if (this.f20816h != null) {
            i += this.f20816h.hashCode();
        }
        return this.f20817i != null ? i + this.f20817i.hashCode() : i;
    }

    /* renamed from: b */
    final C4709b m25851b() {
        C4709b c4709b = new C4709b();
        if (this.f20813e != null) {
            c4709b.m25866a("full_name", this.f20813e);
        }
        if (this.f20809a != null) {
            c4709b.m25866a("first_name", this.f20809a);
        }
        if (this.f20810b != null) {
            c4709b.m25866a("first_name_phonetic", this.f20810b);
        }
        if (this.f20811c != null) {
            c4709b.m25866a("last_name", this.f20811c);
        }
        if (this.f20812d != null) {
            c4709b.m25866a("last_name_phonetic", this.f20812d);
        }
        if (this.f20814f != null) {
            c4709b.m25866a("nick_name", this.f20814f);
        }
        if (this.f20815g != null) {
            c4709b.m25866a("middle_name", this.f20815g);
        }
        if (this.f20816h != null) {
            c4709b.m25866a("middle_name_phonetic", this.f20816h);
        }
        if (this.f20817i != null) {
            c4709b.m25866a("company", this.f20817i);
        }
        return c4709b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f20809a != null) {
            stringBuffer.append("firstname:" + this.f20809a + "\n");
        }
        if (this.f20810b != null) {
            stringBuffer.append("firstname_phonetic:" + this.f20810b + "\n");
        }
        if (this.f20815g != null) {
            stringBuffer.append("middlename:" + this.f20815g + "\n");
        }
        if (this.f20816h != null) {
            stringBuffer.append("middlename_phonetic:" + this.f20816h + "\n");
        }
        if (this.f20811c != null) {
            stringBuffer.append("lastname:" + this.f20811c + "\n");
        }
        if (this.f20812d != null) {
            stringBuffer.append("lastname_phonetic:" + this.f20812d + "\n");
        }
        if (this.f20813e != null) {
            stringBuffer.append("fullname:" + this.f20813e + "\n");
        }
        if (this.f20814f != null) {
            stringBuffer.append("nickname:" + this.f20814f + "\n");
        }
        if (this.f20817i != null) {
            stringBuffer.append("company:" + this.f20817i + "\n");
        }
        return stringBuffer.toString();
    }
}
