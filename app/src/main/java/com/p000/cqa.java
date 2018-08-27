package com.p000;

import com.flurry.android.AdCreative;
import java.util.HashMap;

/* compiled from: ListTypeHelper */
/* renamed from: cqa */
public class cqa {
    /* renamed from: a */
    private static HashMap<String, Integer> f19955a;

    static {
        f19955a = new HashMap();
        f19955a = new cpz("hot", Integer.valueOf(1), "trending", Integer.valueOf(2), "vote", Integer.valueOf(3), "upvote", Integer.valueOf(7), "upload", Integer.valueOf(6), "hotplustrending", Integer.valueOf(9), "comment", Integer.valueOf(11), "overview", Integer.valueOf(10), "search", Integer.valueOf(12), AdCreative.kAlignmentTop, Integer.valueOf(14), "sectionhot", Integer.valueOf(15)).m24355a();
    }

    /* renamed from: a */
    public static String m24360a(int i) {
        if (i == 1) {
            return "hot";
        }
        if (i == 2) {
            return "trending";
        }
        if (i == 3) {
            return "vote";
        }
        if (i == 7) {
            return "upvote";
        }
        if (i == 6) {
            return "upload";
        }
        if (i == 9) {
            return "hotplustrending";
        }
        if (i == 11) {
            return "comment";
        }
        if (i == 10) {
            return "overview";
        }
        if (i == 12) {
            return "search";
        }
        if (i == 14) {
            return AdCreative.kAlignmentTop;
        }
        if (i == 15) {
            return "sectionhot";
        }
        return null;
    }

    /* renamed from: a */
    public static int m24359a(String str) {
        if (str == null) {
            return 1;
        }
        Integer num = (Integer) f19955a.get(str.toLowerCase());
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }
}
