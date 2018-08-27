package com.p000;

/* compiled from: OptionValidator */
/* renamed from: dst */
class dst {
    /* renamed from: a */
    static void m29185a(String str) throws IllegalArgumentException {
        int i = 0;
        if (str != null) {
            if (str.length() == 1) {
                char charAt = str.charAt(0);
                if (!dst.m29186a(charAt)) {
                    throw new IllegalArgumentException(new StringBuffer().append("illegal option value '").append(charAt).append("'").toString());
                }
                return;
            }
            char[] toCharArray = str.toCharArray();
            while (i < toCharArray.length) {
                if (dst.m29187b(toCharArray[i])) {
                    i++;
                } else {
                    throw new IllegalArgumentException(new StringBuffer().append("opt contains illegal character value '").append(toCharArray[i]).append("'").toString());
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m29186a(char c) {
        return dst.m29187b(c) || c == ' ' || c == '?' || c == '@';
    }

    /* renamed from: b */
    private static boolean m29187b(char c) {
        return Character.isJavaIdentifierPart(c);
    }
}
