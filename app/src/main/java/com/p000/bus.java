package com.p000;

import java.io.IOException;

/* compiled from: TypeAdapter */
/* renamed from: bus */
public abstract class bus<T> {

    /* compiled from: TypeAdapter */
    /* renamed from: bus$1 */
    class C15021 extends bus<T> {
        /* renamed from: a */
        final /* synthetic */ bus f7709a;

        C15021(bus bus) {
            this.f7709a = bus;
        }

        /* renamed from: a */
        public void mo1536a(bwc bwc, T t) throws IOException {
            if (t == null) {
                bwc.mo1578f();
            } else {
                this.f7709a.mo1536a(bwc, t);
            }
        }

        /* renamed from: b */
        public T mo1537b(bwa bwa) throws IOException {
            if (bwa.mo1554f() != bwb.NULL) {
                return this.f7709a.mo1537b(bwa);
            }
            bwa.mo1558j();
            return null;
        }
    }

    /* renamed from: a */
    public abstract void mo1536a(bwc bwc, T t) throws IOException;

    /* renamed from: b */
    public abstract T mo1537b(bwa bwa) throws IOException;

    /* renamed from: a */
    public final bus<T> m11007a() {
        return new C15021(this);
    }

    /* renamed from: a */
    public final buh m11006a(T t) {
        try {
            bwc bvp = new bvp();
            mo1536a(bvp, t);
            return bvp.mo1566a();
        } catch (Throwable e) {
            throw new bui(e);
        }
    }
}
