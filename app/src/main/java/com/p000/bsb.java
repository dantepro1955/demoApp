package com.p000;

import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import p000.att.C0806a;

/* renamed from: bsb */
class bsb {
    /* renamed from: a */
    private static brm<C0806a> m10595a(brm<C0806a> brm) {
        try {
            return new brm(brz.m10590c(bsb.m10598a(brz.m10586a((C0806a) brm.m10537a()))), brm.m10538b());
        } catch (Throwable e) {
            brd.m10494a("Escape URI: unsupported encoding", e);
            return brm;
        }
    }

    /* renamed from: a */
    private static brm<C0806a> m10596a(brm<C0806a> brm, int i) {
        if (bsb.m10599a((C0806a) brm.m10537a())) {
            switch (i) {
                case 12:
                    return bsb.m10595a((brm) brm);
                default:
                    brd.m10493a("Unsupported Value Escaping: " + i);
                    return brm;
            }
        }
        brd.m10493a("Escaping can only be applied to strings.");
        return brm;
    }

    /* renamed from: a */
    static brm<C0806a> m10597a(brm<C0806a> brm, int... iArr) {
        brm a;
        for (int a2 : iArr) {
            a = bsb.m10596a(a, a2);
        }
        return a;
    }

    /* renamed from: a */
    static String m10598a(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, Utf8Charset.NAME).replaceAll("\\+", "%20");
    }

    /* renamed from: a */
    private static boolean m10599a(C0806a c0806a) {
        return brz.m10591c(c0806a) instanceof String;
    }
}
