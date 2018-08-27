package com.p000;

import com.under9.android.comments.model.CommentDao;

/* compiled from: MetricsController */
/* renamed from: ddc */
public class ddc {
    /* renamed from: a */
    public static void m26569a(String str) {
        ddc.m26572a("COMMENT_NULL_PROBLEM", CommentDao.TABLENAME, str);
    }

    /* renamed from: b */
    public static void m26573b(String str) {
        ddc.m26572a("COMMENT_ADD_PROBLEM", CommentDao.TABLENAME, str);
    }

    /* renamed from: a */
    public static void m26571a(String str, String str2) {
        ddc.m26572a("UNEXPECTED_DATA_TYPE", "API_ERRORS", str + "\n" + str2);
    }

    /* renamed from: c */
    public static void m26574c(String str) {
        ddc.m26572a("UNEXPECTED_DATA_TYPE", "API_ERRORS", "Not a valid JSON Object\n" + str);
    }

    /* renamed from: d */
    public static void m26575d(String str) {
        ddc.m26572a("NO_QUOTA", "API_ERRORS", str);
    }

    /* renamed from: e */
    public static void m26576e(String str) {
        ddc.m26570a("USER_ACTIONS" + (".comment_system." + str), 1);
    }

    /* renamed from: a */
    private static void m26570a(String str, int i) {
        dfz e = dct.m26395a().m26409e();
        if (e != null) {
            e.logCount(str, i);
        }
    }

    /* renamed from: a */
    private static void m26572a(String str, String str2, String str3) {
        dfz e = dct.m26395a().m26409e();
        if (e != null) {
            e.log(str, str2, str3);
        }
    }
}
