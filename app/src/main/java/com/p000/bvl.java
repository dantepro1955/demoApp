package com.p000;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

/* compiled from: CollectionTypeAdapterFactory */
/* renamed from: bvl */
public final class bvl implements but {
    /* renamed from: a */
    private final bvb f7796a;

    /* compiled from: CollectionTypeAdapterFactory */
    /* renamed from: bvl$a */
    static final class C1530a<E> extends bus<Collection<E>> {
        /* renamed from: a */
        private final bus<E> f7794a;
        /* renamed from: b */
        private final bvg<? extends Collection<E>> f7795b;

        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11202a(bwa);
        }

        public C1530a(bub bub, Type type, bus<E> bus, bvg<? extends Collection<E>> bvg) {
            this.f7794a = new bvw(bub, bus, type);
            this.f7795b = bvg;
        }

        /* renamed from: a */
        public Collection<E> m11202a(bwa bwa) throws IOException {
            if (bwa.mo1554f() == bwb.NULL) {
                bwa.mo1558j();
                return null;
            }
            Collection<E> collection = (Collection) this.f7795b.mo1545a();
            bwa.mo1548a();
            while (bwa.mo1553e()) {
                collection.add(this.f7794a.mo1537b(bwa));
            }
            bwa.mo1549b();
            return collection;
        }

        /* renamed from: a */
        public void m11204a(bwc bwc, Collection<E> collection) throws IOException {
            if (collection == null) {
                bwc.mo1578f();
                return;
            }
            bwc.mo1572b();
            for (E a : collection) {
                this.f7794a.mo1536a(bwc, a);
            }
            bwc.mo1574c();
        }
    }

    public bvl(bvb bvb) {
        this.f7796a = bvb;
    }

    /* renamed from: a */
    public <T> bus<T> mo1546a(bub bub, bvz<T> bvz) {
        Type b = bvz.m11005b();
        Class a = bvz.m11004a();
        if (!Collection.class.isAssignableFrom(a)) {
            return null;
        }
        Type a2 = bva.m11122a(b, a);
        return new C1530a(bub, a2, bub.m11041a(bvz.m11001a(a2)), this.f7796a.m11155a((bvz) bvz));
    }
}
