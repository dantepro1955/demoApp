package com.p000;

import com.facebook.internal.AnalyticsEvents;

/* compiled from: MimeTypes */
/* renamed from: ahg */
public final class ahg {
    /* renamed from: a */
    public static boolean m1531a(String str) {
        return ahg.m1533c(str).equals("audio");
    }

    /* renamed from: b */
    public static boolean m1532b(String str) {
        return ahg.m1533c(str).equals(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
    }

    /* renamed from: c */
    private static String m1533c(String str) {
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: " + str);
    }
}
