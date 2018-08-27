package com.p000;

import com.ninegag.android.app.model.GroupListItemDao;

/* compiled from: GroupListItem */
/* renamed from: ckm */
public class ckm {
    /* renamed from: a */
    private Long f9552a;
    /* renamed from: b */
    private Long f9553b;
    /* renamed from: c */
    private String f9554c;
    /* renamed from: d */
    private String f9555d;
    /* renamed from: e */
    private transient cjx f9556e;
    /* renamed from: f */
    private transient GroupListItemDao f9557f;
    /* renamed from: g */
    private ckk f9558g;
    /* renamed from: h */
    private Long f9559h;

    public ckm(Long l, Long l2, String str, String str2) {
        this.f9552a = l;
        this.f9553b = l2;
        this.f9554c = str;
        this.f9555d = str2;
    }

    /* renamed from: a */
    public void m14193a(cjx cjx) {
        this.f9556e = cjx;
        this.f9557f = cjx != null ? cjx.m14110d() : null;
    }

    /* renamed from: a */
    public Long m14192a() {
        return this.f9552a;
    }

    /* renamed from: a */
    public void m14195a(Long l) {
        this.f9552a = l;
    }

    /* renamed from: b */
    public Long m14197b() {
        return this.f9553b;
    }

    /* renamed from: b */
    public void m14198b(Long l) {
        this.f9553b = l;
    }

    /* renamed from: c */
    public String m14200c() {
        return this.f9554c;
    }

    /* renamed from: a */
    public void m14196a(String str) {
        this.f9554c = str;
    }

    /* renamed from: d */
    public String m14201d() {
        return this.f9555d;
    }

    /* renamed from: b */
    public void m14199b(String str) {
        this.f9555d = str;
    }

    /* renamed from: e */
    public ckk m14202e() {
        Long l = this.f9553b;
        if (this.f9559h == null || !this.f9559h.equals(l)) {
            if (this.f9556e == null) {
                throw new dnw("Entity is detached from DAO context");
            }
            ckk ckk = (ckk) this.f9556e.m14109c().load(l);
            synchronized (this) {
                this.f9558g = ckk;
                this.f9559h = l;
            }
        }
        return this.f9558g;
    }

    /* renamed from: a */
    public void m14194a(ckk ckk) {
        synchronized (this) {
            this.f9558g = ckk;
            this.f9553b = ckk == null ? null : ckk.m14166a();
            this.f9559h = this.f9553b;
        }
    }
}
