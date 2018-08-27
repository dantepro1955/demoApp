package com.p000;

/* compiled from: Util */
/* renamed from: dsy */
class dsy {
    /* renamed from: a */
    static String m29194a(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("--")) {
            return str.substring(2, str.length());
        }
        if (str.startsWith("-")) {
            return str.substring(1, str.length());
        }
        return str;
    }

    /* renamed from: b */
    static String m29195b(String str) {
        if (str.startsWith("\"")) {
            str = str.substring(1, str.length());
        }
        if (str.endsWith("\"")) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }
}
