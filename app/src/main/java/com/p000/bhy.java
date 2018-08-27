package com.p000;

import java.util.Map;
import java.util.concurrent.Future;
import p000.bee.C1109c;

@bhd
/* renamed from: bhy */
public final class bhy {
    /* renamed from: a */
    C1109c f6334a;
    /* renamed from: b */
    public final bcy f6335b = new C12291(this);
    /* renamed from: c */
    public final bcy f6336c = new C12302(this);
    /* renamed from: d */
    public final bcy f6337d = new C12313(this);
    /* renamed from: e */
    private final Object f6338e = new Object();
    /* renamed from: f */
    private String f6339f;
    /* renamed from: g */
    private String f6340g;
    /* renamed from: h */
    private blb<bib> f6341h = new blb();

    /* renamed from: bhy$1 */
    class C12291 implements bcy {
        /* renamed from: a */
        final /* synthetic */ bhy f6331a;

        C12291(bhy bhy) {
            this.f6331a = bhy;
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            synchronized (this.f6331a.f6338e) {
                if (this.f6331a.f6341h.isDone()) {
                } else if (this.f6331a.f6339f.equals(map.get("request_id"))) {
                    Object bib = new bib(1, map);
                    String valueOf = String.valueOf(bib.m8651f());
                    String valueOf2 = String.valueOf(bib.m8647b());
                    bky.m9011e(new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length()).append("Invalid ").append(valueOf).append(" request error: ").append(valueOf2).toString());
                    this.f6331a.f6341h.m7770b(bib);
                }
            }
        }
    }

    /* renamed from: bhy$2 */
    class C12302 implements bcy {
        /* renamed from: a */
        final /* synthetic */ bhy f6332a;

        C12302(bhy bhy) {
            this.f6332a = bhy;
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            synchronized (this.f6332a.f6338e) {
                if (this.f6332a.f6341h.isDone()) {
                    return;
                }
                Object bib = new bib(-2, map);
                if (this.f6332a.f6339f.equals(bib.m8653h())) {
                    String e = bib.m8650e();
                    if (e == null) {
                        bky.m9011e("URL missing in loadAdUrl GMSG.");
                        return;
                    }
                    if (e.contains("%40mediation_adapters%40")) {
                        String replaceAll = e.replaceAll("%40mediation_adapters%40", bka.m9002a(blo.getContext(), (String) map.get("check_adapters"), this.f6332a.f6340g));
                        bib.m8646a(replaceAll);
                        e = "Ad request URL modified to ";
                        replaceAll = String.valueOf(replaceAll);
                        bkc.m9012a(replaceAll.length() != 0 ? e.concat(replaceAll) : new String(e));
                    }
                    this.f6332a.f6341h.m7770b(bib);
                    return;
                }
            }
        }
    }

    /* renamed from: bhy$3 */
    class C12313 implements bcy {
        /* renamed from: a */
        final /* synthetic */ bhy f6333a;

        C12313(bhy bhy) {
            this.f6333a = bhy;
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            synchronized (this.f6333a.f6338e) {
                if (this.f6333a.f6341h.isDone()) {
                    return;
                }
                Object bib = new bib(-2, map);
                if (this.f6333a.f6339f.equals(bib.m8653h())) {
                    this.f6333a.f6341h.m7770b(bib);
                    return;
                }
            }
        }
    }

    public bhy(String str, String str2) {
        this.f6340g = str2;
        this.f6339f = str;
    }

    /* renamed from: a */
    public C1109c m8589a() {
        return this.f6334a;
    }

    /* renamed from: a */
    public void m8590a(C1109c c1109c) {
        this.f6334a = c1109c;
    }

    /* renamed from: b */
    public Future<bib> m8591b() {
        return this.f6341h;
    }
}
