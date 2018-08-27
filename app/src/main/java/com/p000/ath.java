package com.p000;

import android.util.Log;

/* renamed from: ath */
public class ath {
    /* renamed from: a */
    private final String f4324a;
    /* renamed from: b */
    private final String f4325b;
    /* renamed from: c */
    private final apd f4326c;
    /* renamed from: d */
    private final int f4327d;

    private ath(String str, String str2) {
        this.f4325b = str2;
        this.f4324a = str;
        this.f4326c = new apd(str);
        this.f4327d = m5594a();
    }

    public ath(String str, String... strArr) {
        this(str, ath.m5595a(strArr));
    }

    /* renamed from: a */
    private int m5594a() {
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f4324a, i)) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    private static String m5595a(String... strArr) {
        if (strArr.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (String str : strArr) {
            if (stringBuilder.length() > 1) {
                stringBuilder.append(",");
            }
            stringBuilder.append(str);
        }
        stringBuilder.append(']').append(' ');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void m5596a(String str, Object... objArr) {
        if (m5597a(3)) {
            Log.d(this.f4324a, m5600d(str, objArr));
        }
    }

    /* renamed from: a */
    public boolean m5597a(int i) {
        return this.f4327d <= i;
    }

    /* renamed from: b */
    public void m5598b(String str, Object... objArr) {
        Log.i(this.f4324a, m5600d(str, objArr));
    }

    /* renamed from: c */
    public void m5599c(String str, Object... objArr) {
        Log.w(this.f4324a, m5600d(str, objArr));
    }

    /* renamed from: d */
    protected String m5600d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(str, objArr);
        }
        return this.f4325b.concat(str);
    }
}
