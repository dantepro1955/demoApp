package com.p000;

import com.under9.android.lib.network.model.Constants;

/* compiled from: UriHandler */
/* renamed from: dma */
public class dma {
    /* renamed from: a */
    public static String f22152a = "post";
    /* renamed from: b */
    public static String f22153b = "mp4";
    /* renamed from: c */
    public static String f22154c = "tile";

    /* renamed from: a */
    public static String m27960a(String str) {
        int indexOf = str.indexOf(Constants.SCHEME_SEP);
        if (indexOf == -1) {
            return "";
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: b */
    public static String m27961b(String str) {
        String a = dma.m27960a(str);
        int lastIndexOf = a.lastIndexOf("-");
        if (lastIndexOf == -1) {
            return a;
        }
        return a.substring(0, lastIndexOf);
    }
}
