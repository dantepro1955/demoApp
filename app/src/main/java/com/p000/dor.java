package com.p000;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p000.dos.C5029b;
import p000.dos.C5030c;

/* compiled from: WhereCollector */
/* renamed from: dor */
class dor<T> {
    /* renamed from: a */
    private final dnt<T, ?> f22453a;
    /* renamed from: b */
    private final List<dos> f22454b = new ArrayList();
    /* renamed from: c */
    private final String f22455c;

    dor(dnt<T, ?> dnt, String str) {
        this.f22453a = dnt;
        this.f22455c = str;
    }

    /* renamed from: a */
    void m28492a(dos dos, dos... dosArr) {
        m28491a(dos);
        this.f22454b.add(dos);
        for (dos dos2 : dosArr) {
            m28491a(dos2);
            this.f22454b.add(dos2);
        }
    }

    /* renamed from: a */
    dos m28489a(String str, dos dos, dos dos2, dos... dosArr) {
        StringBuilder stringBuilder = new StringBuilder("(");
        List arrayList = new ArrayList();
        m28494a(stringBuilder, arrayList, dos);
        stringBuilder.append(str);
        m28494a(stringBuilder, arrayList, dos2);
        for (dos dos3 : dosArr) {
            stringBuilder.append(str);
            m28494a(stringBuilder, arrayList, dos3);
        }
        stringBuilder.append(')');
        return new C5030c(stringBuilder.toString(), arrayList.toArray());
    }

    /* renamed from: a */
    void m28494a(StringBuilder stringBuilder, List<Object> list, dos dos) {
        m28491a(dos);
        dos.mo4506a(stringBuilder, this.f22455c);
        dos.mo4505a(list);
    }

    /* renamed from: a */
    void m28491a(dos dos) {
        if (dos instanceof C5029b) {
            m28490a(((C5029b) dos).f22459d);
        }
    }

    /* renamed from: a */
    void m28490a(dnz dnz) {
        Object obj = null;
        if (this.f22453a != null) {
            for (dnz dnz2 : this.f22453a.getProperties()) {
                if (dnz == dnz2) {
                    obj = 1;
                    break;
                }
            }
            if (obj == null) {
                throw new dnw("Property '" + dnz.f22368c + "' is not part of " + this.f22453a);
            }
        }
    }

    /* renamed from: a */
    void m28493a(StringBuilder stringBuilder, String str, List<Object> list) {
        ListIterator listIterator = this.f22454b.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.hasPrevious()) {
                stringBuilder.append(" AND ");
            }
            dos dos = (dos) listIterator.next();
            dos.mo4506a(stringBuilder, str);
            dos.mo4505a(list);
        }
    }

    /* renamed from: a */
    boolean m28495a() {
        return this.f22454b.isEmpty();
    }
}
