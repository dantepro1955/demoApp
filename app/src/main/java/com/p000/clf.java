package com.p000;

import com.ninegag.android.app.model.newdb.GagListItemDao;

/* compiled from: GagListItem */
/* renamed from: clf */
public class clf {
    /* renamed from: a */
    private Long f9640a;
    /* renamed from: b */
    private Long f9641b;
    /* renamed from: c */
    private String f9642c;
    /* renamed from: d */
    private Integer f9643d;
    /* renamed from: e */
    private Long f9644e;
    /* renamed from: f */
    private Boolean f9645f;
    /* renamed from: g */
    private String f9646g;
    /* renamed from: h */
    private String f9647h;
    /* renamed from: i */
    private transient clc f9648i;
    /* renamed from: j */
    private transient GagListItemDao f9649j;
    /* renamed from: k */
    private cld f9650k;
    /* renamed from: l */
    private Long f9651l;

    public clf(Long l, Long l2, String str, Integer num, Long l3, Boolean bool, String str2, String str3) {
        this.f9640a = l;
        this.f9641b = l2;
        this.f9642c = str;
        this.f9643d = num;
        this.f9644e = l3;
        this.f9645f = bool;
        this.f9646g = str2;
        this.f9647h = str3;
    }

    /* renamed from: a */
    public void m14252a(clc clc) {
        this.f9648i = clc;
        this.f9649j = clc != null ? clc.m14233c() : null;
    }

    /* renamed from: a */
    public Long m14251a() {
        return this.f9640a;
    }

    /* renamed from: a */
    public void m14256a(Long l) {
        this.f9640a = l;
    }

    /* renamed from: b */
    public Long m14258b() {
        return this.f9641b;
    }

    /* renamed from: b */
    public void m14259b(Long l) {
        this.f9641b = l;
    }

    /* renamed from: c */
    public String m14261c() {
        return this.f9642c;
    }

    /* renamed from: a */
    public void m14257a(String str) {
        this.f9642c = str;
    }

    /* renamed from: d */
    public Integer m14264d() {
        return this.f9643d;
    }

    /* renamed from: a */
    public void m14255a(Integer num) {
        this.f9643d = num;
    }

    /* renamed from: e */
    public Long m14265e() {
        return this.f9644e;
    }

    /* renamed from: c */
    public void m14262c(Long l) {
        this.f9644e = l;
    }

    /* renamed from: f */
    public Boolean m14266f() {
        return this.f9645f;
    }

    /* renamed from: a */
    public void m14254a(Boolean bool) {
        this.f9645f = bool;
    }

    /* renamed from: g */
    public String m14267g() {
        return this.f9646g;
    }

    /* renamed from: b */
    public void m14260b(String str) {
        this.f9646g = str;
    }

    /* renamed from: h */
    public String m14268h() {
        return this.f9647h;
    }

    /* renamed from: c */
    public void m14263c(String str) {
        this.f9647h = str;
    }

    /* renamed from: i */
    public cld m14269i() {
        Long l = this.f9641b;
        if (this.f9651l == null || !this.f9651l.equals(l)) {
            if (this.f9648i == null) {
                throw new dnw("Entity is detached from DAO context");
            }
            cld cld = (cld) this.f9648i.m14232b().load(l);
            synchronized (this) {
                this.f9650k = cld;
                this.f9651l = l;
            }
        }
        return this.f9650k;
    }

    /* renamed from: a */
    public void m14253a(cld cld) {
        synchronized (this) {
            this.f9650k = cld;
            this.f9641b = cld == null ? null : cld.m12619b();
            this.f9651l = this.f9641b;
        }
    }

    /* renamed from: j */
    public void m14270j() {
        if (this.f9649j == null) {
            throw new dnw("Entity is detached from DAO context");
        }
        this.f9649j.update(this);
    }
}
