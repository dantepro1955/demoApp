package com.p000;

import com.ninegag.android.app.otto.response.GagPostResponseEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SinglePostWrapper */
/* renamed from: ccc */
public class ccc extends ccs {
    /* renamed from: b */
    private String f8680b;
    /* renamed from: c */
    private String f8681c;

    public ccc(cco cco) {
        super(cco);
        this.f8680b = cco.f8735g;
        this.f8681c = cco.f8730b;
    }

    /* renamed from: g */
    public String m12454g() {
        return this.f8681c;
    }

    /* renamed from: a */
    protected List<cct> mo1654a() {
        cct a = cct.m12254a(caf.m12046a().m12075g().f9370c.m13832i(this.f8680b));
        List<cct> arrayList = new ArrayList();
        arrayList.add(a);
        return arrayList;
    }

    /* renamed from: a */
    protected List<cct> mo1640a(int i) {
        return new ArrayList();
    }

    /* renamed from: b */
    protected boolean mo1642b() {
        return false;
    }

    /* renamed from: c */
    protected void mo1643c() {
        caf.m12046a().m12079i().m13544a(this.f8680b, this.f8681c);
    }

    /* renamed from: d */
    protected void mo1644d() {
    }

    /* renamed from: f */
    public boolean mo1645f() {
        return true;
    }

    /* renamed from: e */
    protected String mo1655e() {
        return super.mo1655e();
    }

    /* renamed from: h */
    public cct m12455h() {
        if (size() > 0) {
            return (cct) get(0);
        }
        return null;
    }

    @dhg
    public void onGagPostResponse(GagPostResponseEvent gagPostResponseEvent) {
        C();
    }
}
