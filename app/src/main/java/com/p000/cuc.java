package com.p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: UploadDatabase */
/* renamed from: cuc */
public class cuc extends SQLiteOpenHelper {
    public cuc(Context context) {
        super(context, "9gag_upload.db", null, 3);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m24989b(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: a */
    public void m24990a() {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            m24988a(writableDatabase);
            m24989b(writableDatabase);
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* renamed from: a */
    private void m24988a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS entries");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS metas");
    }

    /* renamed from: b */
    private void m24989b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE metas (_id INTEGER PRIMARY KEY AUTOINCREMENT, upload_id TEXT, key TEXT, value TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE entries (_id INTEGER PRIMARY KEY AUTOINCREMENT, upload_id TEXT, post_id TEXT, media_status INTEGER, meta_status INTEGER, status INTEGER, tmp_path TEXT, error_message TEXT);");
    }
}
