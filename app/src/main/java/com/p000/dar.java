package com.p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationOpenedProcessor */
/* renamed from: dar */
public class dar {
    /* renamed from: a */
    private static Context f20954a;
    /* renamed from: b */
    private static Intent f20955b;

    /* renamed from: a */
    public static void m26094a(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            em.m30055a(context).m30059a(intent.getIntExtra("notificationId", 0));
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        dar.m26097b(context, intent);
    }

    /* renamed from: b */
    static void m26097b(Context context, Intent intent) {
        JSONArray a;
        f20954a = context;
        f20955b = intent;
        String stringExtra = f20955b.getStringExtra("summary");
        boolean booleanExtra = f20955b.getBooleanExtra("dismissed", false);
        SQLiteDatabase writableDatabase = new dau(f20954a).getWritableDatabase();
        if (!booleanExtra) {
            try {
                a = daq.m26088a(new JSONObject(f20955b.getStringExtra("onesignal_data")));
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (!(booleanExtra || stringExtra == null)) {
                dar.m26096a(a, stringExtra, writableDatabase);
            }
            dar.m26095a(writableDatabase);
            if (stringExtra == null && f20955b.getStringExtra("grp") != null) {
                dar.m26098b(writableDatabase);
            }
            writableDatabase.close();
            if (!booleanExtra) {
                dat.a(f20954a, a, intent.getBooleanExtra("from_alert", false));
            }
        }
        a = null;
        dar.m26096a(a, stringExtra, writableDatabase);
        dar.m26095a(writableDatabase);
        dar.m26098b(writableDatabase);
        writableDatabase.close();
        if (!booleanExtra) {
            dat.a(f20954a, a, intent.getBooleanExtra("from_alert", false));
        }
    }

    /* renamed from: a */
    private static void m26096a(JSONArray jSONArray, String str, SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("notification", new String[]{"full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, null, null, null);
        if (query.getCount() > 1) {
            query.moveToFirst();
            do {
                try {
                    jSONArray.put(new JSONObject(query.getString(query.getColumnIndex("full_data"))));
                } catch (Throwable th) {
                    dat.a(dat$c.ERROR, "Could not parse JSON of sub notification in group: " + str);
                }
            } while (query.moveToNext());
        }
        query.close();
    }

    /* renamed from: a */
    private static void m26095a(SQLiteDatabase sQLiteDatabase) {
        String str;
        String[] strArr = null;
        if (f20955b.getStringExtra("summary") != null) {
            str = "group_id = ?";
            strArr = new String[]{f20955b.getStringExtra("summary")};
        } else {
            str = "android_notification_id = " + f20955b.getIntExtra("notificationId", 0);
        }
        sQLiteDatabase.update("notification", dar.m26093a(), str, strArr);
        dam.m26048a(sQLiteDatabase, f20954a);
    }

    /* renamed from: b */
    private static void m26098b(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{f20955b.getStringExtra("grp")}, null, null, null);
        if (query.getCount() == 0) {
            sQLiteDatabase.update("notification", dar.m26093a(), "group_id = ?", new String[]{r8});
        } else {
            try {
                dan.m26057a(f20954a, true, new JSONObject("{\"grp\": \"" + r8 + "\"}"));
            } catch (JSONException e) {
            }
        }
        query.close();
    }

    /* renamed from: a */
    private static ContentValues m26093a() {
        ContentValues contentValues = new ContentValues();
        if (f20955b.getBooleanExtra("dismissed", false)) {
            contentValues.put("dismissed", Integer.valueOf(1));
        } else {
            contentValues.put("opened", Integer.valueOf(1));
        }
        return contentValues;
    }
}
