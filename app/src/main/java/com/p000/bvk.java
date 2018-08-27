package com.p000;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ArrayTypeAdapter */
/* renamed from: bvk */
public final class bvk<E> extends bus<Object> {
    /* renamed from: a */
    public static final but f7791a = new C15291();
    /* renamed from: b */
    private final Class<E> f7792b;
    /* renamed from: c */
    private final bus<E> f7793c;

    /* compiled from: ArrayTypeAdapter */
    /* renamed from: bvk$1 */
    static class C15291 implements but {
        C15291() {
        }

        /* renamed from: a */
        public <T> bus<T> mo1546a(bub bub, bvz<T> bvz) {
            Type b = bvz.m11005b();
            if (!(b instanceof GenericArrayType) && (!(b instanceof Class) || !((Class) b).isArray())) {
                return null;
            }
            b = bva.m11135g(b);
            return new bvk(bub, bub.m11041a(bvz.m11001a(b)), bva.m11133e(b));
        }
    }

    public bvk(bub bub, bus<E> bus, Class<E> cls) {
        this.f7793c = new bvw(bub, bus, cls);
        this.f7792b = cls;
    }

    /* renamed from: b */
    public Object mo1537b(bwa bwa) throws IOException {
        if (bwa.mo1554f() == bwb.NULL) {
            bwa.mo1558j();
            return null;
        }
        List arrayList = new ArrayList();
        bwa.mo1548a();
        while (bwa.mo1553e()) {
            arrayList.add(this.f7793c.mo1537b(bwa));
        }
        bwa.mo1549b();
        Object newInstance = Array.newInstance(this.f7792b, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: a */
    public void mo1536a(bwc bwc, Object obj) throws IOException {
        if (obj == null) {
            bwc.mo1578f();
            return;
        }
        bwc.mo1572b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f7793c.mo1536a(bwc, Array.get(obj, i));
        }
        bwc.mo1574c();
    }
}
