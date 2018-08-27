package com.p000;

import java.util.ArrayList;

/* compiled from: Animator */
/* renamed from: cwk */
public abstract class cwk implements Cloneable {
    /* renamed from: a */
    ArrayList<C4624a> f20369a = null;

    /* compiled from: Animator */
    /* renamed from: cwk$a */
    public interface C4624a {
        /* renamed from: a */
        void m25214a(cwk cwk);

        /* renamed from: b */
        void m25215b(cwk cwk);

        /* renamed from: c */
        void m25216c(cwk cwk);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return mo4190b();
    }

    /* renamed from: a */
    public void mo4189a() {
    }

    /* renamed from: b */
    public cwk mo4190b() {
        try {
            cwk cwk = (cwk) super.clone();
            if (this.f20369a != null) {
                ArrayList arrayList = this.f20369a;
                cwk.f20369a = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    cwk.f20369a.add(arrayList.get(i));
                }
            }
            return cwk;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
