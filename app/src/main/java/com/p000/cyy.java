package com.p000;

import java.util.ArrayList;
import java.util.List;
import p000.czs.C4709b;

/* renamed from: cyy */
abstract class cyy<ResultType> extends C0000a {
    /* renamed from: b */
    private final String f20721b;
    /* renamed from: c */
    private final List<dtj> f20722c = new ArrayList();
    /* renamed from: d */
    private final czv f20723d;
    /* renamed from: e */
    private cyv<ResultType> f20724e;
    /* renamed from: f */
    private Runnable f20725f;

    /* renamed from: cyy$1 */
    class C46781 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ cyy f20719a;

        C46781(cyy cyy) {
            this.f20719a = cyy;
        }

        public final void run() {
            this.f20719a.f20724e = this.f20719a.mo4241a(this.f20719a.f20723d.m25903b(), this.f20719a.f20721b, this.f20719a.f20722c);
        }
    }

    /* renamed from: cyy$2 */
    class C46792 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ cyy f20720a;

        C46792(cyy cyy) {
            this.f20720a = cyy;
        }

        public final void run() {
            this.f20720a.f20724e.m25687b();
        }
    }

    cyy(czv czv, String str, Object obj) {
        super(obj);
        this.f20721b = str;
        this.f20723d = czv;
        this.f20725f = new C46781(this);
    }

    /* renamed from: a */
    protected abstract cyv<ResultType> mo4241a(drl drl, String str, List<dtj> list);

    /* renamed from: a */
    public void mo4242a() {
        this.f20723d.m25905d();
        qu.m33922a(new C46792(this));
    }

    /* renamed from: a */
    public void m25724a(String str, C4709b c4709b) {
        this.f20722c.add(new dtj(str, c4709b));
    }

    /* renamed from: b */
    protected final void m25725b() {
        if (this.f20725f != null) {
            qu.m33922a(this.f20725f);
            this.f20725f = null;
        }
    }
}
