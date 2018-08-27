package com.p000;

import java.util.Map;
import org.json.JSONObject;

@bhd
/* renamed from: ayc */
public class ayc implements aye {
    /* renamed from: a */
    private final aya f4963a;
    /* renamed from: b */
    private final bef f4964b;
    /* renamed from: c */
    private final bcy f4965c = new C08881(this);
    /* renamed from: d */
    private final bcy f4966d = new C08892(this);
    /* renamed from: e */
    private final bcy f4967e = new C08903(this);

    /* renamed from: ayc$1 */
    class C08881 implements bcy {
        /* renamed from: a */
        final /* synthetic */ ayc f4960a;

        C08881(ayc ayc) {
            this.f4960a = ayc;
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            this.f4960a.f4963a.m6497a(blo, (Map) map);
        }
    }

    /* renamed from: ayc$2 */
    class C08892 implements bcy {
        /* renamed from: a */
        final /* synthetic */ ayc f4961a;

        C08892(ayc ayc) {
            this.f4961a = ayc;
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            this.f4961a.f4963a.m6496a(this.f4961a, (Map) map);
        }
    }

    /* renamed from: ayc$3 */
    class C08903 implements bcy {
        /* renamed from: a */
        final /* synthetic */ ayc f4962a;

        C08903(ayc ayc) {
            this.f4962a = ayc;
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            this.f4962a.f4963a.m6503b((Map) map);
        }
    }

    public ayc(aya aya, bef bef) {
        this.f4963a = aya;
        this.f4964b = bef;
        m6528a(this.f4964b);
        String str = "Custom JS tracking ad unit: ";
        String valueOf = String.valueOf(this.f4963a.m6520r().m6445d());
        bky.m9006b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    void m6528a(bef bef) {
        bef.mo1023a("/updateActiveView", this.f4965c);
        bef.mo1023a("/untrackActiveViewUnit", this.f4966d);
        bef.mo1023a("/visibilityChanged", this.f4967e);
    }

    /* renamed from: a */
    public void mo849a(JSONObject jSONObject, boolean z) {
        if (z) {
            this.f4963a.m6502b((aye) this);
        } else {
            this.f4964b.mo1025a("AFMA_updateActiveView", jSONObject);
        }
    }

    /* renamed from: a */
    public boolean mo850a() {
        return true;
    }

    /* renamed from: b */
    public void mo851b() {
        m6532b(this.f4964b);
    }

    /* renamed from: b */
    void m6532b(bef bef) {
        bef.mo1028b("/visibilityChanged", this.f4967e);
        bef.mo1028b("/untrackActiveViewUnit", this.f4966d);
        bef.mo1028b("/updateActiveView", this.f4965c);
    }
}
