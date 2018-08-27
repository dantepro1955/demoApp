package com.p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: DatabaseHelper */
/* renamed from: ddf */
public class ddf extends SQLiteOpenHelper {
    public ddf(Context context, String str) {
        super(context, str, null, 17);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        onUpgrade(sQLiteDatabase, 0, 17);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: a */
    public void m26584a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'COMMENT'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'COMMENT_LIST_ITEM'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'PENDING_COMMENT_LIST_ITEM'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'USER'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'PRELOAD_COMMENTS'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'COMMENT_META'");
            sQLiteDatabase.execSQL("CREATE TABLE 'COMMENT' ('_id' INTEGER PRIMARY KEY AUTOINCREMENT ,'URL' TEXT,'COMMENT_ID' TEXT,'NESTING_LEVEL' INTEGER,'STATUS' INTEGER,'COMMENT_TEXT' TEXT,'TIMESTAMP' INTEGER,'LIKE_COUNT' INTEGER,'DISLIKE_COUNT' INTEGER,'COIN_COUNT' INTEGER,'IS_LIKE' INTEGER,'CHILDREN_TOTAL' INTEGER,'IS_ANONYMOUS' INTEGER,'IS_COLLAPSED' INTEGER,'HAS_NEXT' INTEGER,'PARENT_COMMENT_ID' TEXT,'MENTION_MAPPING' TEXT,'PERMALINK' TEXT,'TYPE' INTEGER,'EMBED_MEDIA_META' TEXT,'MEDIA' TEXT,'MEDIA_TEXT' TEXT,'IS_URL' INTEGER,'RICHTEXT' TEXT,'SUPP_DATA' TEXT,'_USER_ID' INTEGER,'_PARENT_COMMENT_ID' INTEGER,'OP_CLIENT_ID' TEXT,'OP_SIGNATURE' TEXT,'COMMENT_LABEL' TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE 'COMMENT_LIST_ITEM' ('_id' INTEGER PRIMARY KEY AUTOINCREMENT ,'SORTING_TYPE' INTEGER,'URL' TEXT,'ORDER_KEY' TEXT,'COMMENT_ID' TEXT,'LFT' INTEGER,'RGT' INTEGER,'_COMMENT_ID' INTEGER);");
            sQLiteDatabase.execSQL("CREATE TABLE 'PENDING_COMMENT_LIST_ITEM' ('_id' INTEGER PRIMARY KEY AUTOINCREMENT ,'SORTING_TYPE' INTEGER,'AFTER' INTEGER,'STATUS' INTEGER,'URL' TEXT,'CREATE_TIME' INTEGER,'_COMMENT_ID' INTEGER,'OP_CLIENT_ID' TEXT,'OP_SIGNATURE' TEXT,'SOURCE_META_JSON' TEXT,'SOURCE_META_HASH' TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE 'USER' ('_id' INTEGER PRIMARY KEY AUTOINCREMENT ,'USER_ID' TEXT,'AVATAR_URL' TEXT,'DISPLAY_NAME' TEXT,'PROFILE_URL' TEXT,'PROFILE_URLS' TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE 'PRELOAD_COMMENTS' ('_id' INTEGER PRIMARY KEY AUTOINCREMENT ,'URL' TEXT,'ORDER' INTEGER,'RAW' TEXT,'TIMESTAMP' INTEGER);");
            sQLiteDatabase.execSQL("CREATE TABLE 'COMMENT_META' ('_id' INTEGER PRIMARY KEY AUTOINCREMENT ,'URL' TEXT,'LIVE_COMMENT_URL' TEXT);");
            sQLiteDatabase.execSQL("CREATE INDEX IDX_COMMENT_META_URL ON COMMENT_META (URL);");
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
