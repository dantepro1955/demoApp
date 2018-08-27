package com.p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;
import p000.cua.C4599b;
import p000.cua.C4600c;

/* compiled from: UploadDatabaseQuery */
/* renamed from: cud */
public class cud {
    /* renamed from: a */
    private static String[] f20249a = new String[]{AnalyticsSQLiteHelper.GENERAL_ID};

    /* renamed from: a */
    public static Cursor m24992a(SQLiteDatabase sQLiteDatabase, String str) {
        String[] strArr = C4599b.f20246b;
        ctl ctl = new ctl();
        ctl.m24883a(C4600c.f20248b);
        ctl.m24884a("upload_id = ?", str);
        return ctl.m24882a(sQLiteDatabase, strArr, null, null, null, null);
    }

    /* renamed from: a */
    public static Cursor m24991a(SQLiteDatabase sQLiteDatabase) {
        String[] strArr = C4599b.f20246b;
        ctl ctl = new ctl();
        ctl.m24883a(C4600c.f20248b);
        return ctl.m24882a(sQLiteDatabase, strArr, null, null, null, null);
    }

    /* renamed from: b */
    public static Cursor m24997b(SQLiteDatabase sQLiteDatabase, String str) {
        String[] strArr = C4599b.f20245a;
        ctl ctl = new ctl();
        ctl.m24883a(C4600c.f20247a);
        ctl.m24884a("upload_id = ?", str);
        return ctl.m24882a(sQLiteDatabase, strArr, null, null, null, null);
    }

    /* renamed from: a */
    public static Cursor m24993a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        String[] strArr = C4599b.f20245a;
        ctl ctl = new ctl();
        String format = String.format("%s = ? and %s = ?", new Object[]{"upload_id", "key"});
        ctl.m24883a(C4600c.f20247a);
        ctl.m24884a(format, str, str2);
        return ctl.m24882a(sQLiteDatabase, strArr, null, null, null, null);
    }

    /* renamed from: a */
    public static void m24994a(SQLiteDatabase sQLiteDatabase, cus cus) {
        ContentValues a = cub.m24986a(null, cus);
        if (cud.m25000e(sQLiteDatabase, cus.f20259b) != -1) {
            sQLiteDatabase.update(C4600c.f20248b, a, "upload_id = ?", new String[]{cus.f20259b});
            return;
        }
        sQLiteDatabase.insert(C4600c.f20248b, null, a);
    }

    /* renamed from: a */
    public static void m24995a(SQLiteDatabase sQLiteDatabase, cut cut) {
        ContentValues a = cub.m24987a(null, cut);
        if (cud.m24996b(sQLiteDatabase, cut.f20268b, cut.f20269c) != -1) {
            sQLiteDatabase.update(C4600c.f20247a, a, "upload_id = ? and key = ?", new String[]{cut.f20268b, cut.f20269c});
            return;
        }
        sQLiteDatabase.insert(C4600c.f20247a, null, a);
    }

    /* renamed from: c */
    public static void m24998c(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete(C4600c.f20248b, "upload_id = ?", new String[]{str});
    }

    /* renamed from: d */
    public static void m24999d(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete(C4600c.f20247a, "upload_id = ?", new String[]{str});
    }

    /* renamed from: e */
    public static long m25000e(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query(C4600c.f20248b, f20249a, "upload_id = ?", new String[]{str}, null, null, null);
        if (query.moveToFirst()) {
            return query.getLong(0);
        }
        return -1;
    }

    /* renamed from: b */
    public static long m24996b(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query(C4600c.f20247a, f20249a, "upload_id = ? and key = ?", new String[]{str, str2}, null, null, null);
        if (query.moveToFirst()) {
            return query.getLong(0);
        }
        return -1;
    }
}
