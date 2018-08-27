package com.p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.AccessToken;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;
import p000.cii.C1745b;
import p000.cii.C1746c;

/* compiled from: GagDatabaseQuery */
/* renamed from: cim */
public class cim {
    /* renamed from: a */
    private static String[] f9386a = new String[]{AnalyticsSQLiteHelper.GENERAL_ID};

    /* renamed from: a */
    public static Cursor m13787a(SQLiteDatabase sQLiteDatabase, String str) {
        ctl ctl = new ctl();
        ctl.a(C1746c.f9360m);
        ctl.a("g.post_id = ?", new String[]{str});
        return ctl.a(sQLiteDatabase, C1745b.f9346m, null, null, null, null);
    }

    /* renamed from: a */
    public static Cursor m13783a(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase.query(C1746c.f9348a, C1745b.f9334a, null, null, null, null, null);
    }

    /* renamed from: a */
    public static Cursor m13784a(SQLiteDatabase sQLiteDatabase, int i) {
        ctl ctl = new ctl();
        ctl.a(C1746c.f9352e);
        ctl.a("status = ?", new String[]{Integer.toString(i)});
        return ctl.a(sQLiteDatabase, C1745b.f9338e, null, null, null, null);
    }

    /* renamed from: b */
    public static Cursor m13795b(SQLiteDatabase sQLiteDatabase, int i) {
        ctl ctl = new ctl();
        ctl.a(C1746c.f9353f);
        ctl.a("status = ?", new String[]{Integer.toString(i)});
        return ctl.a(sQLiteDatabase, C1745b.f9339f, null, null, null, null);
    }

    /* renamed from: a */
    public static Cursor m13785a(SQLiteDatabase sQLiteDatabase, int i, int i2, int i3) {
        ctl ctl = new ctl();
        ctl.a(C1746c.f9358k);
        ctl.a("display_status = ?", new String[]{Integer.toString(i3)});
        String str = i + "," + i2;
        return ctl.a(sQLiteDatabase, C1745b.f9344k, null, null, "timestamp desc", str);
    }

    /* renamed from: a */
    public static Cursor m13786a(SQLiteDatabase sQLiteDatabase, long j) {
        ctl ctl = new ctl();
        ctl.a(C1746c.f9358k);
        ctl.a("_id = ?", new String[]{Long.toString(j)});
        return ctl.a(sQLiteDatabase, C1745b.f9344k, null, null, null, null);
    }

    /* renamed from: b */
    public static Cursor m13796b(SQLiteDatabase sQLiteDatabase, String str) {
        ctl ctl = new ctl();
        ctl.a(C1746c.f9351d);
        ctl.a("post_id = ?", new String[]{str});
        return ctl.a(sQLiteDatabase, C1745b.f9337d, null, null, null, null);
    }

    /* renamed from: c */
    public static Cursor m13799c(SQLiteDatabase sQLiteDatabase, String str) {
        ctl ctl = new ctl();
        ctl.a(C1746c.f9355h);
        ctl.a("post_id = ?", new String[]{str});
        return ctl.a(sQLiteDatabase, C1745b.f9341h, null, null, null, null);
    }

    /* renamed from: a */
    public static long m13780a(SQLiteDatabase sQLiteDatabase, ckj ckj) {
        String str = C1746c.f9351d;
        long d = cim.m13803d(sQLiteDatabase, ckj.f9537b);
        ContentValues a = cik.m13754a(ckj);
        if (d <= 0) {
            return sQLiteDatabase.insert(str, null, a);
        }
        sQLiteDatabase.update(str, a, "_id = ?", cim.m13793a(d));
        return d;
    }

    /* renamed from: a */
    public static long m13779a(SQLiteDatabase sQLiteDatabase, cki cki) {
        String str = C1746c.f9355h;
        long a = cim.m13782a(sQLiteDatabase, cki.f9534b, 0);
        ContentValues a2 = cik.m13753a(cki);
        if (a <= 0) {
            return sQLiteDatabase.insert(str, null, a2);
        }
        sQLiteDatabase.update(str, a2, "_id = ?", cim.m13793a(a));
        return a;
    }

    /* renamed from: c */
    public static void m13801c(SQLiteDatabase sQLiteDatabase, int i) {
        String str = C1746c.f9351d;
        String str2 = i + ",1";
        Cursor query = sQLiteDatabase.query(str, f9386a, null, null, null, null, "_id DESC", str2);
        if (query.moveToLast()) {
            long j = query.getLong(0);
            cim.m13788a(query);
            sQLiteDatabase.delete(str, "_id < ?", new String[]{"" + j});
            return;
        }
        cim.m13788a(query);
    }

    /* renamed from: b */
    public static void m13797b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete(C1746c.f9352e, String.format("%s = ?", new Object[]{AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS}), new String[]{Integer.toString(1)});
    }

    /* renamed from: c */
    public static void m13800c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete(C1746c.f9353f, String.format("%s = ?", new Object[]{AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS}), new String[]{Integer.toString(1)});
    }

    /* renamed from: a */
    public static long m13778a(SQLiteDatabase sQLiteDatabase, ckb ckb) {
        if (ckb == null) {
            return -1;
        }
        ckb.f9482E = cim.m13781a(sQLiteDatabase, ckb.f9479B);
        ContentValues a = cik.m13752a(ckb);
        String str = C1746c.f9350c;
        long f = cim.m13806f(sQLiteDatabase, ckb.f9492b);
        if (f <= 0) {
            return sQLiteDatabase.insert(str, null, a);
        }
        sQLiteDatabase.update(str, a, "_id = ?", cim.m13793a(f));
        return f;
    }

    /* renamed from: a */
    public static long m13781a(SQLiteDatabase sQLiteDatabase, ckr ckr) {
        String str = C1746c.f9349b;
        ContentValues a = cik.m13757a(ckr);
        long g = cim.m13808g(sQLiteDatabase, ckr.f9603b);
        if (g <= 0) {
            return sQLiteDatabase.insert(str, null, a);
        }
        sQLiteDatabase.update(str, a, "_id = ?", cim.m13793a(g));
        return g;
    }

    /* renamed from: a */
    public static void m13791a(SQLiteDatabase sQLiteDatabase, cks cks) {
        if (cks != null) {
            ContentValues a = cik.m13758a(cks);
            a.remove(AnalyticsSQLiteHelper.GENERAL_ID);
            if (cim.m13809h(sQLiteDatabase, cks.f9608b) == -1) {
                sQLiteDatabase.insert(C1746c.f9352e, null, a);
                return;
            }
            sQLiteDatabase.update(C1746c.f9352e, a, String.format("%s = ?", new Object[]{ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID}), new String[]{cks.f9608b});
        }
    }

    /* renamed from: a */
    public static void m13790a(SQLiteDatabase sQLiteDatabase, ckq ckq) {
        if (ckq != null) {
            ContentValues a = cik.m13756a(ckq);
            a.remove(AnalyticsSQLiteHelper.GENERAL_ID);
            if (cim.m13810i(sQLiteDatabase, ckq.f9599b) == -1) {
                sQLiteDatabase.insert(C1746c.f9353f, null, a);
                return;
            }
            sQLiteDatabase.update(C1746c.f9353f, a, String.format("%s = ?", new Object[]{ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID}), new String[]{ckq.f9599b});
        }
    }

    /* renamed from: a */
    public static void m13789a(SQLiteDatabase sQLiteDatabase, ckp ckp, boolean z) {
        if (ckp != null) {
            ContentValues a = cik.m13755a(ckp);
            a.remove(AnalyticsSQLiteHelper.GENERAL_ID);
            long k = cim.m13812k(sQLiteDatabase, ckp.f9592d);
            if (k == -1) {
                sQLiteDatabase.insert(C1746c.f9358k, null, a);
                return;
            }
            int i;
            if (z) {
                Cursor a2 = cim.m13786a(sQLiteDatabase, k);
                if (a2 == null || !a2.moveToFirst() || a2.getLong(a2.getColumnIndex("timestamp")) == ckp.f9595g) {
                    i = 0;
                } else {
                    i = 1;
                }
                cim.m13788a(a2);
            } else {
                i = 0;
            }
            if (i == 0) {
                a.remove("read_state");
            }
            sQLiteDatabase.update(C1746c.f9358k, a, String.format("%s = ?", new Object[]{"id"}), new String[]{ckp.f9592d});
        }
    }

    /* renamed from: a */
    public static int m13777a(SQLiteDatabase sQLiteDatabase, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("read_state", Integer.valueOf(i));
        return sQLiteDatabase.update(C1746c.f9358k, contentValues, String.format("%s = ?", new Object[]{"id"}), new String[]{str});
    }

    /* renamed from: a */
    public static int m13776a(SQLiteDatabase sQLiteDatabase, ckn ckn) {
        ContentValues contentValues = new ContentValues();
        cik.m13747a(contentValues, ckn);
        String f = cim.m13807f(sQLiteDatabase);
        String str = C1746c.f9348a;
        if (f == null) {
            sQLiteDatabase.insert(str, null, contentValues);
            return 1;
        } else if (f.equals(ckn.f9565b)) {
            return sQLiteDatabase.update(str, contentValues, null, null);
        } else {
            return sQLiteDatabase.update(str, contentValues, null, null);
        }
    }

    /* renamed from: b */
    public static int m13794b(SQLiteDatabase sQLiteDatabase, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, Integer.valueOf(i));
        return sQLiteDatabase.update(C1746c.f9352e, contentValues, String.format("%s = ?", new Object[]{ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID}), new String[]{str});
    }

    /* renamed from: c */
    public static int m13798c(SQLiteDatabase sQLiteDatabase, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, Integer.valueOf(i));
        return sQLiteDatabase.update(C1746c.f9353f, contentValues, String.format("%s = ?", new Object[]{ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID}), new String[]{str});
    }

    /* renamed from: d */
    public static int m13802d(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("select count(*) from " + C1746c.f9358k + " where " + "read_state" + "=" + ckp.f9590b, null);
        rawQuery.moveToFirst();
        int i = rawQuery.getInt(0);
        rawQuery.close();
        return i;
    }

    /* renamed from: e */
    public static Cursor m13804e(SQLiteDatabase sQLiteDatabase) {
        ctl ctl = new ctl();
        ctl.a(C1746c.f9357j);
        return ctl.a(sQLiteDatabase, C1745b.f9343j, null, null, null, null);
    }

    /* renamed from: a */
    public static void m13792a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        String str3 = C1746c.f9357j;
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put("value", str2);
        if (cim.m13811j(sQLiteDatabase, str) == -1) {
            sQLiteDatabase.insert(str3, null, contentValues);
            return;
        }
        sQLiteDatabase.update(str3, contentValues, "key = ?", new String[]{str});
    }

    /* renamed from: a */
    private static void m13788a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: d */
    public static long m13803d(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query(C1746c.f9351d, f9386a, String.format("%s = ?", new Object[]{ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID}), new String[]{str}, null, null, null);
        if (query.moveToFirst()) {
            long j = query.getLong(0);
            cim.m13788a(query);
            return j;
        }
        cim.m13788a(query);
        return -1;
    }

    /* renamed from: a */
    public static long m13782a(SQLiteDatabase sQLiteDatabase, String str, long j) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query(C1746c.f9355h, f9386a, String.format("%s = ? and %s > ?", new Object[]{ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, "fetch_time"}), new String[]{str, Long.toString(j)}, null, null, null);
        if (query.moveToFirst()) {
            long j2 = query.getLong(0);
            cim.m13788a(query);
            return j2;
        }
        cim.m13788a(query);
        return -1;
    }

    /* renamed from: f */
    private static long m13806f(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query(C1746c.f9350c, f9386a, String.format("%s = ?", new Object[]{ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID}), new String[]{str}, null, null, null);
        if (query.moveToFirst()) {
            long j = query.getLong(0);
            cim.m13788a(query);
            return j;
        }
        cim.m13788a(query);
        return -1;
    }

    /* renamed from: g */
    private static long m13808g(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query(C1746c.f9349b, f9386a, String.format("%s = ?", new Object[]{AccessToken.USER_ID_KEY}), new String[]{str}, null, null, null);
        if (query.moveToFirst()) {
            long j = query.getLong(0);
            cim.m13788a(query);
            return j;
        }
        cim.m13788a(query);
        return -1;
    }

    /* renamed from: f */
    private static String m13807f(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query(C1746c.f9348a, new String[]{AccessToken.USER_ID_KEY}, null, null, null, null, null);
        if (query.moveToFirst()) {
            String string = query.getString(0);
            cim.m13788a(query);
            return string;
        }
        cim.m13788a(query);
        return null;
    }

    /* renamed from: h */
    private static long m13809h(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query(C1746c.f9352e, f9386a, String.format("%s = ?", new Object[]{ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID}), new String[]{str}, null, null, null);
        if (query.moveToFirst()) {
            long j = query.getLong(0);
            cim.m13788a(query);
            return j;
        }
        cim.m13788a(query);
        return -1;
    }

    /* renamed from: i */
    private static long m13810i(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query(C1746c.f9353f, f9386a, String.format("%s = ?", new Object[]{ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID}), new String[]{str}, null, null, null);
        if (query.moveToFirst()) {
            long j = query.getLong(0);
            cim.m13788a(query);
            return j;
        }
        cim.m13788a(query);
        return -1;
    }

    /* renamed from: j */
    private static long m13811j(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query(C1746c.f9357j, f9386a, String.format("%s = ?", new Object[]{"key"}), new String[]{str}, null, null, null);
        if (query.moveToFirst()) {
            long j = query.getLong(0);
            cim.m13788a(query);
            return j;
        }
        cim.m13788a(query);
        return -1;
    }

    /* renamed from: k */
    private static long m13812k(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query(C1746c.f9358k, f9386a, String.format("%s = ?", new Object[]{"id"}), new String[]{str}, null, null, null);
        if (query.moveToFirst()) {
            long j = query.getLong(0);
            cim.m13788a(query);
            return j;
        }
        cim.m13788a(query);
        return -1;
    }

    /* renamed from: e */
    public static void m13805e(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete(str, null, null);
    }

    /* renamed from: a */
    private static String[] m13793a(long j) {
        return new String[]{Long.toString(j)};
    }
}
