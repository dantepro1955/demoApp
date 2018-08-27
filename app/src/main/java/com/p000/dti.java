package com.p000;

import java.util.List;

/* renamed from: dti */
public class dti extends drh {
    /* renamed from: e */
    private final List<dtj> f22891e;
    /* renamed from: f */
    private final rd<?> f22892f;
    /* renamed from: g */
    private final String f22893g;

    public dti(dot dot, drj drj, String str, List<dtj> list, rd<?> rdVar, drf drf) {
        super(dot, drj, drf);
        this.f22891e = list;
        this.f22892f = rdVar;
        this.f22893g = str;
        this.a = new dyx(this);
    }

    /* renamed from: a */
    protected void mo4633a(dni dni) {
        super.mo4633a(dni);
        dni.mo4459b("dictation_language", "eng-USA");
    }

    /* renamed from: b */
    protected final void m29265b() throws drk {
        if (this.f22891e != null) {
            for (dtj dtj : this.f22891e) {
                String a = dtj.m29268a();
                dtk b = dtj.m29269b();
                switch (b.m29275f()) {
                    case 0:
                        m28822a(a, b.m29272c());
                        break;
                    case 1:
                        czl.m25831c(this, "INT is an unsupported param type");
                        break;
                    case 2:
                        m28821a(a, czl.m25825a((drh) this, b.m29270a()));
                        break;
                    case 3:
                        czl.m25831c(this, "SEQ is an unsupported param type");
                        break;
                    case 5:
                        m28825b(a, czl.m25825a((drh) this, b.m29270a()));
                        break;
                    case 6:
                        m28826c(a, czl.m25825a((drh) this, b.m29270a()));
                        break;
                    case 7:
                        m28827d(a, czl.m25825a((drh) this, b.m29270a()));
                        break;
                    default:
                        break;
                }
                czl.m25828a((Object) this, "Send custom param " + a);
            }
        }
    }

    /* renamed from: c */
    final String m29266c() {
        return this.f22893g;
    }

    /* renamed from: d */
    final rd<?> m29267d() {
        return this.f22892f;
    }
}
