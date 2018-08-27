package com.p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: BadgeCountUpdater */
/* renamed from: dam */
class dam {
    /* renamed from: a */
    static void m26048a(SQLiteDatabase sQLiteDatabase, Context context) {
        Object obj = 1;
        try {
            if ("DISABLE".equals(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("com.onesignal.BadgeCount"))) {
                obj = null;
            }
        } catch (Throwable th) {
            dat.a(dat$c.ERROR, "", th);
        }
        if (obj != null) {
            Cursor query = sQLiteDatabase.query("notification", null, "dismissed = 0 AND opened = 0 AND is_summary = 0 ", null, null, null, null);
            dam.m26047a(query.getCount(), context);
            query.close();
        }
    }

    /* renamed from: a */
    private static void m26047a(int i, Context context) {
        dbf.m26211a(context, i);
    }
}
