package com.p000;

import android.util.StateSet;
import java.util.ArrayList;
import p000.an.C0077a;
import p000.an.C0078b;

/* compiled from: StateListAnimator */
/* renamed from: al */
final class al {
    /* renamed from: a */
    an f1939a = null;
    /* renamed from: b */
    private final ArrayList<C0272a> f1940b = new ArrayList();
    /* renamed from: c */
    private C0272a f1941c = null;
    /* renamed from: d */
    private final C0077a f1942d = new C02711(this);

    /* compiled from: StateListAnimator */
    /* renamed from: al$1 */
    class C02711 extends C0078b {
        /* renamed from: a */
        final /* synthetic */ al f1936a;

        C02711(al alVar) {
            this.f1936a = alVar;
        }

        /* renamed from: b */
        public void mo32b(an anVar) {
            if (this.f1936a.f1939a == anVar) {
                this.f1936a.f1939a = null;
            }
        }
    }

    /* compiled from: StateListAnimator */
    /* renamed from: al$a */
    static class C0272a {
        /* renamed from: a */
        final int[] f1937a;
        /* renamed from: b */
        final an f1938b;

        C0272a(int[] iArr, an anVar) {
            this.f1937a = iArr;
            this.f1938b = anVar;
        }
    }

    al() {
    }

    /* renamed from: a */
    public void m2399a(int[] iArr, an anVar) {
        C0272a c0272a = new C0272a(iArr, anVar);
        anVar.m2796a(this.f1942d);
        this.f1940b.add(c0272a);
    }

    /* renamed from: a */
    void m2398a(int[] iArr) {
        C0272a c0272a;
        int size = this.f1940b.size();
        for (int i = 0; i < size; i++) {
            c0272a = (C0272a) this.f1940b.get(i);
            if (StateSet.stateSetMatches(c0272a.f1937a, iArr)) {
                break;
            }
        }
        c0272a = null;
        if (c0272a != this.f1941c) {
            if (this.f1941c != null) {
                m2396b();
            }
            this.f1941c = c0272a;
            if (c0272a != null) {
                m2395a(c0272a);
            }
        }
    }

    /* renamed from: a */
    private void m2395a(C0272a c0272a) {
        this.f1939a = c0272a.f1938b;
        this.f1939a.m2792a();
    }

    /* renamed from: b */
    private void m2396b() {
        if (this.f1939a != null) {
            this.f1939a.m2802e();
            this.f1939a = null;
        }
    }

    /* renamed from: a */
    public void m2397a() {
        if (this.f1939a != null) {
            this.f1939a.m2804g();
            this.f1939a = null;
        }
    }
}
