package com.p000;

import java.util.Collection;
import p000.dos.C5029b;

/* compiled from: Property */
/* renamed from: dnz */
public class dnz {
    /* renamed from: a */
    public final int f22366a;
    /* renamed from: b */
    public final Class<?> f22367b;
    /* renamed from: c */
    public final String f22368c;
    /* renamed from: d */
    public final boolean f22369d;
    /* renamed from: e */
    public final String f22370e;

    public dnz(int i, Class<?> cls, String str, boolean z, String str2) {
        this.f22366a = i;
        this.f22367b = cls;
        this.f22368c = str;
        this.f22369d = z;
        this.f22370e = str2;
    }

    /* renamed from: a */
    public dos m28328a(Object obj) {
        return new C5029b(this, "=?", obj);
    }

    /* renamed from: b */
    public dos m28331b(Object obj) {
        return new C5029b(this, "<>?", obj);
    }

    /* renamed from: a */
    public dos m28330a(Object... objArr) {
        StringBuilder stringBuilder = new StringBuilder(" IN (");
        doh.m28423a(stringBuilder, objArr.length).append(')');
        return new C5029b(this, stringBuilder.toString(), objArr);
    }

    /* renamed from: a */
    public dos m28329a(Collection<?> collection) {
        return m28330a(collection.toArray());
    }

    /* renamed from: b */
    public dos m28333b(Object... objArr) {
        StringBuilder stringBuilder = new StringBuilder(" NOT IN (");
        doh.m28423a(stringBuilder, objArr.length).append(')');
        return new C5029b(this, stringBuilder.toString(), objArr);
    }

    /* renamed from: b */
    public dos m28332b(Collection<?> collection) {
        return m28333b(collection.toArray());
    }

    /* renamed from: c */
    public dos m28334c(Object obj) {
        return new C5029b(this, ">?", obj);
    }

    /* renamed from: d */
    public dos m28335d(Object obj) {
        return new C5029b(this, "<?", obj);
    }

    /* renamed from: a */
    public dos m28327a() {
        return new C5029b(this, " IS NULL");
    }
}
