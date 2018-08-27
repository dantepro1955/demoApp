package com.p000;

import java.util.HashSet;

/* compiled from: GagNotifConfig */
/* renamed from: cll */
public class cll extends dga {
    /* renamed from: a */
    private static caf f9672a = caf.m12046a();
    /* renamed from: c */
    private static final HashSet<String> f9673c = new HashSet();
    /* renamed from: b */
    private String f9674b;

    static {
        f9673c.add("MILESTONE_POST_UPVOTE");
        f9673c.add("MILESTONE_POST_COMMENT");
        f9673c.add("MILESTONE_COMMENT_REPLY");
        f9673c.add("MILESTONE_COMMENT_UPVOTE");
    }

    public cll(String str) {
        this.f9674b = str;
    }

    /* renamed from: a */
    public static boolean m14303a(String str) {
        return f9673c.contains(str);
    }

    /* renamed from: a */
    public boolean m14305a() {
        return false;
    }

    /* renamed from: b */
    public String m14306b() {
        return cip.m13967a().bc();
    }

    /* renamed from: c */
    public String m14307c() {
        return "http://notif.9gag.com";
    }

    /* renamed from: d */
    public String m14308d() {
        return f9672a.m12068d().f8410g;
    }

    /* renamed from: a */
    public dft m14304a(dft dft) {
        cpm.a(dft);
        return dft;
    }
}
