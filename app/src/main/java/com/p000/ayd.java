package com.p000;

import java.util.Map;
import org.json.JSONObject;
import p000.bee.C1109c;
import p000.blh.C0242c;
import p000.blh.C0892a;
import p000.blh.C1318b;

@bhd
/* renamed from: ayd */
public class ayd implements aye {
    /* renamed from: a */
    private final aya f4976a;
    /* renamed from: b */
    private C1109c f4977b;
    /* renamed from: c */
    private boolean f4978c;
    /* renamed from: d */
    private final bcy f4979d = new C08965(this);
    /* renamed from: e */
    private final bcy f4980e = new C08976(this);
    /* renamed from: f */
    private final bcy f4981f = new C08987(this);
    /* renamed from: g */
    private final bcy f4982g = new C08998(this);

    /* renamed from: ayd$1 */
    class C08911 implements C0242c<bef> {
        /* renamed from: a */
        final /* synthetic */ ayd f4968a;

        C08911(ayd ayd) {
            this.f4968a = ayd;
        }

        /* renamed from: a */
        public void m6533a(bef bef) {
            this.f4968a.f4978c = true;
            this.f4968a.m6547a(bef);
        }

        /* renamed from: a */
        public /* synthetic */ void mo289a(Object obj) {
            m6533a((bef) obj);
        }
    }

    /* renamed from: ayd$2 */
    class C08932 implements C0892a {
        /* renamed from: a */
        final /* synthetic */ ayd f4969a;

        C08932(ayd ayd) {
            this.f4969a = ayd;
        }

        /* renamed from: a */
        public void mo852a() {
            this.f4969a.f4976a.m6502b(this.f4969a);
        }
    }

    /* renamed from: ayd$4 */
    class C08954 implements C0242c<bef> {
        /* renamed from: a */
        final /* synthetic */ ayd f4971a;

        C08954(ayd ayd) {
            this.f4971a = ayd;
        }

        /* renamed from: a */
        public void m6539a(bef bef) {
            this.f4971a.m6551b(bef);
        }

        /* renamed from: a */
        public /* synthetic */ void mo289a(Object obj) {
            m6539a((bef) obj);
        }
    }

    /* renamed from: ayd$5 */
    class C08965 implements bcy {
        /* renamed from: a */
        final /* synthetic */ ayd f4972a;

        C08965(ayd ayd) {
            this.f4972a = ayd;
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            if (this.f4972a.f4976a.m6500a((Map) map)) {
                this.f4972a.f4976a.m6497a(blo, (Map) map);
            }
        }
    }

    /* renamed from: ayd$6 */
    class C08976 implements bcy {
        /* renamed from: a */
        final /* synthetic */ ayd f4973a;

        C08976(ayd ayd) {
            this.f4973a = ayd;
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            if (this.f4973a.f4976a.m6500a((Map) map)) {
                this.f4973a.f4976a.m6496a(this.f4973a, (Map) map);
            }
        }
    }

    /* renamed from: ayd$7 */
    class C08987 implements bcy {
        /* renamed from: a */
        final /* synthetic */ ayd f4974a;

        C08987(ayd ayd) {
            this.f4974a = ayd;
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            if (this.f4974a.f4976a.m6500a((Map) map)) {
                this.f4974a.f4976a.m6503b((Map) map);
            }
        }
    }

    /* renamed from: ayd$8 */
    class C08998 implements bcy {
        /* renamed from: a */
        final /* synthetic */ ayd f4975a;

        C08998(ayd ayd) {
            this.f4975a = ayd;
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            if (this.f4975a.f4976a.m6500a((Map) map)) {
                bcx.f5608p.mo277a(blo, map);
            }
        }
    }

    public ayd(aya aya, bee bee) {
        this.f4976a = aya;
        this.f4977b = bee.m7834a();
        this.f4977b.mo1032a(new C08911(this), new C08932(this));
        String str = "Core JS tracking ad unit: ";
        String valueOf = String.valueOf(this.f4976a.m6520r().m6445d());
        bky.m9006b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    void m6547a(bef bef) {
        bef.mo1023a("/updateActiveView", this.f4979d);
        bef.mo1023a("/untrackActiveViewUnit", this.f4980e);
        bef.mo1023a("/visibilityChanged", this.f4981f);
        if (ako.m2336D().m8879a()) {
            bef.mo1023a("/logScionEvent", this.f4982g);
        }
    }

    /* renamed from: a */
    public void mo849a(final JSONObject jSONObject, boolean z) {
        this.f4977b.mo1032a(new C0242c<bef>(this) {
            /* renamed from: a */
            public void m6537a(bef bef) {
                bef.mo1025a("AFMA_updateActiveView", jSONObject);
            }

            /* renamed from: a */
            public /* synthetic */ void mo289a(Object obj) {
                m6537a((bef) obj);
            }
        }, new C1318b());
    }

    /* renamed from: a */
    public boolean mo850a() {
        return this.f4978c;
    }

    /* renamed from: b */
    public void mo851b() {
        this.f4977b.mo1032a(new C08954(this), new C1318b());
        this.f4977b.j_();
    }

    /* renamed from: b */
    void m6551b(bef bef) {
        bef.mo1028b("/visibilityChanged", this.f4981f);
        bef.mo1028b("/untrackActiveViewUnit", this.f4980e);
        bef.mo1028b("/updateActiveView", this.f4979d);
        if (ako.m2336D().m8879a()) {
            bef.mo1028b("/logScionEvent", this.f4982g);
        }
    }
}
