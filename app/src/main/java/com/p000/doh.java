package com.p000;

/* compiled from: SqlUtils */
/* renamed from: doh */
public class doh {
    /* renamed from: a */
    private static final char[] f22408a = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public static StringBuilder m28425a(StringBuilder stringBuilder, String str, dnz dnz) {
        if (str != null) {
            stringBuilder.append(str).append('.');
        }
        stringBuilder.append('\"').append(dnz.f22370e).append('\"');
        return stringBuilder;
    }

    /* renamed from: a */
    public static StringBuilder m28424a(StringBuilder stringBuilder, String str) {
        stringBuilder.append('\"').append(str).append('\"');
        return stringBuilder;
    }

    /* renamed from: a */
    public static StringBuilder m28426a(StringBuilder stringBuilder, String str, String str2) {
        stringBuilder.append(str).append(".\"").append(str2).append('\"');
        return stringBuilder;
    }

    /* renamed from: a */
    public static StringBuilder m28427a(StringBuilder stringBuilder, String str, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            doh.m28426a(stringBuilder, str, strArr[i]);
            if (i < length - 1) {
                stringBuilder.append(',');
            }
        }
        return stringBuilder;
    }

    /* renamed from: a */
    public static StringBuilder m28428a(StringBuilder stringBuilder, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            stringBuilder.append('\"').append(strArr[i]).append('\"');
            if (i < length - 1) {
                stringBuilder.append(',');
            }
        }
        return stringBuilder;
    }

    /* renamed from: a */
    public static StringBuilder m28423a(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < i - 1) {
                stringBuilder.append("?,");
            } else {
                stringBuilder.append('?');
            }
        }
        return stringBuilder;
    }

    /* renamed from: b */
    public static StringBuilder m28430b(StringBuilder stringBuilder, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            doh.m28424a(stringBuilder, strArr[i]).append("=?");
            if (i < strArr.length - 1) {
                stringBuilder.append(',');
            }
        }
        return stringBuilder;
    }

    /* renamed from: b */
    public static StringBuilder m28429b(StringBuilder stringBuilder, String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            doh.m28426a(stringBuilder, str, strArr[i]).append("=?");
            if (i < strArr.length - 1) {
                stringBuilder.append(',');
            }
        }
        return stringBuilder;
    }

    /* renamed from: a */
    public static String m28419a(String str, String str2, String[] strArr) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append('\"').append(str2).append('\"').append(" (");
        doh.m28428a(stringBuilder, strArr);
        stringBuilder.append(") VALUES (");
        doh.m28423a(stringBuilder, strArr.length);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m28420a(String str, String str2, String[] strArr, boolean z) {
        if (str2 == null || str2.length() < 0) {
            throw new dnw("Table alias required");
        }
        StringBuilder stringBuilder = new StringBuilder(z ? "SELECT DISTINCT " : "SELECT ");
        doh.m28427a(stringBuilder, str2, strArr).append(" FROM ");
        stringBuilder.append('\"').append(str).append('\"').append(' ').append(str2).append(' ');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m28418a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder("SELECT COUNT(*) FROM ");
        stringBuilder.append('\"').append(str).append('\"').append(' ');
        if (str2 != null) {
            stringBuilder.append(str2).append(' ');
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m28421a(String str, String[] strArr) {
        String str2 = '\"' + str + '\"';
        StringBuilder stringBuilder = new StringBuilder("DELETE FROM ");
        stringBuilder.append(str2);
        if (strArr != null && strArr.length > 0) {
            stringBuilder.append(" WHERE ");
            doh.m28429b(stringBuilder, str2, strArr);
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m28422a(String str, String[] strArr, String[] strArr2) {
        String str2 = '\"' + str + '\"';
        StringBuilder stringBuilder = new StringBuilder("UPDATE ");
        stringBuilder.append(str2).append(" SET ");
        doh.m28430b(stringBuilder, strArr);
        stringBuilder.append(" WHERE ");
        doh.m28429b(stringBuilder, str2, strArr2);
        return stringBuilder.toString();
    }
}
