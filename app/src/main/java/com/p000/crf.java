package com.p000;

/* compiled from: AdUtils */
/* renamed from: crf */
public final class crf {

    /* compiled from: AdUtils */
    /* renamed from: crf$a */
    static class C4533a {
        /* renamed from: a */
        public final dmm f20000a;
        /* renamed from: b */
        public final buk f20001b;

        public C4533a(dmm dmm) {
            this.f20000a = dmm;
            this.f20001b = null;
        }

        public C4533a(buk buk) {
            this.f20000a = null;
            this.f20001b = buk;
        }
    }

    /* renamed from: a */
    public static boolean m24565a() {
        if (caf.a().h().aI() || !caf.a().q().v()) {
            return false;
        }
        boolean z;
        crn crn = (crn) crj.m24578b(crn.class);
        if (crn == null || crn.m24598c().intValue() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return true;
        }
        if (caf.a().x().c()) {
            caf.a().h().c(false);
        }
        if (caf.a().h().B()) {
            return System.currentTimeMillis() > caf.a().h().aX() + (((long) crn.m24598c().intValue()) * 86400000);
        } else {
            return true;
        }
    }

    /* renamed from: b */
    public static String m24568b() {
        cro cro = (cro) crj.m24578b(cro.class);
        Object obj = (cro == null || cro.m24606c().intValue() != 1) ? null : 1;
        return obj != null ? "8d94405833154ebe9def4fc47e90a696" : "babdb6ec2fb946e495775f1f34b3878b";
    }

    /* renamed from: a */
    public static dmm m24563a(dmm dmm, buh buh, buh buh2) {
        C4533a a;
        C4533a a2 = crf.m24560a(buh2, "post_default", "post_top");
        if (a2 == null) {
            a = crf.m24560a(buh, "post_default", "post_top");
        } else {
            a = a2;
        }
        buk buk = null;
        if (a != null) {
            if (a.f20000a != null) {
                return a.f20000a;
            }
            buk = a.f20001b;
        }
        dmm a3 = crf.m24562a(buk);
        if (a3 != null) {
            return a3;
        }
        return dmm;
    }

    /* renamed from: b */
    public static dmm m24566b(dmm dmm, buh buh, buh buh2) {
        C4533a a;
        C4533a a2 = crf.m24560a(buh2, "comment_default", "comment_top");
        if (a2 == null) {
            a = crf.m24560a(buh, "comment_default", "comment_top");
        } else {
            a = a2;
        }
        buk buk = null;
        if (a != null) {
            if (a.f20000a != null) {
                return a.f20000a;
            }
            buk = a.f20001b;
        }
        dmm a3 = crf.m24562a(buk);
        if (a3 != null) {
            return a3;
        }
        return dmm;
    }

    /* renamed from: a */
    public static dmm m24564a(dmm dmm, buh buh, String str) {
        C4533a a = crf.m24561a(buh, "list_", str, "inline_ad");
        if (a == null) {
            return dmm;
        }
        if (a.f20000a != null) {
            return a.f20000a;
        }
        dmm a2 = crf.m24562a(a.f20001b);
        if (a2 != null) {
            return a2;
        }
        return dmm;
    }

    /* renamed from: b */
    public static dmm m24567b(dmm dmm, buh buh, String str) {
        C4533a a = crf.m24561a(buh, "overlay_", str, "inline_ad");
        if (a == null) {
            return dmm;
        }
        if (a.f20000a != null) {
            return a.f20000a;
        }
        dmm a2 = crf.m24562a(a.f20001b);
        if (a2 != null) {
            return a2;
        }
        return dmm;
    }

    /* renamed from: a */
    private static C4533a m24561a(buh buh, String str, String str2, String str3) {
        String toLowerCase;
        if (str2 != null) {
            toLowerCase = str2.toLowerCase();
        } else {
            toLowerCase = str2;
        }
        if (str3 != null) {
            str3 = str3.toLowerCase();
        }
        try {
            C4533a a = crf.m24560a(buh, str + toLowerCase, str3);
            if (a != null) {
                return a;
            }
            String substring;
            if (toLowerCase.startsWith("_")) {
                substring = toLowerCase.substring(1);
            } else {
                substring = toLowerCase;
            }
            if (substring.endsWith("_")) {
                toLowerCase = substring.substring(0, substring.length() - 1);
            } else {
                toLowerCase = substring;
            }
            if (toLowerCase.contains("_")) {
                a = crf.m24560a(buh, str + "section_" + toLowerCase.substring(toLowerCase.indexOf("_") + 1), str3);
                if (a != null) {
                    return a;
                }
                a = crf.m24560a(buh, str + toLowerCase.substring(0, toLowerCase.indexOf("_")), str3);
                if (a != null) {
                    return a;
                }
                a = crf.m24560a(buh, str + toLowerCase.substring(toLowerCase.indexOf("_") + 1), str3);
                if (a != null) {
                    return a;
                }
            }
            return crf.m24560a(buh, str + "default", str3);
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    private static C4533a m24560a(buh buh, String str, String str2) {
        if (str != null) {
            str = str.toLowerCase();
        }
        if (str2 != null) {
            str2 = str2.toLowerCase();
        }
        if (buh == null) {
            return null;
        }
        try {
            buk l = buh.l();
            l = l.a(str) ? l.b(str).l() : null;
            if (l == null) {
                return null;
            }
            if (!l.b("displayAdEnabled").g()) {
                return new C4533a(new dmm(null, false, null));
            }
            if (!l.a("placements")) {
                return null;
            }
            buk l2 = l.b("placements").l();
            if (l2.a(str2)) {
                return new C4533a(l2.b(str2).l());
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    private static dmm m24562a(buk buk) {
        String str = null;
        String g = caf.a().p().g();
        if (buk == null) {
            return null;
        }
        buh b;
        if (buk.a(g) || !buk.a("ALL")) {
            b = buk.a(g) ? buk.b(g) : buk.a("ALL") ? buk.b("ALL") : null;
        } else {
            b = buk.b("ALL");
            if (b != null) {
                buk l = b.l();
                if (l.a("excludeCountry") && l.b("excludeCountry").l().a(g)) {
                    return new dmm(null, false, null);
                }
            }
        }
        if (b == null) {
            return null;
        }
        buk l2 = b.l();
        String c = l2.b("adTag").c();
        if (l2.a("occurrence")) {
            str = l2.b("occurrence").c();
        }
        return new dmm(c, true, str);
    }
}
