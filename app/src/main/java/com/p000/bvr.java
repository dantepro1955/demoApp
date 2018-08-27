package com.p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ObjectTypeAdapter */
/* renamed from: bvr */
public final class bvr extends bus<Object> {
    /* renamed from: a */
    public static final but f7846a = new C15351();
    /* renamed from: b */
    private final bub f7847b;

    /* compiled from: ObjectTypeAdapter */
    /* renamed from: bvr$1 */
    static class C15351 implements but {
        C15351() {
        }

        /* renamed from: a */
        public <T> bus<T> mo1546a(bub bub, bvz<T> bvz) {
            if (bvz.m11004a() == Object.class) {
                return new bvr(bub);
            }
            return null;
        }
    }

    bvr(bub bub) {
        this.f7847b = bub;
    }

    /* renamed from: b */
    public Object mo1537b(bwa bwa) throws IOException {
        switch (bwa.mo1554f()) {
            case BEGIN_ARRAY:
                List arrayList = new ArrayList();
                bwa.mo1548a();
                while (bwa.mo1553e()) {
                    arrayList.add(mo1537b(bwa));
                }
                bwa.mo1549b();
                return arrayList;
            case BEGIN_OBJECT:
                Object bvf = new bvf();
                bwa.mo1550c();
                while (bwa.mo1553e()) {
                    bvf.put(bwa.mo1555g(), mo1537b(bwa));
                }
                bwa.mo1552d();
                return bvf;
            case STRING:
                return bwa.mo1556h();
            case NUMBER:
                return Double.valueOf(bwa.mo1559k());
            case BOOLEAN:
                return Boolean.valueOf(bwa.mo1557i());
            case NULL:
                bwa.mo1558j();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo1536a(bwc bwc, Object obj) throws IOException {
        if (obj == null) {
            bwc.mo1578f();
            return;
        }
        bus a = this.f7847b.m11042a(obj.getClass());
        if (a instanceof bvr) {
            bwc.mo1576d();
            bwc.mo1577e();
            return;
        }
        a.mo1536a(bwc, obj);
    }
}
