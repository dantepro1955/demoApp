package com.p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: VoteAppDBHelper */
/* renamed from: cvx */
public class cvx extends SQLiteOpenHelper {
    public cvx(Context context) {
        super(context, "9gagtv.sqlite", null, 5);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE 'OPTION' ('_id' INTEGER PRIMARY KEY ,'KEY' TEXT,'VALUE' TEXT);");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: a */
    public void m25160a() {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.execSQL("DROP TABLE IF EXISTS 'POST'");
            writableDatabase.execSQL("DROP TABLE IF EXISTS 'POST_LIST'");
            writableDatabase.execSQL("DROP TABLE IF EXISTS 'POST_LIST_ITEM'");
            writableDatabase.execSQL("DROP TABLE IF EXISTS 'POST_VIDEO'");
            writableDatabase.execSQL("CREATE TABLE 'POST' ('_id' INTEGER PRIMARY KEY ,'POST_ID' TEXT,'TITLE' TEXT,'DESCRIPTION' TEXT,'OG_TITLE' TEXT,'OG_DESCRIPTION' TEXT,'CREATED' INTEGER,'CONTENT' TEXT,'URL' TEXT,'SHORTEN_URL' TEXT,'TYPE' INTEGER,'LOCAL_SCORE' INTEGER,'EMBED_URL' TEXT,'NSFW' INTEGER,'SOCIAL_EXTERNAL_VIEWS' INTEGER,'SOCIAL_TWEETS' INTEGER,'SOCIAL_FB_LIKES' INTEGER,'SOCIAL_FB_SHARES' INTEGER,'THUMBNAIL720W' TEXT,'THUMBNAIL480W' TEXT,'THUMBNAIL360W' TEXT,'THUMBNAIL240W' TEXT);");
            writableDatabase.execSQL("CREATE INDEX IDX_POST_POST_ID ON POST (POST_ID);");
            writableDatabase.execSQL("CREATE TABLE 'POST_LIST' ('_id' INTEGER PRIMARY KEY ,'NAME' TEXT,'LIST_KEY' TEXT,'NEXT_OFFSET' TEXT,'HAS_NEXT' INTEGER,'SORT_ORDER' INTEGER);");
            writableDatabase.execSQL("CREATE INDEX IDX_POST_LIST_LIST_KEY ON POST_LIST (LIST_KEY);");
            writableDatabase.execSQL("CREATE TABLE 'POST_LIST_ITEM' ('_id' INTEGER PRIMARY KEY ,'POST_DBID' INTEGER,'LIST_KEY' TEXT,'POST_ID' TEXT,'UPDATE_TIME' INTEGER);");
            writableDatabase.execSQL("CREATE INDEX IDX_POST_LIST_ITEM_LIST_KEY ON POST_LIST_ITEM (LIST_KEY);");
            writableDatabase.execSQL("CREATE TABLE 'POST_VIDEO' ('_id' INTEGER PRIMARY KEY ,'TYPE' INTEGER,'VIDEO_ID' TEXT,'EXTERNAL_ID' TEXT,'DURATION' INTEGER,'START_TIME' INTEGER,'END_TIME' INTEGER,'POST_ID' TEXT);");
            writableDatabase.execSQL("CREATE INDEX IDX_POST_VIDEO_POST_ID ON POST_VIDEO (POST_ID);");
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }
}
