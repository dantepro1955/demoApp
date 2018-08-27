package com.p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.facebook.appevents.AppEventsConstants;
import p000.cii.C1746c;

/* compiled from: GagDatabase */
/* renamed from: cil */
public class cil extends SQLiteOpenHelper {
    public cil(Context context) {
        super(context, "9gag.db", null, 47);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE account (_id INTEGER PRIMARY KEY AUTOINCREMENT, user_id TEXT, account_id TEXT, login_name TEXT, full_name TEXT, email TEXT, fb_user_id TEXT, fb_display_name TEXT, fb_account_name TEXT, gplus_user_id TEXT, gplus_display_name TEXT, gplus_account_name TEXT, can_post_to_fb INTEGER, fb_publish INTEGER, fb_timeline INTEGER, fb_like_action INTEGER, safeMode INTEGER, about TEXT, lang TEXT, location TEXT, timezone_gmt_offset TEXT, website TEXT, profile_url TEXT, avatar_url_medium TEXT, avatar_url_small TEXT, avatar_url_tiny TEXT, has_password INTEGER, gender TEXT, birthday TEXT, hide_upvote TEXT, permissions_json TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE options (_id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT, value TEXT);");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Throwable th;
        if (i < 15) {
            m13760p(sQLiteDatabase);
            m13762a(sQLiteDatabase);
        }
        if (i < 18) {
            m13763b(sQLiteDatabase);
        }
        if (i < 19) {
            m13764c(sQLiteDatabase);
        }
        if (i < 33) {
            m13765d(sQLiteDatabase);
        }
        if (i < 34) {
            m13766e(sQLiteDatabase);
        }
        if (i < 40) {
            m13767f(sQLiteDatabase);
        }
        if (i < 41) {
            m13768g(sQLiteDatabase);
        }
        if (i < 42) {
            m13769h(sQLiteDatabase);
        }
        if (i < 44) {
            m13770i(sQLiteDatabase);
        }
        if (i < 45) {
            m13771j(sQLiteDatabase);
        }
        if (i < 46) {
            Cursor query;
            try {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                query = sQLiteDatabase2.query("sqlite_master", new String[]{"name"}, "type = 'table' AND name = 'GAG_ITEM'", null, null, null, null);
                try {
                    Object obj;
                    if (query.moveToNext()) {
                        obj = null;
                    } else {
                        obj = 1;
                    }
                    if (query != null) {
                        query.close();
                    }
                    if (obj != null) {
                        m13759o(sQLiteDatabase);
                    } else {
                        m13772k(sQLiteDatabase);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                query = null;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
        if (i < 47) {
            m13773l(sQLiteDatabase);
        }
    }

    /* renamed from: o */
    private void m13759o(SQLiteDatabase sQLiteDatabase) {
        m13775n(sQLiteDatabase);
        m13762a(sQLiteDatabase);
        m13763b(sQLiteDatabase);
        m13764c(sQLiteDatabase);
        m13765d(sQLiteDatabase);
        m13766e(sQLiteDatabase);
        m13767f(sQLiteDatabase);
        m13768g(sQLiteDatabase);
        m13769h(sQLiteDatabase);
        m13770i(sQLiteDatabase);
    }

    /* renamed from: a */
    public void m13762a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE account (_id INTEGER PRIMARY KEY AUTOINCREMENT, user_id TEXT, login_name TEXT, full_name TEXT, email TEXT, fb_user_id TEXT, can_post_to_fb INTEGER, fb_publish INTEGER, fb_timeline INTEGER, fb_like_action INTEGER, safeMode INTEGER, about TEXT, lang TEXT, location TEXT, timezone_gmt_offset TEXT, website TEXT, profile_url TEXT, avatar_url_medium TEXT, avatar_url_small TEXT, avatar_url_tiny TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE options (_id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT, value TEXT);");
    }

    /* renamed from: b */
    public void m13763b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE account ADD COLUMN fb_display_name TEXT;");
        sQLiteDatabase.execSQL("ALTER TABLE account ADD COLUMN fb_account_name TEXT;");
        sQLiteDatabase.execSQL("ALTER TABLE account ADD COLUMN gplus_user_id TEXT;");
        sQLiteDatabase.execSQL("ALTER TABLE account ADD COLUMN gplus_display_name TEXT;");
        sQLiteDatabase.execSQL("ALTER TABLE account ADD COLUMN gplus_account_name TEXT;");
    }

    /* renamed from: c */
    public void m13764c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE account ADD COLUMN has_password INTEGER;");
    }

    /* renamed from: d */
    public void m13765d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE account ADD COLUMN gender TEXT;");
        sQLiteDatabase.execSQL("ALTER TABLE account ADD COLUMN birthday TEXT;");
    }

    /* renamed from: e */
    public void m13766e(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE account ADD COLUMN hide_upvote TEXT;");
    }

    /* renamed from: f */
    public void m13767f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE account ADD COLUMN permissions_json TEXT;");
    }

    /* renamed from: g */
    public void m13768g(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT VALUE FROM " + C1746c.f9357j + " WHERE KEY = ?", new String[]{"show_ad"});
        Cursor rawQuery2 = sQLiteDatabase.rawQuery("SELECT VALUE FROM " + C1746c.f9357j + " WHERE KEY = ?", new String[]{"hide_ads"});
        ContentValues contentValues = new ContentValues();
        if (!rawQuery.moveToFirst() || rawQuery2.moveToFirst()) {
            contentValues.put("key", "hide_ads");
            contentValues.put("value", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        } else {
            if (AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(rawQuery.getString(rawQuery.getColumnIndex("value")))) {
                contentValues.put("key", "hide_ads");
                contentValues.put("value", "1");
            } else {
                contentValues.put("key", "hide_ads");
                contentValues.put("value", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            }
        }
        sQLiteDatabase.insert(C1746c.f9357j, null, contentValues);
        rawQuery.close();
        rawQuery2.close();
    }

    /* renamed from: h */
    public void m13769h(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete(C1746c.f9357j, " KEY LIKE ? OR KEY LIKE ? OR KEY LIKE ? OR KEY LIKE ?", new String[]{"last_list_state_post_id_%", "last_list_state_orientation_%", "last_list_state_view_top_%", "last_list_state_scroll_offset_%"});
    }

    /* renamed from: i */
    public void m13770i(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE account ADD COLUMN account_id TEXT;");
    }

    /* renamed from: j */
    public void m13771j(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE GAG_ITEM Add COLUMN targeted_ad_tags TEXT;");
        sQLiteDatabase.execSQL("ALTER TABLE GAG_LIST Add COLUMN targeted_ad_tags TEXT;");
    }

    /* renamed from: k */
    public void m13772k(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE GAG_ITEM add COLUMN source_domain TEXT;");
        sQLiteDatabase.execSQL("ALTER TABLE GAG_ITEM add COLUMN source_url TEXT;");
    }

    /* renamed from: l */
    public void m13773l(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE GAG_ITEM Add COLUMN tags_json TEXT;");
    }

    /* renamed from: m */
    public void m13774m(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + C1746c.f9349b);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + C1746c.f9350c);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + C1746c.f9351d);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + C1746c.f9352e);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + C1746c.f9353f);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + C1746c.f9354g);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + C1746c.f9355h);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + C1746c.f9356i);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + C1746c.f9358k);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'FEATURED_ITEM'");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'FEATURED_LIST'");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'FEATURED_LIST_ITEM'");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'GROUP_ITEM'");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'GROUP_LIST'");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'GROUP_LIST_ITEM'");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'GAG_ITEM'");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'GAG_LIST'");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'GAG_LIST_ITEM'");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'USER'");
        sQLiteDatabase.delete(C1746c.f9357j, " KEY LIKE ? OR KEY LIKE ? OR KEY LIKE ? OR KEY LIKE ?", new String[]{"last_list_state_post_id_%", "last_list_state_orientation_%", "last_list_state_view_top_%", "last_list_state_scroll_offset_%"});
    }

    /* renamed from: n */
    public void m13775n(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE gag_top_comments (_id INTEGER PRIMARY KEY AUTOINCREMENT, post_id TEXT, comment_json TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE votes (_id INTEGER PRIMARY KEY AUTOINCREMENT, post_id TEXT, view_type TEXT, status INTEGER, vote INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE reports (_id INTEGER PRIMARY KEY AUTOINCREMENT, post_id TEXT, view_type TEXT, status INTEGER, reason INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE gag_timely_top_comments (_id INTEGER PRIMARY KEY AUTOINCREMENT, post_id TEXT, comment_json TEXT, fetch_time INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE gag_group (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT, url TEXT, name TEXT, list_type TEXT, og_image_url TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE notifs (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT, json TEXT, notif_type TEXT, timestamp INTEGER, display_status INTEGER, read_state INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE 'FEATURED_ITEM' ('_id' INTEGER PRIMARY KEY ,'FEATURED_ITEM_ID' TEXT,'URL' TEXT,'TITLE' TEXT,'FEATURED_IMAGE_URL' TEXT);");
        sQLiteDatabase.execSQL("CREATE INDEX IDX_FEATURED_ITEM_FEATURED_ITEM_ID ON FEATURED_ITEM (FEATURED_ITEM_ID);");
        sQLiteDatabase.execSQL("CREATE TABLE 'FEATURED_LIST' ('_id' INTEGER PRIMARY KEY ,'LIST_KEY' TEXT,'OLDER_THAN' TEXT,'NEWER_THAN' TEXT,'HAS_NEXT' INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE 'FEATURED_LIST_ITEM' ('_id' INTEGER PRIMARY KEY ,'LOCAL_ORDER' INTEGER,'ORDER_ID' INTEGER,'ITEM_TYPE' INTEGER,'ITEM_ID' TEXT,'FEATURED_IMAGE_URL' TEXT);");
        sQLiteDatabase.execSQL("CREATE INDEX IDX_FEATURED_LIST_ITEM_LOCAL_ORDER ON FEATURED_LIST_ITEM (LOCAL_ORDER);");
        sQLiteDatabase.execSQL("CREATE TABLE 'GROUP_ITEM' ('_id' INTEGER PRIMARY KEY ,'GROUP_ID' TEXT,'URL' TEXT,'NAME' TEXT,'OG_IMAGE_URL' TEXT,'LIST_TYPE' TEXT,'DESCRIPTION' TEXT,'USER_UPLOAD_ENABLED' INTEGER,'PREVIEW_GAGS_JSON' TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE 'GROUP_LIST' ('_id' INTEGER PRIMARY KEY ,'LIST_KEY' TEXT,'NEXT_OFFSET' TEXT,'HAS_NEXT' INTEGER);");
        sQLiteDatabase.execSQL("CREATE INDEX IDX_GROUP_LIST_LIST_KEY ON GROUP_LIST (LIST_KEY);");
        sQLiteDatabase.execSQL("CREATE TABLE 'GROUP_LIST_ITEM' ('_id' INTEGER PRIMARY KEY ,'GROUP_DBID' INTEGER,'LIST_KEY' TEXT,'GROUP_ID' TEXT);");
        sQLiteDatabase.execSQL("CREATE INDEX IDX_GROUP_LIST_ITEM_LIST_KEY ON GROUP_LIST_ITEM (LIST_KEY);");
        sQLiteDatabase.execSQL("CREATE TABLE 'USER' ('_id' INTEGER PRIMARY KEY ,'USER_ID' TEXT,'ACCOUNT_ID' TEXT,'USERNAME' TEXT,'PROFILE_URL' TEXT,'AVATAR_URL_SMALL' TEXT);");
        sQLiteDatabase.execSQL("CREATE INDEX IDX_USER_USER_ID ON USER (USER_ID);");
        sQLiteDatabase.execSQL("CREATE TABLE 'GAG_LIST_ITEM' ('_id' INTEGER PRIMARY KEY ,'GAG_DBID' INTEGER,'LIST_KEY' TEXT,'TYPE' INTEGER,'ORDER_ID' INTEGER,'FORCE_HIDE' INTEGER,'USER_ACTION_LABEL' TEXT,'HIGHLIGHT_COMMENT_ID' TEXT);");
        sQLiteDatabase.execSQL("CREATE INDEX IDX_GAG_LIST_ITEM_LIST_KEY ON GAG_LIST_ITEM (LIST_KEY);");
        sQLiteDatabase.execSQL("CREATE INDEX IDX_GAG_LIST_ITEM_TYPE ON GAG_LIST_ITEM (TYPE);");
        sQLiteDatabase.execSQL("CREATE TABLE 'GAG_LIST' ('_id' INTEGER PRIMARY KEY ,'LIST_KEY' TEXT,'PREV_OFFSET' TEXT,'NEXT_OFFSET' TEXT,'HAS_PREV' INTEGER,'HAS_NEXT' INTEGER,'SEPARATOR_JSON' TEXT,'TARGETED_AD_TAGS' TEXT);");
        sQLiteDatabase.execSQL("CREATE INDEX IDX_GAG_LIST_LIST_KEY ON GAG_LIST (LIST_KEY);");
        sQLiteDatabase.execSQL("CREATE TABLE 'GAG_ITEM' ('_id' INTEGER PRIMARY KEY ,'POST_ID' TEXT,'TITLE' TEXT,'DESCRIPTION' TEXT,'TYPE' TEXT,'COMMENT_OP_CLIENT_ID' TEXT,'COMMENT_OP_SIGNATURE' TEXT,'COMMENTS_COUNT' INTEGER,'UPVOTE_COUNT' INTEGER,'DOWNVOTE_COUNT' INTEGER,'NSFW' INTEGER,'VERSION' INTEGER,'HAS_LONG_POST_COVER' INTEGER,'HAS_IMAGE_TILE' INTEGER,'USER_SCORE' INTEGER,'ALBUM_WEB_URL' TEXT,'SOURCE_DOMAIN' TEXT,'SOURCE_URL' TEXT,'GAG_MEDIA_JSON' TEXT,'POST_TILE_JSON' TEXT,'VIDEO_JSON' TEXT,'USER_DBID' INTEGER,'TARGETED_AD_TAGS' TEXT,'TAGS_JSON' TEXT);");
        sQLiteDatabase.execSQL("CREATE INDEX IDX_GAG_ITEM_POST_ID ON GAG_ITEM (POST_ID);");
    }

    /* renamed from: a */
    public void m13761a() {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            m13774m(writableDatabase);
            m13775n(writableDatabase);
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* renamed from: p */
    private void m13760p(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + C1746c.f9354g);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + C1746c.f9350c);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + C1746c.f9349b);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + C1746c.f9348a);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + C1746c.f9352e);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + C1746c.f9357j);
    }
}
