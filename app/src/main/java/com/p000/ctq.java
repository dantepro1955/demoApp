package com.p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: DatabaseHelper */
/* renamed from: ctq */
public class ctq extends SQLiteOpenHelper {
    public ctq(Context context, String str) {
        super(context, str, null, 1);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m24918b(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 1) {
            m24917a(sQLiteDatabase);
            m24918b(sQLiteDatabase);
        }
    }

    /* renamed from: a */
    private void m24917a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'BREADCRUMB'");
    }

    /* renamed from: b */
    private void m24918b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS 'BREADCRUMB' ('_id' INTEGER PRIMARY KEY AUTOINCREMENT ,'SESSION_ID' TEXT,'MESSAGE' TEXT,'TIMESTAMP' INTEGER,'SENT' INTEGER);");
    }
}
